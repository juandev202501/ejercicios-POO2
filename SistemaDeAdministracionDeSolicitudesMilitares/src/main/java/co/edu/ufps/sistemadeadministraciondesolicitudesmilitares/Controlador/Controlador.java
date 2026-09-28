/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Controlador;

import co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo.*;
import co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo.SistemaSolicitudes;
import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class Controlador {

    private SistemaSolicitudes sistemaSolicitudes;

    public Controlador() {
        this.sistemaSolicitudes = new SistemaSolicitudes();
    }

    // 1. Registrar País
    // 1. Delegación directa a SistemaSolicitudes
    public String registrarPais(String nombre, String codigoIso, String continente) {
        if (continente.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UN CONTINENTE.";
        }
        if (nombre.trim().isEmpty() || codigoIso.trim().isEmpty()) {
            return "ERROR: DEBE COMPLETAR TODOS LOS CAMPOS DEL PAÍS SOLICITANTE.";
        }
        return this.sistemaSolicitudes.registrarPais(nombre.trim(), codigoIso, continente);
    }

    // 2. Delegación de la designación del Agregado
    public String designarAgregadoMilitar(String codigoIsoPais, String nombre, String nuip, String pasaporte, String rama) {
        if (codigoIsoPais.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UN PAÍS DE ORIGEN.";
        }
        if (rama.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UNA RAMA MILITAR.";
        }
        if (nombre.trim().isEmpty() || nuip.trim().isEmpty() || pasaporte.trim().isEmpty() || rama == null) {
            return "ERROR: DEBE COMPLETAR TODOS LOS CAMPOS DEL AGREGADO MILITAR.";
        }

        return this.sistemaSolicitudes.designarAgregadoMilitar(codigoIsoPais, nombre.trim(), nuip.trim(), pasaporte.trim(), rama);
    }

    public String emitirYRecibirNotaDiplomatica(String nuipAgregado, String idNota, String contenido) {
        if (nuipAgregado.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UN AGREGADO MILITAR.";
        }
        if (idNota.trim().isEmpty() || contenido.trim().isEmpty()) {
            return "ERROR: DEBE COMPLETAR TODOS LOS CAMPOS DE LA NOTA.";
        }

        return this.sistemaSolicitudes.emitirNotaDiplomatica(nuipAgregado, idNota, contenido);
    }

    public String radicarNotaDiplomatica(String idNotaARadicar) {
        if (idNotaARadicar.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UNA NOTA DIPLOMATICA.";
        }
        return this.sistemaSolicitudes.radicarNotaDiplomatica(idNotaARadicar);

    }

    public String crearSolicitudDeMision(String idNota, String idSolicitud, String urgenciaStr, String materiaStr, String objetivo, String fechaInicio, String fechaFinal) {
        if (idNota.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UN NOTA DIPLOMATICA RADICADA.";
        }
        if (urgenciaStr.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UN NIVEL DE URGENCIA.";
        }
        if (materiaStr.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UNA MATERIA DE TRATADO.";
        }
        if (idSolicitud.trim().isEmpty() || objetivo.trim().isEmpty()) {
            return "ERROR: DEBE COMPLETAR TODOS LOS CAMPOS DE LA SOLICITUD DE MISIÓN.";
        }

        return this.sistemaSolicitudes.crearSolicitudDeMision(idNota, idSolicitud, urgenciaStr, materiaStr, objetivo, fechaInicio, fechaFinal);

    }

    public String emitirYRadicarExpediente(String idExpediente, String isoPaisAdjunto) {
        if (isoPaisAdjunto.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UN PAIS ADJUNTO.";
        }
        if (idExpediente.trim().isEmpty()) {
            return "ERROR: DEBE COMPLETAR TODOS LOS CAMPOS DEL EXPEDIENTE.";
        }
        return this.sistemaSolicitudes.crearExpediente(idExpediente, isoPaisAdjunto);
    }

    public ArrayList<String> retornarSolicitudesCompatibles(String idExpediente) {
        if (idExpediente.equalsIgnoreCase("SELECCIONAR")) {
            return new ArrayList<>();
        }
        return this.sistemaSolicitudes.retornarSolicitudesCompatibles(idExpediente);

    }

    public String anexarSolicitudAExpediente(String idExpediente, String idSolicitud) {
        if (idExpediente.isBlank() || idExpediente.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UN EXPEDIENTE AL CUAL ANEXAR SOLICITUDES.";
        }

        if (idSolicitud.isBlank() || idSolicitud.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UNA SOLICITUD A ANEXAR.";
        }

        return this.sistemaSolicitudes.anexarSolicitudAExpediente(idExpediente.trim(), idSolicitud.trim());
    }

    public String emitirConceptoJuridico(String idExpediente, boolean esFavorable, String consideraciones) {
        if (idExpediente.equalsIgnoreCase("SELECCIONAR")) {
            return "ERROR: DEBE SELECCIONAR UN EXPEDIENTE PARA EMITIR CONCEPTO JURÍDICO.";
        }

        return this.sistemaSolicitudes.emitirConceptoJuridico(idExpediente, esFavorable, consideraciones);
    }
    public String enviarExpedienteAConsejoDeEstado(String idExpediente)
    {
        if(idExpediente.equalsIgnoreCase("SELECCIONAR"))
        {
            return "ERROR: DEBE SELECCIONAR UN EXPEDIENTE PARA ENVIARLO AL CONSEJO";
        }
        return this.sistemaSolicitudes.enviarExpedienteAConsejoDeEstado(idExpediente);
        
    }
}
