/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.tienda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author apineda
 */
@Entity
@Table(name="detalles")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)       
    private Integer id;
    private String nombre;
    private Double cantidad;
    private Double precio;
    private Double total;
    @OneToOne()
    private Orden orden;
    @OneToOne()
    private Producto producto;
    
    public DetalleOrden() {
    }

    public DetalleOrden(Integer id, String nombre, Double cantidad, Double precio, Double total) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Orden getOrden() {
        return orden;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + '}';
    }
    
}
