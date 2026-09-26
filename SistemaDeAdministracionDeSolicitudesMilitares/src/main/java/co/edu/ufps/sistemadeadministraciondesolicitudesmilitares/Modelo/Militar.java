/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class Militar extends Persona{

    private int aniosServicio;
    private GradoMilitar grado;
    private EspecialidadCuerpo especialidad;

    public Militar() {
    }

    public Militar(int aniosServicio, GradoMilitar grado, EspecialidadCuerpo especialidad, String nombre, String nuip) {
        super(nombre, nuip);
        this.aniosServicio = aniosServicio;
        this.grado = grado;
        this.especialidad = especialidad;
    }

    

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    public GradoMilitar getGrado() {
        return grado;
    }

    public void setGrado(GradoMilitar grado) {
        this.grado = grado;
    }

    public EspecialidadCuerpo getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadCuerpo especialidad) {
        this.especialidad = especialidad;
    }

    

}
