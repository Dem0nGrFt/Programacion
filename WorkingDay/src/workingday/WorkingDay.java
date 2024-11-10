/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingday;

/**
 * Clase que representa a un dia de trabajo
 *
 * @author Aitor
 */
public class WorkingDay {

    private String turno;
    private String dia;
    private int horasTrabajadas;

    private static final double TARIFA_DIURNA = 8.0;
    private static final double TARIFA_NOCTURNA = 12.0;
    private static final double INCREMENTO_DOMINGO = 1.2;

    /**
     * Crea un nuevo dia de trabajo
     *
     * @param turno valor para el turno
     * @param dia valor para el turno
     * @param horasTrabajadas valor para el turno
     */
    public WorkingDay(String turno, String dia, int horasTrabajadas) {
        this.turno = turno;
        this.dia = dia;
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Calcula un dia de trabajo
     *
     * @return salario por dia
     */
    public double calcularSalario() {
        double tarifaHora = 0.0;

        if (turno.equals("d")) {
            tarifaHora = TARIFA_DIURNA;
        } else if (turno.equals("n")) {
            tarifaHora = TARIFA_NOCTURNA;
        }

        if (dia.equals("d")) {
            tarifaHora *= INCREMENTO_DOMINGO;
        }

        return tarifaHora * horasTrabajadas;
    }
}
