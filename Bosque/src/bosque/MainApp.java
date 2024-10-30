/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bosque;

/**
 *
 * @author aitor.martinezparente
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pine pine1 = new Pine(34);
        Pine pine2 = new Pine(25);

        pine1.cut(7);
        pine2.cut(12);

        System.out.println("La altura de pino1 ahora es " + pine1.getHeight() + " y la altura de pino2 ahora es " + pine2.getHeight());
    }

}
