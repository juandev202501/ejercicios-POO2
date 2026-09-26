/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos;

import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.Atentado;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.Clasificacion;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.EjercitoNacional;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.ElementoExplosivo;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.ElementoMateriaProbatorio;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.EscenaDelHecho;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.EstadoPolitico;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.EstadoProcesal;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.EstructuraArmadaIlegal;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.ExpedientePenal;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.Fiscal;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.InformePericial;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.Juez;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.Perito;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.Sentencia;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.SujetoActivo;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.TipoPenal;
import co.edu.ufps.sistemaregistroyjudializacionatentadoscontraejercitoconexplosivos.Modelo.TipoSentencia;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SistemaRegistroYJudializacionAtentadosContraEjercitoConExplosivos {

    public static void main(String[] args) {
        System.out.println("--- 1. REGISTRO DEL ATENTADO Y LA ESCENA ---");

        ArrayList<ElementoMateriaProbatorio> pruebasRecolectadas = new ArrayList<>();

        EscenaDelHecho escena = new EscenaDelHecho(
                LocalDateTime.now(),
                "Neiva, Huila",
                "2.9273 N, 75.2819 W",
                pruebasRecolectadas
        );

        Atentado atentado = new Atentado();
        atentado.setEscenaDelHecho(escena);

        TipoPenal terrorismo = new TipoPenal("Terrorismo", "Art. 343");
        atentado.agregarCalificacionJuridica(terrorismo);

        System.out.println("Atentado registrado en: " + escena.getMunicipio());
        terrorismo.mostrarDatos();

        System.out.println("\n--- 2. ACCION DEL EJERCITO NACIONAL ---");
        EjercitoNacional ejercito = new EjercitoNacional("EJC", "Ejercito Nacional", "Defensa de la Soberania");
        ejercito.activarProtocoloSeguridad();

        ejercito.reportarNovedad("Ataque con explosivos a patrulla", Clasificacion.ALTA, LocalDateTime.now(), atentado);
        System.out.println("Novedad institucional reportada con exito.");

        System.out.println("\n--- 3. RECOLECCION DE PRUEBAS Y PERITAJE ---");

        Perito perito = new Perito("TP-98765", "Tecnico Antiexplosivos", "Ana Gomez", "1098765432", "1990-05-15");

        InformePericial informe = new InformePericial(perito, "Artefacto Explosivo Improvisado (AEI) de alto poder", LocalDateTime.now());

        ElementoExplosivo explosivo = new ElementoExplosivo();

        explosivo.setCodigoEMP("EMP-2026-041-HUILA-001");
        explosivo.setCadenaCustodia("Bodega Central Fiscalia");
        explosivo.setInformePericial(informe);

        explosivo.setClasificacionPreliminar("Dinamita comercial y metralla");
        explosivo.setAutoridadDeDesactivacion("Grupo EXDE Ejercito");
        explosivo.setRiesgoActivo(false);

        escena.getMaterialesRecolectados().add(explosivo);
        System.out.println("Prueba guardada: " + explosivo.getCodigoEMP() + " | Dictamen: " + informe.getConclusionTecnica());

        System.out.println("\n--- 4. GESTION DE LA FISCALIA ---");
        Fiscal fiscal = new Fiscal();
        fiscal.setNombre("Dr. Carlos Perez");
        fiscal.setCargo("Fiscal Especializado Antiterrorismo");
        fiscal.agregarCaso(atentado);

        ExpedientePenal expediente = new ExpedientePenal("RAD-2026-0001", EstadoProcesal.INVESTIGACION, atentado);
        System.out.println("Expediente " + expediente.getNumeroRadicado() + " abierto en estado de " + expediente.getEstadoProcesal());

        System.out.println("\n--- 5. JUDICIALIZACION DEL SUJETO ACTIVO ---");
        EstructuraArmadaIlegal estructura = new EstructuraArmadaIlegal("Frente Ilegal 33");

        SujetoActivo sujeto = new SujetoActivo();
        sujeto.setNombre("Alias 'El Mecanico'");
        sujeto.setNuip("1002334455");
        sujeto.setEstadoPolitico(EstadoPolitico.IMPUTADO); // Inicia como imputado
        sujeto.setEstructuraArmadaIlegalRelacionada(estructura);

        System.out.println("Procesado: " + sujeto.getNombre() + " | Estado inicial: " + sujeto.getEstadoPolitico());

        System.out.println("\n--- 6. RESOLUCION DEL JUEZ ---");
        Juez juez = new Juez("Juzgado Primero Penal Especializado", "Juez de la Republica", "TP-112233", "Dra. Maria Lopez", "45678912", "1985-10-20");

        Sentencia sentencia = new Sentencia(TipoSentencia.CONDENATORIA, 45, LocalDateTime.now(), atentado, juez, sujeto);

        juez.emitirSentencia(sentencia);

        System.out.println("Estado final verificado del sujeto: " + sujeto.getEstadoPolitico());
    }
}
