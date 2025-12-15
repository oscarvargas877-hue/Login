/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import FiguraGeometrica.Cuadrado;



/**
 * Clase principal para probar el ejercicio de Figura Geométrica.
 * Crea un cuadrado y muestra su información usando la clase abstracta.
 */
public class MainFigura {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Cuadrado
        // Nota: Cuadrado es una subclase concreta de FiguraGeometrica (abstracta)
        Cuadrado cuadrado = new Cuadrado(1, "Cuadrado Rojo", 5.0);

        // Mostramos la información usando el método heredado de la clase abstracta
        System.out.println("=== FIGURA GEOMÉTRICA ===");
        cuadrado.mostrarInfo(); // Este método está en FiguraGeometrica.java
    }
}