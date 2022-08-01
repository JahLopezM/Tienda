/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sky
 */
@Entity
/*Nombre de la tabla y decimos que es una tabla*/
@Table(name = "personas")
public class Persona implements Serializable {

    /*el id esta definido aqui porque es nuestro primary key por lo que si este cambia tambien el nombre hay que cambiarlo 
    ademas el generatedvalue lo que hace es decir que el es autoincremental */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    /**
     * Empezamos a escribir el nombre de las columnas que quiero en mi tabla*
     */
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;

    /*Se define que es de muchos a 1  esta es la llave foranea por lo que se define*/
    @ManyToOne
    @JoinColumn(name = "paises_id")
    /*La tabla apunta a el objeto de tipo pais */

    private Pais pais;

    /*se hacen los get y set*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
