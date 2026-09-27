/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author JUAN DAVID
 */
public class NotaDiplomatica {

    private String idNota;
    private String fechaEmision;
    private String contenidoOficial;
    private String nombreEmisor;
    private String acreditacionEmisor;
    private boolean estadoRadicacion;
    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm-dd/MM/yyyy");

    public NotaDiplomatica() {
        this.estadoRadicacion = false;
        this.fechaEmision = LocalDateTime.now().format(formato);
    }

    public NotaDiplomatica(String idNota, String contenidoOficial, String nombreEmisor, String acreditacionEmisor) {
        this.idNota = idNota;
        this.contenidoOficial = contenidoOficial;
        this.nombreEmisor = nombreEmisor;
        this.acreditacionEmisor = acreditacionEmisor;
        this.fechaEmision = LocalDateTime.now().format(formato);
        this.estadoRadicacion = false;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getContenidoOficial() {
        return contenidoOficial;
    }

    public void setContenidoOficial(String contenidoOficial) {
        this.contenidoOficial = contenidoOficial;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public String getAcreditacionEmisor() {
        return acreditacionEmisor;
    }

    public void setAcreditacionEmisor(String acreditacionEmisor) {
        this.acreditacionEmisor = acreditacionEmisor;
    }

    public boolean isEstadoRadicacion() {
        return estadoRadicacion;
    }

    public void setEstadoRadicacion(boolean estadoRadicacion) {
        this.estadoRadicacion = estadoRadicacion;
    }

}
