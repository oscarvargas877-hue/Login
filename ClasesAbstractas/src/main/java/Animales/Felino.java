/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 * Clase abstracta para felinos (gatos, tigres, etc.).
 * Agrega comportamiento específico: todos los felinos pueden maullar.
 */
public abstract class Felino extends Mamifero {

    /**
     * Constructor: llama al constructor de Mamifero.
     * @param nombre
     * @param habitat
     * @param peso
     * @param alimentacion
     * @param raza
     * @param tipo
     * @param numExtremidades
     * @param numDientes
     */
    public Felino(String nombre, String habitat, double peso, String alimentacion,
                  String raza, boolean tipo, String numExtremidades, int numDientes) {
        super(nombre, habitat, peso, alimentacion, raza, tipo, numExtremidades, numDientes);
    }

    /**
     * Método abstracto: cada felino maulla de forma diferente.
     * Las subclases (Gato, Tigre) deben implementarlo.
     */
    public abstract void maullar();

    /**
     * Sobrescribe 'imprimir' para agregar un mensaje de identidad.
     */
    @Override
    public void imprimir() {
        super.imprimir(); // muestra toda la info de Mamifero
        System.out.println("¡Soy un felino!");
    }
}