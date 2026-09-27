/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

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

    public SistemaSolicitudes() {
        // 1. Presidente: public Presidente(String despacho, String periodoMandato, String nombre, String nuip)
        this.presidenteActual = new Presidente("Casa de Nariño", "2026-2030", "Abelardo", "1098765432");

        // 2. Cancillería con su Ministro: public Ministro(String nombre, String nuip, TipoMinistro tipoMinistro, String decretoNombramiento)
        Ministro cancillerTitular = new Ministro("Canciller Titular", "900123456", TipoMinistro.MINISTRO_RELACIONES_EXTERIORES, "Decreto Nombramiento Canciller");
        this.cancilleria = new Cancilleria(cancillerTitular, "Palacio de San Carlos, Bogotá D.C.");

        // 3. Consejo de Estado
        this.consejoDeEstado = new ConsejoDeEstado("Sala de Consulta y Servicio Civil", "Palacio de Justicia, Bogotá D.C.");

        // 4. Senado de la República
        this.senado = new Senado(108, "Plenaria del Senado de la República - Capitolio Nacional");

        // 5. Ministerio de Defensa con su Ministro
        Ministro ministroDefensaTitular = new Ministro("Ministro de Defensa", "900987654", TipoMinistro.MINISTRO_DEFENSA_NACIONAL, "Decreto Nombramiento MinDefensa");
        this.ministerioDeDefensa = new MinisterioDeDefensa(ministroDefensaTitular, "CAN, Bogotá D.C.");

        // 6. Comando General: public ComandanteJefe(GradoMilitar rango, RamaMilitar fuerza, String decretoNombramiento, String nombre, String nuip)
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

}
