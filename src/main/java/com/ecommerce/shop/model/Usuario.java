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
@Table(name="usuarios")
public class Usuario {
    @Id
    private Integer id;
    @Column(name="codigo")
    private Integer codigo;
    @Column(name="nombre")   
    private String nombre;
    @Column(name="apellido")
    private String apellido;

    @Column(name="username")
    private String username;
    @Column(name="email")
    private String email;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private String telefono;
    @Column(name="tipo")
    private String tipo;
    @Column(name="password")
    private String password;
        
    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, String username, String email, String direccion, String telefono, String tipo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.password = password;
    }

//    public void setProductos(ArrayList<Producto> productos) {
//        this.productos = productos;
//    }
//
//    public ArrayList<Producto> getProductos() {
//        return productos;
//    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }



    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", password=" + password + '}';
    }    
}
