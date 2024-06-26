/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorias.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;




public class Tutoria {

    
    

    private int idTutoria;
    
    @NotEmpty
    @Size(min = 4, max=200, message="Debe ser de 4 a 200 caracteres")
    private String titulo;
    @NotEmpty
    @Size(min = 4, max=200, message="Debe ser de 4 a 200 caracteres")
    private String descripcion;
    @NotEmpty
    private String fechaLimite;
    
    @NotNull
    @Min(value = 100, message="El precio debe ser de al menos $100")
    private Double precio;
    private int idEstado;
    private int idEstudiante;
    private int idArea;
    private int activo;
    private int idCarrera;
    private int postulacion_disponible;

    public Tutoria() {
    }

    public Tutoria(int idTutoria, String titulo, String descripcion, String fechaLimite, Double precio, int idEstado, int idEstudiante, int idArea) {
        this.idTutoria = idTutoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.precio = precio;
        this.idEstado = idEstado;
        this.idEstudiante = idEstudiante;
        this.idArea = idArea;
    }



    /**
     * @return the idTutoria
     */
    public int getIdTutoria() {
        return idTutoria;
    }

    /**
     * @param idTutoria the idTutoria to set
     */
    public void setIdTutoria(int idTutoria) {
        this.idTutoria = idTutoria;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaLimite
     */
    public String getFechaLimite() {
        return fechaLimite;
    }

    /**
     * @param fechaLimite the fechaLimite to set
     */
    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the idArea
     */
    public int getIdArea() {
        return idArea;
    }

    /**
     * @param idArea the idArea to set
     */
    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    /**
     * @return the idEstudiante
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
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
     * @return the idCarrera
     */
    public int getIdCarrera() {
        return idCarrera;
    }

    /**
     * @param idCarrera the idCarrera to set
     */
    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * @return the postulacion_disponible
     */
    public int getPostulacion_disponible() {
        return postulacion_disponible;
    }

    /**
     * @param postulacion_disponible the postulacion_disponible to set
     */
    public void setPostulacion_disponible(int postulacion_disponible) {
        this.postulacion_disponible = postulacion_disponible;
    }
}
