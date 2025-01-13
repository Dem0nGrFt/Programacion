/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacher;

/**
 *
 * @author aitor.martinezparente
 */
public abstract class Teacher {
    
    protected String name, surname, address;
    
    protected double baseSalary;
    
    protected double salary;

    public Teacher(String name, String surname, String address, double baseSalary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.baseSalary = baseSalary;
    }
    
    public void teach(){
        
        System.out.println("Doy una clase de programacion en Java");
        
    }
    
    public abstract void generatePayroll();
        
}

