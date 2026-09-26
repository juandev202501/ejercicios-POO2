/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.fortaleza.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class DocenteCatedral extends Docente{
    private int numeroDeContratoSemestral;
    private int  NumeroDeHorasQueDictaSemanamente;
    private int ValorHora;

    public DocenteCatedral() {
    }

    public DocenteCatedral(int numeroDeContratoSemestral, int NumeroDeHorasQueDictaSemanamente, int ValorHora, int salarioBasico, int salarioMensual, String codigo, String nombreCompleto, String tituloAcademico, Departamento departeamento) {
        super(salarioBasico, salarioMensual, codigo, nombreCompleto, tituloAcademico, departeamento);
        this.numeroDeContratoSemestral = numeroDeContratoSemestral;
        this.NumeroDeHorasQueDictaSemanamente = NumeroDeHorasQueDictaSemanamente;
        this.ValorHora = ValorHora;
    }

    public int getNumeroDeContratoSemestral() {
        return numeroDeContratoSemestral;
    }

    public void setNumeroDeContratoSemestral(int numeroDeContratoSemestral) {
        this.numeroDeContratoSemestral = numeroDeContratoSemestral;
    }

    public int getNumeroDeHorasQueDictaSemanamente() {
        return NumeroDeHorasQueDictaSemanamente;
    }

    public void setNumeroDeHorasQueDictaSemanamente(int NumeroDeHorasQueDictaSemanamente) {
        this.NumeroDeHorasQueDictaSemanamente = NumeroDeHorasQueDictaSemanamente;
    }

    public int getValorHora() {
        return ValorHora;
    }

    public void setValorHora(int ValorHora) {
        this.ValorHora = ValorHora;
    }

    @Override
    public void SalarioMensual() {
        this.salarioMensual=(double)((this.NumeroDeHorasQueDictaSemanamente*4)*this.ValorHora);
        
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("numeroDeHorasQueDictaSemanalmente="+this.NumeroDeHorasQueDictaSemanamente+"numerodeContratoSemestral="+this.numeroDeContratoSemestral+"\n"+"valorHora="+this.ValorHora);
    }
    

    
}
