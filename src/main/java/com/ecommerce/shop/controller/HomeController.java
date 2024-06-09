/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.shop.controller;

import com.ecommerce.shop.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("productos",productoservice.findAll());
        return "usuario/home";
    }
}
