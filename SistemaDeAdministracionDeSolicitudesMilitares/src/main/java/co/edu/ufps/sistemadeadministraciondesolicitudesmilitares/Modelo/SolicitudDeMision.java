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
    private MateriaTratado materia;
    private String objetivo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;
    private boolean cumpleRequisitos;
    
    public SolicitudDeMision() {
        this.cumpleRequisitos = true;
    }

    public SolicitudDeMision(String idSolicitud, NivelUrgencia nivelUrgencia, MateriaTratado materia, String objetivo, LocalDateTime fechaInicio, LocalDateTime fechaFinal) {
        this.idSolicitud = idSolicitud;
        this.nivelUrgencia = nivelUrgencia;
        this.materia = materia;
        this.objetivo = objetivo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cumpleRequisitos=true;
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

    public MateriaTratado getMateria() {
        return materia;
    }

    public void setMateria(MateriaTratado materia) {
        this.materia = materia;
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

    public boolean isCumpleRequisitos() {
        return cumpleRequisitos;
    }

    public void setCumpleRequisitos(boolean cumpleRequisitos) {
        this.cumpleRequisitos = cumpleRequisitos;
    }
    
    
    
}
