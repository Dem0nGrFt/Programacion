/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.Date;
import model.Booking;

/**
 *
 * @author aitor.martinezparente
 */
public class BookingDB {
    
    public static ArrayList<Booking> findByDate(Date date){
        return null;
    }
    
    public static ArrayList<Booking> findByUserAndDate(Date date, String id){
        return null;
    }
    
    public static void save(Booking booking){
        PadelManagerDB.getBookings().add(booking);
    }
    
}
