/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Familia;

/**
 * Clase concreta que representa a un padre.
 * Hereda de Abuelo y agrega atributos específicos del padre.
 */
public class Padre extends Abuelo {
    private String profesion;       // Profesión del padre
    private int anioNacimiento;     // Año en que nació el padre

    /**
     * Constructor: llama al constructor de la clase padre (Abuelo) y luego inicializa sus propios atributos.
     * @param nombres
     * @param apellidos
     * @param edad
     * @param direccion
     * @param profesion
     * @param anioNacimiento
     */
    public Padre(String nombres, String apellidos, int edad, String direccion,
                 String profesion, int anioNacimiento) {
        super(nombres, apellidos, edad, direccion); // ← llama a Abuelo(...)
        this.profesion = profesion;
        this.anioNacimiento = anioNacimiento;
    }

    // GETTERS
    public String getProfesion() { return profesion; }
    public int getAnioNacimiento() { return anioNacimiento; }

    // SETTERS
    public void setProfesion(String profesion) { this.profesion = profesion; }
    public void setAnioNacimiento(int anioNacimiento) { this.anioNacimiento = anioNacimiento; }

    /**
     * Implementación del método abstracto 'imprimir'.
     * Muestra toda la información del padre.
     */
    @Override
    public void imprimir() {
        System.out.println("Soy el padre:");
        System.out.println("Nombre: " + getNombres() + " " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Profesión: " + profesion);
        System.out.println("Año de nacimiento: " + anioNacimiento);
    }
}