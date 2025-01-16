/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacher;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author aitor.martinezparente
 */
public abstract class Teacher {

    protected String name, surname, address;

    protected double baseSalary;

    protected double salary;

    /**
     * consigue el valor del nombre
     *
     * @return valor del nombre
     */
    public String getName() {
        return name;
    }

    /**
     * cambia el valor del nombre
     *
     * @param name valor del nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * consigue el valor del apellido
     *
     * @return valor del apellido
     */
    public String getSurname() {
        return surname;
    }

    /**
     * cambia el valor del apellido
     *
     * @param surname valor del apellido
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * consigue el valor de la direccion
     *
     * @return valor de la direccion
     */
    public String getAddress() {
        return address;
    }

    /**
     * cambia el valor de la direccion
     *
     * @param address valor de la direccion
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * consigue el valor del salario base
     *
     * @return valor del salario base
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * cambia el valor del salario base
     *
     * @param baseSalary valor del salario base
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * consigue el valor del salario
     *
     * @return valor del salario
     */
    public double getSalary() {
        return salary;
    }

    /**
     * cambia el valor del salario
     *
     * @param salary valor del salario
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Crea un nuevo profesor
     *
     * @param name valor del nombre
     * @param surname valor del apellido
     * @param address valor de el enderezo
     * @param baseSalary valor del salario base
     */
    public Teacher(String name, String surname, String address, double baseSalary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.baseSalary = baseSalary;
    }

    /**
     * dice lo que hace como profesor
     */
    public void teach() {

        System.out.println("Doy una clase de programacion en Java");

    }

    /**
     * genera una nomina
     */
    public abstract void generatePayroll();

    /**
     * inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher careerOfficer = new CareerOfficer(500, 4, "cangas", "patica", "suerez", "montepinar", 1200);

        Teacher interim = new Interim(1000.50, "puerto rico", "aitor", "martinez", "ponteareas", 5000);

        Teacher substitute = new Substitute(5, Date.from(Instant.now()), "hector", "de sousa", "lugo", 2000);

        careerOfficer.generatePayroll();
        System.out.println("Me llamo " + careerOfficer.name + " y mi salario es de: " + careerOfficer.salary);
        careerOfficer.teach();
        System.out.println();

        interim.generatePayroll();
        System.out.println("Me llamo " + interim.name + " y mi salario es de: " + interim.salary);       
        interim.teach();
        System.out.println();

        substitute.generatePayroll();
        System.out.println("Me llamo " + substitute.name + " y mi salario es de: " + substitute.salary);
        substitute.teach();
        System.out.println();
        
    }
}
