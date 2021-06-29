/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import fes.Animal;
import fes.Gato;
import fes.Perro;

/**
 *
 * @author PC
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Animal a1 = new Animal(4, "Domesticos", "no");
  Gato g1 = new Gato("Siamés", "Cafe");
  Perro p1 = new Perro("Pastor Aleman", "14");
   
  
        System.out.println("Numero de patas:"+a1.getNumeroPatas() );
        System.out.println("Tipo:"+a1.getTipo());
        System.out.println("Habla:"+a1.getHabla());
        System.out.println("Raza:"+g1.getRaza());
        System.out.println("Color:"+g1.getColor());
        System.out.println("Raza:"+p1.getRaza());
        System.out.println("Peso:"+p1.getPeso());
    }
    
}
