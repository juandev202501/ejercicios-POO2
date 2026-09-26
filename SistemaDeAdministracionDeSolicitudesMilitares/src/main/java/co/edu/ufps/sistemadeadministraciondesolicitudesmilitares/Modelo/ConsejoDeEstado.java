/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class ConsejoDeEstado {

    private String salaCompetente;
    private boolean peticionComsultaRecibida;
    private boolean demandaNulidadRecibida;

    public ConsejoDeEstado() {
    }

    public ConsejoDeEstado(String salaCompetente, boolean peticionComsultaRecibida, boolean demandaNulidadRecibida) {
        this.salaCompetente = salaCompetente;
        this.peticionComsultaRecibida = peticionComsultaRecibida;
        this.demandaNulidadRecibida = demandaNulidadRecibida;
    }

    public String getSalaCompetente() {
        return salaCompetente;
    }

    public void setSalaCompetente(String salaCompetente) {
        this.salaCompetente = salaCompetente;
    }

    public boolean isPeticionComsultaRecibida() {
        return peticionComsultaRecibida;
    }

    public void setPeticionComsultaRecibida(boolean peticionComsultaRecibida) {
        this.peticionComsultaRecibida = peticionComsultaRecibida;
    }

    public boolean isDemandaNulidadRecibida() {
        return demandaNulidadRecibida;
    }

    public void setDemandaNulidadRecibida(boolean demandaNulidadRecibida) {
        this.demandaNulidadRecibida = demandaNulidadRecibida;
    }

    public ConceptoJuridico evaluarConsulta(Expediente expediente) {
        if (expediente != null && expediente.isDocumentacionCompleta()) {
            this.peticionComsultaRecibida = true;
            return new ConceptoJuridico("CJ-" + java.time.LocalDateTime.now().getYear(), java.time.LocalDateTime.now(), "Ajustado a la Constitución.", true);
        }
        return null;
    }

    public FalloJudicial evaluarDemanda(DemandaNulidad demanda) {
        if (demanda != null && demanda.isDemandaAdmitida()) {
            this.demandaNulidadRecibida = true;
            return new FalloJudicial("FALLO-" + demanda.getIdDemanda(), java.time.LocalDateTime.now(), "Magistrado Sala Plena", false, "ruta/sentencia.pdf");
        }
        return null;
    }

}
