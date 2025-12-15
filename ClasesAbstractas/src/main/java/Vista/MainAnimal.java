/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Animales.Aguila;
import Animales.Gato;
import Animales.Lobo;
import Animales.Paloma;
import Animales.Perro;
import Animales.Tigre;
import Animales.Trucha;

/**
 * Clase principal para probar el ejercicio de Animales.
 * Crea varios animales y muestra su información.
 */
public class MainAnimal {
    public static void main(String[] args) {
        // Creamos diferentes animales
        Perro perro = new Perro("Firulais", "Casa", 5.0, "Carne", "Labrador", true, "4 patas", 42, 6);
        Lobo lobo = new Lobo("Lobo Gris", "Bosque", 30.0, "Carnívoro", "Grande", false, "4 patas", 42, 5);
        Gato gato = new Gato("Michi", "Casa", 3.0, "Atún", "Siames", true, "4 patas", 30);
        Tigre tigre = new Tigre("Shere Khan", "Selva", 200.0, "Carnívoro", "Bengala", false, "4 patas", 30);
        Aguila aguila = new Aguila("Águila Real", "Montañas", 5.0, "Carnívoro", "ámbar", 20, 45);
        Paloma paloma = new Paloma("Paloma Blanca", "Ciudad", 0.3, "Semillas", "negro", 5, 15);
        Trucha trucha = new Trucha("Trucha Arcoíris", "Río", 1.5, "Insectos", "dulce", true);
                
        // Mostramos la información de cada animal
        System.out.println("     ANIMALES ");
        System.out.println("\n--- PERRO ---");
        perro.imprimir();

        System.out.println("\n--- LOBO ---");
        lobo.imprimir();

        System.out.println("\n--- GATO ---");
        gato.imprimir();

        System.out.println("\n--- TIGRE ---");
        tigre.imprimir();

        System.out.println("\n--- ÁGUILA ---");
        aguila.imprimir();

        System.out.println("\n--- PALOMA ---");
        paloma.imprimir();

        System.out.println("\n--- TRUCHA ---");
        trucha.imprimir();
    }
}