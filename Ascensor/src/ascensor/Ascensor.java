/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascensor;

/**
 *
 * @author aitor.martinezparente
 */
public class Ascensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char action = 'p';

        // ascensor que haceuna funcion segun la letra de action
        switch (action) {
            case 'a':
                System.out.println("Abrir");
                break;
            case 'b':
                System.out.println("Bajar");
                break;
            case 'p':
                System.out.println("Cerrar");
                break;
            case 's':
                System.out.println("Subir");
                break;

            default:
                System.out.println("¡Error!");
        }
    }

}
