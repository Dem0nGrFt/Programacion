/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wallet;

/**
 * Clase que representa a una cartera
 *
 * @author aitor.martinezparente
 */
public class Wallet {

    private double money;
    private boolean card;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet(250, false);
        Wallet wallet2 = new Wallet(25, true);
        Wallet wallet3 = new Wallet(10, false);

        wallet1.avaliable();
        wallet2.avaliable();
        wallet3.avaliable();

    }

    /**
     * Crea una nueva cartera
     *
     * @param money Valor para el dinero
     *
     * @param card Valor para la tarjeta
     */
    public Wallet(double money, boolean card) {
        this.money = money;
        this.card = card;
    }

    /**
     * Invoca el valor del dinero
     *
     * @return Valor del dinero
     */
    public double getMoney() {
        return money;
    }

    /**
     * Cambia el valor para el dinero
     *
     * @param money Nuevo valor de el dinero
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * Invoca el valor de la tarjeta
     *
     * @return Valor de la tarjeta
     */
    public boolean isCard() {
        return card;
    }

    /**
     * Cambia el valor de la tarjeta
     *
     * @param card Nuevo valor de la tarjeta
     */
    public void setCard(boolean card) {
        this.card = card;
    }

    /**
     * Comprueba si tiene efectivo y tarjeta
     */
    public void avaliable() {
        if (money >= 100) {
            System.out.println("Si tengo efectivo");
        } else if (card) {
            System.out.println("Ve al cajero");
        } else {
            System.out.println("Ve a la sucursal");
        }
    }
}
