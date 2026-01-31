/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomanel;

/**
 *
 * @author Aitor
 */
public class OrderItem {
    
    private MenuItem element;
    
    private int cantid;

    /**
     * @return the element
     */
    public MenuItem getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(MenuItem element) {
        this.element = element;
    }

    /**
     * @return the cantid
     */
    public int getCantid() {
        return cantid;
    }

    /**
     * @param cantid the cantid to set
     */
    public void setCantid(int cantid) {
        this.cantid = cantid;
    }

    public OrderItem(MenuItem element, int cantid) {
        this.element = element;
        this.cantid = cantid;
    }
    
    
    
}
