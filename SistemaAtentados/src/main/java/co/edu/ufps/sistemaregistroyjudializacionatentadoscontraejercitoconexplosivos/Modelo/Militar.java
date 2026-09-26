/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author estudiante
 */
public class Militar extends Persona{
    private String grado;
    private String estado;
    private String unidadAsignada;

    public Militar() {
    }

    public Militar(String estado, String unidadAsignada, String nombre, String nuip, String nacimiento) {
        super(nombre, nuip, nacimiento);
        this.estado = estado;
        this.unidadAsignada = unidadAsignada;
    }

    

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUnidadAsignada() {
        return unidadAsignada;
    }

    public void setUnidadAsignada(String unidadAsignada) {
        this.unidadAsignada = unidadAsignada;
    }
   
    
    
}
