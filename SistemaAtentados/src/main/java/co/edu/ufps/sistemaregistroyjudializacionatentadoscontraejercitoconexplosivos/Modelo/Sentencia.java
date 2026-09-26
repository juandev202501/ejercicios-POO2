/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author JUAN DAVID
 */
public class Sentencia {
   private TipoSentencia tipo;       
    private int penaAnios;
    private LocalDateTime fechaEmision;
    private Atentado atentadoAsociado;
    private Juez juezEmisor;
    private SujetoActivo sujetoProcesado;

    public Sentencia() {
    }

    public Sentencia(TipoSentencia tipo, int penaAnios, LocalDateTime fechaEmision, Atentado atentadoAsociado, Juez juezEmisor, SujetoActivo sujetoProcesado) {
        if (tipo == TipoSentencia.CONDENATORIA && penaAnios > 60) {
            throw new IllegalArgumentException("Violación del Art. 31 del Código Penal: La pena condenatoria no puede superar los 60 años.");
        }
        this.tipo = tipo;
        this.penaAnios = penaAnios;
        this.fechaEmision = fechaEmision;
        this.atentadoAsociado = atentadoAsociado;
        this.juezEmisor = juezEmisor;
        this.sujetoProcesado = sujetoProcesado;
    }

    public TipoSentencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoSentencia tipo) {
        this.tipo = tipo;
    }

    public int getPenaAnios() {
        return penaAnios;
    }

    public void setPenaAnios(int penaAnios) {
        this.penaAnios = penaAnios;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Atentado getAtentadoAsociado() {
        return atentadoAsociado;
    }

    public void setAtentadoAsociado(Atentado atentadoAsociado) {
        this.atentadoAsociado = atentadoAsociado;
    }

    public Juez getJuezEmisor() {
        return juezEmisor;
    }

    public void setJuezEmisor(Juez juezEmisor) {
        this.juezEmisor = juezEmisor;
    }

    public SujetoActivo getSujetoProcesado() {
        return sujetoProcesado;
    }

    public void setSujetoProcesado(SujetoActivo sujetoProcesado) {
        this.sujetoProcesado = sujetoProcesado;
    }
    
}
