/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class EscenaDelHecho {
    private LocalDateTime fecha;
    private String municipio;
    private String coordenadas;
    private ArrayList<ElementoMateriaProbatorio> materialesRecolectados;

    public EscenaDelHecho() {
    }

    public EscenaDelHecho(LocalDateTime fecha, String municipio, String coordenadas, ArrayList<ElementoMateriaProbatorio> materialesRecolectados) {
        this.fecha = fecha;
        this.municipio = municipio;
        this.coordenadas = coordenadas;
        this.materialesRecolectados = materialesRecolectados;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public ArrayList<ElementoMateriaProbatorio> getMaterialesRecolectados() {
        return materialesRecolectados;
    }

    public void setMaterialesRecolectados(ArrayList<ElementoMateriaProbatorio> materialesRecolectados) {
        this.materialesRecolectados = materialesRecolectados;
    }

    

}
