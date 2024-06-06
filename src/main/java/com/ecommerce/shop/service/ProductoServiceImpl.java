/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.shop.service;

import com.ecommerce.shop.model.Producto;
import com.ecommerce.shop.repository.ProductoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aleja
 */
@Service
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    private ProductoRepository productorepository;
    
    @Override
    public Producto save(Producto producto) {
        return productorepository.save(producto);
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productorepository.findById(id);
    }

    @Override
    public void update(Producto producto) {
        productorepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productorepository.deleteById(id);
    }
    
}
