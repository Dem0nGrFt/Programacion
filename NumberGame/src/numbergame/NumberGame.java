/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbergame;

import java.util.Scanner;
import java.util.Random;

/**
 * Clase que representa a un juego de adivinar
 *
 * @author Aitor
 */
public class NumberGame {

    /**
     * Inicia la ejecucion
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el valor maximo: ");
        int max = scan.nextInt();

        System.out.print("Introduce el numero de intentos permitidos: ");
        int attempts = scan.nextInt();

        int numberToGuess = new Random().nextInt(max) + 1;

        System.out.println("Quiero jugar un juego... Adivina mi numero");

        boolean hasWon = false;
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Intento " + i + ": ");
            int userGuess = scan.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Tuviste suerte...");
                hasWon = true;
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("El numero es mayor.");
            } else {
                System.out.println("El numero es menor.");
            }
        }

        if (!hasWon) {
            System.out.println("Perdiste... El numero era: " + numberToGuess + ". Borrando todo el sistema de almacenamiento...  ");
        }
    }
}
