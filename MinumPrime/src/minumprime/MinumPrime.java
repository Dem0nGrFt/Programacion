/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minumprime;

import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class MinumPrime {

    /**
     * Comprueba si un numero es primo
     *
     * @param number valor de el numero
     * @return true si es primo
     */
    public static boolean esPrimo(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Inicia la ejecucion
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        System.out.println("Numeros primos menores que " + n + ":");

        for (int i = 2; i < n; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
