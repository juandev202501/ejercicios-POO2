/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class Militar extends Persona {

    private GradoMilitar grado;
    private RamaMilitar rama;
    private String unidadAdscrita;

    public Militar() {

    }

    public Militar(String nombre, String nuip, GradoMilitar grado, RamaMilitar rama, String unidadAdscrita) {
        super(nombre, nuip);
        this.grado = grado;
        this.rama = rama;
        this.unidadAdscrita = unidadAdscrita;
    }

    public GradoMilitar getGrado() {
        return grado;
    }

    public void setGrado(GradoMilitar grado) {
        this.grado = grado;
    }

    public RamaMilitar getRama() {
        return rama;
    }

    public void setRama(RamaMilitar rama) {
        this.rama = rama;
    }

    public String getUnidadAdscrita() {
        return unidadAdscrita;
    }

    public void setUnidadAdscrita(String unidadAdscrita) {
        this.unidadAdscrita = unidadAdscrita;
    }

}
