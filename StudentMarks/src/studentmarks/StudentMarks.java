/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmarks;

import java.util.Scanner;

/**
 * Clase que representa a estudiantes y sus notas
 *
 * @author aitor.martinezparente
 */
public class StudentMarks {

    private int marks[] = new int[10];
    private String names[] = new String[10];

    /**
     * Consigue los valores de las notas
     *
     * @return el valor de las notas
     */
    public int[] getMarks() {
        return marks;
    }

    /**
     * Cambia el valor de las notas
     *
     * @param marks nuevo valor para las notas
     */
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    /**
     * Consigue los valores de los nombres
     *
     * @return el valor de los nombres
     */
    public String[] getNames() {
        return names;
    }

    /**
     * Cambia el valor de los nombres
     *
     * @param names nuevo valor para los nombres
     */
    public void setNames(String[] names) {
        this.names = names;
    }

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentMarks nameMark = new StudentMarks();

        nameMark.fillMarks();

        System.out.println("La nota maxima es de: " + nameMark.maxMark());
        System.out.println("La nota minima es de: " + nameMark.minMark());

    }

    /**
     * Rellena los datos de las notas y los nombres
     */
    public void fillMarks() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Introduce el nombre del alumno:");
            names[i] = scan.nextLine();
            System.out.println("Introduce su nota:");
            marks[i] = scan.nextInt();
            scan.nextLine();

        }
    }

    /**
     * Consigue el alumno con menor nota
     *
     * @return el alumno con menor nota
     */
    public String minMark() {
        int iMin = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < marks[iMin]) {
                iMin = i;
            }
        }
        return names[iMin];
    }

    /**
     * Consigue el alumno con mayor nota
     *
     * @return el alumno con mayor nota
     */
    public String maxMark() {
        int iMax = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > marks[iMax]) {
                iMax = i;
            }
        }
        return names[iMax];
    }

}
