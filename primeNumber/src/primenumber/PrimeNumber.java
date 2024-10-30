/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumber;

import java.util.Scanner;

/**
 * Clase que representa a un comprobador de numeros primos
 *
 * @author aitor.martinezparente
 */
public class PrimeNumber {

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Introduce un numero, (0 para salir): ");
            number = scan.nextInt();

            if (number == 0) {
                break;
            }

            if (Prime(number)) {
                System.out.println("El numero " + number + " es primo");
            } else {
                System.out.println("El numero " + number + " no es primo");
            }
        } while (number != 0);
    }

    /**
     * Comprueba si es numero primo o no
     *
     * @param n numero a comprobar
     * @return true si se cumplen las condiciones
     */
    public static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
