/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Familia;

/**
 * Clase concreta que representa a un nieto.
 * Hereda de Padre, por lo tanto también de Abuelo.
 */
public class Nieto extends Padre {
    private String colegio;         // Colegio donde estudia el nieto
    private String nombrePadre;     // Nombre del padre (opcional, para mostrar relación)

    /**
     * Constructor: llama al constructor de la clase padre (Padre) y luego inicializa sus propios atributos.
     * @param nombres
     * @param apellidos
     * @param edad
     * @param direccion
     * @param profesion
     * @param anioNacimiento
     * @param colegio
     * @param nombrePadre
     */
    public Nieto(String nombres, String apellidos, int edad, String direccion,
                 String profesion, int anioNacimiento, String colegio, String nombrePadre) {
        super(nombres, apellidos, edad, direccion, profesion, anioNacimiento);
        this.colegio = colegio;
        this.nombrePadre = nombrePadre;
    }

    // GETTERS
    public String getColegio() { return colegio; }
    public String getNombrePadre() { return nombrePadre; }

    // SETTERS
    public void setColegio(String colegio) { this.colegio = colegio; }
    public void setNombrePadre(String nombrePadre) { this.nombrePadre = nombrePadre; }

    /**
     * Sobrescribe 'imprimir' para agregar información del nieto.
     */
    @Override
    public void imprimir() {
        System.out.println("Soy el nieto:");
        System.out.println("Nombre: " + getNombres() + " " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Colegio: " + colegio);
        System.out.println("Mi padre es: " + nombrePadre);
    }
}