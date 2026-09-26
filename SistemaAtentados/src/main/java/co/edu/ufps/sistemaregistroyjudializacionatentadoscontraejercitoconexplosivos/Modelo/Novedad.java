/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author JUAN DAVID
 */
public class Novedad {
    private String nombre;
    private Clasificacion clasificacion;
    private LocalDateTime fecha;
    private Atentado atentado;

    public Novedad() {
    }

    public Novedad(String nombre, Clasificacion clasificacion, LocalDateTime fecha, Atentado atentado) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.fecha = fecha;
        this.atentado = atentado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Atentado getAtentado() {
        return atentado;
    }

    public void setAtentado(Atentado atentado) {
        this.atentado = atentado;
    }
    
    
    
    
    
}
