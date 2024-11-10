/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package getbigger;

import java.util.Scanner;

/**
 * Clase que comprueba el numero mas grande
 *
 * @author Aitor
 */
public class GetBigger {

    /**
     * Comprueba el numero mayor
     *
     * @return El numero mas grande
     */
    public int getBigger() {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Introduce 10 numeros enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int num = scan.nextInt();
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Inicia la ejecucion
     *
     * @param args
     */
    public static void main(String[] args) {
        GetBigger analyzer = new GetBigger();
        int biggest = analyzer.getBigger();
        System.out.println("El numero mas grande es: " + biggest);
    }
}
