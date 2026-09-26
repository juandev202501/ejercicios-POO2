/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class ExpedientePenal {
    private String numeroRadicado;
    private EstadoProcesal estadoProcesal;
    private Atentado atentado;

    public ExpedientePenal() {
    }

    public ExpedientePenal(String numeroRadicado, EstadoProcesal estadoProcesal, Atentado atentado) {
        this.numeroRadicado = numeroRadicado;
        this.estadoProcesal = estadoProcesal;
        this.atentado = atentado;
    }

    public String getNumeroRadicado() {
        return numeroRadicado;
    }

    public void setNumeroRadicado(String numeroRadicado) {
        this.numeroRadicado = numeroRadicado;
    }

    public EstadoProcesal getEstadoProcesal() {
        return estadoProcesal;
    }

    public void setEstadoProcesal(EstadoProcesal estadoProcesal) {
        this.estadoProcesal = estadoProcesal;
    }

    public Atentado getAtentado() {
        return atentado;
    }

    public void setAtentado(Atentado atentado) {
        this.atentado = atentado;
    }
    
    
}
