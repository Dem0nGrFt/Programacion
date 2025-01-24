/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author aitor.martinezparente
 */
public class Bedel extends Persona implements interfaces.Speaker{

    private String turn, seniority;

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public Bedel(String turn, String seniority, String name, int age) {
        super(name, age);
        this.turn = turn;
        this.seniority = seniority;
    }

    @Override
    public void speak() {
        System.out.println("Hola, soy un " + getClass().getSimpleName() + " y se hablar.");
        System.out.print("Nombre: " + getName() + "  ");
        System.out.println("Edad: " + getAge());
        System.out.print("Turno: " + getTurn()+ "  ");
        System.out.println("Antiguedad: " + getSeniority());
    }
}
