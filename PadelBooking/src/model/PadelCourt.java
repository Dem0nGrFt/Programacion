/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aitor.martinezparente
 */
public class PadelCourt {

    private int number;
    private int type;
    private String bookingHours[];
    public static final int SINGLE = 1;
    public static final int DOUBLE = 2;

    /**
     * consigue el valor para el numero
     *
     * @return valor del numero
     */
    public int getNumber() {
        return number;
    }

    /**
     * cambia el valor para el numero
     *
     * @param number valor para el numero
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * consigue el valor para el tipo
     *
     * @return valor del tipo
     */
    public int getType() {
        return type;
    }

    /**
     * cambia el valor para el tipo
     *
     * @param type valor para el tipo
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * consigue el valor para las horas disponibles
     *
     * @return valor de las horas disponibles
     */
    public String[] getBookingHours() {
        return bookingHours;
    }

    /**
     * cambia el valor de las horas disponibles
     *
     * @param bookingHours valor de las horas disponibles
     */
    public void setBookingHours(String[] bookingHours) {
        this.bookingHours = bookingHours;
    }

    /**
     * crea un nuevo campo de padel
     *
     * @param number valor para el numero
     * @param type valor para el tipo
     * @param bookingHours valor de las horas disponibles
     */
    public PadelCourt(int number, int type, String[] bookingHours) {
        this.number = number;
        this.type = type;
        this.bookingHours = bookingHours;
    }

}
