/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 * Clase abstracta base que representa a un animal genérico.
 * No se puede instanciar directamente, pero sirve como molde para todos los animales.
 */

public abstract class Animales {
    // Atributos privados → solo accesibles mediante métodos (encapsulamiento)
    private String nombre;        // Nombre del animal
    private String habitat;       // Donde vive (selva, casa, río, etc.)
    private double peso;          // Peso en kilogramos
    private String alimentacion;  // Tipo de comida (carnívoro, herbívoro, etc.)

    /**
     * Constructor: inicializa los atributos comunes a todos los animales.Se llama desde las subclases usando 'super(...)'
     * @param nombre
     * @param habitat
     * @param peso
     * @param alimentacion
     */
    public Animales(String nombre, String habitat, double peso, String alimentacion) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.peso = peso;
        this.alimentacion = alimentacion;
    }

    // === GETTERS (métodos para LEER los atributos) ===
    public String getNombre() { return nombre; }
    public String getHabitat() { return habitat; }
    public double getPeso() { return peso; }
    public String getAlimentacion() { return alimentacion; }

    // === SETTERS (métodos para MODIFICAR los atributos) ===
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setHabitat(String habitat) { this.habitat = habitat; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setAlimentacion(String alimentacion) { this.alimentacion = alimentacion; }

    /**
     * Método abstracto: cada tipo de animal debe definir cómo se "presenta".
     * Las subclases están obligadas a implementar este método.
     */
    public abstract void imprimir();

    /**
     * Método concreto: muestra información básica que todos los animales comparten.
     * Las subclases pueden usarlo o sobrescribirlo si lo necesitan.
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Alimentación: " + getAlimentacion());
    }
}