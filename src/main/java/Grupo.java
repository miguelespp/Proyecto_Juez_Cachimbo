/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon
 */
import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private String codigoGrupo;
    private String nombreGrupo;
    private List<Estudiante> estudiantes;
    private List<Texto> textos;

    public Grupo(String codigoGrupo, String nombreGrupo) {
        this.codigoGrupo = codigoGrupo;
        this.nombreGrupo = nombreGrupo;
        this.estudiantes = new ArrayList<>();
        this.textos = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarTexto(Texto texto) {
        textos.add(texto);
    }

    public EstadisticasGrupo verEstadisticasGrupo() {
    int cantidadTextosResueltos = calcularCantidadTextosResueltos();
    float porcentajePreguntasCorrectas = calcularPorcentajePreguntasCorrectas();
    float porcentajePromedioCorrectasPorTexto = calcularPorcentajePromedioCorrectasPorTexto();
    List<Texto> textosMasLeidos = calcularTextosMasLeidos();
    List<Texto> textosMasFaciles = calcularTextosMasFaciles();
    List<Texto> textosMasDificiles = calcularTextosMasDificiles();

    return new EstadisticasGrupo(cantidadTextosResueltos, porcentajePreguntasCorrectas, 
                                porcentajePromedioCorrectasPorTexto, textosMasLeidos, 
                                textosMasFaciles, textosMasDificiles);
    }

    // Getters y setters para acceder a los atributos
    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Texto> getTextos() {
        return textos;
    }

    public void setTextos(List<Texto> textos) {
        this.textos = textos;
    }
}

