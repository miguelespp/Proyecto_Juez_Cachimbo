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

public class Estudiante {
    private Grupo grupo;
    private List<Texto> textosLeidos;
    
    public Estudiante(Grupo grupo) {
        this.grupo = grupo;
        this.textosLeidos = new ArrayList<>();
    }

    public List<Texto> buscarTexto(String palabraClave) {
        List<Texto> resultados = new ArrayList<>();
        for (Texto texto : grupo.getTextos()) {
            if (texto.contienePalabraClave(palabraClave)) {
                resultados.add(texto);
            }
        }
        return resultados;
    }

    public void seleccionarTexto(Texto texto) {
        if (textosLeidos.contains(texto)) {
            System.out.println("El texto ya ha sido seleccionado por el estudiante.");
        } else {
            textosLeidos.add(texto);
            System.out.println("Texto seleccionado con éxito.");
        }
    }

    public List<Respuesta> responder(List<Pregunta> preguntas) {
        List<Respuesta> respuestas = new ArrayList<>();
        for (Pregunta pregunta : preguntas) {
            Respuesta respuesta = new Respuesta(pregunta, "Respuesta del estudiante.");
            respuestas.add(respuesta);
        }
        return respuestas;
    }

    public Estadisticas verEstadisticas() {
        // Lógica para calcular estadísticas sobre el desempeño del estudiante
        // Puedes devolver un objeto Estadisticas con los datos correspondientes
        return new Estadisticas(/* Datos de estadísticas */);
    }
}

