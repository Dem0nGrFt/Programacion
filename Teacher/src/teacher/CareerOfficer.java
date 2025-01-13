/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

/**
 *
 * @author aitor.martinezparente
 */
public class CareerOfficer extends Teacher {
    
    private double officerComplement;
    
    private int oppositionYear;
    
    private String oppositionPlace;

    public CareerOfficer(String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
    }

    @Override
    public void teach() {
        super.teach();
    }

    @Override
    public void generatePayroll() {
        salary = baseSalary + officerComplement;
        
    }
    
    
    
}
