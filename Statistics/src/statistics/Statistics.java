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
     * Imprime os valores dun array.
     *
     * @param array O array a imprimir
     * @param message Mensaxe inicial para a impresión
     */
    private void printArray(int[] array, String message) {
        System.out.print(message);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Calcula a mediana dos números dun array
     *
     * Ordenamento aleatorio. Este algoritmo verifica si el array esta ordenado.
     * Si no lo esta, permuta repetida y aleatoriamente los valores hasta que lo
     * este.
     *
     * @return valor para a mediana
     */
    public int median() {

        while (!isSorted(numbers)) {

            System.out.print("Permutacion generada: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            shuffle(numbers);
        }

        System.out.print("Array ordenado: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int medianIndex = numbers.length / 2;

        System.out.println(numbers[medianIndex] + " é a mediana.");
        return numbers[medianIndex];
    }

    /**
     * Verifica si el array esta ordenado
     *
     * @param array el array a comprobar
     * @return true si esta ordenado
     */
    private boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Baraja o array
     *
     * @param array O array a barallar
     */
    private void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

}
