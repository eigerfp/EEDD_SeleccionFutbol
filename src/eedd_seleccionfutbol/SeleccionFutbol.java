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
public class SeleccionFutbol {

    protected int id, edad;
    protected String nombre, apellidos;

    public SeleccionFutbol(int id, int edad, String nombre, String apellidos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public SeleccionFutbol() {

    }

    public void concentrarse() {

    }

    public void viajar() {

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

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
}
