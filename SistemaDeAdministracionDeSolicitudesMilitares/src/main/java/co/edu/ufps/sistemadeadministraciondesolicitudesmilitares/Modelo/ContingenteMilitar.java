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
public class ContingenteMilitar {

    private String idContingente;
    private String paisOrigen;
    private int numeroEfectivo;
    private String tipoTropas;
    private boolean ingresoAutorizado;
    private ArrayList<Militar> tropas;

    public ContingenteMilitar() {
    }

    public ContingenteMilitar(String idContingente, String paisOrigen, int numeroEfectivo, String tipoTropas, boolean ingresoAutorizado) {
        this.idContingente = idContingente;
        this.paisOrigen = paisOrigen;
        this.numeroEfectivo = numeroEfectivo;
        this.tipoTropas = tipoTropas;
        this.ingresoAutorizado = ingresoAutorizado;
        this.tropas = new ArrayList<>();
    }

    public ArrayList<Militar> getTropas() {
        return tropas;
    }

    public void setTropas(ArrayList<Militar> tropas) {
        this.tropas = tropas;
    }

    public String getIdContingente() {
        return idContingente;
    }

    public void setIdContingente(String idContingente) {
        this.idContingente = idContingente;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getNumeroEfectivo() {
        return numeroEfectivo;
    }

    public void setNumeroEfectivo(int numeroEfectivo) {
        this.numeroEfectivo = numeroEfectivo;
    }

    public String getTipoTropas() {
        return tipoTropas;
    }

    public void setTipoTropas(String tipoTropas) {
        this.tipoTropas = tipoTropas;
    }

    public boolean isIngresoAutorizado() {
        return ingresoAutorizado;
    }

    public void setIngresoAutorizado(boolean ingresoAutorizado) {
        this.ingresoAutorizado = ingresoAutorizado;
    }

    public String agregarMilitar(Militar nuevoSoldado) {
        if (nuevoSoldado != null) {
            this.tropas.add(nuevoSoldado);
            return "Militar con NUIP " + nuevoSoldado.getNuip() + " asignado al contingente " + this.idContingente;
        }
        return "Error: Militar inválido.";
    }
}
