/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.*;

/**
 *
 * @author aitor.martinezparente
 */
public class PadelManagerDB {

    private static Map<String, Player> players = new HashMap<>();

    private static ArrayList<PadelCourt> courts = new ArrayList<>();

    private static ArrayList<Booking> bookings = new ArrayList<>();

    /**
     * consigue los valores de la lista de jugadores
     *
     * @return valores de la lista de jugadores
     */
    public static Map<String, Player> getPlayers() {
        return players;
    }

    /**
     * cambia los valores de la lista de jugadores
     *
     * @param players valores de la lista de jugadores
     */
    public static void setPlayers(Map<String, Player> players) {
        PadelManagerDB.players = players;
    }

    /**
     * consigue los valores de la lista de campos
     *
     * @return valores de la lista de campos
     */
    public static ArrayList<PadelCourt> getCourts() {
        return courts;
    }

    /**
     * cambia los valores de la lista de campos
     *
     * @param courts valores de la lista de campos
     */
    public static void setCourts(ArrayList<PadelCourt> courts) {
        PadelManagerDB.courts = courts;
    }

    /**
     * consigue los valores de la lista de reservas
     *
     * @return valores de la lista de reservas
     */
    public static ArrayList<Booking> getBookings() {
        return bookings;
    }

    /**
     * cambia los valores de la lista de reservas
     *
     * @param bookings valores de la lista de reservas
     */
    public static void setBookings(ArrayList<Booking> bookings) {
        PadelManagerDB.bookings = bookings;
    }

}
