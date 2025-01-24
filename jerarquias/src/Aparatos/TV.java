/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aparatos;

/**
 *
 * @author aitor.martinezparente
 */
public class TV extends Aparato implements interfaces.Speaker{
    
    private boolean teletext;
    
    private int inches;

    public boolean isTeletext() {
        return teletext;
    }

    public void setTeletext(boolean teletext) {
        this.teletext = teletext;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public TV(boolean teletext, int inches, String comsumption, int Price) {
        super(comsumption, Price);
        this.teletext = teletext;
        this.inches = inches;
    }
    
    @Override
    public void speak() {
        System.out.println("Hola, soy un " + getClass().getSimpleName() + " y se hablar.");
        System.out.print("Consumo: " + getComsumption()+ "  ");
        System.out.println("Precio: " + getPrice());
        System.out.print("Tiene teletexto: " + isTeletext()+ "  ");
        System.out.println("Pulgadas: " + getInches());
    }
}
