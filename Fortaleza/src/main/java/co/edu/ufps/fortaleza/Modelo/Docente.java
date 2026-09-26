/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.fortaleza.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class Docente {
    protected double salarioBasico;
    protected double salarioMensual;
    protected String codigo;
    protected String nombreCompleto;
    protected String tituloAcademico;
    protected  Departamento departamento;

    public Docente(double salarioBasico, double salarioMensual, String codigo, String nombreCompleto, String tituloAcademico, Departamento departamento) {
        this.salarioBasico = salarioBasico;
        this.salarioMensual = salarioMensual;
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.tituloAcademico = tituloAcademico;
        this.departamento = departamento;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Docente() {
    }

    

    public void SalarioMensual(){};
    public void MostrarInfo(){
        System.out.println("Nombre="+this.nombreCompleto+"\n"+"salarioBasico="+this.salarioBasico+"\n"+"COdigo="+this.codigo+"\n"+"salarioMensual="+this.salarioMensual+"\n"+"Titulo Academico="+this.tituloAcademico+"\n"+"Ddepartamento="+this.departamento.getNombre()+"\n");
    
        };

    
    
    
}
