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
public class VotacionSenado {

    private int votosAFavor;
    private int votosEnContra;
    private int abstenciones;
    private LocalDateTime fechaVotacion;
    private boolean quorumAlcanzado;
    private boolean aprobadoParaPlenaria;

    public VotacionSenado() {
    }

    public VotacionSenado(int votosAFavor, int votosEnContra, int abstenciones, LocalDateTime fechaVotacion, boolean quorumAlcanzado, boolean aprobadoParaPlenaria) {
        this.votosAFavor = votosAFavor;
        this.votosEnContra = votosEnContra;
        this.abstenciones = abstenciones;
        this.fechaVotacion = fechaVotacion;
        this.quorumAlcanzado = quorumAlcanzado;
        this.aprobadoParaPlenaria = aprobadoParaPlenaria;
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

    public LocalDateTime getFechaVotacion() {
        return fechaVotacion;
    }

    public void setFechaVotacion(LocalDateTime fechaVotacion) {
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

    public String calcularResultado(int totalSenadores) {
        int totalVotos = this.votosAFavor + this.votosEnContra + this.abstenciones;
        int quorumMinimo = (totalSenadores / 2) + 1;

        if (totalVotos >= quorumMinimo) {
            this.quorumAlcanzado = true;
            if (this.votosAFavor > this.votosEnContra) {
                this.aprobadoParaPlenaria = true;
                return "Resultado: Aprobado con " + this.votosAFavor + " votos a favor.";
            } else {
                this.aprobadoParaPlenaria = false;
                return "Resultado: Rechazado por votos insuficientes.";
            }
        } else {
            this.quorumAlcanzado = false;
            this.aprobadoParaPlenaria = false;
            return "Alerta: Votación nula por falta de quórum.";
        }
    }

}
