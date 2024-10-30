/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smallprograms;

/**
 *
 * @author aitor.martinezparente
 */
public class Hypotenuse {

    /**
     * @param args the command line arguments
     * Declaramos las 2 variables cat1 y cat2 siendo estos los 2 catetos de el calculo de la hipotenusa
     * Calculamos la raiz cuadrada de los 2 catetos para que nos de la hipotenusa
     * Mostramos por pantalla el resultado
     */
    public static void main(String[] args) {
        
        double cat1 = 4;
        double cat2 = 3;
        
        double result = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        
        System.out.println("el resultado es " + result);
    }
    
}
