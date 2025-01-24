/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aves;

/**
 *
 * @author aitor.martinezparente
 */
public class Piolin extends Canario implements interfaces.Speaker{
    
    private int numberOfFilms;

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public Piolin(int numberOfFilms, boolean sing, char sex, int age) {
        super(sing, sex, age);
        this.numberOfFilms = numberOfFilms;
    }
    
    @Override
    public void speak() {
        System.out.println("Hola, soy un " + getClass().getSimpleName() + " y se hablar.");
        System.out.print("Canta: " + isSing()+ "  ");
        System.out.println("Sexo: " + getSex());
        System.out.print("Edad: " + getAge()+ "  ");
        System.out.println("Numero de Peliculas: " + getNumberOfFilms());
    }
}
