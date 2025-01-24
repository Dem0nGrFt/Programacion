/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aves;

/**
 *
 * @author aitor.martinezparente
 */
public class Canario extends Ave {
    
    private boolean sing;

    public boolean isSing() {
        return sing;
    }

    public void setSing(boolean sing) {
        this.sing = sing;
    }

    public Canario(boolean sing, char sex, int age) {
        super(sex, age);
        this.sing = sing;
    }
    
}
