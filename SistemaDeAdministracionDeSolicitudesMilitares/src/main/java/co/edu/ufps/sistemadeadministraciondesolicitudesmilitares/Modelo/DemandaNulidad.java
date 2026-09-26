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
public class DemandaNulidad {
    
    private String idDemanda;
    private LocalDateTime fechaRadicacion;
    private String fundamentosDerecho;
    private boolean medidaCautelarSolicitada;
    private boolean demandaAdmitida;

    public DemandaNulidad() {
    }

    public DemandaNulidad(String idDemanda, LocalDateTime fechaRadicacion, String fundamentosDerecho, boolean medidaCautelarSolicitada, boolean demandaAdmitida) {
        this.idDemanda = idDemanda;
        this.fechaRadicacion = fechaRadicacion;
        this.fundamentosDerecho = fundamentosDerecho;
        this.medidaCautelarSolicitada = medidaCautelarSolicitada;
        this.demandaAdmitida = demandaAdmitida;
    }

    public String getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(String idDemanda) {
        this.idDemanda = idDemanda;
    }

    public LocalDateTime getFechaRadicacion() {
        return fechaRadicacion;
    }

    public void setFechaRadicacion(LocalDateTime fechaRadicacion) {
        this.fechaRadicacion = fechaRadicacion;
    }

    public String getFundamentosDerecho() {
        return fundamentosDerecho;
    }

    public void setFundamentosDerecho(String fundamentosDerecho) {
        this.fundamentosDerecho = fundamentosDerecho;
    }

    public boolean isMedidaCautelarSolicitada() {
        return medidaCautelarSolicitada;
    }

    public void setMedidaCautelarSolicitada(boolean medidaCautelarSolicitada) {
        this.medidaCautelarSolicitada = medidaCautelarSolicitada;
    }

    public boolean isDemandaAdmitida() {
        return demandaAdmitida;
    }

    public void setDemandaAdmitida(boolean demandaAdmitida) {
        this.demandaAdmitida = demandaAdmitida;
    }
    
    
    public String notificarEntidades() {
        if (this.demandaAdmitida) {
            return "Notificación: Se informó al Ejecutivo sobre la demanda " + this.idDemanda + ".";
        }
        return "La demanda aún no ha sido admitida.";
    }
    
}
