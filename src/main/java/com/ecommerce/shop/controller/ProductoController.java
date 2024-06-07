/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.shop.controller;

import com.ecommerce.shop.model.Producto;
import com.ecommerce.shop.model.Usuario;
import com.ecommerce.shop.service.ProductoService;
import com.ecommerce.shop.service.ProductoServiceImpl;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    
}
