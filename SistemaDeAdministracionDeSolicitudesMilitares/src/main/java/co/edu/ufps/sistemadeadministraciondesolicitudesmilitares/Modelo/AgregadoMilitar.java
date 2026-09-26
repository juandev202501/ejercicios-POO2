/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class AgregadoMilitar extends Persona{
    private String numeroPasaporte;
    private RamaMilitar rama;

    public AgregadoMilitar() {
    }

    public AgregadoMilitar(String numeroPasaporte, RamaMilitar rama, String nombre, String nuip) {
        super(nombre, nuip);
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
   
    public NotaDiplomatica emitirYFirmarNota(String idNota, String contenido) {
        
        String acreditacion = "Pasaporte: " + this.getNumeroPasaporte() + " - Rama: " + this.getRama();
        NotaDiplomatica nuevaNota = new NotaDiplomatica(
            idNota,
            java.time.LocalDateTime.now(), // Fecha exacta de la firma
            contenido,
            this.getNombre(), // Nombre del emisor (heredado de Persona)[cite: 1]
            acreditacion,
            false // Empieza en false porque aún no ha sido radicada en Cancillería[cite: 23]
        );
        return nuevaNota;
    }
    
    
}
