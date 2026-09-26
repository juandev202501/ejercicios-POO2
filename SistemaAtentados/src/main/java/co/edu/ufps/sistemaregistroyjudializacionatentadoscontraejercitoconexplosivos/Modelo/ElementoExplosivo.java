/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class ElementoExplosivo extends ElementoMateriaProbatorio {
    private String clasificacionPreliminar;
    private String autoridadDeDesactivacion;
    private boolean riesgoActivo;

    public ElementoExplosivo() {
    }

    public String getClasificacionPreliminar() {
        return clasificacionPreliminar;
    }

    public void setClasificacionPreliminar(String clasificacionPreliminar) {
        this.clasificacionPreliminar = clasificacionPreliminar;
    }

    public String getAutoridadDeDesactivacion() {
        return autoridadDeDesactivacion;
    }

    public void setAutoridadDeDesactivacion(String autoridadDeDesactivacion) {
        this.autoridadDeDesactivacion = autoridadDeDesactivacion;
    }

    public boolean isRiesgoActivo() {
        return riesgoActivo;
    }

    public void setRiesgoActivo(boolean riesgoActivo) {
        this.riesgoActivo = riesgoActivo;
    }
            

    
}
