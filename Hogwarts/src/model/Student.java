/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aitor.martinezparente
 */
public class Student extends HogwartsCharacter{
    
    private String quidditch;
    private int curso;

    public String getQuidditch() {
        return quidditch;
    }

    public void setQuidditch(String quidditch) {
        this.quidditch = quidditch;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public Student(String nome, String caracteristicas, String codigo, String casa, Pet mascota, String quidditch, int curso) {
        super(nome, caracteristicas, codigo, casa, mascota);
        this.quidditch = quidditch;
        this.curso = curso;
    }
    
}
