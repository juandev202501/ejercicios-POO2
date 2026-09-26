/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class Funcionario extends Persona{
    protected String cargo;
    protected String tarjetaProfesional;

    public Funcionario() {
    }

    public Funcionario(String cargo, String tarjetaProfesional, String nombre, String nuip, String nacimiento) {
        super(nombre, nuip, nacimiento);
        this.cargo = cargo;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
    
    
    
}
