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

public class Profesor {
    private String carrera;
    private List<Grupo> grupos;
    
    public Profesor(String carrera) {
        this.carrera = carrera;
        this.grupos = new ArrayList<>();
    }

    public Grupo crearGrupo() {
        Grupo grupo = new Grupo(/* Parámetros del grupo, como nombre, curso, etc. */);
        grupos.add(grupo);
        return grupo;
    }

    public Texto crearTexto() {
        Texto texto = new Texto(/* Parámetros del texto, como título, contenido, etc. */);
        return texto;
    }

    public EstadisticasGrupo verEstadisticasGrupo(Grupo grupo) {
        // Lógica para calcular estadísticas del grupo
        // Puedes devolver un objeto EstadisticasGrupo con los datos correspondientes
        return new EstadisticasGrupo(/* Datos de estadísticas del grupo */);
    }
}
