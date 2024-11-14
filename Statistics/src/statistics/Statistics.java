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

    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public void fillArrayLength() {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("¿Cuantos numeros vas a introducir? ");
            arrayLength = scan.nextInt();
        } while (arrayLength / 2 != 0);
        numbers = new int[arrayLength];

    }

    public void fillMarks() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número:");
            numbers[i] = scan.nextInt();

        }
    }

}
