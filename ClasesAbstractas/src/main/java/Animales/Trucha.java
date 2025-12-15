/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Usuario
 */
public class Trucha extends Pez {
    public Trucha(String nombre, String habitat, double peso, String alimentacion,
                  String tipoAgua, boolean escamas) {
        super(nombre, habitat, peso, alimentacion, tipoAgua, escamas);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("¡Soy una trucha!");
    }
}
