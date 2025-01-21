/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author aitor.martinezparente
 */
public abstract class Shape implements Coloreable {

    private Color color;

    /**
     * dibuja la figura
     */
    public void draw() {

    }

    /**
     * borra la figura dibujada
     */
    public void erase() {

    }

    /**
     * cambia el valor del color
     *
     * @param c el valor del color
     */
    @Override
    public void setColor(Color c) {
    }

    /**
     * consigue el valor del color
     *
     * @return el valor del color
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * crea una nueva figura
     * @param color el valor del color
     */
    public Shape(Color color) {
        this.color = color;
    }

}
