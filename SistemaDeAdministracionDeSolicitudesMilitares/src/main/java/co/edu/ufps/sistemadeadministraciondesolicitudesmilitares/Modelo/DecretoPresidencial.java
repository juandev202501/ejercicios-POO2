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
public class DecretoPresidencial {

    private String numeracionOficial;
    private String fechaExpedicion;
    private String cosideraciones;
    private int tiempoVigenciaDias;
    private Expediente expedienteAsociado;
    private boolean refrendadoPorDefensa;
    private boolean rechazadoPorDefensa;
    private boolean firmadoPorPresidente;

    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm-dd/MM/yyyy");

    public DecretoPresidencial() {
        this.fechaExpedicion = LocalDateTime.now().format(formato);
        this.refrendadoPorDefensa = false;
        this.firmadoPorPresidente= false;
    }

    public DecretoPresidencial(String numeracionOficial, int tiempoVigenciaDias,String consideraciones, Expediente expedienteAsociado) {
        this.numeracionOficial = numeracionOficial;
        this.tiempoVigenciaDias = tiempoVigenciaDias;
        this.cosideraciones=consideraciones;
        this.expedienteAsociado = expedienteAsociado;
        this.fechaExpedicion = LocalDateTime.now().format(formato);
        this.refrendadoPorDefensa = false;
        this.firmadoPorPresidente= false;
    }

    public String getNumeracionOficial() {
        return numeracionOficial;
    }

    public void setNumeracionOficial(String numeracionOficial) {
        this.numeracionOficial = numeracionOficial;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public int getTiempoVigenciaDias() {
        return tiempoVigenciaDias;
    }

    public void setTiempoVigenciaDias(int tiempoVigenciaDias) {
        this.tiempoVigenciaDias = tiempoVigenciaDias;
    }

    public Expediente getExpedienteAsociado() {
        return expedienteAsociado;
    }

    public void setExpedienteAsociado(Expediente expedienteAsociado) {
        this.expedienteAsociado = expedienteAsociado;
    }

    public boolean isRefrendadoPorDefensa() {
        return refrendadoPorDefensa;
    }

    public void setRefrendadoPorDefensa(boolean refrendadoPorDefensa) {
        this.refrendadoPorDefensa = refrendadoPorDefensa;
    }

    public String getCosideraciones() {
        return cosideraciones;
    }

    public void setCosideraciones(String cosideraciones) {
        this.cosideraciones = cosideraciones;
    }

    public boolean isFirmadoPorPresidente() {
        return firmadoPorPresidente;
    }

    public void setFirmadoPorPresidente(boolean firmadoPorPresidente) {
        this.firmadoPorPresidente = firmadoPorPresidente;
    }

    public boolean isRechazadoPorDefensa() {
        return rechazadoPorDefensa;
    }

    public void setRechazadoPorDefensa(boolean rechazadoPorDefensa) {
        this.rechazadoPorDefensa = rechazadoPorDefensa;
    }
    

}
