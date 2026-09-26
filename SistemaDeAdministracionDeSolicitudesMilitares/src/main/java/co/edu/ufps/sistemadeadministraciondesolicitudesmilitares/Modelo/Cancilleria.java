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
public class Cancilleria {

    private Ministro ministroRepresentante;
    private String sedeOficial;
    private boolean sistemaRadicacionActivo;
    private boolean requisitosValidos;
    private boolean estadoaprobado;
    private ArrayList<NotaDiplomatica> notasRecibidas;

    public Cancilleria() {
    }

    public Cancilleria(Ministro ministroRepresentante, String sedeOficial, boolean sistemaRadicacionActivo, boolean requisitosValidos, boolean estadoaprobado) {
        this.ministroRepresentante = ministroRepresentante;
        this.sedeOficial = sedeOficial;
        this.sistemaRadicacionActivo = sistemaRadicacionActivo;
        this.requisitosValidos = requisitosValidos;
        this.estadoaprobado = estadoaprobado;
        this.notasRecibidas = new ArrayList<>();
    }

    public ArrayList<NotaDiplomatica> getNotasRecibidas() {
        return notasRecibidas;
    }

    public void setNotasRecibidas(ArrayList<NotaDiplomatica> notasRecibidas) {
        this.notasRecibidas = notasRecibidas;
    }

    public Ministro getMinistroRepresentante() {
        return ministroRepresentante;
    }

    public void setMinistroRepresentante(Ministro ministroRepresentante) {
        this.ministroRepresentante = ministroRepresentante;
    }

    public String getSedeOficial() {
        return sedeOficial;
    }

    public void setSedeOficial(String sedeOficial) {
        this.sedeOficial = sedeOficial;
    }

    public boolean isSistemaRadicacionActivo() {
        return sistemaRadicacionActivo;
    }

    public void setSistemaRadicacionActivo(boolean sistemaRadicacionActivo) {
        this.sistemaRadicacionActivo = sistemaRadicacionActivo;
    }

    public boolean isRequisitosValidos() {
        return requisitosValidos;
    }

    public void setRequisitosValidos(boolean requisitosValidos) {
        this.requisitosValidos = requisitosValidos;
    }

    public boolean isEstadoaprobado() {
        return estadoaprobado;
    }

    public void setEstadoaprobado(boolean estadoaprobado) {
        this.estadoaprobado = estadoaprobado;
    }

    public boolean verificarCredencialesNota(NotaDiplomatica nota) {
        if (nota != null && nota.getAcriditacionEmisor() != null && !nota.getAcriditacionEmisor().isEmpty()) {
            this.requisitosValidos = true;
            return true;
        }
        this.requisitosValidos = false;
        return false;
    }

    public String registrarRadicacion(NotaDiplomatica nota) {
        if (verificarCredencialesNota(nota)) {
            nota.setEstadoRadicacion(true);
            this.notasRecibidas.add(nota);
            this.sistemaRadicacionActivo = true;
            return "Éxito: La nota diplomática " + nota.getIdNota() + " ha sido radicada oficialmente.";
        }
        return "Error: La nota diplomática no superó la verificación.";
    }

    public Expediente crearExpediente(String idExpediente) {
        if (this.sistemaRadicacionActivo) {
            return new Expediente(idExpediente, java.time.LocalDateTime.now(), EstadoExpediente.RADICADO, false);
        }
        return null;
    }

}
