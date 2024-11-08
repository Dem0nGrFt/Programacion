/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmarks;

import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class StudentMarks {

    private int marks[] = new int[10];
    private String names[] = new String[10];

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    private void fillMarks() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Introduce el nombre del alumno:");
            names[i] = scan.nextLine();
            System.out.println("Introduce su nota:");
            marks[i] = scan.nextInt();
            scan.nextLine();

        }
    }

}
