/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aitor.martinezparente
 */
public class Order {

    private int numeroMesa;
    private ArrayList<OrderItem> items;

    /**
     * @return the numeroMesa
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }

    /**
     * @param numeroMesa the numeroMesa to set
     */
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    /**
     * @return the items
     */
    public ArrayList<OrderItem> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }

    public Order(int numeroMesa, ArrayList<OrderItem> items) {
        this.numeroMesa = numeroMesa;
        this.items = new ArrayList<>();
    }
    
    private double getPrice(){
        
        double total = 0;
        
        for (OrderItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

}
