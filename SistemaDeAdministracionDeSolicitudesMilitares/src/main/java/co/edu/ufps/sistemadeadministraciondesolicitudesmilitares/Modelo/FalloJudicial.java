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
public class FalloJudicial {

    private String idFallo;
    private LocalDateTime fechaFallo;
    private String magistradoPonente;
    private boolean esNulo;
    private String archivoSentencia;

    public FalloJudicial() {
    }

    public FalloJudicial(String idFallo, LocalDateTime fechaFallo, String magistradoPonente, boolean esNulo, String archivoSentencia) {
        this.idFallo = idFallo;
        this.fechaFallo = fechaFallo;
        this.magistradoPonente = magistradoPonente;
        this.esNulo = esNulo;
        this.archivoSentencia = archivoSentencia;
    }

    public String getIdFallo() {
        return idFallo;
    }

    public void setIdFallo(String idFallo) {
        this.idFallo = idFallo;
    }

    public LocalDateTime getFechaFallo() {
        return fechaFallo;
    }

    public void setFechaFallo(LocalDateTime fechaFallo) {
        this.fechaFallo = fechaFallo;
    }

    public String getMagistradoPonente() {
        return magistradoPonente;
    }

    public void setMagistradoPonente(String magistradoPonente) {
        this.magistradoPonente = magistradoPonente;
    }

    public boolean isEsNulo() {
        return esNulo;
    }

    public void setEsNulo(boolean esNulo) {
        this.esNulo = esNulo;
    }

    public String getArchivoSentencia() {
        return archivoSentencia;
    }

    public void setArchivoSentencia(String archivoSentencia) {
        this.archivoSentencia = archivoSentencia;
    }

    public String ordenarSuspension() {
        if (this.esNulo) {
            return "Fallo Cautelar: SUSPENSIÓN INMEDIATA del tránsito de tropas.";
        }
        return "Fallo Cautelar: Se niega la suspensión. Misión activa.";
    }

    public String aplicarMedida() {
        if (this.esNulo) {
            return "Sentencia: Decreto ANULADO por el magistrado " + this.magistradoPonente + ".";
        }
        return "Sentencia: Demanda desestimada. Archívese.";
    }
}
