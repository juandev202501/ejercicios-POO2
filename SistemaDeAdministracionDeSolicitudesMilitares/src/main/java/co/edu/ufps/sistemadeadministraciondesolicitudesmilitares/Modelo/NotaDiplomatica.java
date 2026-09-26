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
public class NotaDiplomatica {
    private String idNota;
    private LocalDateTime fechaEmision;
    private String contenidoOficial;
    private String nombreEmisor;
    private String acriditacionEmisor;
    private boolean estadoRadicacion;

    public NotaDiplomatica() {
    }

    public NotaDiplomatica(String idNota, LocalDateTime fechaEmision, String contenidoOficial, String nombreEmisor, String acriditacionEmisor, boolean estadoRadicacion) {
        this.idNota = idNota;
        this.fechaEmision = fechaEmision;
        this.contenidoOficial = contenidoOficial;
        this.nombreEmisor = nombreEmisor;
        this.acriditacionEmisor = acriditacionEmisor;
        this.estadoRadicacion = estadoRadicacion;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
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

    public String getAcriditacionEmisor() {
        return acriditacionEmisor;
    }

    public void setAcriditacionEmisor(String acriditacionEmisor) {
        this.acriditacionEmisor = acriditacionEmisor;
    }

    public boolean isEstadoRadicacion() {
        return estadoRadicacion;
    }

    public void setEstadoRadicacion(boolean estadoRadicacion) {
        this.estadoRadicacion = estadoRadicacion;
    }
    
}
