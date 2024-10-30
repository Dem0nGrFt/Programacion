/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package people;

import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce o nome da primeira persoa:");
        String name1 = scan.nextLine();
        System.out.println("Introduce o ano de nacemento da primeira persoa:");
        int year1 = scan.nextInt();
        String fix = scan.nextLine();
        System.out.println("Introduce o nome da segunda persoa:");
        String name2 = scan.nextLine();
        System.out.println("Introduce o ano de nacemento da segunda persoa:");
        int year2 = scan.nextInt();
        Person person1 = new Person(name1, year1);
        Person person2 = new Person(name2, year2);

        person1.future();
        person2.future();
    }

}
