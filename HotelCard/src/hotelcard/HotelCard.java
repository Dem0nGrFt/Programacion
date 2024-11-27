/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelcard;

/**
 * Clase que representa a un seleccionador en un hotel
 *
 * @author aitor.martinezparente
 */
public class HotelCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 20;
        boolean unemploy = true;
        boolean univCard = true;
        boolean retirCard = true;
        boolean famCard = true;

        
        //Clasificador para saber lo que se paga en el hotel
        if (age < 30 || age > 55) {
            if (age < 30) {
                if (univCard == true && unemploy == true) {
                    System.out.println("Paga 35€");
                } else if (univCard == true || unemploy == true){
                    System.out.println("Paga 40€");
                } else {
                    System.out.println("Paga 50€");
                }
            } else {
                if (retirCard == true || unemploy == true) {
                    System.out.println("Paga 45€");
                } else {
                    System.out.println("Paga 60€");
                }
            }

        } else {
            if (famCard == true) {
                System.out.println("Paga 65€");
            } else {
                System.out.println("Paga 75€");
            }
        }

    }

}
