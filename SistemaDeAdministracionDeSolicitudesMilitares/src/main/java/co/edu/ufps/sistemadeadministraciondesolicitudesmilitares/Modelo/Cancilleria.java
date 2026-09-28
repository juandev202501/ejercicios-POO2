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
public class Cancilleria {

    private Ministro ministroRepresentante;
    private String sedeOficial;
    private boolean sistemaRadicacionActivo;
    private ArrayList<NotaDiplomatica> notasRecibidas;
    private ArrayList<NotaDiplomatica> notasRadicadas;
    private ArrayList<SolicitudDeMision> solicitudesEmitidas;
    private ArrayList<Expediente> expedietesEmitidos;

    public Cancilleria() {
        this.notasRadicadas = new ArrayList<>();
        this.notasRecibidas = new ArrayList<>();
        this.solicitudesEmitidas = new ArrayList<>();
        this.expedietesEmitidos = new ArrayList<>();
        this.sistemaRadicacionActivo = true;
    }

    public Cancilleria(Ministro ministroRepresentante, String sedeOficial) {
        this.ministroRepresentante = ministroRepresentante;
        this.sedeOficial = sedeOficial;
        this.sistemaRadicacionActivo = true;
        this.notasRadicadas = new ArrayList<>();
        this.notasRecibidas = new ArrayList<>();
        this.solicitudesEmitidas = new ArrayList<>();
        this.expedietesEmitidos = new ArrayList<>();
    }

    public Ministro getMinistroRepresentante() {
        return ministroRepresentante;
    }

    public void setMinistroRepresentante(Ministro ministroRepresentante) {
        this.ministroRepresentante = ministroRepresentante;
    }

    public String getSedeOficial() {
        return sedeOficial;
    }

    public void setSedeOficial(String sedeOficial) {
        this.sedeOficial = sedeOficial;
    }

    public boolean isSistemaRadicacionActivo() {
        return sistemaRadicacionActivo;
    }

    public void setSistemaRadicacionActivo(boolean sistemaRadicacionActivo) {
        this.sistemaRadicacionActivo = sistemaRadicacionActivo;
    }

    public ArrayList<NotaDiplomatica> getNotasRadicadas() {
        return notasRadicadas;
    }

    public void setNotasRadicadas(ArrayList<NotaDiplomatica> notasRadicadas) {
        this.notasRadicadas = notasRadicadas;
    }

    public ArrayList<NotaDiplomatica> getNotasRecibidas() {
        return notasRecibidas;
    }

    public void setNotasRecibidas(ArrayList<NotaDiplomatica> notasRecibidas) {
        this.notasRecibidas = notasRecibidas;
    }

    public ArrayList<SolicitudDeMision> getSolicitudesEmitidas() {
        return solicitudesEmitidas;
    }

    public void setSolicitudesEmitidas(ArrayList<SolicitudDeMision> solicitudesEmitidas) {
        this.solicitudesEmitidas = solicitudesEmitidas;
    }

    public ArrayList<Expediente> getExpedietesEmitidos() {
        return expedietesEmitidos;
    }

    public void setExpedietesEmitidos(ArrayList<Expediente> expedietesEmitidos) {
        this.expedietesEmitidos = expedietesEmitidos;
    }

    public String recibirNotaDiplomatica(NotaDiplomatica nuevaNota) {
        if (this.duplicadoRecibidas(nuevaNota) != null) {
            return "ERROR: YA EXISTE UNA NOTA DIPLOMATICA REGISTRADA CON EL ID (N°" + nuevaNota.getIdNota() + ")";
        }
        nuevaNota.setEstadoRadicacion(false);
        this.notasRecibidas.add(nuevaNota);
        return "NOTA DIPLOMATICA (N°" + nuevaNota.getIdNota() + ") RECIBIDA CON EXITO EN CANCILLERIA";
    }

    public NotaDiplomatica duplicadoRecibidas(NotaDiplomatica nuevo) {
        for (NotaDiplomatica recibida : notasRecibidas) {
            if (recibida.getIdNota().equalsIgnoreCase(nuevo.getIdNota())) {
                return recibida;
            }

        }
        return null;
    }

    public String radicarNotaDiplomatica(String idNota) {
        NotaDiplomatica aRadicar = this.buscarIdRecibida(idNota);
        aRadicar.setEstadoRadicacion(true);
        this.notasRadicadas.add(aRadicar);
        this.notasRecibidas.remove(aRadicar);

        return "NOTA DIPLOMATICA (N°" + aRadicar.getIdNota() + ") RADICADA CON EXITO EN CANCILLERIA";
    }

    public NotaDiplomatica buscarIdRecibida(String idNota) {
        for (NotaDiplomatica recibida : this.notasRecibidas) {
            if (recibida.getIdNota().equalsIgnoreCase(idNota)) {
                return recibida;
            }

        }
        return null;
    }

    public NotaDiplomatica buscarIdRadicada(String idNota) {
        for (NotaDiplomatica radicada : this.notasRadicadas) {
            if (radicada.getIdNota().equalsIgnoreCase(idNota)) {
                return radicada;
            }

        }
        return null;
    }

    public String registrarSolicitudMision(SolicitudDeMision nuevaSolicitud) {
        for (SolicitudDeMision s : this.solicitudesEmitidas) {
            if (s.getIdSolicitud().equalsIgnoreCase(nuevaSolicitud.getIdSolicitud())) {
                return "ERROR: YA EXISTE UNA SOLICITUD DE MISIÓN REGISTRADA CON EL ID (" + nuevaSolicitud.getIdSolicitud() + ")";
            }
        }
        this.solicitudesEmitidas.add(nuevaSolicitud);
        return "SOLICITUD DE MISIÓN (N°" + nuevaSolicitud.getIdSolicitud() + ") EMITIDA Y REGISTRADA EN CANCILLERÍA CON ÉXITO";
    }

    public SolicitudDeMision buscarSolicitudPorId(String idSolicitud) {
        for (SolicitudDeMision emitida : this.solicitudesEmitidas) {
            if (emitida.getIdSolicitud().equalsIgnoreCase(idSolicitud)) {
                return emitida;
            }
        }
        return null;
    }

    public String registrarExpediente(Expediente nuevoExpediente) {
        if (buscarExpedientePorId(nuevoExpediente.getIdExpediente()) != null) {
            return "ERROR: YA EXISTE UN EXPEDIENTE REGISTRADO CON EL ID (" + nuevoExpediente.getIdExpediente() + ")";
        }
        this.expedietesEmitidos.add(nuevoExpediente);
        return "EXPEDIENTE (N°" + nuevoExpediente.getIdExpediente() + ") REGISTRADO EN CANCILLERÍA EXITOSAMENTE";
    }

    public Expediente buscarExpedientePorId(String idExpediente) {
        for (Expediente e : this.expedietesEmitidos) {
            if (e.getIdExpediente().equalsIgnoreCase(idExpediente)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<String> retornarSolicitudesCompatibles(String idExpediente) {
        ArrayList<String> validos = new ArrayList<>();

        Expediente e = this.buscarExpedientePorId(idExpediente.trim());
        if (e == null || e.getPaisOrigen() == null || e.getPaisOrigen().getCodigoIso() == null) {
            return validos;
        }

        String isoPais = e.getPaisOrigen().getCodigoIso();

        for (SolicitudDeMision solicitudEmitida : this.solicitudesEmitidas) {
            if (solicitudEmitida != null && solicitudEmitida.getNotaContemplada() != null) {

                String isoNota = solicitudEmitida.getNotaContemplada().getIsoPais();

                if (isoNota != null && isoNota.equalsIgnoreCase(isoPais)) {

                    if (!estaAnexadaEnAlgunExpediente(solicitudEmitida.getIdSolicitud())) {
                        validos.add(solicitudEmitida.getIdSolicitud());
                    }
                }
            }
        }

        return validos;
    }

    private boolean estaAnexadaEnAlgunExpediente(String idSolicitud) {
        if (this.expedietesEmitidos == null || idSolicitud == null) {
            return false;
        }

        for (Expediente expediente : this.expedietesEmitidos) {
            if (expediente != null && expediente.getSolicitudes() != null) {
                for (SolicitudDeMision sol : expediente.getSolicitudes()) {
                    if (sol != null && idSolicitud.equalsIgnoreCase(sol.getIdSolicitud())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String enviarExpedienteAConsejoDeEstado(String idExpediente, ConsejoDeEstado consejoDeEstado) {
        Expediente exp = buscarExpedientePorId(idExpediente);

        if (!exp.isDocumentacionCompleta()) {
            return "ERROR: EL EXPEDIENTE " + idExpediente + " NO TIENE LA DOCUMENTACIÓN COMPLETA PARA SER ENVIADO.";
        }
        return consejoDeEstado.recibirExpediente(exp);
    }

}
