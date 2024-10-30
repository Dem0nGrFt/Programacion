/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class Person {

    private String name;
    private int birthYear;

    /**
     * Invoca la variable del nombre
     * 
     * @return devuelve el valor de el nombre 
     */
    public String getName() {
        return name;
    }

    /**
     * Cambia el valor de el nombre
     * 
     * @param name Nuevo valor de el nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Invoca la variable del año de nacimiento
     * 
     * @return devuelve el valor de el año de nacimiento
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Cambia el valor de el año de nacimiento
     * 
     * @param birthYear Nuevo valor para el año de nacimiento 
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * Crea una nueva persona
     * 
     * @param name Valor de el nombre para la nueva persona
     * @param birthYear Valor de el año de nacimiento para la nueva persona
     */
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    
    /**
     * Muestra los datos de la persona
     */
    public void future(){
        System.out.println("Soy " + name + ", y en el año 2030 tendre " + (2030 - birthYear));
    }

}
