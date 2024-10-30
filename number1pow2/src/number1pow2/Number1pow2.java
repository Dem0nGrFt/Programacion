/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number1pow2;

/**
 * Clase que representa un numero elevado a otro
 *
 * @author aitor.martinezparente
 */
public class Number1pow2 {

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number1 = 2;
        int number2 = 20;
        int plus = 1;
        for (int i = 0; i < number2; i++) {
            plus = plus * number1;
            System.out.println(plus);
        }

    }

}
