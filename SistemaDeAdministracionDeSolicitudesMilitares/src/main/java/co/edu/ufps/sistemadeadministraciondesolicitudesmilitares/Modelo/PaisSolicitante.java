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
public class PaisSolicitante {

    private String nombrePais;
    private String codigoIso;
    private Continente continente;
    private ArrayList<AgregadoMilitar> agregados;

    public PaisSolicitante() {
        this.agregados = new ArrayList<>();
    }

    public PaisSolicitante(String nombrePais, String codigoIso, Continente continente) {
        this.nombrePais = nombrePais;
        this.codigoIso = codigoIso;
        this.continente = continente;
        this.agregados = new ArrayList<>();
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public ArrayList<AgregadoMilitar> getAgregados() {
        return agregados;
    }

    public void setAgregados(ArrayList<AgregadoMilitar> agregados) {
        this.agregados = agregados;
    }

    public String designarAgregadoMilitar(AgregadoMilitar agregado) {
        for (AgregadoMilitar existente : agregados) {
            if (existente.tieneMismoNuip(agregado)) {
                return "ERROR YA EXISTE UN AGREGADO CON EL NUIP (" + agregado.getNuip()+")";
            }
        }

        this.agregados.add(agregado);
        return "EL PAIS (" + this.nombrePais + ") HA DESIGNADO OFICIALMENTE AL AGREGADO (" + agregado.getNombre()+")";
    }

}
