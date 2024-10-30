/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package años;

/**
 * Clase que representa un año
 *
 * @author aitor.martinezparente
 */
public class Year {

    private boolean leapYear;

    /**
     * Crea un nuevo año bisiesto
     *
     * @param leapYear Valor de el año bisiesto
     */
    public Year(boolean leapYear) {
        this.leapYear = leapYear;
    }

    /**
     * Invoca la variable de el año bisiesto
     *
     * @return Valor de el año bisiesto
     */
    public boolean isLeapYear() {
        return leapYear;
    }

    /**
     * Cambia el valor de el año bisiesto
     *
     * @param leapYear Nuevo valor de el año bisiesto
     */
    public void setLeapYear(boolean leapYear) {
        this.leapYear = leapYear;
    }

    /**
     * Muestra el numero de dias del mes
     *
     * @param monthDay numero del mes, que debe estar entre 1 y 12
     */
    public void showDaysOfMonth(int monthDay) {

        if ((monthDay < 1) || (monthDay > 12)) {
            System.out.println("Mes inválido!");
        } else {

            /*
            Clasificamos los meses segun su numero
            Despues se muestra por pantalla el numero de dias
             */
            switch (monthDay) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("Este mes tiene 31 dias");
                    break;
                case 2:
                    if (leapYear) {
                        System.out.println("Este mes tiene 29 dias");
                    } else {
                        System.out.println("Este mes tiene 28 dias");
                    }
                    break;
                case 4, 6, 9, 11:
                    System.out.println("Este mes tiene 30 dias");
                    break;
                default:
                    System.out.println("Error");
            }
        }

    }
}
