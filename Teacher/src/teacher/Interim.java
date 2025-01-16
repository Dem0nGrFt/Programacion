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

    /**
     * Consigue el valor del complemento de interno
     *
     * @return valor del complemento de interno
     */
    public double getInterimComplement() {
        return interimComplement;
    }

    /**
     * Cambia el valor del complemento de interno
     *
     * @param interimComplement valor del complemento de interno
     */
    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    /**
     * Consigue el valor del destino
     *
     * @return valor del destino
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Cambia el valor del destino
     *
     * @param destination valor del destino
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Crea un nuevo profesor interno
     *
     * @param interimComplement valor del complemento del interno
     * @param destination valor del destino
     * @param name valor del nombre
     * @param surname valor del apellido
     * @param address valor de el enderezo
     * @param baseSalary valor del salario base
     */
    public Interim(double interimComplement, String destination, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.interimComplement = interimComplement;
        this.destination = destination;
    }

    /**
     * genera una nomina
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + interimComplement;
    }

    /**
     * dice lo que hace como profesor
     */
    @Override
    public void teach() {
        super.teach();
    }

}
