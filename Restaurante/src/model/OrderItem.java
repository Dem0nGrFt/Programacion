/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aitor.martinezparente
 */
public class OrderItem {

    private MenuItem menuItem;
    private int cantidad;

    /**
     * @return the menuItem
     */
    public MenuItem getMenuItem() {
        return menuItem;
    }

    /**
     * @param menuItem the menuItem to set
     */
    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public OrderItem(MenuItem menuItem, int cantidad) {
        this.menuItem = menuItem;
        this.cantidad = cantidad;
    }

    public double getPrice() {
        double precio;

        precio = menuItem.getPrecio() * cantidad;

        return precio;

    }

}
