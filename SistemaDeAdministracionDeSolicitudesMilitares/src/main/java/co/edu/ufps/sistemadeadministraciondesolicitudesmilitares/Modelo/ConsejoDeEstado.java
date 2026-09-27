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
public class ConsejoDeEstado {

    private String salaCompetente;
    private String direccion;
    private boolean conceptoEmitido;
    private ArrayList<DemandaNulidad> demandasRecibidas;

    public ConsejoDeEstado() {
        this.conceptoEmitido = false;
        this.demandasRecibidas = new ArrayList<>();
    }

    public ConsejoDeEstado(String salaCompetente, String direccion) {
        this.salaCompetente = salaCompetente;
        this.direccion = direccion;
        this.conceptoEmitido = false;
        this.demandasRecibidas = new ArrayList<>();
    }

    public String getSalaCompetente() {
        return salaCompetente;
    }

    public void setSalaCompetente(String salaCompetente) {
        this.salaCompetente = salaCompetente;
    }

    public boolean isConceptoEmitido() {
        return conceptoEmitido;
    }

    public void setConceptoEmitido(boolean conceptoEmitido) {
        this.conceptoEmitido = conceptoEmitido;
    }

    public ArrayList<DemandaNulidad> getDemandasRecibidas() {
        return demandasRecibidas;
    }

    public void setDemandasRecibidas(ArrayList<DemandaNulidad> demandasRecibidas) {
        this.demandasRecibidas = demandasRecibidas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    public String emitirConceptoJuridico(Expediente expediente) {
        if (!expediente.isDocumentacionCompleta()) {
            return "ERROR: EL EXPEDIENTE" + expediente.getIdExpediente() + " CARECE DE LA DOCUMENTACION COMPLETA REQUERIDA PARA EMITIR CONCEPTO JURIDICO ";
        }
        expediente.setEstadoActual(EstadoExpediente.EN_ESTUDIO);
        this.conceptoEmitido = true;
        return "EL CONSEJO DE ESTADO EMITIO CONCEPTO JURIDICO FAVORABLE PARA EL EXPEDIENTE: " + expediente.getIdExpediente();
    }

    public String radicarDemandaNulidad(DemandaNulidad demanda) {
        if (this.duplicado(demanda) != null) {
            return "ERROR: YA EXISTE UNA DEMANDA DE NULIDAD RADICADA CON EL ID " + demanda.getIdDemanda();
        }

        this.demandasRecibidas.add(demanda);
        demanda.setEstado(EstadoDemanda.RADICADA);
        return "DEMANDA DE NULIDAD " + demanda.getIdDemanda() + " RADICADA CORRECTAMENTE ANTE EL CONSEJO DE ESTADO.";
    }

    public DemandaNulidad duplicado(DemandaNulidad nueva) {
        for (DemandaNulidad demanda : this.demandasRecibidas) {
            if (demanda.getIdDemanda().equalsIgnoreCase(nueva.getIdDemanda())) {
                return demanda;
            }
        }
        return null;
    }

    public DemandaNulidad buscar(String id) {
        for (DemandaNulidad demandaRecibida : demandasRecibidas) {
            if (demandaRecibida.getIdDemanda().equalsIgnoreCase(id)) {
                return demandaRecibida;
            }

        }
        return null;
    }

    public String admitirDemandaNulidad(String idDemanda) {
        DemandaNulidad demanda = this.buscar(idDemanda);

        demanda.setEstado(EstadoDemanda.ADMITIDA);
        return "EL CONSEJO DE ESTADO HA ADMITIDO A TRAMITE LA DEMANDA DE NULIDAD " + idDemanda;
    }

    public String fallarDemandaNulidad(String idDemanda, boolean estimarDemanda) {
        DemandaNulidad demanda = this.buscar(idDemanda);

        if (demanda.getEstado() != EstadoDemanda.ADMITIDA) {
            return "ERROR: LA DEMANDA " + idDemanda + " NO HA SIDO ADMITIDA PARA ESTUDIO (ESTADO ACTUAL: "
                    + demanda.getEstado() + ") Y NO SE PUEDE FALLAR.";
        }

        if (estimarDemanda) {
            demanda.setEstado(EstadoDemanda.ESTIMADA);

            DecretoPresidencial decreto = demanda.getDecretoDemandado();
            decreto.getExpedienteAsociado().setEstadoActual(EstadoExpediente.ARCHIVADO);

            return "SENTENCIA ESTIMATORIA: EL CONSEJO DE ESTADO DECLARO LA NULIDAD DEL DECRETO "
                    + decreto.getNumeracionOficial()
                    + ". EL EXPEDIENTE PASA A ESTADO ARCHIVADO Y PIERDE EFECTOS LEGALES.";
        } else {
            demanda.setEstado(EstadoDemanda.DESESTIMADA);

            return "SENTENCIA DESESTIMATORIA: EL CONSEJO DE ESTADO NEGO LA DEMANDA DE NULIDAD " + idDemanda
                    + ". SE CONFIRMA LA PLENA VALIDEZ DEL DECRETO Y LA DEMANDA QUEDA ARCHIVADA.";
        }
    }

}
