/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

public abstract class Pez extends Animales {
    private String tipoAgua;  // "dulce", "salada", "mixta"
    private boolean escamas;  // true si tiene escamas

    public Pez(String nombre, String habitat, double peso, String alimentacion,
               String tipoAgua, boolean escamas) {
        super(nombre, habitat, peso, alimentacion);
        this.tipoAgua = tipoAgua;
        this.escamas = escamas;
    }

    // GETTERS
    public String getTipoAgua() { return tipoAgua; }
    public boolean isEscamas() { return escamas; }

    // SETTERS
    public void setTipoAgua(String tipoAgua) { this.tipoAgua = tipoAgua; }
    public void setEscamas(boolean escamas) { this.escamas = escamas; }

    @Override
    public void imprimir() {
        mostrarInfo();
        System.out.println("Tipo de agua: " + getTipoAgua());
        System.out.println("Tiene escamas: " + (isEscamas() ? "Sí" : "No"));
    }
}