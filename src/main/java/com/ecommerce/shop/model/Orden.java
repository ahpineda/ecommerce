/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.shop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;


/**
 *
 * @author apineda
 */
@Entity
@Table(name="ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="codigo")
    private Integer codigo;
    @Column(name="numero")
    private String numero;
    @Column(name="fechacreate")
    private Date fechaCreacion;
    @Column(name="fechareceived")
    private Date fechaRecibida;
    @Column(name="total")
    private Double total;
    @Column(name="cod_usuario")
    private Integer codusuario;
    @Column(name="cod_detalle")
    private Integer coddetalle;


    public Orden() {
    }   
    public Orden(Integer id, Integer codigo,String numero, Date fechaCreacion, Date fechaRecibida, Double total,Integer codusuario,Integer coddetalle) {
        this.id = id;
        this.codigo=codigo;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
        this.codusuario = codusuario;
        this.coddetalle = coddetalle;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Integer getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public Integer getCoddetalle() {
        return coddetalle;
    }

    public void setCoddetalle(Integer coddetalle) {
        this.coddetalle = coddetalle;
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
