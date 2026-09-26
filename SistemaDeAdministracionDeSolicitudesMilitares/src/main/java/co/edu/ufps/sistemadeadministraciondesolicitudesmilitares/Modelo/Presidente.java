/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

/**
 *
 * @author JUAN DAVID
 */
public class Presidente extends Persona{
    private String despacho;
    private boolean solicitoConceptoPrevio;
    private boolean autorizacionSenadoRecibida;
    private String inicioYFinDelMandato;

    public Presidente() {
    }

    public Presidente(String despacho, boolean solicitoConceptoPrevio, boolean autorizacionSenadoRecibida, String inicioYFinDelMandato, String nombre, String nuip) {
        super(nombre, nuip);
        this.despacho = despacho;
        this.solicitoConceptoPrevio = solicitoConceptoPrevio;
        this.autorizacionSenadoRecibida = autorizacionSenadoRecibida;
        this.inicioYFinDelMandato = inicioYFinDelMandato;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public boolean isSolicitoConceptoPrevio() {
        return solicitoConceptoPrevio;
    }

    public void setSolicitoConceptoPrevio(boolean solicitoConceptoPrevio) {
        this.solicitoConceptoPrevio = solicitoConceptoPrevio;
    }

    public boolean isAutorizacionSenadoRecibida() {
        return autorizacionSenadoRecibida;
    }

    public void setAutorizacionSenadoRecibida(boolean autorizacionSenadoRecibida) {
        this.autorizacionSenadoRecibida = autorizacionSenadoRecibida;
    }

    public String getInicioYFinDelMandato() {
        return inicioYFinDelMandato;
    }

    public void setInicioYFinDelMandato(String inicioYFinDelMandato) {
        this.inicioYFinDelMandato = inicioYFinDelMandato;
    }
    
    public String radicarEnSenado(Expediente expediente) {
        if (expediente != null && expediente.isDocumentacionCompleta()) {
            return "El expediente " + expediente.getIdEspediente() + " fue radicado en el Senado.";
        }
        return "Error: Expediente incompleto.";
    }

    public DecretoPresidencial expedirDecreto(Expediente expediente, boolean avalSenado) {
        if (expediente != null && avalSenado) {
            DecretoPresidencial nuevoDecreto = new DecretoPresidencial("DEC-AUTO-" + java.time.LocalDateTime.now().getYear());
            nuevoDecreto.setFechaExpedicion(java.time.LocalDateTime.now());
            nuevoDecreto.setTiempoVigenciaDias(90); 
            return nuevoDecreto; 
        }
        return null; 
    }

    public String firmarDecreto(DecretoPresidencial decreto) {
        if (decreto != null) {
            return "Decreto " + decreto.getNumeracionOficial() + " firmado. Tránsito autorizado.";
        }
        return "Trámite detenido: No hay decreto válido.";
    }
    
}
