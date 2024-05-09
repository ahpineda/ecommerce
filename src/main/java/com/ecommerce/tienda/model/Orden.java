/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.tienda.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author apineda
 */
@Entity
@Table(name="ordenes")
public class Orden {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private Double total;
    @ManyToOne
    private Usuario usuario;
    @OneToOne()
    private DetalleOrden detalleOrden;
    public Orden() {
    }   
    public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, Double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    public void setDetalleOrden(DetalleOrden detalleOrden) {
        this.detalleOrden = detalleOrden;
    }

    public DetalleOrden getDetalleOrden() {
        return detalleOrden;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }



    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }



    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida=" + fechaRecibida + ",  total=" + total + '}';
    }

}
