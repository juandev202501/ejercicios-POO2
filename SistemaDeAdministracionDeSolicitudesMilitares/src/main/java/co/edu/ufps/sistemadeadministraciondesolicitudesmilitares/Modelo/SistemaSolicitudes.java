package co.edu.ufps.sistemadeadministraciondesolicitudesmilitares.Modelo;

import java.util.ArrayList;

public class SistemaSolicitudes {
    
    // El sistema contiene las entidades principales del Estado
    private ArrayList<PaisSolicitante> paisesExtranjeros;
    private Cancilleria cancilleria;
    private Senado senado;
    private Presidente presidente;
    private ConsejoDeEstado consejoEstado;
    private MinisterioDeDefensa ministerioDefensa;
    private ComandoGeneralFfmm comandoGeneral;

    public SistemaSolicitudes() {
        // Al nacer el sistema, se instancian las instituciones por defecto
        this.cancilleria = new Cancilleria(new Ministro(), "Palacio San Carlos", false, false, false);
        this.senado = new Senado(108, "Presidente del Senado", false);
        this.presidente = new Presidente("Casa de Nariño", false, false, "2026-2030", "Juan Perez", "100200300");
        this.consejoEstado = new ConsejoDeEstado("Sala de Consulta", false, false);
        this.ministerioDefensa = new MinisterioDeDefensa(new Ministro(), "CAN", false);
        this.comandoGeneral = new ComandoGeneralFfmm("General Giraldo", "CGFFMM");
        this.paisesExtranjeros=new ArrayList<>();
    }

    // Generas los Getters para que el Controlador pueda acceder a ellos
    public Cancilleria getCancilleria() { return cancilleria; }
    public Senado getSenado() { return senado; }
    public Presidente getPresidente() { return presidente; }
    public ConsejoDeEstado getConsejoEstado() { return consejoEstado; }
    public MinisterioDeDefensa getMinisterioDefensa() { return ministerioDefensa; }
    public ComandoGeneralFfmm getComandoGeneral() { return comandoGeneral; }

    public ArrayList<PaisSolicitante> getPaisesExtranjeros() {
        return paisesExtranjeros;
    }
    
}
