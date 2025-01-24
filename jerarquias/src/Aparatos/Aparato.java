/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aparatos;

/**
 *
 * @author aitor.martinezparente
 */
public class Aparato {
    
    private String comsumption;
    
    private int Price;

    public String getComsumption() {
        return comsumption;
    }

    public void setComsumption(String comsumption) {
        this.comsumption = comsumption;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public Aparato(String comsumption, int Price) {
        this.comsumption = comsumption;
        this.Price = Price;
    }
    
}
