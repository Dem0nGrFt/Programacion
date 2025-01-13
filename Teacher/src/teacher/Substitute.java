/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

/**
 *
 * @author aitor.martinezparente
 */
public class Substitute extends Teacher {

    private double displacement;

    private java.util.Date initDate;

    public Substitute(String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
    }


    @Override
    public void teach() {
        System.out.println("Substituyo una clase de programacion en Java");
    }

    @Override
    public void generatePayroll() {

        salary = baseSalary + displacement;

    }

}
