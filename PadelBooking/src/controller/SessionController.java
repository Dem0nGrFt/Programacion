/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import model.*;
import view.SessionView;

/**
 *
 * @author aitor.martinezparente
 */
public class SessionController {

    private SessionView view;

    private Player sessionPlayer;

    public Player getSessionPlayer() {
        return sessionPlayer;
    }

    public void setSessionPlayer(Player sessionPlayer) {
        this.sessionPlayer = sessionPlayer;
    }

    public SessionController(Player sessionPlayer) {
        view = new SessionView(this); //this
        this.sessionPlayer = sessionPlayer;
    }

    public void loadSession() {
        //view.showSessionMenu(bookings);

    }

    public void createBooking(Date date) {

    }

    public void completeBooking(Date date, String hora, PadelCourt court) {

        if (court.getType() == PadelCourt.SINGLE) {

        }
        loadSession();
    }

    public void addPlayerToBooking() {
        loadSession();
    }

}
