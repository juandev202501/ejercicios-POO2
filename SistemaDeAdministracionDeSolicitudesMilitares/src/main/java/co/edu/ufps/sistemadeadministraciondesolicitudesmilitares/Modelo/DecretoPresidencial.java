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
public class DecretoPresidencial {

    private String numeracionOficial;
    private LocalDateTime fechaExpedicion;
    private int tiempoVigenciaDias;
    private ContingenteMilitar contingenteAutorizado;
    private BaseMilitar baseAsignada;

    public DecretoPresidencial(String numeracionOficial) {
        this.numeracionOficial = numeracionOficial;
    }

    public DecretoPresidencial(String numeracionOficial, LocalDateTime fechaExpedicion, int tiempoVigenciaDias, ContingenteMilitar contingenteAutorizado, BaseMilitar baseAsignada) {
        this.numeracionOficial = numeracionOficial;
        this.fechaExpedicion = fechaExpedicion;
        this.tiempoVigenciaDias = tiempoVigenciaDias;
        this.contingenteAutorizado = contingenteAutorizado;
        this.baseAsignada = baseAsignada;
    }

    public String getNumeracionOficial() {
        return numeracionOficial;
    }

    public void setNumeracionOficial(String numeracionOficial) {
        this.numeracionOficial = numeracionOficial;
    }

    public LocalDateTime getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDateTime fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public int getTiempoVigenciaDias() {
        return tiempoVigenciaDias;
    }

    public void setTiempoVigenciaDias(int tiempoVigenciaDias) {
        this.tiempoVigenciaDias = tiempoVigenciaDias;
    }

    public ContingenteMilitar getContingenteAutorizado() {
        return contingenteAutorizado;
    }

    public void setContingenteAutorizado(ContingenteMilitar contingenteAutorizado) {
        this.contingenteAutorizado = contingenteAutorizado;
    }

    public BaseMilitar getBaseAsignada() {
        return baseAsignada;
    }

    public void setBaseAsignada(BaseMilitar baseAsignada) {
        this.baseAsignada = baseAsignada;
    }
    
    
}
