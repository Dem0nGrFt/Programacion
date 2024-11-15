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
        Statistics stat = new Statistics();

        stat.fillArrayLength();
        stat.fillNumbers();
        stat.median();
    }

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

    public void fillNumbers() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número:");
            numbers[i] = scan.nextInt();

        }
    }

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

            System.out.println("hay " + biggers + " elementos mayores que el que esta en " + i);
            System.out.println("hay " + smallers + " elementos menores que el que esta en " + i);

            if (biggers >= numbers.length/2 && smallers >= numbers.length/2) {
                System.out.println(numbers[i] + " es la mediana.");
            }
        }

        return 0;
    }

}
