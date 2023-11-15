/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon
 */
import java.util.List;

public class Pregunta {
    private String enunciado;
    private List<String> alternativas;
    private char respuestaCorrecta;
    private String razonamiento;

    public Pregunta(String enunciado, List<String> alternativas, char respuestaCorrecta, String razonamiento) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respuestaCorrecta = respuestaCorrecta;
        this.razonamiento = razonamiento;
    }

    // Getters y setters para acceder a los atributos
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<String> alternativas) {
        this.alternativas = alternativas;
    }

    public char getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(char respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getRazonamiento() {
        return razonamiento;
    }

    public void setRazonamiento(String razonamiento) {
        this.razonamiento = razonamiento;
    }
}

