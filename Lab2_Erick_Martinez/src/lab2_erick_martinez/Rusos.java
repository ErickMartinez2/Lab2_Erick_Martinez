/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_erick_martinez;

/**
 *
 * @author usuario
 */
public class Rusos {
    public String nombre;
    public int ID;
    public int edad;
    public String rango;
    public int resistencia;
    public String arma;
    public int fuego;

    public Rusos(String nombre, int ID, int edad, String rango, int resistencia, String arma, int fuego) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.rango = rango;
        this.resistencia = resistencia;
        this.arma = arma;
        this.fuego = fuego;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public int getEdad() {
        return edad;
    }

    public String getRango() {
        return rango;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getArma() {
        return arma;
    }
    
    public int getFuego() {
        return fuego;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    public void setFuego(int fuego){
        this.fuego = fuego;
    }

    @Override
    public String toString() {
        return "Rusos{" + "nombre=" + nombre + ", ID=" + ID + ", edad=" + edad + ", rango=" + rango + ", resistencia=" + resistencia + ", arma=" + arma + ", fuego=" + fuego + '}';
    }
    
}
