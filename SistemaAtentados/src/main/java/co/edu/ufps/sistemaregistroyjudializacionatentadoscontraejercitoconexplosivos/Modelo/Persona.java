/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author estudiante
 */
public class Persona {
    protected String nombre;
    protected String nuip;
    protected String nacimiento;

    public Persona() {
    }

    public Persona(String nombre, String nuip, String nacimiento) {
        this.nombre = nombre;
        this.nuip = nuip;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNuip() {
        return nuip;
    }

    public void setNuip(String nuip) {
        this.nuip = nuip;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    
}
