/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;
/**
 * Clase abstracta para animales ovíparos (que ponen huevos).
 * 
 */
public abstract class Oviparo extends Animales {
    private String tipoHuevo;     // "duro", "blando", etc.
    private int cantidadHuevos;   // número de huevos por puesta

    public Oviparo(String nombre, String habitat, double peso, String alimentacion,
                   String tipoHuevo, int cantidadHuevos) {
        super(nombre, habitat, peso, alimentacion);
        this.tipoHuevo = tipoHuevo;
        this.cantidadHuevos = cantidadHuevos;
    }

    // GETTERS
    public String getTipoHuevo() { return tipoHuevo; }
    public int getCantidadHuevos() { return cantidadHuevos; }

    // SETTERS
    public void setTipoHuevo(String tipoHuevo) { this.tipoHuevo = tipoHuevo; }
    public void setCantidadHuevos(int cantidadHuevos) { this.cantidadHuevos = cantidadHuevos; }

    @Override
    public void imprimir() {
        mostrarInfo();
        System.out.println("Tipo de huevo: " + getTipoHuevo());
        System.out.println("Cantidad de huevos: " + getCantidadHuevos());
    }
}