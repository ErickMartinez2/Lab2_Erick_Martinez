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
public class Alemanes {

    public String alias;
    public int edad;
    public String casta;
    public int resistencia;
    public String arma;
    public int fuego;

    public int getFuego() {
        return fuego;
    }

    public void setFuego(int fuego) {
        this.fuego = fuego;
    }

    public Alemanes(String alias, int edad, String casta, int resistencia, String arma, int fuego) {
        this.alias = alias;
        this.edad = edad;
        this.casta = casta;
        this.resistencia = resistencia;
        this.arma = arma;
        this.fuego = fuego;
    }

    public String getAlias() {
        return alias;
    }

    public int getEdad() {
        return edad;
    }

    public String getCasta() {
        return casta;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getArma() {
        return arma;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Alemanes{" + "alias=" + alias + ", edad=" + edad + ", casta=" + casta + ", resistencia=" + resistencia + ", arma=" + arma + ", fuego=" + fuego + '}';
    }

}
