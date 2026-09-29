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
public class Presidente extends Persona {

    private String despacho;
    private String periodoMandato;
    private ArrayList<Expediente> expedientesRecibidos;
    private ArrayList<DecretoPresidencial> decretosRedactados;
    private ArrayList<DecretoPresidencial> decretosFirmados;

    public Presidente() {
        this.expedientesRecibidos = new ArrayList<>();
        this.decretosRedactados = new ArrayList<>();
    }

    public Presidente(String despacho, String periodoMandato, String nombre, String nuip) {
        super(nombre, nuip);
        this.despacho = despacho;
        this.periodoMandato = periodoMandato;
        this.expedientesRecibidos = new ArrayList<>();
        this.decretosRedactados = new ArrayList<>();
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

    public ArrayList<Expediente> getExpedientesRecibidos() {
        return expedientesRecibidos;
    }

    public void setExpedientesRecibidos(ArrayList<Expediente> expedientesRecibidos) {
        this.expedientesRecibidos = expedientesRecibidos;
    }

    public ArrayList<DecretoPresidencial> getDecretosRedactados() {
        return decretosRedactados;
    }

    public void setDecretosRedactados(ArrayList<DecretoPresidencial> decretosRedactados) {
        this.decretosRedactados = decretosRedactados;
    }

    public DecretoPresidencial expedirDecreto(String numeracionOficial, int tiempoVigenciaDias, String consideraciones, Expediente expediente) {
        return new DecretoPresidencial(numeracionOficial, tiempoVigenciaDias, consideraciones, expediente);
    }

    public String recibirExpediente(Expediente expediente) {

        this.expedientesRecibidos.add(expediente);
        return "PRESIDENCIA HA RECIBIDO EL EXPEDIENTE (N°" + expediente.getIdExpediente() + ") AVALADO POR EL SENADO.";
    }

    public Expediente buscarExpedientePorId(String idExpediente) {
        for (Expediente e : this.expedientesRecibidos) {
            if (e != null && e.getIdExpediente().equalsIgnoreCase(idExpediente)) {
                return e;
            }
        }
        return null;
    }

    public String crearDecreto(Expediente expediente, String numeracionOficial, int tiempoVigenciaDias, String consideraciones) {

       
        DecretoPresidencial nuevoDecreto = new DecretoPresidencial(numeracionOficial, tiempoVigenciaDias, consideraciones, expediente);

        this.decretosRedactados.add(nuevoDecreto);
        
        return "BORRADOR DE DECRETO (N°" + numeracionOficial + ") REGISTRADO EXITOSAMENTE PARA EL EXPEDIENTE (N°" + expediente.getIdExpediente() + ") PENDIENTE DE SANCIÓN.";
    }
    public DecretoPresidencial buscarDecretoPorNumero(String numeroOficial) {
    if (this.decretosRedactados != null) {
        for (DecretoPresidencial d : this.decretosRedactados) {
            if (d != null && d.getNumeracionOficial().equalsIgnoreCase(numeroOficial)) {
                return d;
            }
        }
    }
    return null;
}
}
