/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bosque;

/**
 *
 * @author aitor.martinezparente
 */
public class Pine {

    private int height;

    /**
     * Crea un nuevo pino
     *
     * @param height valor de la altura para el nuevo pino
     */
    public Pine(int height) {
        this.height = height;
    }

    /**
     * Invoca la variable de la altura
     *
     * @return devuelve altura de el pino
     */
    public int getHeight() {
        return height;
    }

    /**
     * Cambia el valor de la altura
     *
     * @param height Nuevo valor para la altura
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Modifica el valor de la altura
     *
     * @param heightToCut Nuevo valor para la altura
     */
    public void cut(int heightToCut) {
        height = height - heightToCut;
    }
}
