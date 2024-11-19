/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;

import java.util.Scanner;

/**
 * Clase que representa a una matriz
 *
 * @author aitor.martinezparente
 */
public class Matrix {

    /**
     * Numero de filas de la matriz
     */
    public static final int ROWS = 3;
    /**
     * Numero de columnas de la matriz
     */
    public static final int COLUMNS = 3;
    private int matrix[][] = new int[ROWS][COLUMNS];

    /**
     * Consigue los valores de la matriz
     *
     * @return los valores de la matriz
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * Cambia los valores de la matriz
     *
     * @param matrix nuevos valores para la matriz
     */
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Rellena los datos de la matriz
     */
    public void askValues() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.println("Introduce el numero que esta en la posicion " + i + ", " + j + ":");
                matrix[i][j] = scan.nextInt();
            }

        }
    }

    /**
     * Muestra los valores de la matriz
     */
    public void show() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * suma los valores de 2 matrices
     *
     * @param b segunda matriz a sumar
     * @return suma de las 2 matrices
     */
    public Matrix sum(Matrix b) {
        Matrix res = new Matrix();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                res.getMatrix()[i][j] = matrix[i][j] + b.getMatrix()[i][j];
            }
        }

        return res;
    }

    /**
     * Inicia la ejecucion
     *
     * @param args
     */
    public static void main(String[] args) {
        Matrix matriz1 = new Matrix();
        Matrix matriz2 = new Matrix();
        Matrix plusmatriz;

        //Rellenar valores de las matrices
        System.out.println("Inserta los valores de la primera matriz ");
        matriz1.askValues();
        System.out.println("Inserta los valores de la segunda matriz ");
        matriz2.askValues();
        //Muestra los valores de las matrices
        System.out.println("Los valores de la primera matriz son: ");
        matriz1.show();
        System.out.println("Los valores de la segunda matriz son: ");
        matriz2.show();
        //Suma las 2 matrices y muestra el resultado
        plusmatriz = matriz1.sum(matriz2);
        System.out.println("La suma de las 2 matrices es: ");
        plusmatriz.show();

    }
}
