/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Clase que representa a varias notas
 *
 * @author aitor.martinezparente
 */
public class Marks {

    private ArrayList<Integer> numbers = new ArrayList<>();

    /**
     * Valor fijo de alumnos
     */
    public static final int STUDENTS = 10;

    /**
     *
     * @return
     */
    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
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

        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("Introduce un número:");
            numbers.add(scan.nextInt());
        }
    }

    /**
     * Calcula a media de las notas usando un iterador
     *
     * @return la media de las notas
     */
    public double getAverage() {
        double sum = 0;
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum / numbers.size();
    }
}
