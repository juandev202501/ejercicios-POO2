/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class Expediente {

    private String idEspediente;
    private LocalDateTime fechaCreacion;
    private EstadoExpediente estadoActual;
    private boolean documentacionCompleta;
    private ArrayList<SolicitudDeMision> solicitudes;

    public Expediente() {
    }

    public Expediente(String idEspediente, LocalDateTime fechaCreacion, EstadoExpediente estadoActual, boolean documentacionCompleta) {
        this.idEspediente = idEspediente;
        this.fechaCreacion = fechaCreacion;
        this.estadoActual = estadoActual;
        this.documentacionCompleta = documentacionCompleta;
        this.solicitudes = new ArrayList<>();
    }

    public ArrayList<SolicitudDeMision> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<SolicitudDeMision> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public String getIdEspediente() {
        return idEspediente;
    }

    public void setIdEspediente(String idEspediente) {
        this.idEspediente = idEspediente;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public EstadoExpediente getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoExpediente estadoActual) {
        this.estadoActual = estadoActual;
    }

    public boolean isDocumentacionCompleta() {
        return documentacionCompleta;
    }

    public void setDocumentacionCompleta(boolean documentacionCompleta) {
        this.documentacionCompleta = documentacionCompleta;
    }

    public String crearYAnexarSolicitud(String idSolicitud, NivelUrgencia urgencia, String objetivo, LocalDateTime fechaInicio, LocalDateTime fechaFinal, boolean cumpleRequisitos) {
        SolicitudDeMision nuevaSolicitud = new SolicitudDeMision(idSolicitud, urgencia, objetivo, fechaInicio, fechaFinal, cumpleRequisitos);
        this.solicitudes.add(nuevaSolicitud);
        this.documentacionCompleta = true;
        return "Solicitud " + idSolicitud + " creada y anexada correctamente al expediente " + this.idEspediente + ".";
    }
}
