/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

import java.util.Date;

/**
 *
 * @author aitor.martinezparente
 */
public class Substitute extends Teacher {

    private double displacement;

    private java.util.Date initDate;

    /**
     * consigue el valor del desplazamiento
     *
     * @return valor del desplazamiento
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     * cambia el valor del desplazamiento
     *
     * @param displacement
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     * consigue el valor de la fecha de inicio
     *
     * @return
     */
    public Date getInitDate() {
        return initDate;
    }

    /**
     * cambia el valor de la fecha de inicio
     *
     * @param initDate
     */
    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    /**
     *
     * @param displacement valor del desplazamiento
     * @param initDate valor de la fecha de inicio
     * @param name valor del nombre
     * @param surname valor del apellido
     * @param address valor de el enderezo
     * @param baseSalary valor del salario base
     */
    public Substitute(double displacement, Date initDate, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.displacement = displacement;
        this.initDate = initDate;
    }

    /**
     * dice lo que hace como profesor
     */
    @Override
    public void teach() {
        System.out.println("Substituyo una clase de programacion en Java");
    }

    /**
     * genera una nomina
     */
    @Override
    public void generatePayroll() {

        salary = baseSalary + displacement;

    }

}
