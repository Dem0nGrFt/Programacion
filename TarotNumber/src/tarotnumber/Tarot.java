/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarotnumber;

/**
 * Clase que representa al tarot
 *
 * @author aitor.martinezparente
 */
public class Tarot {

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarot tarot = new Tarot();
        int day = 28;
        int month = 2;
        int year = 2006;

        if (tarot.checkDate(day, month, year)) {
            int tarotNumber = tarot.calculateTarot(day, month, year);
            System.out.println("El numero de tarot es " + tarotNumber);
        } else {
            System.out.println("Fecha incorrecta");
        }

    }

    /**
     * Comprueba si es año bisiesto
     *
     * @param year año a verificar
     * @return true si es bisiesto, false en lo contrario
     */
    public boolean isLeapYear(int year) {
        return (year % 4 == 00 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Comprueba si una fecha es correcta
     *
     * @param day dia de la fecha
     * @param month mes de la fecha
     * @param year año de la fecha
     * @return true si es fecha valida, false en lo contrario
     */
    public boolean checkDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        int maxDays;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = isLeapYear(year) ? 29 : 28;
                break;
            default:
                maxDays = 31;
        }

        return day <= maxDays;
    }

    /**
     * Calcula el numero del tarot meidante una fecha
     * 
     * @param day dia de la fecha
     * @param month mes de la fecha
     * @param year año de la fecha
     * @return el numero del tarot
     */
    public int calculateTarot(int day, int month, int year) {
        int sum = day + month + year;

        while (sum > 9) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }
        return sum;
    }

}
