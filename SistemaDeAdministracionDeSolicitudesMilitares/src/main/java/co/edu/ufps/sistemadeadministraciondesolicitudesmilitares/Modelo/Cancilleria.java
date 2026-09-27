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
    private ArrayList<NotaDiplomatica> notasRadicadas;

    public Cancilleria() {
        this.notasRadicadas = new ArrayList<>();
        this.sistemaRadicacionActivo = true;
    }

    public Cancilleria(Ministro ministroRepresentante, String sedeOficial) {
        this.ministroRepresentante = ministroRepresentante;
        this.sedeOficial = sedeOficial;
        this.sistemaRadicacionActivo = true;
        this.notasRadicadas = new ArrayList<>();
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

    public ArrayList<NotaDiplomatica> getNotasRadicadas() {
        return notasRadicadas;
    }

    public void setNotasRadicadas(ArrayList<NotaDiplomatica> notasRadicadas) {
        this.notasRadicadas = notasRadicadas;
    }
    
    public String radicarNotaDiplomatica(NotaDiplomatica nuevaNota)
    {
        if(this.duplicado(nuevaNota)!=null)
        {
            return "ERROR: YA EXISTE UNA NOTA DIPLOMATICA REGISTRADA CON EL ID "+nuevaNota.getIdNota();
        }
        nuevaNota.setEstadoRadicacion(true);
        return "NOTA DIPLOMATICA "+nuevaNota.getIdNota()+" RADICADA CON EXITO EN CANCILLERIA";
    }

    public NotaDiplomatica duplicado(NotaDiplomatica nuevo) {
        for (NotaDiplomatica notaRadicada : notasRadicadas) {
            if (notaRadicada.getIdNota().equalsIgnoreCase(nuevo.getIdNota())) {
                return notaRadicada;
            }

        }
        return null;
    }

}
