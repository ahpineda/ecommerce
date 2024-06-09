/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.shop.controller;

import com.ecommerce.shop.model.Producto;
import com.ecommerce.shop.model.Usuario;
import com.ecommerce.shop.service.ProductoService;
import com.ecommerce.shop.service.ProductoServiceImpl;
import com.ecommerce.shop.service.UploadFileService;
import java.io.IOException;
import java.util.Optional;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
    
    @Autowired
    private UploadFileService upload;
    
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
    public String save(Producto producto, @RequestParam("img")MultipartFile file) throws IOException{
        logger.info("Este es el objeto producto{}",producto.toString());
        //imagen
        if(producto.getId()==null){//cuando se crea un producto
            String nombreImagen = upload.saveImage(file);
            producto.setImagen(nombreImagen);
        }else{
 
            
        }
        
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
    public String update(Producto producto, @RequestParam("img")MultipartFile file) throws IOException{
        if(file.isEmpty()){//cuando se edita un producto sin cambiar foto
            Producto p=new Producto();
            p = productoservice.get(producto.getId()).get();
            producto.setImagen(p.getImagen());
        }else{
            //cuando se edita la imagen
            Producto p = new Producto();
            p=productoservice.get(producto.getId()).get();
            if(p.getImagen().equals("default.jpg")){
                upload.deleteImage(p.getImagen());
             }        
            
            String nombreImagen = upload.saveImage(file);
            producto.setImagen(nombreImagen);
        }    
        productoservice.update(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, @RequestParam("img")MultipartFile file){
        Producto p = new Producto();
        p=productoservice.get(id).get();
        //eliminamos img cuando no sea por default
        if(p.getImagen().equals("default.jpg")){
            upload.deleteImage(p.getImagen());
        }
        productoservice.delete(id);
        return "redirect:/productos";
    }
    
    
}
