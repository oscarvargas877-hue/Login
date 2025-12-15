/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Usuario
 */
public class Paloma extends Ave {
    public Paloma(String nombre, String habitat, double peso, String alimentacion,
                  String colorOjos, int expectativaVida, int tiempoGestacion) {
        super(nombre, habitat, peso, alimentacion, colorOjos, expectativaVida, tiempoGestacion);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("¡Soy una paloma!");
    }
}