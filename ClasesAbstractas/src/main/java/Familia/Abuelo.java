/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Familia;

/**
 * Clase abstracta que representa a un abuelo.
 * No se puede instanciar directamente, pero sirve como molde para la familia.
 */
public abstract class Abuelo {
    // Atributos privados → solo accesibles mediante métodos (encapsulamiento)
    private String nombres;        // Nombre completo del abuelo
    private String apellidos;      // Apellidos del abuelo
    private int edad;              // Edad del abuelo
    private String direccion;      // Dirección donde vive

    /**
     * Constructor: inicializa los atributos comunes a todos los miembros de la familia.Se llama desde las subclases usando 'super(...)'
     * @param nombres
     * @param apellidos
     * @param edad
     * @param direccion
     */
    public Abuelo(String nombres, String apellidos, int edad, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
    }

    // === GETTERS (métodos para LEER los atributos) ===
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }
    public String getDireccion() { return direccion; }

    // === SETTERS (métodos para MODIFICAR los atributos) ===
    public void setNombres(String nombres) { this.nombres = nombres; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    /**
     * Método abstracto: cada miembro de la familia debe saber cómo presentarse.
     * Las subclases están obligadas a implementar este método.
     */
    public abstract void imprimir();

    /**
     * Método concreto: muestra la edad del abuelo.
     * Las subclases pueden usarlo o sobrescribirlo si lo necesitan.
     */
    public void mostrarEdad() {
        System.out.println(getNombres() + " tiene " + getEdad() + " años.");
    }
}