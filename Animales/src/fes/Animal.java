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
public class Animal {
    private int numeroPatas;
    private String tipo;
    private String habla;

    public Animal() {
    }

    public Animal(int numeroPatas, String tipo, String habla) {
        this.numeroPatas = numeroPatas;
        this.tipo = tipo;
        this.habla = habla;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabla() {
        return habla;
    }

    public void setHabla(String habla) {
        this.habla = habla;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", tipo=" + tipo + ", habla=" + habla + '}';
    }

 
    
    
}
