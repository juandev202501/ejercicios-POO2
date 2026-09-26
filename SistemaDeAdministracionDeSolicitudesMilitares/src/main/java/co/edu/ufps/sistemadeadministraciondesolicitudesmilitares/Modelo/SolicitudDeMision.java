/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author JUAN DAVID
 */
public class SolicitudDeMision {
    private String idSolicitud;
    private NivelUrgencia nivelUrgencia;
    private String objetivo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;
    private boolean cumplerequisitos;

    public SolicitudDeMision() {
    }

    public SolicitudDeMision(String idSolicitud, NivelUrgencia nivelUrgencia, String objetivo, LocalDateTime fechaInicio, LocalDateTime fechaFinal, boolean cumplerequisitos) {
        this.idSolicitud = idSolicitud;
        this.nivelUrgencia = nivelUrgencia;
        this.objetivo = objetivo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cumplerequisitos = cumplerequisitos;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public NivelUrgencia getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(NivelUrgencia nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDateTime fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isCumplerequisitos() {
        return cumplerequisitos;
    }

    public void setCumplerequisitos(boolean cumplerequisitos) {
        this.cumplerequisitos = cumplerequisitos;
    }

    public boolean validarRequisitos() {
        boolean objetivoValido = (this.objetivo != null && !this.objetivo.trim().isEmpty());
        boolean fechasValidas = (this.fechaInicio != null && this.fechaFinal != null && this.fechaInicio.isBefore(this.fechaFinal));
        
        if (objetivoValido && fechasValidas) {
            this.cumplerequisitos = true;
            return true; 
        }
        this.cumplerequisitos = false;
        return false; 
    }
}
