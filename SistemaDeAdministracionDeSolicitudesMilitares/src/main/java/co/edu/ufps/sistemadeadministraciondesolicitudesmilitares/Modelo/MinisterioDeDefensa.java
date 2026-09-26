/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class MinisterioDeDefensa {

    private Ministro ministroTitular;
    private String sedePrincipal;
    private boolean requisitosAprobados;

    public MinisterioDeDefensa() {
    }

    public MinisterioDeDefensa(Ministro ministroTitular, String sedePrincipal, boolean requisitosAprobados) {
        this.ministroTitular = ministroTitular;
        this.sedePrincipal = sedePrincipal;
        this.requisitosAprobados = requisitosAprobados;
    }

    public Ministro getMinistroTitular() {
        return ministroTitular;
    }

    public void setMinistroTitular(Ministro ministroTitular) {
        this.ministroTitular = ministroTitular;
    }

    public String getSedePrincipal() {
        return sedePrincipal;
    }

    public void setSedePrincipal(String sedePrincipal) {
        this.sedePrincipal = sedePrincipal;
    }

    public boolean isRequisitosAprobados() {
        return requisitosAprobados;
    }

    public void setRequisitosAprobados(boolean requisitosAprobados) {
        this.requisitosAprobados = requisitosAprobados;
    }

    public String refrendarDecreto(DecretoPresidencial decreto) {
        if (decreto != null && decreto.getNumeracionOficial() != null) {
            this.requisitosAprobados = true;
            return "El Ministerio ha refrendado el decreto " + decreto.getNumeracionOficial() + ".";
        }
        this.requisitosAprobados = false;
        return "Error: Decreto inválido.";
    }

    public PlanOperacion estructurarPlanOperaciones(String idPlan, String reglas, String perimetro) {
        if (this.requisitosAprobados) {
            return new PlanOperacion(idPlan, reglas, perimetro, false);
        }
        return null;
    }
}
