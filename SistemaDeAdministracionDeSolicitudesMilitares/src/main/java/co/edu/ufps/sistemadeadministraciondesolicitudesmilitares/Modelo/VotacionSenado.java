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
public class VotacionSenado {

    private Expediente expediente;
    private int votosAFavor;
    private int votosEnContra;
    private int abstenciones;
    private String fechaVotacion;
    private boolean quorumAlcanzado;
    private boolean aprobadoParaPlenaria;
    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm-dd/MM/yyyy");

    public VotacionSenado() {
        this.fechaVotacion = LocalDateTime.now().format(formato);
        this.quorumAlcanzado = false;
        this.aprobadoParaPlenaria = false;

    }

    public VotacionSenado(Expediente expediente,int votosAFavor, int votosEnContra, int abstenciones, int totalSenadores) {
        this.expediente=expediente;
        this.votosAFavor = votosAFavor;
        this.votosEnContra = votosEnContra;
        this.abstenciones = abstenciones;
        this.fechaVotacion = LocalDateTime.now().format(formato);
        calcularResultadoVotacion(totalSenadores);

    }

    public int getVotosAFavor() {
        return votosAFavor;
    }

    public void setVotosAFavor(int votosAFavor) {
        this.votosAFavor = votosAFavor;
    }

    public int getVotosEnContra() {
        return votosEnContra;
    }

    public void setVotosEnContra(int votosEnContra) {
        this.votosEnContra = votosEnContra;
    }

    public int getAbstenciones() {
        return abstenciones;
    }

    public void setAbstenciones(int abstenciones) {
        this.abstenciones = abstenciones;
    }

    public String getFechaVotacion() {
        return fechaVotacion;
    }

    public void setFechaVotacion(String fechaVotacion) {
        this.fechaVotacion = fechaVotacion;
    }

    public boolean isQuorumAlcanzado() {
        return quorumAlcanzado;
    }

    public void setQuorumAlcanzado(boolean quorumAlcanzado) {
        this.quorumAlcanzado = quorumAlcanzado;
    }

    public boolean isAprobadoParaPlenaria() {
        return aprobadoParaPlenaria;
    }

    public void setAprobadoParaPlenaria(boolean aprobadoParaPlenaria) {
        this.aprobadoParaPlenaria = aprobadoParaPlenaria;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
    

    public void calcularResultadoVotacion(int totalSenadores) {
        int totalEmitidos = this.votosAFavor + this.votosEnContra + this.abstenciones;

        this.quorumAlcanzado = totalEmitidos >= (totalSenadores / 2) + 1;

        if (this.quorumAlcanzado && this.votosAFavor > this.votosEnContra) {
            this.aprobadoParaPlenaria = true;
        } else {
            this.aprobadoParaPlenaria = false;
        }
    }

}
