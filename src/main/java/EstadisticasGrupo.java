/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon
 */
import java.util.List;

public class EstadisticasGrupo {
    private int cantidadTextosResueltos;
    private float porcentajePreguntasCorrectas;
    private float porcentajePromedioCorrectasPorTexto;
    private List<Texto> textosMasLeidos;
    private List<Texto> textosMasFaciles;
    private List<Texto> textosMasDificiles;

    public EstadisticasGrupo(int cantidadTextosResueltos, float porcentajePreguntasCorrectas, float porcentajePromedioCorrectasPorTexto, List<Texto> textosMasLeidos, List<Texto> textosMasFaciles, List<Texto> textosMasDificiles) {
        this.cantidadTextosResueltos = cantidadTextosResueltos;
        this.porcentajePreguntasCorrectas = porcentajePreguntasCorrectas;
        this.porcentajePromedioCorrectasPorTexto = porcentajePromedioCorrectasPorTexto;
        this.textosMasLeidos = textosMasLeidos;
        this.textosMasFaciles = textosMasFaciles;
        this.textosMasDificiles = textosMasDificiles;
    }

    // Getters y setters para acceder a los atributos
    public int getCantidadTextosResueltos() {
        return cantidadTextosResueltos;
    }

    public void setCantidadTextosResueltos(int cantidadTextosResueltos) {
        this.cantidadTextosResueltos = cantidadTextosResueltos;
    }

    public float getPorcentajePreguntasCorrectas() {
        return porcentajePreguntasCorrectas;
    }

    public void setPorcentajePreguntasCorrectas(float porcentajePreguntasCorrectas) {
        this.porcentajePreguntasCorrectas = porcentajePreguntasCorrectas;
    }

    public float getPorcentajePromedioCorrectasPorTexto() {
        return porcentajePromedioCorrectasPorTexto;
    }

    public void setPorcentajePromedioCorrectasPorTexto(float porcentajePromedioCorrectasPorTexto) {
        this.porcentajePromedioCorrectasPorTexto = porcentajePromedioCorrectasPorTexto;
    }

    public List<Texto> getTextosMasLeidos() {
        return textosMasLeidos;
    }

    public void setTextosMasLeidos(List<Texto> textosMasLeidos) {
        this.textosMasLeidos = textosMasLeidos;
    }

    public List<Texto> getTextosMasFaciles() {
        return textosMasFaciles;
    }

    public void setTextosMasFaciles(List<Texto> textosMasFaciles) {
        this.textosMasFaciles = textosMasFaciles;
    }

    public List<Texto> getTextosMasDificiles() {
        return textosMasDificiles;
    }

    public void setTextosMasDificiles(List<Texto> textosMasDificiles) {
        this.textosMasDificiles = textosMasDificiles;
    }
}

