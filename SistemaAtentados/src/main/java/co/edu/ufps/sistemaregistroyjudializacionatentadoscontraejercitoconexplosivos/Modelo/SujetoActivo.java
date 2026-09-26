/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class SujetoActivo extends Persona{
    private EstadoPolitico estadoPolitico;
    private EstructuraArmadaIlegal estructuraArmadaIlegalRelacionada;

    public SujetoActivo() {
    }

    public SujetoActivo(EstadoPolitico estadoPolitico, EstructuraArmadaIlegal estructuraArmadaIlegalRelacionada, String nombre, String nuip, String nacimiento) {
        super(nombre, nuip, nacimiento);
        this.estadoPolitico = estadoPolitico;
        this.estructuraArmadaIlegalRelacionada = estructuraArmadaIlegalRelacionada;
    }

    public EstadoPolitico getEstadoPolitico() {
        return estadoPolitico;
    }

    public void setEstadoPolitico(EstadoPolitico estadoPolitico) {
        this.estadoPolitico = estadoPolitico;
    }

    public EstructuraArmadaIlegal getEstructuraArmadaIlegalRelacionada() {
        return estructuraArmadaIlegalRelacionada;
    }

    public void setEstructuraArmadaIlegalRelacionada(EstructuraArmadaIlegal estructuraArmadaIlegalRelacionada) {
        this.estructuraArmadaIlegalRelacionada = estructuraArmadaIlegalRelacionada;
    }
    
}
