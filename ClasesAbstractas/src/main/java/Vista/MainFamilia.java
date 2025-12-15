/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Familia.Bisnieto;
import Familia.Nieto;
import Familia.Padre;

/**
 * Clase principal para probar el ejercicio de Familia.
 * Crea miembros de la familia y muestra su información.
 */
public class MainFamilia {
    public static void main(String[] args) {
        // Creamos miembros de la familia
        Padre papa = new Padre("Carlos", "González", 45, "Calle 123", "Ingeniero", 1978);
        Nieto hijo = new Nieto("Marco", "González", 12, "Calle 123", "Ingeniero", 1978, "Colegio San José", "Carlos");
        Bisnieto bebe = new Bisnieto("Fabian", "González", 2, "Calle 123", "Ingeniero", 1978, "Colegio San José", "Carlos", "Me gusta jugar");

        // Mostramos la información de cada miembro
        System.out.println("=== FAMILIA ===");
        System.out.println("\n--- PADRE ---");
        papa.imprimir();

        System.out.println("\n--- NIETO ---");
        hijo.imprimir();

        System.out.println("\n--- BISNIETO ---");
        bebe.imprimir();
    }
}