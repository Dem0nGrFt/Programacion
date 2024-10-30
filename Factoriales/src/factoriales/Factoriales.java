/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factoriales;

/**
 * Clase que representa a numeros factoriales
 *
 * @author aitor.martinezparente
 */
public class Factoriales {

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        int acum = 1;

        while (i <= n) {
            acum = acum * i++;
        }
        System.out.println(acum);
    }

}
