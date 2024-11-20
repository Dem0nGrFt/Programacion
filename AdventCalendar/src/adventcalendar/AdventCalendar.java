/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventcalendar;

/**
 *
 * @author aitor.martinezparente
 */
public class AdventCalendar {

    /**
     * Numero maximo de dias del calendario
     */
    public static final int MAX = 24;
    /**
     * Numero de filas del calendario
     */
    public static final int ROWS = 6;
    /**
     * Numero de columnas del calendario
     */
    public static final int COLUMNS = 4;
    private int calendar[][] = new int[ROWS][COLUMNS];

    public int[][] getCalendar() {
        return calendar;
    }

    public void setCalendar(int[][] calendar) {
        this.calendar = calendar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    /**
     * Muestra los valores del calendario
     */
    public void show() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(calendar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fill() {
        int value = new java.util.Random().nextInt(MAX);
    }

}
