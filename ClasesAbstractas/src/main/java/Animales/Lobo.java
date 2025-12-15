/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Usuario
 */public class Lobo extends Canino {
    public Lobo(String nombre, String habitat, double peso, String alimentacion,
                String raza, boolean tipo, String numExtremidades, int numDientes,
                int numCachorros) {
        super(nombre, habitat, peso, alimentacion, raza, tipo, numExtremidades, numDientes, numCachorros);
    }

    @Override
    public void ladrar() {
        System.out.println("¡Auuu!");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("¡Soy un lobo!");
        ladrar();
    }
}