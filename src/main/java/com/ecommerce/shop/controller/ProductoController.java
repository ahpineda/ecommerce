/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.shop.controller;

import com.ecommerce.shop.model.Producto;
import com.ecommerce.shop.model.Usuario;
import com.ecommerce.shop.service.ProductoService;
import com.ecommerce.shop.service.ProductoServiceImpl;
import java.util.Optional;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author aleja
 */
@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    private final Logger logger= (Logger) LoggerFactory.getLogger(ProductoController.class);
    
    @Autowired
    private ProductoServiceImpl productoservice;
    
    @GetMapping("")
    public String show(Model model){
        model.addAttribute("productos", productoservice.findAll());
        return "productos/show";
    }
    
    @GetMapping("/create")
    public String create(){
        return "productos/create";
    }
    
    @PostMapping("/save")
    public String save(Producto producto){
        logger.info("Este es el objeto producto{}",producto.toString());
        productoservice.save(producto);
        return "redirect:/productos";
    }    
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        Producto producto = new Producto();
        Optional<Producto> optionalProducto = productoservice.get(id);
        producto = optionalProducto.get();
        logger.info("Producto buscado :{}", producto);
        model.addAttribute("producto", producto);
        return "productos/edit";
    }
    
    @PostMapping("/update")
    public String update(Producto producto){
        productoservice.update(producto);
        return "redirect:/productos";
    }
}
