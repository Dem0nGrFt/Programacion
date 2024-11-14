/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marks;

import java.util.Scanner;

/**
 * Clase que representa a varias notas
 *
 * @author aitor.martinezparente
 */
public class Marks {

    private int[] numbers = new int[10];

    /**
     * Invoca el valor de las notas
     *
     * @return el valor de las notas
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Cambia los valores de las notas
     *
     * @param numbers valores para las notas
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
        Marks notas = new Marks();
        notas.fillMarks();
        System.out.println("El resultado de la media es: " + notas.getAverage() + ".");
    }

    /**
     * Rellena las notas con datos
     */
    public void fillMarks() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número:");
            numbers[i] = scan.nextInt();

        }
    }

    /**
     * Calcula la media de las notas
     *
     * @return la media de las notas
     */
    public double getAverage() {

        double plus = 0;

        for (int number : numbers) {
            plus += number;
        }
        return plus /= numbers.length;
    }

}
