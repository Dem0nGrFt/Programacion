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

    /**
     * Consigue los valores de el calendario
     *
     * @return los valores de el calendario
     */
    public int[][] getCalendar() {
        return calendar;
    }

    /**
     * Cambia los valores de el calendario
     *
     * @param calendar los valores de el calendario
     */
    public void setCalendar(int[][] calendar) {
        this.calendar = calendar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdventCalendar adventcalendar = new AdventCalendar();

        adventcalendar.fill();
        adventcalendar.show();

        while (!adventcalendar.christmasIsHere()) {
            adventcalendar.eat();
            System.out.println();
            adventcalendar.show();
        }

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

    /**
     * Verifica si el valor esta o no introducido
     *
     * @param b valor a verificar
     * @return true si esta introducido
     */
    private boolean isIt(int b) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (b == calendar[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Rellena el calendario con valores aleatorios del 1 al 24
     */
    public void fill() {

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                int value;
                do {
                    value = new java.util.Random().nextInt(MAX) + 1;
                } while (isIt(value));
                calendar[i][j] = value;
            }
        }

    }

    /**
     * Cambia el menor valor de el calendario y lo pone a 0
     */
    public void eat() {
        int min = Integer.MAX_VALUE;
        int minRow = -1;
        int minCol = -1;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (calendar[i][j] != 0 && calendar[i][j] < min) {
                    min = calendar[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        if (minRow != -1 && minCol != -1) {
            calendar[minRow][minCol] = 0;
        }

    }

    /**
     * Verifica si el calendario esta vacio
     *
     * @return true si el calendario esta vacio
     */
    public boolean christmasIsHere() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (calendar[i][j] != 0) {
                    return false;
                }
            }
        }
        System.out.println("¡Ya es Navidad!");
        return true;
    }
}
