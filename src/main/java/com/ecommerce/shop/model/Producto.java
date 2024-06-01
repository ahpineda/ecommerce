/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.shop.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author apineda
 */
@Entity
@Table(name="productos")
public class Producto {
    @Id
    private Integer id;
    @Column(name="codigo")
    private Integer codigo;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="imagen")
    private String imagen;
    @Column(name="precio")
    private Double precio;
    @Column(name="cantidad")
    private Integer cantidad;

    public Producto() {
    }

    public Producto(Integer id, Integer codigo,String nombre, String descripcion, String imagen, Double precio) {
        this.id = id;
        this.codigo=codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
    }


    public Producto(Integer id,Integer codigo, String nombre, String descripcion, String imagen, Double precio, Integer cantidad) {
        this.id = id;
        this.codigo=codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

}
