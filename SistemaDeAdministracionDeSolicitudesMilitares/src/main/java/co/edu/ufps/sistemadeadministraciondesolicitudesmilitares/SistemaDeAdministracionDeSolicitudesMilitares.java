package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares;

import co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo.*;
import java.time.LocalDateTime;

public class SistemaDeAdministracionDeSolicitudesMilitares {

    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("  SISTEMA DE TRÁNSITO DE TROPAS EXTRANJERAS - PRUEBA MVC  ");
        System.out.println("==========================================================\n");

        // 0. Instanciamos el contenedor principal que agrupa al Estado
        SistemaSolicitudes estadoColombiano = new SistemaSolicitudes();

        // ---------------------------------------------------------
        // FASE 1: DIPLOMACIA Y RADICACIÓN 
        // ---------------------------------------------------------
        System.out.println("--- FASE 1: DIPLOMACIA ---");

        // El país extranjero designa su agregado y emite la nota
        PaisSolicitante usa = new PaisSolicitante("Estados Unidos", "US", Continente.AMERICA);
        AgregadoMilitar agregado = new AgregadoMilitar("PAS-9988", RamaMilitar.EJERCITO, "John Doe", "11223344");
        System.out.println(usa.designarAgregadoMilitar(agregado));

        NotaDiplomatica notaRecibida = agregado.emitirYFirmarNota("NOTA-001", "Solicitud de escala técnica para 50 militares.");

        // La Cancillería (sacada del contenedor) procesa la nota
        Cancilleria cancilleria = estadoColombiano.getCancilleria();
        System.out.println(cancilleria.registrarRadicacion(notaRecibida));

        Expediente expediente = cancilleria.crearExpediente("EXP-2026-001");
        if (expediente != null) {
            System.out.println(expediente.crearYAnexarSolicitud("SOL-001", NivelUrgencia.ORDINARIO, "Escala y reabastecimiento", LocalDateTime.now(), LocalDateTime.now().plusDays(5), true));
        }

        // ---------------------------------------------------------
        // FASE 2: REVISIÓN CONSTITUCIONAL Y POLÍTICA 
        // ---------------------------------------------------------
        System.out.println("\n--- FASE 2: POLÍTICA Y CONSTITUCIÓN ---");
        ConsejoDeEstado consejo = estadoColombiano.getConsejoEstado();

        ConceptoJuridico concepto = consejo.evaluarConsulta(expediente);
        if (concepto != null) {
            System.out.println(concepto.emitirDictamen());
        }

        Senado senado = estadoColombiano.getSenado();
        System.out.println(senado.estudiarSolicitud(expediente));

        VotacionSenado votacion = new VotacionSenado(70, 30, 8, LocalDateTime.now(), false, false);
        System.out.println(votacion.calcularResultado(senado.getTotalSenadores()));
        senado.setPonenciaAprobada(votacion.isAprobadoParaPlenaria());

        // ---------------------------------------------------------
        // FASE 3: EJECUTIVO Y LOGÍSTICA
        // ---------------------------------------------------------
        System.out.println("\n--- FASE 3: EJECUTIVO Y DEFENSA ---");
        Presidente presidente = estadoColombiano.getPresidente();

        System.out.println(presidente.radicarEnSenado(expediente));
        DecretoPresidencial decreto = presidente.expedirDecreto(expediente, senado.isPonenciaAprobada());
        System.out.println(presidente.firmarDecreto(decreto));

        MinisterioDeDefensa minDefensa = estadoColombiano.getMinisterioDefensa();
        System.out.println(minDefensa.refrendarDecreto(decreto));

        PlanOperacion planTactico = minDefensa.estructurarPlanOperaciones("PLAN-OMEGA", "Uso de armas solo en legítima defensa", "Perímetro Base Aérea Palanquero");
        if (planTactico != null && planTactico.verificarEstrategia()) {
            System.out.println("Estrategia Militar: El plan de operaciones ha sido verificado y aprobado.");
        }

        // ---------------------------------------------------------
        // FASE 4: OPERACIONES Y CONTROL EN TERRENO
        // ---------------------------------------------------------
        System.out.println("\n--- FASE 4: INSPECCIÓN OPERATIVA ---");
        ContingenteMilitar contingenteUSA = new ContingenteMilitar("CONT-US-1", "Estados Unidos", 50, "Fuerza Aérea", true);
        ComandoGeneralFfmm comando = estadoColombiano.getComandoGeneral();

        System.out.println(contingenteUSA.agregarMilitar(new Militar(10, GradoMilitar.OFICIAL, EspecialidadCuerpo.ARMAS, "Soldado Ryan", "998877")));
        System.out.println(comando.supervisarTropas(contingenteUSA));

        GrupoInspeccion grupoInspeccion = new GrupoInspeccion("GRUPO-ALFA", "Inspección General", 5, "Coronel Lopez");
        OficialInspector inspector = new OficialInspector(GradoMilitar.OFICIAL, EspecialidadInspector.ARMAS);

        System.out.println(grupoInspeccion.asignarInspector(inspector));
        System.out.println(inspector.reportarHallazgo("El armamento coincide con el inventario autorizado."));

        boolean cumpleTactica = grupoInspeccion.verificarCumplimiento(planTactico);
        System.out.println(grupoInspeccion.generarInforme(cumpleTactica));

        // ---------------------------------------------------------
        // FASE 5: DEMANDA CIUDADANA Y FALLO
        // ---------------------------------------------------------
        System.out.println("\n--- FASE 5: DEMANDA CIUDADANA ---");
        CiudadanoImpugnante ciudadano = new CiudadanoImpugnante("Violación a la soberanía", false);
        ciudadano.setNombre("Carlos Ramirez");

        DemandaNulidad demanda = ciudadano.interponerDemanda("DEM-2026-99", "El decreto excede el tiempo máximo permitido.");
        if (demanda != null) {
            demanda.setDemandaAdmitida(true);
            System.out.println(demanda.notificarEntidades());
            System.out.println(ciudadano.presentarPruebas("Documento probatorio anexado."));

            FalloJudicial fallo = consejo.evaluarDemanda(demanda);

            // Juez emite el fallo (false = no es nulo, la misión continúa)
            System.out.println(fallo.ordenarSuspension());
            System.out.println(fallo.aplicarMedida());
        }

        System.out.println("\n==========================================================");
        System.out.println("        FIN DE LA EJECUCIÓN - MODELO 100% OPERATIVO       ");
        System.out.println("==========================================================");
    }

    public void agregarPaisSolicitante() {
    
    }
}
