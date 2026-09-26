/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class Fiscal extends Funcionario{
    private ArrayList<Atentado> casos;

    public Fiscal() {
    
        this.casos=new ArrayList<>();
    }
    
    public void agregarCaso(Atentado caso)
    {
        this.casos.add(caso);
    }

    
    
}
