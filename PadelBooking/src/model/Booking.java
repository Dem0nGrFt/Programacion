/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aitor.martinezparente
 */
public abstract class Booking {

    protected Date date;
    protected String hour;
    protected PadelCourt court;

    /**
     * consigue el valor para la fecha
     *
     * @return valor para la fecha
     */
    public Date getDate() {
        return date;
    }

    /**
     * cambia el valor de la fecha
     *
     * @param date valor para la fecha
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * consigue el valor para la hora
     *
     * @return valor para la hora
     */
    public String getHour() {
        return hour;
    }

    /**
     * cambia el valor para la hora
     *
     * @param hour valor para la hora
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * consigue el valor para el campo
     *
     * @return valor para el campo
     */
    public PadelCourt getCourt() {
        return court;
    }

    /**
     * cambia el valor para el campo
     *
     * @param court valor para el campo
     */
    public void setCourt(PadelCourt court) {
        this.court = court;
    }

    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }

    public abstract double getPrice();

    public abstract boolean isCompleted();

    public abstract boolean containsPlayer(String id);

    public String getDescription() {

        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(date);
        String text = "Reserva ";

        if (isCompleted()) {
            text += "Completa: \n";
        } else {
            text += "Pendente: \n";
        }
        text += "Data: " + fecha + " Hora: " + court.getBookingHours() + " Pista: " + court.getType() + "\n";
        return text;
    }

}
