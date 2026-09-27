/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class ComandanteJefe extends Persona{
    private GradoMilitar rango; 
    private RamaMilitar fuerza; 
    private String decretoNombramiento;

    public ComandanteJefe() {
    }

    public ComandanteJefe(GradoMilitar rango, RamaMilitar fuerza, String decretoNombramiento, String nombre, String nuip) {
        super(nombre, nuip);
        this.rango = rango;
        this.fuerza = fuerza;
        this.decretoNombramiento = decretoNombramiento;
    }

    public GradoMilitar getRango() {
        return rango;
    }

    public void setRango(GradoMilitar rango) {
        this.rango = rango;
    }

    public RamaMilitar getFuerza() {
        return fuerza;
    }

    public void setFuerza(RamaMilitar fuerza) {
        this.fuerza = fuerza;
    }

    public String getDecretoNombramiento() {
        return decretoNombramiento;
    }

    public void setDecretoNombramiento(String decretoNombramiento) {
        this.decretoNombramiento = decretoNombramiento;
    }
    
}
