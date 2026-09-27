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
    private int cantidadEfectivos;
    private PaisSolicitante paisOrigen;
    private ArrayList<Militar> efectivos;
    private DecretoPresidencial decretoRespaldo;

    public ContingenteMilitar() {
        this.efectivos = new ArrayList<>();
    }

    public ContingenteMilitar(String idContingente, int cantidadEfectivos, PaisSolicitante paisOrigen,  DecretoPresidencial decretoRespaldo) {
        this.idContingente = idContingente;
        this.cantidadEfectivos = cantidadEfectivos;
        this.paisOrigen = paisOrigen;
        this.decretoRespaldo= decretoRespaldo;
        this.efectivos = new ArrayList<>();
    }

    public String getIdContingente() {
        return idContingente;
    }

    public void setIdContingente(String idContingente) {
        this.idContingente = idContingente;
    }

    public int getCantidadEfectivos() {
        return cantidadEfectivos;
    }

    public void setCantidadEfectivos(int cantidadEfectivos) {
        this.cantidadEfectivos = cantidadEfectivos;
    }

    public PaisSolicitante getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisSolicitante paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public ArrayList<Militar> getEfectivos() {
        return efectivos;
    }

    public void setEfectivos(ArrayList<Militar> efectivos) {
        this.efectivos = efectivos;
    }

    public DecretoPresidencial getDecretoRespaldo() {
        return decretoRespaldo;
    }

    public void setDecretoRespaldo(DecretoPresidencial decretoRespaldo) {
        this.decretoRespaldo = decretoRespaldo;
    }
    

    public String registrarMilitar(Militar militar) {
        if (this.duplicado(militar) != null) {
            return "ERROR: EL MILITAR CON NUIP " + militar.getNuip() + " YA ESTA REGISTRADO EN ESTE CONTINGENTE.";
        }

        this.efectivos.add(militar);
        return "MILITAR REGISTRADO CORRECTAMENTE EN EL CONTINGENTE " + this.idContingente;
    }

    public Militar duplicado(Militar nuevo) {
        for (Militar militar : this.efectivos) {
            if (militar.getNuip().equalsIgnoreCase(nuevo.getNuip())) {
                return militar;
            }
        }
        return null;
    }
}
