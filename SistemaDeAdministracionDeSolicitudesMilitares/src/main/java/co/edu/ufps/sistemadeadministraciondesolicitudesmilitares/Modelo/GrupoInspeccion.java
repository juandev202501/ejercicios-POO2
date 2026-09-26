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
public class GrupoInspeccion {

    private String idGrupo;
    private String nombreUnidad;
    private int numeroIntegrantes;
    private String liderGrupo;
    private ArrayList<OficialInspector> inspectores;

    public GrupoInspeccion() {
    }

    public GrupoInspeccion(String idGrupo, String nombreUnidad, int numeroIntegrantes, String liderGrupo) {
        this.idGrupo = idGrupo;
        this.nombreUnidad = nombreUnidad;
        this.numeroIntegrantes = numeroIntegrantes;
        this.liderGrupo = liderGrupo;
        this.inspectores = new ArrayList<>();

    }

    public ArrayList<OficialInspector> getInspectores() {
        return inspectores;
    }

    public void setInspectores(ArrayList<OficialInspector> inspectores) {
        this.inspectores = inspectores;
    }

    public String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public String getLiderGrupo() {
        return liderGrupo;
    }

    public void setLiderGrupo(String liderGrupo) {
        this.liderGrupo = liderGrupo;
    }

    public boolean verificarCumplimiento(PlanOperacion plan) {
        return plan != null && plan.isPlanAprobado();
    }

    public String generarInforme(boolean cumplimientoConfirmado) {
        if (cumplimientoConfirmado) {
            return "Informe: Las tropas operan bajo las reglas de compromiso.";
        }
        return "ALERTA: Desviaciones del perímetro detectadas.";
    }

    public String asignarInspector(OficialInspector inspector) {
        if (inspector != null) {
            this.inspectores.add(inspector);
            return "Oficial asignado exitosamente al grupo de inspección " + this.idGrupo + ".";
        }
        return "Error: No se pudo asignar al oficial inspector.";
    }
}
