/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author aitor.martinezparente
 */
public class PaintingSession {
    
    /**
     * inicia la ejecucion
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shape square = new Square();
        
        Shape triangle = new Triangle();
        
        Shape circle = new Circle();
        
        Board board = new Board();
        
        board.drawShapes(square);
        board.drawShapes(triangle);
        board.drawShapes(circle);
        
        board.eraseShapes();
        
    }
    
}
