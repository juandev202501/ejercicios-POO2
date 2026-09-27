/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;


/**
 *
 * @author JUAN DAVID
 */
public class Presidente extends Persona {

    private String despacho;
    private String periodoMandato;

    public Presidente() {
    }

    public Presidente(String despacho, String periodoMandato, String nombre, String nuip) {
        super(nombre, nuip);
        this.despacho = despacho;
        this.periodoMandato = periodoMandato;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getPeriodoMandato() {
        return periodoMandato;
    }

    public void setPeriodoMandato(String periodoMandato) {
        this.periodoMandato = periodoMandato;
    }

    public DecretoPresidencial expedirDecreto(String numeracionOficial, int tiempoVigenciaDias, Expediente expediente) {
        return new DecretoPresidencial(numeracionOficial, tiempoVigenciaDias, expediente);
    }
}
