/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

/**
 *
 * @author aitor.martinezparente
 */
public class Interim extends Teacher {
    
    private double interimComplement;
    
    private String destination;

    public Interim(String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
    }

    @Override
    public void generatePayroll() {
        salary = baseSalary + interimComplement;
    }

    @Override
    public void teach() {
        super.teach();
    }
    
}
