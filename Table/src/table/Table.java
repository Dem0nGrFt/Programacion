/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package table;

/**
 * Clase que representa a una tabla de multiplicar
 *
 * @author Aitor
 */
class Table {

    private int number;

    /**
     * Crea una nueva tabla de multiplicar
     *
     * @param number
     */
    public Table(int number) {
        this.number = number;
    }

    /**
     * Consigue los valores de la tabla de multiplicar
     *
     * @return Los valores de la tabla de multiplicar
     */
    public int getNumber() {
        return number;
    }

    /**
     * Cambia los valores de la tabla de multipicar
     *
     * @param number Nuevos valores para la trabla de multiplicar
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Muestra la tabla de multiplicar de un numero
     */
    public void show() {
        System.out.println("Tabla de multiplicar del " + number + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }

    /**
     * Inicia la ejecucion
     *
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            Table table = new Table(i);
            table.show();
        }
    }
}
