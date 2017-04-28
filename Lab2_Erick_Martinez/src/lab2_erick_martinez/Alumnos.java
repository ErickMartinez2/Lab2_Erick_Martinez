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
public class Alumnos {

    public String apodo;
    public int cuenta;
    public int edad;
    public int resistencia;
    public String grado;
    public String arma;

    public Alumnos(String apodo, int cuenta, int edad, int resistencia, String grado, String arma) {
        this.apodo = apodo;
        this.cuenta = cuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.grado = grado;
        this.arma = arma;
    }

    public String getApodo() {
        return apodo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getGrado() {
        return grado;
    }

    public String getArma() {
        return arma;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    
}
