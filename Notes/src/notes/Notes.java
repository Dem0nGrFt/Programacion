/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notes;

/**
 *
 * @author aitor.martinezparente
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qualification = 8;

        // Clasificador de notas segun su valor
        switch (qualification) {
            case 10:
                System.out.println("Matricula de honor");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 5:
                System.out.println("Suficiente");
                break;

            default:
                System.out.println("Suspenso");
        }
    }

}
