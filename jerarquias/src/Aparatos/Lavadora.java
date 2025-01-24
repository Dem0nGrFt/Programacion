/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aparatos;

/**
 *
 * @author aitor.martinezparente
 */
public class Lavadora extends Aparato{
    
    private int height, width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Lavadora(int height, int width, String comsumption, int Price) {
        super(comsumption, Price);
        this.height = height;
        this.width = width;
    }
    
}
