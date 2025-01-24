/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author aitor.martinezparente
 */
public class Profesor extends Persona implements interfaces.Speaker{
    
    private String office, email;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profesor(String office, String email, String name, int age) {
        super(name, age);
        this.office = office;
        this.email = email;
    }
    
    @Override
    public void speak() {
        System.out.println("Hola, soy un " + getClass().getSimpleName() + " y se hablar.");
        System.out.print("Nombre: " + getName() + "  ");
        System.out.println("Edad: " + getAge());
        System.out.print("Oficio: " + getOffice()+ "  ");
        System.out.println("Email: " + getEmail());
    }
}
