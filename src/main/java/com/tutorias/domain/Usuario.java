/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorias.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Usuario{


    

    private int id_usuario;
    

    private String tipo_usuario;
    

    private String nombre;
    

    private String apellido;
    

    private int codigo_estudiante;
    
   
    private String password;
    

    private String login;
    

    private int id_carrera;
    
    private int activo;
    
    private int semestre;


    public Usuario() {
    }

    public Usuario(int id_usuario, String tipo_usuario, String nombre, String apellido, int codigo_estudiante, String password, String login, int id_carrera) {
        this.id_usuario = id_usuario;
        this.tipo_usuario = tipo_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo_estudiante = codigo_estudiante;
        this.password = password;
        this.login = login;
        this.id_carrera = id_carrera;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the tipo_usuario
     */
    public String getTipo_usuario() {
        return tipo_usuario;
    }

    /**
     * @param tipo_usuario the tipo_usuario to set
     */
    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the codigo_estudiante
     */
    public int getCodigo_estudiante() {
        return codigo_estudiante;
    }

    /**
     * @param codigo_estudiante the codigo_estudiante to set
     */
    public void setCodigo_estudiante(int codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the id_carrera
     */
    public int getId_carrera() {
        return id_carrera;
    }

    /**
     * @param id_carrera the id_carrera to set
     */
    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    /**
     * @return the activo
     */
    public int getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(int activo) {
        this.activo = activo;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    

}
