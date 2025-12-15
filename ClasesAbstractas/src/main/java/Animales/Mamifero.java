/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;


/**
 * Clase abstracta que representa a los mamíferos.
 * Hereda de Animales y agrega atributos específicos de mamíferos.
 */
public abstract class Mamifero extends Animales {
    private String raza;              // Raza del mamífero
    private boolean tipo;             // true = doméstico, false = salvaje
    private String numExtremidades;   // Ej: "4 patas"
    private int numDientes;           // Número de dientes

    /**
     * Constructor: llama al constructor de la clase padre (Animales) y luego inicializa sus propios atributos.
     * @param nombre
     * @param habitat
     * @param peso
     * @param alimentacion
     * @param raza
     * @param tipo
     * @param numExtremidades
     * @param numDientes
     */
    public Mamifero(String nombre, String habitat, double peso, String alimentacion,
                    String raza, boolean tipo, String numExtremidades, int numDientes) {
        super(nombre, habitat, peso, alimentacion); // ← llama a Animales(...)
        this.raza = raza;
        this.tipo = tipo;
        this.numExtremidades = numExtremidades;
        this.numDientes = numDientes;
    }

    // GETTERS
    public String getRaza() { return raza; }
    public boolean isTipo() { return tipo; } // para booleanos, se usa "is"
    public String getNumExtremidades() { return numExtremidades; }
    public int getNumDientes() { return numDientes; }

    // SETTERS
    public void setRaza(String raza) { this.raza = raza; }
    public void setTipo(boolean tipo) { this.tipo = tipo; }
    public void setNumExtremidades(String numExtremidades) { this.numExtremidades = numExtremidades; }
    public void setNumDientes(int numDientes) { this.numDientes = numDientes; }

    /**
     * Implementación del método abstracto 'imprimir'.
     * Muestra toda la información del mamífero.
     */
    @Override
    public void imprimir() {
        mostrarInfo(); // llama al método de la clase padre
        System.out.println("Raza: " + getRaza());
        System.out.println("Tipo: " + (isTipo() ? "Doméstico" : "Salvaje"));
        System.out.println("Extremidades: " + getNumExtremidades());
        System.out.println("Dientes: " + getNumDientes());
    }
}