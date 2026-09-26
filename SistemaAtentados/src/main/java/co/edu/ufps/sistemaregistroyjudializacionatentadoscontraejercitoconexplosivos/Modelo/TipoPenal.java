/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author estudiante
 */
public class TipoPenal {
    private String nombre;
    private  String articulo;

    public TipoPenal() {
    }

    public TipoPenal(String nombre, String articulo) {
        this.nombre = nombre;
        this.articulo = articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    public void mostrarDatos()
    {
        System.out.println("El nombre del delito es:"+getNombre());
        System.out.println("El articulo que encasilla el delito:"+getArticulo());
    }
    
    
}
