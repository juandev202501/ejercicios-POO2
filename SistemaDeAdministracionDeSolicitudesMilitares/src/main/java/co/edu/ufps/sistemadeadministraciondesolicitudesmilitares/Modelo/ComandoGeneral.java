/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class ComandoGeneral {

    private ComandanteJefe comandanteEnJefe;
    private String sedeComando;
    private ArrayList<ContingenteMilitar> contingentesDesplegados;

    public ComandoGeneral() {
        this.contingentesDesplegados = new ArrayList<>();
    }

    public ComandoGeneral(ComandanteJefe comandanteEnJefe, String sedeComando) {
        this.comandanteEnJefe = comandanteEnJefe;
        this.sedeComando = sedeComando;
        this.contingentesDesplegados = new ArrayList<>();
    }

    public ComandanteJefe getComandanteEnJefe() {
        return comandanteEnJefe;
    }

    public void setComandanteEnJefe(ComandanteJefe comandanteEnJefe) {
        this.comandanteEnJefe = comandanteEnJefe;
    }

    public String getSedeComando() {
        return sedeComando;
    }

    public void setSedeComando(String sedeComando) {
        this.sedeComando = sedeComando;
    }

    public ArrayList<ContingenteMilitar> getContingentesDesplegados() {
        return contingentesDesplegados;
    }

    public void setContingentesDesplegados(ArrayList<ContingenteMilitar> contingentesDesplegados) {
        this.contingentesDesplegados = contingentesDesplegados;
    }

    public String autorizarDespliegueContingente(ContingenteMilitar contingente) {
        if (this.duplicado(contingente) != null) {
            return "ERROR: EL CONTINGENTE CON ID " + contingente.getIdContingente() + " YA SE ENCUENTRA REGISTRADO EN EL COMANDO GENERAL";
        }

        this.contingentesDesplegados.add(contingente);
        return "EL COMANDANTE JEFE HA REVISADO Y APROBADO EL DESPLIEGUE DEL CONTINGENTE: " + contingente.getIdContingente() + " AUTORIZADO Y REGISTRADO EN EL COMANDO GENERAL";
    }

    public ContingenteMilitar duplicado(ContingenteMilitar nuevo) {
        for (ContingenteMilitar contingente : this.contingentesDesplegados) {
            if (contingente.getIdContingente().equalsIgnoreCase(nuevo.getIdContingente())) {
                return contingente;
            }
        }
        return null;
    }

    public String revocarContingentesPorDecreto(DecretoPresidencial decretoAnulado) {
        ArrayList<String> idsARevocar = new ArrayList<>();

        for (ContingenteMilitar cont : this.contingentesDesplegados) {
            if (cont.getDecretoRespaldo().equals(decretoAnulado)) {
                idsARevocar.add(cont.getIdContingente());
            }
        }

        StringBuilder reporte = new StringBuilder();
        for (String idCont : idsARevocar) {
            this.revocarDespliegueContingente(idCont);
            reporte.append("\n -> COMANDO GENERAL: REVOCADA LA ORDEN DE DESPLIEGUE DEL CONTINGENTE ").append(idCont);
        }

        return reporte.toString();
    }

    public boolean revocarDespliegueContingente(String idContingente) {
        for (int i = 0; i < this.contingentesDesplegados.size(); i++) {
            if (this.contingentesDesplegados.get(i).getIdContingente().equalsIgnoreCase(idContingente)) {
                this.contingentesDesplegados.remove(i);
                return true;
            }
        }
        return false;
    }
}
