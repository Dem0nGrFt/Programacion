/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortedarray;

import java.util.Scanner;
import java.lang.Exception;

/**
 *
 * @author aitor.martinezparente
 */
public class SortedArray {

    private int[] array;
    private boolean sorted;

    /**
     * Crea un nuevo array
     */
    public SortedArray() {
        array = new int[6];
        sorted = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 6 numeros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
    }

    /**
     * Ordena el array con metodo bubble sort
     */
    public void sort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        sorted = true;
    }

    /**
     * Muestra los valores del array
     */
    public void show() throws ArrayIndexOutOfBoundsException {

        /*
        System.out.print("Array ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        */
        // prueba try catch
        try {
            for (int i = 0; i < 100; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: el indice esta fuera del rango.");
        }
    }

    /**
     * Consulta si el array está ordenado
     *
     * @return true si el array está ordenado
     */
    public boolean isSorted() {
        return sorted;
    }

    /**
     * Busca un número en el array
     *
     * @param number Número a buscar
     * @return true si el número está en el array
     */
    public boolean contains(int number) {

        if (!sorted) {
            sort();
        }

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == number) {
                return true;
            } else if (array[mid] < number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    /**
     * Inicia la ejecución
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();
        sortedArray.sort();
        sortedArray.show();
    }
}
