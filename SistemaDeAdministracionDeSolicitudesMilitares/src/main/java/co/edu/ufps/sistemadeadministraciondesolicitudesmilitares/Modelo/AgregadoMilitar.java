/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class AgregadoMilitar extends Persona {
    private PaisSolicitante paisOrigen;
    private String numeroPasaporte;
    private RamaMilitar rama;

    public AgregadoMilitar() {
    }

    public AgregadoMilitar(PaisSolicitante paisOrigen, String numeroPasaporte, RamaMilitar rama, String nombre, String nuip) {
        super(nombre, nuip);
        this.paisOrigen = paisOrigen;
        this.numeroPasaporte = numeroPasaporte;
        this.rama = rama;
    }

    

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public RamaMilitar getRama() {
        return rama;
    }

    public void setRama(RamaMilitar rama) {
        this.rama = rama;
    }

    public PaisSolicitante getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisSolicitante paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    public NotaDiplomatica emitirYFirmarNota(String idNota, String contenido) {
        return new NotaDiplomatica(idNota, contenido, this.getNombre(), this.numeroPasaporte);
    }
    
}
