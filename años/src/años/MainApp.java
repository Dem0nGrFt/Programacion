/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package años;

import java.util.Scanner;

/**
 * Clase que reprenta un aplicacion principal
 *
 * @author aitor.martinezparente
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("El año es bisesto? (true/false): ");
        boolean leap1 = scan.nextBoolean();
        Year year1 = new Year(leap1);

        System.out.println("Introduce el numero del mes: ");
        int monthDay1 = scan.nextInt();
        year1.showDaysOfMonth(monthDay1);

    }

}
