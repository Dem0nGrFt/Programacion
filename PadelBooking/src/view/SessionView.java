/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.SessionController;
import java.util.ArrayList;
import java.util.Scanner;
import model.Booking;

/**
 *
 * @author aitor.martinezparente
 */
public class SessionView {
    
    private SessionController controller;

    public SessionView(SessionController controller) {
        this.controller = controller;
    }
    
    public void showSessionMenu(ArrayList<Booking> bookings){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Benvido: " + controller.getSessionPlayer().getName());
        System.out.print("Saldo: " + controller.getSessionPlayer().getBalance());
        System.out.println("Reservas: ");
        for (Booking booking : bookings) {
            System.out.println(booking.getDescription());
        }
        
    }
    
}
