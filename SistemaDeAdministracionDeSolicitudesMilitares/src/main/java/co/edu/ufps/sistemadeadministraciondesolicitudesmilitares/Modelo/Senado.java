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
    private String presidentePonencia;
    private boolean ponenciaAprobada;
    private ArrayList<VotacionSenado>votaciones;

    public Senado() {
    }

    public Senado(int totalSenadores, String presidentePonencia, boolean ponenciaAprobada) {
        this.totalSenadores = totalSenadores;
        this.presidentePonencia = presidentePonencia;
        this.ponenciaAprobada = ponenciaAprobada;
        this.votaciones=new ArrayList<>();
    }

    public ArrayList<VotacionSenado> getVotaciones() {
        return votaciones;
    }

    public void setVotaciones(ArrayList<VotacionSenado> votaciones) {
        this.votaciones = votaciones;
    }
    

    public int getTotalSenadores() {
        return totalSenadores;
    }

    public void setTotalSenadores(int totalSenadores) {
        this.totalSenadores = totalSenadores;
    }

    public String getPresidentePonencia() {
        return presidentePonencia;
    }

    public void setPresidentePonencia(String presidentePonencia) {
        this.presidentePonencia = presidentePonencia;
    }

    public boolean isPonenciaAprobada() {
        return ponenciaAprobada;
    }

    public void setPonenciaAprobada(boolean ponenciaAprobada) {
        this.ponenciaAprobada = ponenciaAprobada;
    }
    
    public String estudiarSolicitud(Expediente exp) {
        if(exp != null && exp.isDocumentacionCompleta()){
            return "El Senado inicia estudio del expediente.";
        }
        return "Expediente inválido para estudio.";
    }

    public String ejecutarVotacion(VotacionSenado acta) {
        if(acta != null) {
            this.votaciones.add(acta);
            return "Acta de votación registrada en el Senado.";
        }
        return "Error al registrar votación.";
    }
}
