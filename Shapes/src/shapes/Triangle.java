/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author aitor.martinezparente
 */
public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }
    
    /**
     * borra la figura creada
     */
    @Override
    public void erase() {
        System.out.println("Borrando triangulo...");
    }

    /**
     * dibuja la figura
     */
    @Override
    public void draw() {
        System.out.println("Dibujando triangulo...");
    }
    
}
