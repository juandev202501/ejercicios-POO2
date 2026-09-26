/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author JUAN DAVID
 */
public class InformePericial {
    private Perito perito;
    private String conclusionTecnica;
    private LocalDateTime fechaDictamen;

    public InformePericial() {
    }

    public InformePericial(Perito perito, String conclusionTecnica, LocalDateTime fechaDictamen) {
        this.perito = perito;
        this.conclusionTecnica = conclusionTecnica;
        this.fechaDictamen = fechaDictamen;
    }

    public Perito getPerito() {
        return perito;
    }

    public void setPerito(Perito perito) {
        this.perito = perito;
    }

    public String getConclusionTecnica() {
        return conclusionTecnica;
    }

    public void setConclusionTecnica(String conclusionTecnica) {
        this.conclusionTecnica = conclusionTecnica;
    }

    public LocalDateTime getFechaDictamen() {
        return fechaDictamen;
    }

    public void setFechaDictamen(LocalDateTime fechaDictamen) {
        this.fechaDictamen = fechaDictamen;
    }
    
}
