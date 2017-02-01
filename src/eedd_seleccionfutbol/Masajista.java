/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eedd_seleccionfutbol;

/**
 *
 * @author a053380739q
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String titulacion, int anyosExperiencia, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;
    }

    public Masajista(String titulacion, int anyosExperiencia) {
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;
    }

    public Masajista() {
        super();
    }
    
    public static void darMasaje(){
        
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
}
