/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;



/**
 *
 * @author JUAN DAVID
 */
public class Suceso {
    protected EscenaDelHecho escenaDelHecho;
    

    public Suceso() {
    }

    public Suceso(EscenaDelHecho escenaDelHecho) {
        this.escenaDelHecho = escenaDelHecho;
    }

    public EscenaDelHecho getEscenaDelHecho() {
        return escenaDelHecho;
    }

    public void setEscenaDelHecho(EscenaDelHecho escenaDelHecho) {
        this.escenaDelHecho = escenaDelHecho;
    }
    
}
