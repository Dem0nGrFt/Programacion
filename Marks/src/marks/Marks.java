/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marks;

import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class Marks {

    private int[] numbers = new int[10];

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
        Marks notas = new Marks();
        notas.fillMarks();
    }

    private void fillMarks() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número:");
            numbers[i] = scan.nextInt();

        }
    }

    private void getAverage(double average) {

        //average = numbers.length % numbers;

    }

}
