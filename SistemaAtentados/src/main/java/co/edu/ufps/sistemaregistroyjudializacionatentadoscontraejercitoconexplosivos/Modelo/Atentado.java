/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class Atentado extends Suceso{
    
    private ArrayList<TipoPenal> calificacionesJuridicas;
    private ArrayList<Novedad> novedades;
            
    public Atentado() {
        this.calificacionesJuridicas= new ArrayList<>();
        this.novedades= new ArrayList<>();
    }

    public Atentado(ArrayList<TipoPenal> calificacionesJuridicas, ArrayList<Novedad> novedades, EscenaDelHecho escenaDelHecho) {
        super(escenaDelHecho);
        this.calificacionesJuridicas = calificacionesJuridicas;
        this.novedades = novedades;
    }

    
    
    public List<TipoPenal> getCalificacionesJuridicas() {
        return calificacionesJuridicas;
    }

    public void setCalificacionesJuridicas(ArrayList<TipoPenal> calificacionesJuridicas) {
        this.calificacionesJuridicas = calificacionesJuridicas;
    }
    
    public void agregarCalificacionJuridica(TipoPenal tipoPenal) {
        if (tipoPenal != null) {
            this.calificacionesJuridicas.add(tipoPenal);
        }
    }
    
    public void agregarNovedad(Novedad novedad)
    {
        this.novedades.add(novedad);
    }
}
