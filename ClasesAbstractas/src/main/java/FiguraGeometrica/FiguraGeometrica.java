/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 * Clase abstracta que representa una figura geométrica genérica.
 * No se puede instanciar directamente, pero sirve como molde para todas las figuras.
 */
public abstract class FiguraGeometrica {
    // Atributos privados → solo accesibles mediante métodos (encapsulamiento)
    private int id;        // Identificador único de la figura
    private String nombre; // Nombre de la figura (ej: "Cuadrado Rojo")

    /**
     * Constructor: inicializa los atributos comunes a todas las figuras.Se llama desde las subclases usando 'super(...)'
     * @param id
     * @param nombre
     */
    public FiguraGeometrica(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //  GETTERS (métodos para LEER los atributos)
    public int getId() { return id; }
    public String getNombre() { return nombre; }

    //  SETTERS (métodos para MODIFICAR los atributos) 
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Método abstracto: cada figura debe definir cómo calcula su área.Las subclases están obligadas a implementar este método.
     * @return
     */
    public abstract double calcularArea();

    /**
     * Método abstracto: cada figura debe definir cómo calcula su perímetro.Las subclases están obligadas a implementar este método.
     * @return
     */
    public abstract double calcularPerimetro();

    /**
     * Método concreto: muestra información básica que todas las figuras comparten.
     * Las subclases pueden usarlo o sobrescribirlo si lo necesitan.
     */
    public void mostrarInfo() {
        System.out.println("Figura: " + getNombre() + "  ID: " + getId());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}