/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class BaseMilitar {
    private String idBase;
    private String nombreBase;
    private String ubicacion;
    private int capacidadAlojamiento;
    private boolean activaOperativa;
    private ArrayList<ContingenteMilitar>contingentes;

    public BaseMilitar() {
    }

    public BaseMilitar(String idBase, String nombreBase, String ubicacion, int ccapacidadAlojamiento, boolean activaOperativa) {
        this.idBase = idBase;
        this.nombreBase = nombreBase;
        this.ubicacion = ubicacion;
        this.capacidadAlojamiento = ccapacidadAlojamiento;
        this.activaOperativa = activaOperativa;
        this.contingentes=new ArrayList<>();
    }

    public String getIdBase() {
        return idBase;
    }

    public void setIdBase(String idBase) {
        this.idBase = idBase;
    }

    public String getNombreBase() {
        return nombreBase;
    }

    public void setNombreBase(String nombreBase) {
        this.nombreBase = nombreBase;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidadAlojamiento() {
        return capacidadAlojamiento;
    }

    public void setCapacidadAlojamiento(int capacidadAlojamiento) {
        this.capacidadAlojamiento = capacidadAlojamiento;
    }

    public boolean isActivaOperativa() {
        return activaOperativa;
    }

    public void setActivaOperativa(boolean activaOperativa) {
        this.activaOperativa = activaOperativa;
    }

    public ArrayList<ContingenteMilitar> getContingentes() {
        return contingentes;
    }

    public void setContingentes(ArrayList<ContingenteMilitar> contingentes) {
        this.contingentes = contingentes;
    }
    
    
}
