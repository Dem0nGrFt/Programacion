/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.RestManagerController;
import java.util.Scanner;
import model.Order;

/**
 *
 * @author aitor.martinezparente
 */
public class RestManagerView {

    private RestManagerController controller;

    public RestManagerView(RestManagerController controller) {
        this.controller = controller;
    }

    public void showInitMenu() {
        int code;
        boolean condicion = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Selecciona una opcion: ");

            System.out.println("1. Añadir elementos a un pedido");
            System.out.println("2. Mostrar un pedido");
            System.out.println("3. Cobrar pedidos");
            System.out.println("4. Salir");

            code = scan.nextInt();
            scan.nextLine();

            if (code == 1 || code == 2 || code == 3 || code == 4) {
                condicion = true;

                switch (code) {
                    case 1:
                        System.out.println("Introduce el numero de mesa");

                        int mesa = scan.nextInt();
                        scan.nextLine();
                        controller.completeOrder(mesa);

                        break;
                    case 2:
                        System.out.println("Introduce el numero de mesa");

                        int table = scan.nextInt();
                        scan.nextLine();
                        controller.showOrder(table);

                        break;
                    case 3:
                        controller.showOrders();

                        break;
                }
            }

        } while (condicion);
    }

    public int askOrderItem() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Di un numero de un elemento de la carta, 0 para acabar el pedido");

        int numero = scan.nextInt();
        if (numero != 0) {
            return numero;
        }
        return 0;
    }

    public void showItemNotFoundMessage() {
        System.out.println("non se atopou un elemento da carta con ese número");
    }

    public void showOrderItems(Order order) {

        if (order != null) {

            System.out.println("Elementos: " + order.getItems() + order.getNumeroMesa());

        } else {
            System.out.println("non hai ningún pedido para a mesa indicada");
        }

    }

}
