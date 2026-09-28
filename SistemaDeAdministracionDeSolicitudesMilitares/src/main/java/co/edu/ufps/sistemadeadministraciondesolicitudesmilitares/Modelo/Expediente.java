/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class Expediente {

    private String idExpediente;
    private String fechaCreacion;
    private EstadoExpediente estadoActual;
    private boolean documentacionCompleta;
    private PaisSolicitante paisOrigen;
    private ArrayList<SolicitudDeMision> solicitudes;

    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm-dd/MM/yyyy");

    public Expediente() {
        this.solicitudes = new ArrayList<>();
        this.fechaCreacion = LocalDateTime.now().format(formato);
        this.estadoActual = EstadoExpediente.RADICADO;
        this.documentacionCompleta = false;
    }

    public Expediente(String idExpediente, PaisSolicitante paisOrigen) {
        this.idExpediente = idExpediente;
        this.paisOrigen = paisOrigen;
        this.solicitudes = new ArrayList<>();
        this.fechaCreacion = LocalDateTime.now().format(formato);
        this.estadoActual = EstadoExpediente.RADICADO;
        this.documentacionCompleta = false;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
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

    public PaisSolicitante getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisSolicitante paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public ArrayList<SolicitudDeMision> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<SolicitudDeMision> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public String anexarSolicitud(SolicitudDeMision solicitud) {

        if(duplicado(solicitud)!=null)
        {
            return "ERROR YA EXISTE UNA SOLICITUD DE MISION CON ID(N°"+solicitud.getIdSolicitud()+") EN EL EXPEDIENTE (N°"+this.idExpediente+")";
        }
        this.solicitudes.add(solicitud);
        this.documentacionCompleta = true;
        return "SOLICITUD (N°" + solicitud.getIdSolicitud() + ") ANEXADA CON EXITO AL EXPEDIENTE (N°" + this.idExpediente+")";
    }
    public SolicitudDeMision duplicado(SolicitudDeMision solicitud2)
    {
        for (SolicitudDeMision solicitud : solicitudes) {
            if(solicitud.getIdSolicitud().equalsIgnoreCase(solicitud2.getIdSolicitud()))
            {
                return solicitud;
            }
            
        }
        return null;
    }
}
