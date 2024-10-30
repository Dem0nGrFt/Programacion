/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fivetable;

/**
 * Clase que representa a la tabla del 5
 *
 * @author aitor.martinezparente
 */
public class FiveTable {

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        int plus = 0;
        for (int i = 1; i <= number2; i++) {
            plus = plus + number1;
            System.out.println(number1 + "x" + i + " " + plus);
        }
    }

}
