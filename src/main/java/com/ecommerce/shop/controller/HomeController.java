/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.shop.controller;

import com.ecommerce.shop.model.Producto;
import com.ecommerce.shop.service.ProductoService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author aleja
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private ProductoService productoservice;
    private final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @GetMapping("/")    
    public String home(Model model){
        model.addAttribute("productos",productoservice.findAll());
        return "usuario/home";
    }
    @GetMapping("productohome/{id}")
    public String productohome(@PathVariable Integer id, Model model){
        logger.info("id producto enviado como parametro{}",id);
        Producto producto = new Producto();
        Optional<Producto>  productooptional=productoservice.get(id);
        producto = productooptional.get();
        model.addAttribute("producto", producto);
        return "usuario/productohome";
    }
}
