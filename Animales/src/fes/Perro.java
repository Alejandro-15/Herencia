/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes;

/**
 *
 * @author PC
 */
public class Perro extends Animal{
    
    private String raza;
    private String peso;

    public Perro() {
    }

    public Perro(String raza, String peso) {
        this.raza = raza;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", peso=" + peso + '}';
    }

  
    
    
    
}
