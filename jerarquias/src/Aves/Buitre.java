/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aves;

/**
 *
 * @author aitor.martinezparente
 */
public class Buitre extends Ave{
    
    private int flightSpeed, weight;

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Buitre(int flightSpeed, int weight, char sex, int age) {
        super(sex, age);
        this.flightSpeed = flightSpeed;
        this.weight = weight;
    }
    
}
