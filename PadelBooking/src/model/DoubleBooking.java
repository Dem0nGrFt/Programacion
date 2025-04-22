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
public class DoubleBooking extends Booking {

    private Player teams[][];

    /**
     * consigue el valor para los equipos
     *
     * @return valor para los equipos
     */
    public Player[][] getTeams() {
        return teams;
    }

    /**
     * cambia el valor para los equipos
     *
     * @param teams valor para los equipos
     */
    public void setTeams(Player[][] teams) {
        this.teams = teams;
    }

    /**
     * crea una nueva reserva doble
     *
     * @param teams valor para los equipos
     * @param date valor para la fecha
     * @param hour valor para la hora
     * @param court valor para el campo
     */
    public DoubleBooking(Player[][] teams, Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        this.teams = teams;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {

        boolean check = true;

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams.length; j++) {
                if (teams[i][j] == null) {
                    check = false;
                    return check;
                } else {
                    return check;
                }
            }

        }
        return check;

    }

    @Override
    public boolean containsPlayer(String id) {

        boolean check = true;

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams.length; j++) {
                if (teams[i][j] != null && teams[i][j].getId().equals(id)) {
                    return check;
                } else {
                    check = false;
                    return check;
                }
            }
        }
        return check;
    }

    @Override
    public String getDescription() {

        String text = super.getDescription();

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams.length; j++) {
                if (teams[i][j] != null) {
                    text += "Xogadores: Equipo 1:" + teams[i][j].getId() + "(" + teams[i][j].getScore() + ")"
                            + teams[i][j].getId() + "(" + teams[i][j].getScore() + ")" + " Equipo 2: "
                            + teams[i][j].getId() + "(" + teams[i][j].getScore() + ")"
                            + teams[i][j].getId() + "(" + teams[i][j].getScore() + ")\n";
                }
            }
        }
        return text;
    }

    public void addPlayer(Player player, int team) {

        for (int j = 0; j < teams[team].length; j++) {
            if (teams[team][j] == null) {
                teams[team][j] = player;
            }
        }

    }

}
