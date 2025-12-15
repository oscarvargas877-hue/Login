/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 * Clase concreta: representa a un perro.
 * Hereda de Canino, por lo tanto también de Mamifero y Animales.
 */
public class Perro extends Canino {
    public Perro(String nombre, String habitat, double peso, String alimentacion,
                 String raza, boolean tipo, String numExtremidades, int numDientes,
                 int numCachorros) {
        super(nombre, habitat, peso, alimentacion, raza, tipo, numExtremidades, numDientes, numCachorros);
    }

    /**
     * Implementación del método abstracto 'ladrar'.
     */
    @Override
    public void ladrar() {
        System.out.println("¡Guau guau!");
    }

    /**
     * Sobrescribe 'imprimir' para agregar identidad y sonido.
     */
    @Override
    public void imprimir() {
        super.imprimir(); // muestra toda la info de Canino
        System.out.println("¡Soy un perro!");
        ladrar(); // llama al método específico
    }
}