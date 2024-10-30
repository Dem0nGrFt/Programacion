/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multipleoffive;

/**
 * Clase que representa a multiplos de cinco
 *
 * @author aitor.martinezparente
 */
public class MultipleOfFive {

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 30;
        int suma = 0;

        if (a > b) {
            System.out.println("Valores no validos");
        } else {

            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {
                    suma += i;
                }
            }

            System.out.println("La suma de los múltiplos de 5 entre " + a + " y " + b + " es: " + suma);
        }
    }
}
