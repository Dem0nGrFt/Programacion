/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayorque;

/**
 *
 * @author aitor.martinezparente
 */
public class MayorQue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int z = 10;

        // comparacion de variables para saber el mayor
        if ((x > y) && (x > z)) {
            System.out.println(x + " es el mayor.");
        } else if (y > z) {
            System.out.println(y + " es el mayor.");
        } else {
            System.out.println(z + " es el mayor.");
        }
    }

}
