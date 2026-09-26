/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class OficialInspector {
    private GradoMilitar rango;
    private EspecialidadInspector especialidad;

    public OficialInspector() {
    }

    public OficialInspector(GradoMilitar rango, EspecialidadInspector especialidad) {
        this.rango = rango;
        this.especialidad = especialidad;
    }

    public GradoMilitar getRango() {
        return rango;
    }

    public void setRango(GradoMilitar rango) {
        this.rango = rango;
    }

    public EspecialidadInspector getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadInspector especialidad) {
        this.especialidad = especialidad;
    }

    
    public String reportarHallazgo(String observacion) {
        if (observacion != null && !observacion.trim().isEmpty()) {
            return "Reporte del Inspector (" + this.especialidad + "): " + observacion;
        }
        return "Error: Observación vacía.";
    }
}
