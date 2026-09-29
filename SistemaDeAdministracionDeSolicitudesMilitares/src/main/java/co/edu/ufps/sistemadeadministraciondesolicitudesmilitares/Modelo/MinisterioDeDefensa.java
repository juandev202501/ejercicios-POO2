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
public class MinisterioDeDefensa {

    private Ministro ministroTitular;
    private String sedeMinisterial;
    private ArrayList<BaseMilitar> basesMilitares;
    private ArrayList<DecretoPresidencial> decretosRecibidos;

    public MinisterioDeDefensa() {
        this.basesMilitares = new ArrayList<>();
        this.decretosRecibidos = new ArrayList<>();
    }

    public MinisterioDeDefensa(Ministro ministroTitular, String sedeMinisterial) {
        this.ministroTitular = ministroTitular;
        this.sedeMinisterial = sedeMinisterial;
        this.basesMilitares = new ArrayList<>();
        this.decretosRecibidos = new ArrayList<>();
    }

    public Ministro getMinistroTitular() {
        return ministroTitular;
    }

    public void setMinistroTitular(Ministro ministroTitular) {
        this.ministroTitular = ministroTitular;
    }

    public String getSedeMinisterial() {
        return sedeMinisterial;
    }

    public void setSedeMinisterial(String sedeMinisterial) {
        this.sedeMinisterial = sedeMinisterial;
    }

    public ArrayList<BaseMilitar> getBasesMilitares() {
        return basesMilitares;
    }

    public void setBasesMilitares(ArrayList<BaseMilitar> basesMilitares) {
        this.basesMilitares = basesMilitares;
    }

    public ArrayList<DecretoPresidencial> getDecretosRecibidos() {
        return decretosRecibidos;
    }

    public void setDecretosRecibidos(ArrayList<DecretoPresidencial> decretosRecibidos) {
        this.decretosRecibidos = decretosRecibidos;
    }
    

    public String refrendarDecreto(DecretoPresidencial decreto) {
        decreto.setRefrendadoPorDefensa(true);
        return "El MINISTERIO DE DEFENSA HA REFERENDADO EL DECRETO PRESIDENCIAL: " + decreto.getNumeracionOficial();
    }

    public String registrarBaseMilitar(BaseMilitar base) {
        if (this.duplicado(base) != null) {
            return "ERROR: YA EXISTE UNA BASE MMILITAR REGISTRADA CON EL CODIGO" + base.getIdBase();
        }

        this.basesMilitares.add(base);
        return "BASE MILITAR " + base.getNombre() + " REGISTRADA EXISTOSAMENE EN EL MINISTERIO DE DEFENSA ";
    }

    public BaseMilitar duplicado(BaseMilitar nueva) {
        for (BaseMilitar base : this.basesMilitares) {
            if (base.getIdBase().equalsIgnoreCase(nueva.getIdBase())) {
                return base;
            }

        }
        return null;
    }

    public String desalojarContingentesPorDecreto(DecretoPresidencial decretoAnulado) {
        StringBuilder reporte = new StringBuilder();

        for (BaseMilitar base : this.basesMilitares) {
            ArrayList<String> idsADesalojar = new ArrayList<>();

            for (ContingenteMilitar cont : base.getContingentesAlojamientos()) {
                if (cont.getDecretoRespaldo().equals(decretoAnulado)) {
                    idsADesalojar.add(cont.getIdContingente());
                }
            }

            for (String idCont : idsADesalojar) {
                base.retirarContingente(idCont);
                reporte.append("\n -> BASE MILITAR ").append(base.getNombre().toUpperCase())
                        .append(": CONTINGENTE ").append(idCont.toUpperCase()).append(" DESALOJADO EXITOSAMENTE.");
            }
        }

        return reporte.toString();
    }

    public String recibirDecretoParaEstudio(DecretoPresidencial decreto) {
        if (decreto == null) {
            return "ERROR: EL DECRETO PROPORCIONADO ES NULO.";
        }

        for (DecretoPresidencial d : this.decretosRecibidos) {
            if (d.getNumeracionOficial().equalsIgnoreCase(decreto.getNumeracionOficial())) {
                return "ERROR: EL DECRETO " + decreto.getNumeracionOficial() + " YA FUE RECIBIDO EN EL MINISTERIO DE DEFENSA.";
            }
        }

        this.decretosRecibidos.add(decreto);
        return "DECRETO (N°" + decreto.getNumeracionOficial() + ") RECIBIDO EN EL MINISTERIO DE DEFENSA PARA EVALUACIÓN.";
    }

    public DecretoPresidencial buscarDecretoPorNumero(String numeroOficial) {
        for (DecretoPresidencial d : this.decretosRecibidos) {
            if (d.getNumeracionOficial().equalsIgnoreCase(numeroOficial)) {
                return d;
            }
        }
        return null;
    }

    public String evaluarYDecidirDecreto(String numeroOficial, boolean aprobar) {
        DecretoPresidencial decreto = buscarDecretoPorNumero(numeroOficial);

        if (aprobar) {
            decreto.setRefrendadoPorDefensa(true);
            return "EL MINISTERIO DE DEFENSA HA EMITIDO DECISIÓN FAVORABLE Y REFRENDADO EL DECRETO (N°" + numeroOficial + ").";
        } else {
            decreto.setRefrendadoPorDefensa(false);
            decreto.setRechazadoPorDefensa(true);
            return "EL MINISTERIO DE DEFENSA HA DESCHAZADO/DESESTIMADO EL DECRETO (N°" + numeroOficial + "). NO SERÁ REFRENDADO.";
        }
    }
}
