/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class Perito extends Persona {

    private String terjetaProfesional;
    private String especialidad;

    public Perito() {
    }

    public Perito(String terjetaProfesional, String especialidad, String nombre, String nuip, String nacimiento) {
        super(nombre, nuip, nacimiento);
        this.terjetaProfesional = terjetaProfesional;
        this.especialidad = especialidad;
    }

    public String getTerjetaProfesional() {
        return terjetaProfesional;
    }

    public void setTerjetaProfesional(String terjetaProfesional) {
        this.terjetaProfesional = terjetaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
