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
public class DemandaNulidad {

    private String idDemanda;
    private String fundamentosDeDerecho;
    private String fechaRadicacion;
    private CiudadanoImpugnante demandante;
    private Expediente expedienteDemandado;
    private DecretoPresidencial decretoDemandado;
    private EstadoDemanda estado;

    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm-dd/MM/yyyy");

    public DemandaNulidad() {
        this.fechaRadicacion = LocalDateTime.now().format(formato);
    }

    public DemandaNulidad(String idDemanda, String fundamentosDeDerecho, CiudadanoImpugnante demandante, Expediente expedienteDemandado, DecretoPresidencial decretoDemandado) {
        this.idDemanda = idDemanda;
        this.fundamentosDeDerecho = fundamentosDeDerecho;
        this.demandante = demandante;
        this.expedienteDemandado = expedienteDemandado;
        this.decretoDemandado = decretoDemandado;
        this.fechaRadicacion = LocalDateTime.now().format(formato);

    }

    public String getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(String idDemanda) {
        this.idDemanda = idDemanda;
    }

    public String getFundamentosDeDerecho() {
        return fundamentosDeDerecho;
    }

    public void setFundamentosDeDerecho(String fundamentosDeDerecho) {
        this.fundamentosDeDerecho = fundamentosDeDerecho;
    }

    public String getFechaRadicacion() {
        return fechaRadicacion;
    }

    public void setFechaRadicacion(String fechaRadicacion) {
        this.fechaRadicacion = fechaRadicacion;
    }

    public CiudadanoImpugnante getDemandante() {
        return demandante;
    }

    public void setDemandante(CiudadanoImpugnante demandante) {
        this.demandante = demandante;
    }

    public Expediente getExpedienteDemandado() {
        return expedienteDemandado;
    }

    public void setExpedienteDemandado(Expediente expedienteDemandado) {
        this.expedienteDemandado = expedienteDemandado;
    }

    public DecretoPresidencial getDecretoDemandado() {
        return decretoDemandado;
    }

    public void setDecretoDemandado(DecretoPresidencial decretoDemandado) {
        this.decretoDemandado = decretoDemandado;
    }

    public EstadoDemanda getEstado() {
        return estado;
    }

    public void setEstado(EstadoDemanda estado) {
        this.estado = estado;
    }

}
