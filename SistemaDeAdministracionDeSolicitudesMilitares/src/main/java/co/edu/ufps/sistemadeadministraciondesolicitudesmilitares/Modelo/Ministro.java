/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class Ministro extends Persona {

    private TipoMinistro carteraMinisterial; // Ej: "Ministerio de Relaciones Exteriores" o "Ministerio de Defensa"
    private String decretoNombramiento;

    public Ministro() {

    }

    public Ministro(String nombre, String nuip, TipoMinistro tipoMinistro, String decretoNombramiento) {
        super(nombre, nuip);
        this.carteraMinisterial = tipoMinistro;
        this.decretoNombramiento = decretoNombramiento;
    }

    public TipoMinistro getCarteraMinisterial() {
        return carteraMinisterial;
    }

    public void setCarteraMinisterial(TipoMinistro carteraMinisterial) {
        this.carteraMinisterial = carteraMinisterial;
    }

    public String getDecretoNombramiento() {
        return decretoNombramiento;
    }

    public void setDecretoNombramiento(String decretoNombramiento) {
        this.decretoNombramiento = decretoNombramiento;
    }

}
