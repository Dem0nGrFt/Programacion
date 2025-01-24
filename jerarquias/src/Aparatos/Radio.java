/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aparatos;

/**
 *
 * @author aitor.martinezparente
 */
public class Radio extends Aparato implements interfaces.Speaker{
    
    private boolean casette;
    
    private int power;

    public boolean isCasette() {
        return casette;
    }

    public void setCasette(boolean casette) {
        this.casette = casette;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Radio(boolean casette, int power, String comsumption, int Price) {
        super(comsumption, Price);
        this.casette = casette;
        this.power = power;
    }
    
    @Override
    public void speak() {
        System.out.println("Hola, soy un " + getClass().getSimpleName() + " y se hablar.");
        System.out.print("Consumo: " + getComsumption()+ "  ");
        System.out.println("Precio: " + getPrice());
        System.out.print("Tiene casette: " + isCasette()+ "  ");
        System.out.println("Poder: " + getPower());
    }
}
