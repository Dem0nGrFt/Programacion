/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aitor.martinezparente
 */
public class Teacher extends HogwartsCharacter {

    private String cv;

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public Teacher(String nome, String caracteristicas, String codigo, String casa, Pet mascota, String cv) {
        super(nome, caracteristicas, codigo, casa, mascota);
        this.cv = cv;

    }

}
