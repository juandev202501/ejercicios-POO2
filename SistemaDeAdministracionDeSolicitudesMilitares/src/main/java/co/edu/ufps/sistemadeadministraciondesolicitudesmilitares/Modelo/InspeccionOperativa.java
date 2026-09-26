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
public class InspeccionOperativa {
    
    private String idInspeccion;
    private GrupoInspeccion grupoInspeccionAsignado;
    private LocalDateTime fechaVisita;
    private boolean cumpleReglasCompromiso;
    private boolean sinDesviacionPlan;

    public InspeccionOperativa() {
    }

    public InspeccionOperativa(String idInspeccion, GrupoInspeccion grupoInspeccionAsignado, LocalDateTime fechaVisita, boolean cumpleReglasCompromiso, boolean sinDesviacionPlan) {
        this.idInspeccion = idInspeccion;
        this.grupoInspeccionAsignado = grupoInspeccionAsignado;
        this.fechaVisita = fechaVisita;
        this.cumpleReglasCompromiso = cumpleReglasCompromiso;
        this.sinDesviacionPlan = sinDesviacionPlan;
    }

    public String getIdInspeccion() {
        return idInspeccion;
    }

    public void setIdInspeccion(String idInspeccion) {
        this.idInspeccion = idInspeccion;
    }

    public GrupoInspeccion getGrupoInspeccionAsignado() {
        return grupoInspeccionAsignado;
    }

    public void setGrupoInspeccionAsignado(GrupoInspeccion grupoInspeccionAsignado) {
        this.grupoInspeccionAsignado = grupoInspeccionAsignado;
    }

    public LocalDateTime getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDateTime fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public boolean isCumpleReglasCompromiso() {
        return cumpleReglasCompromiso;
    }

    public void setCumpleReglasCompromiso(boolean cumpleReglasCompromiso) {
        this.cumpleReglasCompromiso = cumpleReglasCompromiso;
    }

    public boolean isSinDesviacionPlan() {
        return sinDesviacionPlan;
    }

    public void setSinDesviacionPlan(boolean sinDesviacionPlan) {
        this.sinDesviacionPlan = sinDesviacionPlan;
    }
    
}
