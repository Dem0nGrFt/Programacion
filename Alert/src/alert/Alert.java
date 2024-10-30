/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alert;

/**
 *
 * @author aitor.martinezparente
 */
public class Alert {

    /**
     * Valor maximo de la temperatura
     */
    public final static int MAX_TEMPERATURE = 24;
    /**
     * Valor maximo de la humedad
     */
    public final static int MAX_HUMIDITY = 50;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp = 3;
        int humid = 10;

        // Comprobacion de temperatura y humedad para saber tipo alerta
        if (temp > MAX_TEMPERATURE && humid > MAX_HUMIDITY) {
            System.out.println("Alerta Roja");
        } else if (temp > MAX_TEMPERATURE || humid > MAX_HUMIDITY) {
            System.out.println("Alerta Amarilla");
        } else {
            System.out.println("Alerta Verde");
        }
    }

}
