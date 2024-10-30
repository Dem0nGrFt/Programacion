/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundredorodd;

/**
 *
 * @author aitor.martinezparente
 */
public class HundredOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 501;
        // Comprobamos si el numero es mayor que 100 o si es par
        if ((x > 100) || (x % 2 == 0)) {
            System.out.println("El numero " + x + " cumple la condicion.");
        } else {
            System.out.println("El numero " + x + " no cumple la condicion.");
        }
    }

}
