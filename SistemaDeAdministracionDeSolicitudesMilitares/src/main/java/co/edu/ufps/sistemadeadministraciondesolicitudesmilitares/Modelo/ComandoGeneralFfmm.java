/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class ComandoGeneralFfmm {

    private String comandanteGeneral;
    private String sede;

    public ComandoGeneralFfmm() {
    }

    public ComandoGeneralFfmm(String comandanteGeneral, String sede) {
        this.comandanteGeneral = comandanteGeneral;
        this.sede = sede;
    }

    public String getComandanteGeneral() {
        return comandanteGeneral;
    }

    public void setComandanteGeneral(String comandanteGeneral) {
        this.comandanteGeneral = comandanteGeneral;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public InspeccionOperativa ordenarIspeccion(String idInspeccion, GrupoInspeccion grupo) {
        if (grupo != null) {
            return new InspeccionOperativa(idInspeccion, grupo, java.time.LocalDateTime.now(), true, true);
        }
        return null;
    }

    public String supervisarTropas(ContingenteMilitar contingente) {
        if (contingente != null && contingente.isIngresoAutorizado()) {
            return "Supervisión Operativa: Monitoreando al contingente " + contingente.getIdContingente() + ".";
        }
        return "Alerta: El contingente no cuenta con autorización.";
    }

}
