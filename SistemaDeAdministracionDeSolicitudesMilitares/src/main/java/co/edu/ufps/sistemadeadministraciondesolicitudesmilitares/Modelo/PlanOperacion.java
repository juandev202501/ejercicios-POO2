/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class PlanOperacion {
    private String idPlan;
    private  String reglasCompromiso;
    private String perimetrSeguridad;
    private boolean planAprobado;

    public PlanOperacion() {
    }

    public PlanOperacion(String idPlan, String reglasCompromiso, String perimetrSeguridad, boolean planAprobado) {
        this.idPlan = idPlan;
        this.reglasCompromiso = reglasCompromiso;
        this.perimetrSeguridad = perimetrSeguridad;
        this.planAprobado = planAprobado;
    }

    public String getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(String idPlan) {
        this.idPlan = idPlan;
    }

    public String getReglasCompromiso() {
        return reglasCompromiso;
    }

    public void setReglasCompromiso(String reglasCompromiso) {
        this.reglasCompromiso = reglasCompromiso;
    }

    public String getPerimetrSeguridad() {
        return perimetrSeguridad;
    }

    public void setPerimetrSeguridad(String perimetrSeguridad) {
        this.perimetrSeguridad = perimetrSeguridad;
    }

    public boolean isPlanAprobado() {
        return planAprobado;
    }

    public void setPlanAprobado(boolean planAprobado) {
        this.planAprobado = planAprobado;
    }
    
    public boolean verificarEstrategia() {
        boolean reglasLlenas = (this.reglasCompromiso != null && !this.reglasCompromiso.trim().isEmpty());
        boolean perimetroLleno = (this.perimetrSeguridad != null && !this.perimetrSeguridad.trim().isEmpty());
        
        if (reglasLlenas && perimetroLleno) {
            this.planAprobado = true;
            return true;
        }
        this.planAprobado = false;
        return false;
    }
    
}
