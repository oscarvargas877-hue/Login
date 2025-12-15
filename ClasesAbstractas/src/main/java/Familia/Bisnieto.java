/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Familia;

/**
 *
 * @author Usuario
 */
public class Bisnieto extends Nieto {
    private String atributo1;       // Atributo adicional (como en tu diagrama)

    /**
     * Constructor: llama al constructor de la clase padre (Nieto) y luego inicializa su propio atributo.
     * @param nombres
     * @param apellidos
     * @param edad
     * @param direccion
     * @param profesion
     * @param anioNacimiento
     * @param colegio
     * @param nombrePadre
     * @param atributo1
     */
    public Bisnieto(String nombres, String apellidos, int edad, String direccion,
                    String profesion, int anioNacimiento, String colegio, String nombrePadre,
                    String atributo1) {
        super(nombres, apellidos, edad, direccion, profesion, anioNacimiento, colegio, nombrePadre);
        this.atributo1 = atributo1;
    }

    // GETTER Y SETTER
    public String getAtributo1() { return atributo1; }
    public void setAtributo1(String atributo1) { this.atributo1 = atributo1; }

    /**
     * Sobrescribe 'imprimir' para agregar información del bisnieto.
     */
    @Override
    public void imprimir() {
        System.out.println("Soy el bisnieto:");
        System.out.println("Nombre: " + getNombres() + " " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Colegio: " + getColegio());
        System.out.println("Mi padre es: " + getNombrePadre());
        System.out.println("Atributo extra: " + atributo1);
    }
}
