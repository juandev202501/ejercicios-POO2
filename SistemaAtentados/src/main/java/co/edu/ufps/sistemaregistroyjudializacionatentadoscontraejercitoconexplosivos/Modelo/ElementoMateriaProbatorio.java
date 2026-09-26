/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class ElementoMateriaProbatorio {
    protected String codigoEMP; 
    protected String cadenaCustodia;  
    protected InformePericial informePericial;

    public ElementoMateriaProbatorio() {
    }

    public ElementoMateriaProbatorio(String codigoEMP, String cadenaCustodia, InformePericial informePericial) {
        this.codigoEMP = codigoEMP;
        this.cadenaCustodia = cadenaCustodia;
        this.informePericial = informePericial;
    }

    public String getCodigoEMP() {
        return codigoEMP;
    }

    public void setCodigoEMP(String codigoEMP) {
        this.codigoEMP = codigoEMP;
    }

    public String getCadenaCustodia() {
        return cadenaCustodia;
    }

    public void setCadenaCustodia(String cadenaCustodia) {
        this.cadenaCustodia = cadenaCustodia;
    }

    public InformePericial getInformePericial() {
        return informePericial;
    }

    public void setInformePericial(InformePericial informePericial) {
        this.informePericial = informePericial;
    }
    
}
