/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import db.OrderDB;
import javax.swing.JOptionPane;
import model.Order;
import view.OrderManagerView;
import view.RestManagerView;

/**
 *
 * @author aitor.martinezparente
 */
public class RestManagerController {

    private RestManagerView view;

    public RestManagerController() {
        this.view = new RestManagerView(this);
    }

    public void initApp() {
        view.showInitMenu();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RestManagerController controller = new RestManagerController();
        controller.initApp();
        OrderDB.closeConnection();

    }

    public void completeOrder(int mesa) {

    }

    public void showOrder(Order mesa) {
        view.showOrderItems(mesa);
    }

    public void showOrders() {
        OrderManagerView view = new OrderManagerView(this);
    }

    public void refreshOrders() {

    }

    public void showOrderDetails(Order order) {
        JOptionPane.showMessageDialog(this, order, "elementos", 0);
        OrderDB.findByTable(1);
    }

    public void removeOrderItem(Order order, int index) {
        OrderDB.updateItem(order, index);
    }
    
    

}
