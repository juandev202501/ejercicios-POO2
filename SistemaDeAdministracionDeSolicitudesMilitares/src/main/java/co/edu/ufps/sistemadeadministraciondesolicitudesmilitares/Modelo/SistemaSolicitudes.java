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
public class SistemaSolicitudes {

    private Cancilleria cancilleria;
    private ConsejoDeEstado consejoDeEstado;
    private Senado senado;
    private MinisterioDeDefensa ministerioDeDefensa;
    private ComandoGeneral comandoGeneral;
    private Presidente presidenteActual;

    // Lista global de países registrados
    private ArrayList<PaisSolicitante> paisesRegistrados;

    public SistemaSolicitudes() {
        this.paisesRegistrados = new ArrayList<>();

        this.presidenteActual = new Presidente("Casa de Nariño", "2026-2030", "Abelardo", "1098765432");

        Ministro cancillerTitular = new Ministro("Canciller Titular", "900123456", TipoMinistro.MINISTRO_RELACIONES_EXTERIORES, "Decreto Nombramiento Canciller");
        this.cancilleria = new Cancilleria(cancillerTitular, "Palacio de San Carlos, Bogotá D.C.");

        this.consejoDeEstado = new ConsejoDeEstado("Sala de Consulta y Servicio Civil", "Palacio de Justicia, Bogotá D.C.");
        this.senado = new Senado(108, "Plenaria del Senado de la República - Capitolio Nacional");

        Ministro ministroDefensaTitular = new Ministro("Ministro de Defensa", "900987654", TipoMinistro.MINISTRO_DEFENSA_NACIONAL, "Decreto Nombramiento MinDefensa");
        this.ministerioDeDefensa = new MinisterioDeDefensa(ministroDefensaTitular, "CAN, Bogotá D.C.");

        ComandanteJefe comandanteJefe = new ComandanteJefe(
                GradoMilitar.OFICIAL,
                RamaMilitar.EJERCITO,
                "Decreto de Nombramiento de Cúpula 105",
                "General de las Fuerzas Militares",
                "74125896"
        );
        this.comandoGeneral = new ComandoGeneral(comandanteJefe, "Fuerte Militar de Tolemaida / Comando General Bogotá");
    }

    public Cancilleria getCancilleria() {
        return cancilleria;
    }

    public void setCancilleria(Cancilleria cancilleria) {
        this.cancilleria = cancilleria;
    }

    public ConsejoDeEstado getConsejoDeEstado() {
        return consejoDeEstado;
    }

    public void setConsejoDeEstado(ConsejoDeEstado consejoDeEstado) {
        this.consejoDeEstado = consejoDeEstado;
    }

    public Senado getSenado() {
        return senado;
    }

    public void setSenado(Senado senado) {
        this.senado = senado;
    }

    public MinisterioDeDefensa getMinisterioDeDefensa() {
        return ministerioDeDefensa;
    }

    public void setMinisterioDeDefensa(MinisterioDeDefensa ministerioDeDefensa) {
        this.ministerioDeDefensa = ministerioDeDefensa;
    }

    public ComandoGeneral getComandoGeneral() {
        return comandoGeneral;
    }

    public void setComandoGeneral(ComandoGeneral comandoGeneral) {
        this.comandoGeneral = comandoGeneral;
    }

    public Presidente getPresidenteActual() {
        return presidenteActual;
    }

    public void setPresidenteActual(Presidente presidenteActual) {
        this.presidenteActual = presidenteActual;
    }

    public ArrayList<PaisSolicitante> getPaisesRegistrados() {
        return paisesRegistrados;
    }

    public void setPaisesRegistrados(ArrayList<PaisSolicitante> paisesRegistrados) {
        this.paisesRegistrados = paisesRegistrados;
    }

    // --- MÉTODOS QUE EL CONTROLADOR INVOCARÁ DIRECTAMENTE ---
    public String registrarPais(String nombre, String codigoIso, String continenteStr) {
        for (PaisSolicitante p : this.paisesRegistrados) {
            if (p.getCodigoIso().equalsIgnoreCase(codigoIso)) {
                return "ERROR: YA EXISTE UN PAÍS REGISTRADO CON EL CÓDIGO ISO (" + codigoIso + ")";
            }
            if (p.getNombrePais().equalsIgnoreCase(nombre)) {
                return "ERROR: YA EXISTE UN PAÍS REGISTRADO CON EL NOMBRE (" + nombre + ")";
            }
        }

        Continente continenteEnum;
        continenteEnum = Continente.valueOf(continenteStr);

        PaisSolicitante nuevoPais = new PaisSolicitante(nombre, codigoIso, continenteEnum);

        this.paisesRegistrados.add(nuevoPais);
        return "PAÍS REGISTRADO CON ÉXITO: " + nuevoPais.getNombrePais() + " (" + nuevoPais.getCodigoIso() + " - " + nuevoPais.getContinente() + ")";

    }

    public String designarAgregadoMilitar(String codigoIsoPais, String nombre, String nuip, String pasaporte, String ramaStr) {
        PaisSolicitante paisEncontrado = buscarPaisPorIso(codigoIsoPais);

        RamaMilitar ramaEnum;
        ramaEnum = RamaMilitar.valueOf(ramaStr);

        AgregadoMilitar agregado = new AgregadoMilitar(paisEncontrado, pasaporte, ramaEnum, nombre, nuip);

        return paisEncontrado.designarAgregadoMilitar(agregado);

    }

    public PaisSolicitante buscarPaisPorIso(String codigoIso) {
        for (PaisSolicitante p : this.paisesRegistrados) {
            if (p.getCodigoIso().equalsIgnoreCase(codigoIso)) {
                return p;
            }
        }
        return null;
    }

    public String emitirNotaDiplomatica(String nuipAgregado, String idNota, String contenido) {
        AgregadoMilitar emisor = null;
        for (PaisSolicitante paisRegistrado : paisesRegistrados) {
            for (AgregadoMilitar agregado : paisRegistrado.getAgregados()) {
                if (agregado.getNuip().equalsIgnoreCase(nuipAgregado)) {
                    emisor = agregado;
                    break;
                }

            }

        }
        NotaDiplomatica nota = emisor.emitirYFirmarNota(idNota, contenido);

        return this.cancilleria.recibirNotaDiplomatica(nota);
    }

    public String radicarNotaDiplomatica(String idNotaARadicar) {
        return (this.cancilleria.radicarNotaDiplomatica(idNotaARadicar));
    }

    public String crearSolicitudDeMision(String idNota, String idSolicitud, String urgenciaStr, String materiaStr, String objetivo, String fechaInicio, String fechaFinal) {

        NotaDiplomatica notaRadicada = this.cancilleria.buscarIdRadicada(idNota);

        NivelUrgencia urgenciaEnum;
        MateriaTratado materiaEnum;
        urgenciaEnum = NivelUrgencia.valueOf(urgenciaStr);
        materiaEnum = MateriaTratado.valueOf(materiaStr);

        SolicitudDeMision nuevaSolicitud = new SolicitudDeMision(
                idSolicitud,
                urgenciaEnum,
                materiaEnum,
                objetivo,
                fechaInicio,
                fechaFinal,
                notaRadicada
        );

        return this.cancilleria.registrarSolicitudMision(nuevaSolicitud);
    }

    public String crearExpediente(String idExpediente, String isoPaisAdjuntado) {
        PaisSolicitante pais = buscarPaisPorIso(isoPaisAdjuntado);
        Expediente e = new Expediente(idExpediente, pais);
        return this.cancilleria.registrarExpediente(e);
    }

    public String anexarSolicitudAExpediente(String idExpediente, String idSolicitud) {
        Expediente exp = this.cancilleria.buscarExpedientePorId(idExpediente);

        SolicitudDeMision solicitud = this.cancilleria.buscarSolicitudPorId(idSolicitud);
        return exp.anexarSolicitud(solicitud);
    }

    public String emitirConceptoJuridico(String idExpediente, boolean esFavorable, String consideraciones) {
        Expediente exp = this.cancilleria.buscarExpedientePorId(idExpediente);

        return this.consejoDeEstado.emitirConceptoJuridico(exp, esFavorable, consideraciones);
    }

    public String enviarExpedienteAConsejoDeEstado(String idExpediente) {
        return this.cancilleria.enviarExpedienteAConsejoDeEstado(idExpediente, this.consejoDeEstado);
    }

    public String enviarExpedienteASenado(String idExpediente) {
        Expediente expediente = this.consejoDeEstado.buscarExpedientePorId(idExpediente);
        return this.consejoDeEstado.enviarExpedienteASenado(expediente, this.senado);
    }

    public String someterAVotacionSenado(String idExpediente, int aFavor, int enContra, int abstencion) {
        Expediente exp = this.senado.buscarExpedientePorId(idExpediente);
        if ((aFavor + enContra + abstencion) > this.senado.getTotalSenadores()) {
            return "ERROR: LA CANTIDAD TOTAL DE VOTOS ES SUPERIOR A LA CANTIDAD DE SENADORES";
        }
        return this.senado.someterAVotacionExpediente(exp, aFavor, enContra, abstencion);
    }

    public String procesarSentenciaYEjecutarRetiro(String idDemanda, boolean estimarDemanda) {
        // 1. El Consejo de Estado dicta la sentencia
        String resultadoFallo = this.consejoDeEstado.fallarDemandaNulidad(idDemanda, estimarDemanda);

        // 2. Obtenemos la demanda real ya procesada
        DemandaNulidad demanda = this.consejoDeEstado.buscar(idDemanda);

        // 3. Si la demanda fue ESTIMADA, ejecutamos el retiro en las entidades del modelo
        if (demanda.getEstado() == EstadoDemanda.ESTIMADA) {
            DecretoPresidencial decretoNulo = demanda.getDecretoDemandado();

            String reporteComando = this.comandoGeneral.revocarContingentesPorDecreto(decretoNulo);
            String reporteDefensa = this.ministerioDeDefensa.desalojarContingentesPorDecreto(decretoNulo);

            return (resultadoFallo
                    + "\n--- EJECUCION AUTOMATICA DE RETIRO EN CUMPLIMIENTO DEL FALLO JUDICIAL ---"
                    + reporteComando
                    + reporteDefensa).toUpperCase();
        }

        return resultadoFallo.toUpperCase();
    }

    public ArrayList<String> retornarSolicitudesCompatibles(String idExpediente) {
        return this.cancilleria.retornarSolicitudesCompatibles(idExpediente);

    }

    public ArrayList<String> obtenerExpedientesEnSenado() {
        ArrayList<String> listaIds = new ArrayList<>();
        ArrayList<Expediente> expedientes = this.senado.obtenerExpedientesPendientes();

        if (expedientes != null) {
            for (Expediente e : expedientes) {
                if (e != null && e.getIdExpediente() != null) {
                    listaIds.add(e.getIdExpediente());
                }
            }
        }
        return listaIds;
    }

    public String enviarExpedienteAPresidencia(String idExpediente) {
        return this.senado.enviarExpedienteAPresidencia(idExpediente, this.presidenteActual);
    }

    public String enviarDecretoAMinDefensa(String numeroOficial) {
        DecretoPresidencial decreto = this.presidenteActual.buscarDecretoPorNumero(numeroOficial);

        if (decreto == null) {
            return "ERROR: NO SE ENCONTRÓ NINGÚN BORRADOR CON EL NÚMERO (" + numeroOficial + ") EN PRESIDENCIA.";
        }

        return this.ministerioDeDefensa.recibirDecretoParaEstudio(decreto);
    }

    public String emitirDecisionMinDefensa(String numeroOficial, boolean aprobar) {
        return this.ministerioDeDefensa.evaluarYDecidirDecreto(numeroOficial, aprobar);
    }

    public ArrayList<String> obtenerDecretosEnMinDefensa() {
        ArrayList<String> ids = new ArrayList<>();
        if (this.ministerioDeDefensa.getDecretosRecibidos() != null) {
            for (DecretoPresidencial d : this.ministerioDeDefensa.getDecretosRecibidos()) {
                if (d != null && !d.isRefrendadoPorDefensa() && !d.isRechazadoPorDefensa()) {
                    ids.add(d.getNumeracionOficial());
                }
            }
        }
        return ids;
    }

    public ArrayList<String> obtenerBorradoresDecretosEnPresidencia() {
        ArrayList<String> listaNumeros = new ArrayList<>();

        if (this.presidenteActual != null && this.presidenteActual.getDecretosRedactados() != null) {
            for (DecretoPresidencial d : this.presidenteActual.getDecretosRedactados()) {
                if (d != null && d.getNumeracionOficial() != null) {
                    listaNumeros.add(d.getNumeracionOficial());
                }
            }
        }

        return listaNumeros;
    }

    public ArrayList<String> obtenerExpedientesEnPresidencia() {
        ArrayList<String> ids = new ArrayList<>();
        if (this.presidenteActual.getExpedientesRecibidos() != null) {
            for (Expediente e : this.presidenteActual.getExpedientesRecibidos()) {
                if (e != null && e.getEstadoActual() == EstadoExpediente.AVALADO) {
                    ids.add(e.getIdExpediente());
                }
            }
        }
        return ids;
    }

    public ArrayList<String> obtenerExpedientesAvaladosSenado() {
        ArrayList<String> avalados = new ArrayList<>();

        if (this.senado != null && this.senado.getExpedientesRecibidos() != null) {
            for (Expediente exp : this.senado.getExpedientesRecibidos()) {
                if (exp != null && exp.getEstadoActual() == EstadoExpediente.AVALADO) {
                    avalados.add(exp.getIdExpediente());
                }
            }
        }

        return avalados;
    }

    public String crearDecretoPresidencial(String idExpediente, String numeracionOficial, int tiempoVigenciaDias, String consideraciones) {

        Expediente exp = this.presidenteActual.buscarExpedientePorId(idExpediente);

        return this.presidenteActual.crearDecreto(exp, numeracionOficial, tiempoVigenciaDias, consideraciones);
    }
}
