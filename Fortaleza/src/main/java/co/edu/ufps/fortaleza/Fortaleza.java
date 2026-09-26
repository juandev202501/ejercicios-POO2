/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.ufps.fortaleza;

import co.edu.ufps.fortaleza.Modelo.Docente;
import co.edu.ufps.fortaleza.Modelo.Departamento;
import co.edu.ufps.fortaleza.Modelo.DocenteCatedral;
import co.edu.ufps.fortaleza.Modelo.DocenteOcasional;
import co.edu.ufps.fortaleza.Modelo.DocentePlanta;
import java.time.LocalDateTime;

import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class Fortaleza {

    private ArrayList<Docente> listaDocentes;

    public Fortaleza() {
        this.listaDocentes = new ArrayList<>();
    }

    public String registrarDocentePlanta(String codigo, String nombre, String titulo, String deptoNombre,
            int salarioBasico, int puntos, int valorPunto, String categoria,
            int numResolucion, LocalDateTime fechaNombramiento) {

        if (!verificarCodigo(codigo)) {
            Departamento depto = new Departamento(deptoNombre);

            DocentePlanta dp = new DocentePlanta(puntos, valorPunto, categoria, numResolucion,
                    fechaNombramiento, salarioBasico, 0, codigo,
                    nombre, titulo, depto);

            dp.SalarioMensual();

            this.listaDocentes.add(dp);

            return "DOCENTE DE PLANTA REGISTRADO CON EXITO";
        } else {
            return "NO SE PUEDO REGISTRAR DOCENTE A CAUSA DE CODIGO DUPLICADO";
        }

    }

    public String registrarDocenteCatedra(String codigo, String nombre, String titulo, String deptoNombre,
            int salarioBasico, int numContrato, int horas, int valorHora) {
        if (!verificarCodigo(codigo)) {
            Departamento depto = new Departamento(deptoNombre);

            DocenteCatedral dc = new DocenteCatedral(numContrato, horas, valorHora, salarioBasico,
                    0, codigo, nombre, titulo, depto);

            dc.SalarioMensual();

            this.listaDocentes.add(dc);
            return "DOCENTE DE CATEDRA REGISTRADO CON EXITO";
        } else {
            return "NO SE PUEDO REGISTRAR DOCENTE A CAUSA DE CODIGO DUPLICADO";
        }
    }

    public String registrarDocenteOcasional(String codigo, String nombre, String titulo,
            String deptoNombre, int salarioBasico) {
        if (!verificarCodigo(codigo)) {
            Departamento depto = new Departamento(deptoNombre);

            DocenteOcasional doDoc = new DocenteOcasional(salarioBasico, 0, codigo, nombre, titulo, depto);

            doDoc.SalarioMensual();

            this.listaDocentes.add(doDoc);
            return "DOCENTE OCASIONAL REGISTRADO CON EXITO";
        } else {
            return "NO SE PUEDO REGISTRAR DOCENTE A CAUSA DE CODIGO DUPLICADO";
        }
    }

    // Método auxiliar para determinar la vinculación
    public String identificarTipoVinculacion(Docente d) {
        if (d instanceof DocentePlanta) {
            return "Planta";
        }
        if (d instanceof DocenteCatedral) {
            return "Cátedra";
        }
        if (d instanceof DocenteOcasional) {
            return "Ocasional";
        }
        return "Sin Vinculación";
    }

    public String obtenerInformacionTodos() {
        if (listaDocentes.isEmpty()) {
            return "No hay docentes registrados en el sistema.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("         REPORTE GENERAL DE DOCENTES              \n");

        for (Docente d : listaDocentes) {
            d.SalarioMensual();

            sb.append("Código: ").append(d.getCodigo()).append("\n");
            sb.append("Nombre: ").append(d.getNombreCompleto()).append("\n");
            sb.append("Título Académico: ").append(d.getTituloAcademico()).append("\n");
            sb.append("Departamento: ").append(d.getDepartamento() != null ? d.getDepartamento().getNombre() : "N/A").append("\n");
            sb.append("Tipo de Vinculación: ").append(identificarTipoVinculacion(d)).append("\n");
            sb.append("Salario Básico: $").append(d.getSalarioBasico()).append("\n");
            sb.append("Salario Mensual Calculado: $").append(d.getSalarioMensual()).append("\n");

            if (d instanceof DocentePlanta) {
                DocentePlanta dp = (DocentePlanta) d;
                sb.append("Categoría: ").append(dp.getCategoria()).append("\n");
                sb.append("N° Resolución: ").append(dp.getNumeroDeResolucionDeNombramiento()).append("\n");
            } else if (d instanceof DocenteCatedral) {
                DocenteCatedral dc = (DocenteCatedral) d;
                sb.append("N° Contrato: ").append(dc.getNumeroDeContratoSemestral()).append("\n");
                sb.append("Horas Semanales: ").append(dc.getNumeroDeHorasQueDictaSemanamente()).append("\n");
            }

            sb.append("--------------------------------------------------\n");
        }
        return sb.toString();
    }

    public String obtenerSalariosCalculados() {
        if (listaDocentes.isEmpty()) {
            return "No hay docentes registrados para calcular salarios.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("           SALARIOS MENSUALES CALCULADOS          \n");

        for (Docente d : listaDocentes) {
            d.SalarioMensual();
            sb.append("• ").append(d.getNombreCompleto())
                    .append(" (").append(identificarTipoVinculacion(d)).append(")")
                    .append("  Salario Final: $").append(d.getSalarioMensual())
                    .append("\n");
        }
        return sb.toString();
    }

    public String obtenerTiposVinculacionTodos() {
        if (listaDocentes.isEmpty()) {
            return "No hay docentes registrados.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("            VINCULACIÓN DE DOCENTES               \n");

        for (Docente d : listaDocentes) {
            sb.append("- ").append(d.getNombreCompleto())
                    .append(" [Código: ").append(d.getCodigo()).append("]")
                    .append("  Tipo: ").append(identificarTipoVinculacion(d).toUpperCase())
                    .append("\n");
        }
        return sb.toString();
    }

    public boolean verificarCodigo(String codigo) {
        if (listaDocentes.isEmpty()) {
            return false;
        }
        for (Docente docente : listaDocentes) {
            if (docente.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }
}
