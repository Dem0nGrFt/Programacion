/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act2.pkg2.pkg1;

/**
 *
 * @author aitor.martinezparente
 */
public class Circle {

    public final static int MAX_RADIUS = 10;

    private int radius;

    /**
     * Invoca la constante de el radio maximo
     *
     * @return
     */
    public static int getMAX_RADIUS() {
        return MAX_RADIUS;
        
    }

    /**
     * Invoca la variable del radio
     *
     * @return devuelve el valor del radio
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Cambia el valor del radio
     *
     * @param radius Nuevo valor para el radio
     */
    public void setRadius(int radius) {
        if (radius <= MAX_RADIUS) {
            this.radius = radius;
        } else {
            this.radius = MAX_RADIUS;
        }
    }

    /**
     * Crea un nuevo circulo
     *
     * @param radius Valor del radio para un nuevo circulo
     */
    public Circle(int radius) {
        if (radius <= MAX_RADIUS) {
            this.radius = radius;
        } else {
            this.radius = MAX_RADIUS;
        }
    }

    /**
     * Muestra los datos del círculo
     */
    public void show() {
        System.out.println("Soy un circulo de radio " + radius);
    }

    /**
     * Duplica el valor de el radio
     */
    public void enlarge() {
        if (radius * 2 <= MAX_RADIUS) {
            radius = radius * 2;
        } else {
            radius = MAX_RADIUS;
        }
    }
}
