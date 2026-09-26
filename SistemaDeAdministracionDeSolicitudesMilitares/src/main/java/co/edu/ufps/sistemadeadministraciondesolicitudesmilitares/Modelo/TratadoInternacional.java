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
public class TratadoInternacional {
    private String idTratado;
    private String nombreOficial;
    private LocalDateTime fechaRatificacion;
    private MateriaTratado materiaRegulada;
    private PaisSolicitante estadoParte;

    public TratadoInternacional() {
    }

    public TratadoInternacional(String idTratado, String nombreOficial, LocalDateTime fechaRatificacion, MateriaTratado materiaRegulada, PaisSolicitante estadoParte) {
        this.idTratado = idTratado;
        this.nombreOficial = nombreOficial;
        this.fechaRatificacion = fechaRatificacion;
        this.materiaRegulada = materiaRegulada;
        this.estadoParte = estadoParte;
    }

    public String getIdTratado() {
        return idTratado;
    }

    public void setIdTratado(String idTratado) {
        this.idTratado = idTratado;
    }

    public String getNombreOficial() {
        return nombreOficial;
    }

    public void setNombreOficial(String nombreOficial) {
        this.nombreOficial = nombreOficial;
    }

    public LocalDateTime getFechaRatificacion() {
        return fechaRatificacion;
    }

    public void setFechaRatificacion(LocalDateTime fechaRatificacion) {
        this.fechaRatificacion = fechaRatificacion;
    }

    public MateriaTratado getMateriaRegulada() {
        return materiaRegulada;
    }

    public void setMateriaRegulada(MateriaTratado materiaRegulada) {
        this.materiaRegulada = materiaRegulada;
    }

    public PaisSolicitante getEstadoParte() {
        return estadoParte;
    }

    public void setEstadoParte(PaisSolicitante estadoParte) {
        this.estadoParte = estadoParte;
    }

    
    
    
}
