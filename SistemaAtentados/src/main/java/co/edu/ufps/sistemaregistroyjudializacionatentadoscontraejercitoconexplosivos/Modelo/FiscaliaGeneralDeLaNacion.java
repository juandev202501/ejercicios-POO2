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
public class FiscaliaGeneralDeLaNacion {

    private ArrayList<Fiscal> fiscalesDelegados;

    public FiscaliaGeneralDeLaNacion() {
      this.fiscalesDelegados=new ArrayList<>();
    }
    

    public void asignarCaso(Atentado atentado, Fiscal fiscal) {
        if(fiscalesDelegados.contains(fiscal))
        {
            fiscal.agregarCaso(atentado);
        }
        else
        {
            System.out.println("FISCAL NO REGISTRADO EN LOS DELEGADOS DE LA FISCALIA GENERAL DE LA NACION");
        }
    }
}
