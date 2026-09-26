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
public class Juez extends Funcionario {

    private String despachoJudicial;
    private ArrayList<Sentencia> sentenciasEmitidas;

    public Juez() {
    }

    public Juez(String despachoJudicial, String cargo, String tarjetaProfesional, String nombre, String nuip, String nacimiento) {
        super(cargo, tarjetaProfesional, nombre, nuip, nacimiento);
        this.despachoJudicial = despachoJudicial;

        sentenciasEmitidas = new ArrayList<>();
    }

    public String getDespachoJudicial() {
        return despachoJudicial;
    }

    public void setDespachoJudicial(String despachoJudicial) {
        this.despachoJudicial = despachoJudicial;
    }

    public ArrayList<Sentencia> getSentenciasEmitidas() {
        return sentenciasEmitidas;
    }

    public void setSentenciasEmitidas(ArrayList<Sentencia> sentenciasEmitidas) {
        this.sentenciasEmitidas = sentenciasEmitidas;
    }

    public void emitirSentencia(Sentencia s) {

        this.sentenciasEmitidas.add(s);

        if (s.getTipo() == TipoSentencia.CONDENATORIA) {

            SujetoActivo procesado = s.getSujetoProcesado();
            procesado.setEstadoPolitico(EstadoPolitico.CONDENADO);

            System.out.println("Fallo judicial: El sujeto ha sido CONDENADO a " + s.getPenaAnios() + " anios de prision.");
        } else if (s.getTipo() == TipoSentencia.ABSOLUTORIA) {
            System.out.println("Fallo judicial: El sujeto ha sido ABSUELTO.");
        }

    }

}
