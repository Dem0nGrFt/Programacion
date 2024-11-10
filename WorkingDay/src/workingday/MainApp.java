/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingday;

/**
 * Clase Principal
 *
 * @author Aitor
 */
public class MainApp {

    /**
     * Inicia la ejecucion
     *
     * @param args
     */
    public static void main(String[] args) {
        boolean incluyeDomingo = true;

        double salarioSemanal = calcularSalarioSemanal(incluyeDomingo);

        System.out.println("El salario semanal es: " + salarioSemanal + " euros");
    }

    /**
     * Calcula el salario semanal
     *
     * @param incluyeDomingo trabaja el domingo si o no
     * @return el total del salario
     */
    public static double calcularSalarioSemanal(boolean incluyeDomingo) {
        double salarioTotal = 0.0;

        if (incluyeDomingo) {
            for (int i = 0; i < 4; i++) {
                WorkingDay diaX = new WorkingDay("d", "x", 8);
                salarioTotal += diaX.calcularSalario();
            }
            WorkingDay domingo = new WorkingDay("d", "d", 8);
            salarioTotal += domingo.calcularSalario();
        } else {
            for (int i = 0; i < 5; i++) {
                WorkingDay diaX = new WorkingDay("d", "x", 8);
                salarioTotal += diaX.calcularSalario();
            }
        }

        return salarioTotal;
    }
}
