/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistics;

import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class Statistics {

    private int arrayLength;
    private int numbers[];

    /**
     * Consigue el valor para el tamaño del array
     *
     * @return tamaño del array
     */
    public int getArrayLength() {
        return arrayLength;
    }

    /**
     * Cambia el valor para el tamaño del array
     *
     * @param arrayLength tamaño del array
     */
    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    /**
     * Consigue el valor de los numeros
     *
     * @return el valor de los numeros
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Cambia el valor de los numeros
     *
     * @param numbers valor para los numeros
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Statistics stat = new Statistics();

        stat.fillArrayLength();
        stat.fillNumbers();
        stat.median();
    }

    /**
     * Introduce el valor del array (impar)
     */
    public void fillArrayLength() {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("¿Cuantos numeros vas a introducir? (debe ser impar): ");
            arrayLength = scan.nextInt();
            if (arrayLength % 2 == 0) {
                System.out.println("Debe de ser un numero impar!!");
            }
        } while (arrayLength % 2 == 0);
        numbers = new int[arrayLength];

    }

    /**
     * Introduce los valores para los numeros
     */
    public void fillNumbers() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número:");
            numbers[i] = scan.nextInt();

        }
    }

    /**
     * Calcula la mediana de los numeros de un array
     *
     * @return valor para la mediana
     */
    public int median() {

        for (int i = 0; i < numbers.length; i++) {

            int biggers = 0;
            int smallers = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (j != i) {
                    if (numbers[j] >= numbers[i]) {
                        biggers++;
                    }
                    if (numbers[j] <= numbers[i]) {
                        smallers++;
                    }
                }
            }

            if (biggers >= numbers.length / 2 && smallers >= numbers.length / 2) {
                System.out.println(numbers[i] + " es la mediana.");
            }
        }

        return 0;
    }

}
