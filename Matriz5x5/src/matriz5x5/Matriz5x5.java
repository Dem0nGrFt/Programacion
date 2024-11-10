/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz5x5;

/**
 * Clase que representa a una matriz
 *
 * @author Aitor
 */
public class Matriz5x5 {

    /**
     * Inicia la ejecucion
     *
     * @param args
     */
    public static void main(String[] args) {
        int size = 5;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = 10 - (i + j);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
