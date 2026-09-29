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
    ArrayList<Expediente> expedientesRecibidos;
    ArrayList<Expediente> expedientesAvalados;

    public Senado() {
        this.totalSenadores = 108;
        this.historialVotaciones = new ArrayList<>();
        this.expedientesRecibidos = new ArrayList<>();
        this.expedientesAvalados= new ArrayList<>();
    }

    public Senado(int totalSenadores, String mesaDirectiva) {
        this.totalSenadores = totalSenadores;
        this.mesaDirectiva = mesaDirectiva;
        this.historialVotaciones = new ArrayList<>();
        this.expedientesRecibidos = new ArrayList<>();
        this.expedientesAvalados= new ArrayList<>();
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

    public ArrayList<Expediente> getExpedientesRecibidos() {
        return expedientesRecibidos;
    }

    public void setExpedientesRecibidos(ArrayList<Expediente> expedientesRecibidos) {
        this.expedientesRecibidos = expedientesRecibidos;
    }

    public String recibirExpediente(Expediente expediente) {

        this.expedientesRecibidos.add(expediente);

        return "EL SENADO RECIBIÓ EL EXPEDIENTE (N°" + expediente.getIdExpediente() + ") PARA TRÁMITE LEGISLATIVO.";
    }

    public Expediente buscarExpedientePorId(String idExpediente) {
        if (idExpediente == null) {
            return null;
        }
        for (Expediente e : this.expedientesRecibidos) {
            if (e != null && e.getIdExpediente().equalsIgnoreCase(idExpediente)) {
                return e;
            }
        }
        return null;
    }

    public String someterAVotacionExpediente(Expediente expediente, int aFavor, int enContra, int abstencion) {
        VotacionSenado votacion = new VotacionSenado(expediente,aFavor, enContra, abstencion, this.totalSenadores);
        this.historialVotaciones.add(votacion);
        votacion.calcularResultadoVotacion(this.totalSenadores);

        if (votacion.isAprobadoParaPlenaria()) {
            expediente.setEstadoActual(EstadoExpediente.AVALADO);
            return "EL SENADO A  APROBADO EL EXPEDIENTE (N°" + expediente.getIdExpediente() + ") ESTADO ACTUALIZADO A AVALADO";
        } else {
            expediente.setEstadoActual(EstadoExpediente.ARCHIVADO);
            return "EL SENADO HA RECHAZADO O NO CUMPLIO QUORUM PARA EL EXPEDIENTE (N°" + expediente.getIdExpediente() + ") ESTADO ACTUALIZADO A ARCHIVADO";
        }
    }

    public ArrayList<Expediente> obtenerExpedientesPendientes() {
        ArrayList<Expediente> pendientes = new ArrayList<>();
        if (this.expedientesRecibidos != null) {
            for (Expediente exp : this.expedientesRecibidos) {
                if (exp != null && exp.getEstadoActual() != EstadoExpediente.AVALADO
                        && exp.getEstadoActual() != EstadoExpediente.ARCHIVADO) {
                    pendientes.add(exp);
                }
            }
        }
        return pendientes;
    }

    public String enviarExpedienteAPresidencia(String idExpediente, Presidente presidente) {
        
        Expediente exp = buscarExpedientePorId(idExpediente);
        return presidente.recibirExpediente(exp);
    }
}
