/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.util.ArrayList;

/**
 *
 * @author aitor.martinezparente
 */
public class Board {
    
    protected ArrayList<Shape> shapes = new ArrayList<>();

    /**
     * consigue los valores de las piezas
     * @return los valores de las piezas
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    /**
     * cambia los valores de las piezas
     * @param shapes los valores de las piezas
     */
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
    /**
     * pinta una figura y la añade a la pizarra
     * @param shape valor de la pieza
     */
    public void drawShapes(Shape shape){
        shape.draw();
        shapes.add(shape);
    }
    
    /**
     * borra todas las figuras de la pizarra
     */
    public void eraseShapes(){
        for (int i = shapes.size(); i > 0; i--) {
            shapes.getLast().erase();
            shapes.removeLast();
        }
        
    }
    
}
