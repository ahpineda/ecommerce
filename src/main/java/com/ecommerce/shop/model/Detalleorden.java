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
@Table(name="detalleorden")
public class Detalleorden {
    @Id
    private Integer id;
    @Column(name="codigo")
    private Integer codigo;
    @Column(name="cantidad")
    private Double cantidad;
    @Column(name="precio")
    private Double precio;
    @Column(name="total")
    private Double total;
    @Column(name="codorden")
    private Integer codorden;
    @Column(name="codproducto")
    private Integer codproducto;


    public Detalleorden() {
    }

    public Detalleorden(Integer id, Double cantidad, Double precio, Double total,Integer codorden,Integer codproducto) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.codorden=codorden;
        this.codproducto=codproducto;
    }

    public Integer getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(Integer codproducto) {
        this.codproducto = codproducto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodorden() {
        return codorden;
    }

    public void setCodorden(Integer codorden) {
        this.codorden = codorden;
    }
    

    public Integer getId() {
        return id;
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
        return "DetalleOrden{" + "id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + '}';
    }
    
}
