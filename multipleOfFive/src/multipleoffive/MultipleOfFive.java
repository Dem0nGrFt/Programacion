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
        int a = 100;
        int b = 30;
        int suma = 0;
        int temp;

        if (a < 0 || b < 0) {
            System.out.println("Los numeros deben ser positivos");
        } else {

            if (a > b) {
                temp = a;
                a = b;
                b = temp;
                for (int i = a; i <= b; i++) {
                    if (i % 5 == 0) {
                        suma += i;
                    }
                }
                System.out.println("La suma de los múltiplos de 5 entre " + a + " y " + b + " es: " + suma);
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
}
