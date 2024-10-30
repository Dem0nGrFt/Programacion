/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equation;

/**
 *
 * @author aitor.martinezparente
 */
public class Equation {

    /**
     * @param args the command line arguments
     * Declaramos las variables a, b y c siendo estas las 3 integrantes de la ecuacion
     * Luego, declaramos 2 variables mas, en la que equationplus es la ecuacion sumando y equationminum la ecuacion restando
     * Al final mostramos por pantalla el resultado
     * 
     */
    public static void main(String[] args) {
        
        int a = 1;
        int b = -2;
        int c = -15;
        
        double equationplus = (-(b) + Math.sqrt(Math.pow(b, 2) - (4*a*c))) /2*a;
        double equationminum = (-(b) - Math.sqrt(Math.pow(b, 2) - (4*a*c))) /2*a;
        
        System.out.println("El resultado sumando es " + equationplus);
        System.out.println("El resultado restando es " + equationminum);
    }
    
}
