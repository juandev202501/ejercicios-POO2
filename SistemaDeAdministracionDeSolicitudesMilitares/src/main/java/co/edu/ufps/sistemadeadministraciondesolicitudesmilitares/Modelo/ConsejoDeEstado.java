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
    private ArrayList<Expediente> expedientesRecibidos;
    private ArrayList<DemandaNulidad> demandasRecibidas;

    public ConsejoDeEstado() {
        this.demandasRecibidas = new ArrayList<>();
        this.expedientesRecibidos = new ArrayList<>();
    }

    public ConsejoDeEstado(String salaCompetente, String direccion) {
        this.salaCompetente = salaCompetente;
        this.direccion = direccion;
        this.demandasRecibidas = new ArrayList<>();
        this.expedientesRecibidos = new ArrayList<>();
    }

    public String getSalaCompetente() {
        return salaCompetente;
    }

    public void setSalaCompetente(String salaCompetente) {
        this.salaCompetente = salaCompetente;
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

    public ArrayList<Expediente> getExpedientesRecibidos() {
        return expedientesRecibidos;
    }

    public void setExpedientesRecibidos(ArrayList<Expediente> expedientesRecibidos) {
        this.expedientesRecibidos = expedientesRecibidos;
    }

    public String recibirExpediente(Expediente expediente) {
        this.expedientesRecibidos.add(expediente);
        return "EL CONSEJO DE ESTADO RECIBIO DE FORMA EXITOSA EL EXPEDIENTE (N°" + expediente.getIdExpediente() + ")";

    }

    public String emitirConceptoJuridico(Expediente expediente, boolean esFavorable, String consideraciones) {

        if (esFavorable) {
            expediente.setEstadoActual(EstadoExpediente.EN_ESTUDIO);
            return "EL CONSEJO DE ESTADO EMITIÓ CONCEPTO JURÍDICO FAVORABLE PARA EL EXPEDIENTE (N°" + expediente.getIdExpediente() + ") CONSIDERACIONES: " + consideraciones;
        } else {
            expediente.setEstadoActual(EstadoExpediente.ARCHIVADO);
            return "EL CONSEJO DE ESTADO EMITIÓ CONCEPTO JURÍDICO DESFAVORABLE PARA EL EXPEDIENTE (N°" + expediente.getIdExpediente() + ") CONSIDERACIONES: " + consideraciones;
        }
    }

    public String enviarExpedienteASenado(Expediente exp, Senado senado) {
        Expediente expediente = exp;
        return senado.recibirExpediente(exp);
    }

    public String radicarDemandaNulidad(DemandaNulidad demanda) {
        if (this.duplicado(demanda) != null) {
            return "ERROR: YA EXISTE UNA DEMANDA DE NULIDAD RADICADA CON EL ID (N°" + demanda.getIdDemanda()+")";
        }

        this.demandasRecibidas.add(demanda);
        demanda.setEstado(EstadoDemanda.RADICADA);
        return "DEMANDA DE NULIDAD (N°" + demanda.getIdDemanda() + ") RADICADA CORRECTAMENTE ANTE EL CONSEJO DE ESTADO.";
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
        return "EL CONSEJO DE ESTADO HA ADMITIDO A TRAMITE LA DEMANDA DE NULIDAD (N°" + idDemanda+")";
    }

    public Expediente buscarExpedientePorId(String idExpediente) {
        if (idExpediente == null) {
            return null;
        }
        for (Expediente e : this.expedientesRecibidos) {
            if (e != null && e.getIdExpediente().equalsIgnoreCase(idExpediente)) {
                return e;
            }
        }
        return null;
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
