/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class CiudadanoImpugnante extends Persona {

    private String motivoImpugnacion;
    private boolean demandaAdmitida;

    public CiudadanoImpugnante() {
    }

    public CiudadanoImpugnante(String motivoImpugnacion, boolean demandaAdmitida) {
        this.motivoImpugnacion = motivoImpugnacion;
        this.demandaAdmitida = demandaAdmitida;
    }

    public String getMotivoImpugnacion() {
        return motivoImpugnacion;
    }

    public void setMotivoImpugnacion(String motivoImpugnacion) {
        this.motivoImpugnacion = motivoImpugnacion;
    }

    public boolean isDemandaAdmitida() {
        return demandaAdmitida;
    }

    public void setDemandaAdmitida(boolean demandaAdmitida) {
        this.demandaAdmitida = demandaAdmitida;
    }

    public DemandaNulidad interponerDemanda(String idDemanda, String fundamentos) {
        if (fundamentos != null && !fundamentos.isEmpty()) {
            return new DemandaNulidad(idDemanda, java.time.LocalDateTime.now(), fundamentos, true, false);
        }
        return null;
    }

    public String presentarPruebas(String descripcionPrueba) {
        return "Evidencia anexada por " + this.getNombre() + ": " + descripcionPrueba;
    }

}
