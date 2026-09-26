/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author JUAN DAVID
 */
public class ConceptoJuridico {

    private String idConcepto;
    private LocalDateTime fechaEmision;
    private String dictamen;
    private boolean esFavorable;

    public ConceptoJuridico() {
    }

    public ConceptoJuridico(String idConcepto, LocalDateTime fechaEmision, String dictamen, boolean esFavorable) {
        this.idConcepto = idConcepto;
        this.fechaEmision = fechaEmision;
        this.dictamen = dictamen;
        this.esFavorable = esFavorable;
    }

    public String getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDictamen() {
        return dictamen;
    }

    public void setDictamen(String dictamen) {
        this.dictamen = dictamen;
    }

    public boolean isEsFavorable() {
        return esFavorable;
    }

    public void setEsFavorable(boolean esFavorable) {
        this.esFavorable = esFavorable;
    }

    public String emitirDictamen() {
        if (this.esFavorable) {
            return "Dictamen favorable (" + this.idConcepto + "): El trámite pasa al Presidente.";
        }
        return "Dictamen desfavorable (" + this.idConcepto + "): Se bloquea el tránsito militar.";
    }

    public boolean verificarFiabilidad() {
        return this.dictamen != null && !this.dictamen.isEmpty();
    }

}
