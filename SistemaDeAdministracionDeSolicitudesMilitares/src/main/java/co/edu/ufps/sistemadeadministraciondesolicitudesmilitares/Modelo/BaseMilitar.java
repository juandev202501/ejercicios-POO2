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
    private String nombre;
    private String ubicacionGeografica;
    private int capacidadMaximaEfectivos;
    private ArrayList<ContingenteMilitar> contingentesAlojamientos;

    public BaseMilitar() {
        this.contingentesAlojamientos = new ArrayList<>();
    }

    public BaseMilitar(String idBase, String nombre, String ubicacionGeografica, int capacidadMaximaEfectivos) {
        this.idBase = idBase;
        this.nombre = nombre;
        this.ubicacionGeografica = ubicacionGeografica;
        this.capacidadMaximaEfectivos = capacidadMaximaEfectivos;
        this.contingentesAlojamientos = new ArrayList<>();
    }

    public String getIdBase() {
        return idBase;
    }

    public void setIdBase(String idBase) {
        this.idBase = idBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public int getCapacidadMaximaEfectivos() {
        return capacidadMaximaEfectivos;
    }

    public void setCapacidadMaximaEfectivos(int capacidadMaximaEfectivos) {
        this.capacidadMaximaEfectivos = capacidadMaximaEfectivos;
    }

    public ArrayList<ContingenteMilitar> getContingentesAlojamientos() {
        return contingentesAlojamientos;
    }

    public void setContingentesAlojamientos(ArrayList<ContingenteMilitar> contingentesAlojamientos) {
        this.contingentesAlojamientos = contingentesAlojamientos;
    }

    public String alojarContingente(ContingenteMilitar contingente) {
        if (this.duplicado(contingente) != null) {
            return "ERROR: EL CONTINGENTE CON ID " + contingente.getIdContingente() + " YA SE ENCUENTRA ALOJADO EN ESTA BASE";
        }

        this.contingentesAlojamientos.add(contingente);
        return "CONTINGENTE " + contingente.getIdContingente() + " ALOJADO EXITOSAMENTE EN LA BASE " + this.nombre;
    }

    public ContingenteMilitar duplicado(ContingenteMilitar nuevo) {
        for (ContingenteMilitar cont : this.contingentesAlojamientos) {
            if (cont.getIdContingente().equalsIgnoreCase(nuevo.getIdContingente())) {
                return cont;
            }
        }
        return null;
    }
    public boolean retirarContingente(String idContingente) {
        for (int i = 0; i < this.contingentesAlojamientos.size(); i++) {
            if (this.contingentesAlojamientos.get(i).getIdContingente().equalsIgnoreCase(idContingente)) {
                this.contingentesAlojamientos.remove(i);
                return true;
            }
        }
        return false;
    }

}
