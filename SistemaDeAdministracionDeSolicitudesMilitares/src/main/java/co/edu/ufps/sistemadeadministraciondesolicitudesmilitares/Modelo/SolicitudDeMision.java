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

    private NotaDiplomatica notaContemplada;
    private String idSolicitud;
    private NivelUrgencia nivelUrgencia;
    private MateriaTratado materia;
    private String objetivo;
    private String fechaInicio;
    private String fechaFinal;

    public SolicitudDeMision() {

    }

    public SolicitudDeMision(String idSolicitud, NivelUrgencia nivelUrgencia, MateriaTratado materia, String objetivo, String fechaInicio, String fechaFinal, NotaDiplomatica notaContemplada) {
        this.idSolicitud = idSolicitud;
        this.nivelUrgencia = nivelUrgencia;
        this.materia = materia;
        this.objetivo = objetivo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.notaContemplada = notaContemplada;

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

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public NotaDiplomatica getNotaContemplada() {
        return notaContemplada;
    }

    public void setNotaContemplada(NotaDiplomatica notaContemplada) {
        this.notaContemplada = notaContemplada;
    }

}
