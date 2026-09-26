/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class EjercitoNacional {

    private String sigla;
    private String nombre;
    private String mision;
    private ArrayList<Militar> militares;

    public EjercitoNacional() {
        this.militares = new ArrayList<>();
    }

    public EjercitoNacional(String sigla, String nombre, String mision) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.mision = mision;
        this.militares = new ArrayList<>();
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public ArrayList<Militar> getMilitares() {
        return militares;
    }

    public void setMilitares(ArrayList<Militar> militares) {
        this.militares = militares;
    }

    public void reportarNovedad(String nombre, Clasificacion clasificacion, LocalDateTime fecha, Atentado atentado) {
        Novedad novedad = new Novedad(nombre, clasificacion, fecha, atentado);
        atentado.agregarNovedad(novedad);

    }

    public void activarProtocoloSeguridad() {
        System.out.println("Protocolos de seguridad activados...");
    }
}
