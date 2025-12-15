/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 * Clase abstracta para caninos (perros, lobos, etc.).
 * Agrega atributos y comportamientos específicos.
 */
public abstract class Canino extends Mamifero {
    private int numCachorros; // número de crías en una camada

    /**
     * Constructor: llama a Mamifero y luego inicializa numCachorros.
     * @param nombre
     * @param habitat
     * @param peso
     * @param alimentacion
     * @param raza
     * @param tipo
     * @param numExtremidades
     * @param numDientes
     * @param numCachorros
     */
    public Canino(String nombre, String habitat, double peso, String alimentacion,
                  String raza, boolean tipo, String numExtremidades, int numDientes,
                  int numCachorros) {
        super(nombre, habitat, peso, alimentacion, raza, tipo, numExtremidades, numDientes);
        this.numCachorros = numCachorros;
    }

    // GETTER Y SETTER
    public int getNumCachorros() { return numCachorros; }
    public void setNumCachorros(int numCachorros) { this.numCachorros = numCachorros; }

    /**
     * Método abstracto: cada canino ladra de forma diferente.
     */
    public abstract void ladrar();

    /**
     * Sobrescribe 'imprimir' para incluir el número de cachorros.
     */
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de cachorros: " + getNumCachorros());
    }
}