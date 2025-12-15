/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 * Clase abstracta para aves.
 */
public abstract class Ave extends Animales {
    private String colorOjos;       // color de los ojos
    private int expectativaVida;    // en años
    private int tiempoGestacion;    // en días

    public Ave(String nombre, String habitat, double peso, String alimentacion,
               String colorOjos, int expectativaVida, int tiempoGestacion) {
        super(nombre, habitat, peso, alimentacion);
        this.colorOjos = colorOjos;
        this.expectativaVida = expectativaVida;
        this.tiempoGestacion = tiempoGestacion;
    }

    // GETTERS
    public String getColorOjos() { return colorOjos; }
    public int getExpectativaVida() { return expectativaVida; }
    public int getTiempoGestacion() { return tiempoGestacion; }

    // SETTERS
    public void setColorOjos(String colorOjos) { this.colorOjos = colorOjos; }
    public void setExpectativaVida(int expectativaVida) { this.expectativaVida = expectativaVida; }
    public void setTiempoGestacion(int tiempoGestacion) { this.tiempoGestacion = tiempoGestacion; }

    @Override
    public void imprimir() {
        mostrarInfo();
        System.out.println("Color de ojos: " + getColorOjos());
        System.out.println("Expectativa de vida: " + getExpectativaVida() + " años");
        System.out.println("Tiempo de gestación: " + getTiempoGestacion() + " días");
    }
}