/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 * Clase concreta que representa un cuadrado.
 * Hereda de FiguraGeometrica, por lo tanto también hereda sus atributos y métodos.
 */
public class Cuadrado extends FiguraGeometrica {
    private double lado;  // Longitud de uno de los lados del cuadrado

    /**
     * Constructor: llama al constructor de la clase padre (FiguraGeometrica) y luego inicializa su propio atributo.
     * @param id
     * @param nombre
     * @param lado
     */
    public Cuadrado(int id, String nombre, double lado) {
        super(id, nombre); // ← llama a FiguraGeometrica(id, nombre)
        this.lado = lado;
    }

    // GETTER Y SETTER PARA EL LADO
    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }

    /**
     * Implementación del método abstracto 'calcularArea'.
     * Para un cuadrado, el área es lado × lado.
     */
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    /**
     * Implementación del método abstracto 'calcularPerimetro'.
     * Para un cuadrado, el perímetro es 4 × lado.
     */
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    /**
     * Sobrescribe 'mostrarInfo' si se quiere agregar algo específico del cuadrado.
     * En este caso, no es necesario, porque ya heredamos el método de la clase padre.
     * Pero si se quisiere, podríamos hacerlo así:
     *
     * @Override
     * public void mostrarInfo() {
     *     super.mostrarInfo();
     *     System.out.println("Lado: " + getLado());
     * }
     */
}