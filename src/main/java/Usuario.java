/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhon
 */
import java.util.Date;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;

    // Constructor
    public Usuario(String nombreUsuario, String contraseña, String nombres, String apellidos, Date fechaNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para iniciar sesión
    public void login() {
        // Lógica para iniciar sesión
        System.out.println("Inicio de sesión exitoso para el usuario: " + nombreUsuario);
    }

    // Método para cerrar sesión
    public void logout() {
        // Lógica para cerrar sesión
        System.out.println("Cierre de sesión exitoso para el usuario: " + nombreUsuario);
    }

    // Método para registrarse como nuevo usuario
    public void registrarse() {
        // Lógica para registrar un nuevo usuario
        System.out.println("Registro exitoso para el usuario: " + nombreUsuario);
    }

    // Método para guardar los datos del usuario
    public void guardarDatos() {
        // Lógica para guardar los datos del usuario en una base de datos o archivo
        System.out.println("Datos del usuario guardados con éxito.");
    }

    // Método para cargar los datos del usuario
    public void cargarDatos() {
        // Lógica para cargar los datos del usuario desde una base de datos o archivo
        System.out.println("Datos del usuario cargados con éxito.");
    }

    // Otros métodos y getters/setters si es necesario
}

