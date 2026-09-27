/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class Senado {

    private int totalSenadores;
    private String mesaDirectiva;
    private ArrayList<VotacionSenado> historialVotaciones;

    public Senado() {
        this.totalSenadores = 108;
        this.historialVotaciones = new ArrayList<>();
    }

    public Senado(int totalSenadores, String mesaDirectiva) {
        this.totalSenadores = totalSenadores;
        this.mesaDirectiva = mesaDirectiva;
        this.historialVotaciones = new ArrayList<>();
    }

    public int getTotalSenadores() {
        return totalSenadores;
    }

    public void setTotalSenadores(int totalSenadores) {
        this.totalSenadores = totalSenadores;
    }

    public String getMesaDirectiva() {
        return mesaDirectiva;
    }

    public void setMesaDirectiva(String mesaDirectiva) {
        this.mesaDirectiva = mesaDirectiva;
    }

    public ArrayList<VotacionSenado> getHistorialVotaciones() {
        return historialVotaciones;
    }

    public void setHistorialVotaciones(ArrayList<VotacionSenado> historialVotaciones) {
        this.historialVotaciones = historialVotaciones;
    }
    public String someterAVotacionExpediente(Expediente expediente, int aFavor, int enContra, int abstencion) {
        VotacionSenado votacion = new VotacionSenado(aFavor, enContra, abstencion, this.totalSenadores);
        this.historialVotaciones.add(votacion);
        
        if (votacion.isAprobadoParaPlenaria()) {
            expediente.setEstadoActual(EstadoExpediente.AVALADO);
            return "EL SENADO A  APROBADO EL EXPEDIENTE " + expediente.getIdExpediente() + " ESTADO ACTUALIZADO A AVALADO";
        } else {
            expediente.setEstadoActual(EstadoExpediente.ARCHIVADO);
            return "EL SENADO HA RECHAZADO O NO CUMPLIO QUORUM PARA EL EXPEDIENTE " + expediente.getIdExpediente() + " ESTADO ACTUALIZADO A ARCHIVADO";
        }
    }

}
