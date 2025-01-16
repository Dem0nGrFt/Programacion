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

    /**
     * Consigue el valor del complemento
     *
     * @return valor del complemento
     */
    public double getOfficerComplement() {
        return officerComplement;
    }

    /**
     * Cambia el valor del complemento
     *
     * @param officerComplement
     */
    public void setOfficerComplement(double officerComplement) {
        this.officerComplement = officerComplement;
    }

    /**
     * Consigue el valor del año de oposicion
     *
     * @return valor del año de oposicion
     */
    public int getOppositionYear() {
        return oppositionYear;
    }

    /**
     * Cambia el valor del año de oposicion
     *
     * @param oppositionYear valor del año de oposicion
     */
    public void setOppositionYear(int oppositionYear) {
        this.oppositionYear = oppositionYear;
    }

    /**
     * Consigue el valor de la plaza de oposicion
     *
     * @return valor de la plaza de oposicion
     */
    public String getOppositionPlace() {
        return oppositionPlace;
    }

    /**
     * Cambia el valor de la plaza de oposicion
     *
     * @param oppositionPlace valor de la plaza de oposicion
     */
    public void setOppositionPlace(String oppositionPlace) {
        this.oppositionPlace = oppositionPlace;
    }

    /**
     * Crea un nuevo profesor funcionario de carrera
     *
     * @param officerComplement valor del complemento
     * @param oppositionYear valor del año de oposicion
     * @param oppositionPlace valor de la plaza de oposicion
     * @param name valor del nombre
     * @param surname valor del apellido
     * @param address valor de el enderezo
     * @param baseSalary valor del salario base
     */
    public CareerOfficer(double officerComplement, int oppositionYear, String oppositionPlace, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.officerComplement = officerComplement;
        this.oppositionYear = oppositionYear;
        this.oppositionPlace = oppositionPlace;
    }

    /**
     * Dice lo que hace como profesor
     */
    @Override
    public void teach() {
        super.teach();
    }

    /**
     * Genera una nomina
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + officerComplement;

    }

}
