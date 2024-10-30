/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2.pkg2.pkg1;

/**
 *
 * @author aitor.martinezparente
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(9);
        System.out.println("O valor maximo do radio e " + Circle.getMAX_RADIUS());

        c1.enlarge();
        c2.enlarge();
        c1.show();
        c2.show();
    }

}
