/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Usuario
 */
public class Gato extends Felino {
    public Gato(String nombre, String habitat, double peso, String alimentacion,
                String raza, boolean tipo, String numExtremidades, int numDientes) {
        super(nombre, habitat, peso, alimentacion, raza, tipo, numExtremidades, numDientes);
    }

    @Override
    public void maullar() {
        System.out.println("¡Miau miau!");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("¡Soy un gato!");
        maullar();
    }
}