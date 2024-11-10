/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pen;

/**
 *
 * @author Aitor
 */
public class Pen {

    private int ink;

    /**
     * Crea un nuevo boligrafo
     */
    public Pen() {
        this.ink = 30;
    }

    /**
     * Calcula cuanta tinta queda
     *
     * @param Words numero de palabras
     */
    public void write(int Words) {
        if (ink >= Words) {
            System.out.println("Escribiendo " + Words + " palabras...");
            ink -= Words;
            System.out.println("Quedan " + ink + " unidades de tinta.");
        } else {
            System.out.println("No queda suficiente tinta para escribir " + Words + " palabras.");
        }
    }

    /**
     * Inicia la ejecucion
     *
     * @param args
     */
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.write(20);
        pen.write(15);
        pen.write(6);
    }
}
