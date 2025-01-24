/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aves;

/**
 *
 * @author aitor.martinezparente
 */
public class Loro extends Ave implements interfaces.Speaker{
    
    private String region, color;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Loro(String region, String color, char sex, int age) {
        super(sex, age);
        this.region = region;
        this.color = color;
    }
    
    @Override
    public void speak() {
        System.out.println("Hola, soy un " + getClass().getSimpleName() + " y se hablar.");
        System.out.print("Sexo: " + getSex()+ "  ");
        System.out.println("Edad: " + getAge());
        System.out.print("Region: " + getRegion()+ "  ");
        System.out.println("Color: " + getColor());
    }
    
}
