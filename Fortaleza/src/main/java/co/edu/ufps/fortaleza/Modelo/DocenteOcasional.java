/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.fortaleza.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class DocenteOcasional extends Docente{

    public DocenteOcasional() {
    }

    public DocenteOcasional(int salarioBasico, int salarioMensual, String codigo, String nombreCompleto, String tituloAcademico, Departamento departeamento) {
        super(salarioBasico, salarioMensual, codigo, nombreCompleto, tituloAcademico, departeamento);
        
    }


    @Override
    public void SalarioMensual() {
        this.salarioMensual=this.salarioBasico;
    }
    
}
