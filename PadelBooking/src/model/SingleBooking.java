/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author aitor.martinezparente
 */
public class SingleBooking extends Booking {

    private Player players[];

    /**
     * consigue el valor para los jugadores
     *
     * @return valor para los jugadores
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     * cambia el valor para los jugadores
     *
     * @param players valor para los jugadores
     */
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    /**
     * crea una nueva reserva single
     *
     * @param players valor para los jugadores
     * @param date valor para la fecha
     * @param hour valor para la hora
     * @param court valor para el campo
     */
    public SingleBooking(Player[] players, Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        this.players = players;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {

        boolean check = true;

        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                check = false;
                return check;
            } else {
                return check;
            }
        }
        return check;

    }

    @Override
    public boolean containsPlayer(String id) {
        boolean check = true;

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null && players[i].getId().equals(id)) {
                return check;
            } else {
                check = false;
                return check;
            }
        }
        return check;
    }

    @Override
    public String getDescription() {
        String text = super.getDescription();
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                text += "Xogadores: " + players[i].getId() + "(" + players[i].getScore() + ")"
                        + players[i].getId() + "(" + players[i].getScore() + ")\n";
            }
        }
        return text;
    }

    public void addPlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
            }

        }
    }
}
