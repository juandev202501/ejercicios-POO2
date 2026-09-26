/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.fortaleza.Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author JUAN DAVID
 */
public class DocentePlanta extends Docente{
    private int numeroDePuntosSalarial;
    private int valorDelPuntoSalarial;
    private String categoria;
    private int numeroDeResolucionDeNombramiento;
    private LocalDateTime fehaNombramieto;

    public DocentePlanta() {
    }

    public DocentePlanta(int numeroDePuntosSalarial, int valorDelPuntoSalarial, String categoria, int numreoDeResolucionDeNombramiento, LocalDateTime fehaNombramieto, int salarioBasico, int salarioMensual, String codigo, String nombreCompleto, String tituloAcademico, Departamento departeamento) {
        super(salarioBasico, salarioMensual, codigo, nombreCompleto, tituloAcademico, departeamento);
        this.numeroDePuntosSalarial = numeroDePuntosSalarial;
        this.valorDelPuntoSalarial = valorDelPuntoSalarial;
        this.categoria = categoria;
        this.numeroDeResolucionDeNombramiento = numreoDeResolucionDeNombramiento;
        this.fehaNombramieto = fehaNombramieto;
    }

    public int getNumeroDePuntosSalarial() {
        return numeroDePuntosSalarial;
    }

    public void setNumeroDePuntosSalarial(int numeroDePuntosSalarial) {
        this.numeroDePuntosSalarial = numeroDePuntosSalarial;
    }

    public int getValorDelPuntoSalarial() {
        return valorDelPuntoSalarial;
    }

    public void setValorDelPuntoSalarial(int valorDelPuntoSalarial) {
        this.valorDelPuntoSalarial = valorDelPuntoSalarial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumeroDeResolucionDeNombramiento() {
        return numeroDeResolucionDeNombramiento;
    }

    public void setNumeroDeResolucionDeNombramiento(int numeroDeResolucionDeNombramiento) {
        this.numeroDeResolucionDeNombramiento = numeroDeResolucionDeNombramiento;
    }

    public LocalDateTime getFehaNombramieto() {
        return fehaNombramieto;
    }

    public void setFehaNombramieto(LocalDateTime fehaNombramieto) {
        this.fehaNombramieto = fehaNombramieto;
    }

    

    @Override
    public void SalarioMensual() {
        this.salarioMensual=this.salarioBasico+(this.valorDelPuntoSalarial*numeroDePuntosSalarial);
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("numeroDePuntosSalarial="+this.numeroDePuntosSalarial+"\n"+"ValorDelPuntoSalarial="+this.valorDelPuntoSalarial+"\n"+"cattegoria="+this.categoria+"\n"+"numeroDeResolucionDeNombramiento="+this.numeroDeResolucionDeNombramiento+"\n"+"fechaNombraMiento="+this.fehaNombramieto);
    }
    
    

    
    
}
