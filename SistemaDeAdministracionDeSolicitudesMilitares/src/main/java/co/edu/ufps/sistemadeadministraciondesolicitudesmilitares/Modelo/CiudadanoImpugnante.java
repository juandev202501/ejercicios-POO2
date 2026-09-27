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
    private String organizacionRepresentada;
    private String correoContacto;

    public CiudadanoImpugnante() {
    }

    public CiudadanoImpugnante(String organizacionRepresentada, String correoContacto, String nombre, String nuip) {
        super(nombre, nuip);
        this.organizacionRepresentada = organizacionRepresentada;
        this.correoContacto = correoContacto;
    }

    public String getOrganizacionRepresentada() {
        return organizacionRepresentada;
    }

    public void setOrganizacionRepresentada(String organizacionRepresentada) {
        this.organizacionRepresentada = organizacionRepresentada;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }
    
    
}
