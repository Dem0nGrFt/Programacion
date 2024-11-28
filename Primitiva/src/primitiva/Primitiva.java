/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primitiva;

import java.util.Scanner;

/**
 * Clase que representa a un sorteo de la primitva
 *
 * @author aitor.martinezparente
 */
public class Primitiva {

    private int day, month, year;

    private int winnerNumbers[] = new int[6];

    private int winnerComplement;

    private int refundNumber;

    /**
     * valor maximo de los numeros del boleto
     */
    public static final int TOTAL_NUMBERS = 6;

    /**
     * valor maximo del rango de numeros
     */
    public static final int MAX_NUMBER = 49;

    /**
     * valor maximo de los numeros del reintegro
     */
    public static final int MAX_REFUND_NUMBER = 9;

    /**
     * Consigue el valor del dia
     *
     * @return el valor del dia
     */
    public int getDay() {
        return day;
    }

    /**
     * Cambia el valor para el dia
     *
     * @param day el valor para el dia
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Consigue el valor del mes
     *
     * @return el valor de el mes
     */
    public int getMonth() {
        return month;
    }

    /**
     * Cambia el valor para el mes
     *
     * @param month el valor para el mes
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Consigue el valor del año
     *
     * @return el valor del año
     */
    public int getYear() {
        return year;
    }

    /**
     * Cambia el valor para el año
     *
     * @param year el valor para el año
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Consigue los valores de los numeros ganadores
     *
     * @return los valores de los numeros ganadores
     */
    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }

    /**
     * Cambia los valores para numeros ganadores
     *
     * @param winnerNumbers los valores para los numeros ganadores
     */
    public void setWinnerNumbers(int[] winnerNumbers) {
        this.winnerNumbers = winnerNumbers;
    }

    /**
     * Consigue el valor del numero complementario
     *
     * @return el valor del numero complementario
     */
    public int getWinnerComplement() {
        return winnerComplement;
    }

    /**
     * Cambia el valor para el numero complementario
     *
     * @param winnerComplement el valor para el numero complementario
     */
    public void setWinnerComplement(int winnerComplement) {
        this.winnerComplement = winnerComplement;
    }

    /**
     * Consigue el valor del numero reintegro
     *
     * @return el valor del numero reintegro
     */
    public int getRefundNumber() {
        return refundNumber;
    }

    /**
     * Cambia el valor para el numero reintegro
     *
     * @param refundNumber el valor para el numero reintegro
     */
    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }

    /**
     * Crea una nueva primitiva
     *
     * @param day valor para el dia
     * @param month valor para el mes
     * @param year valor para el año
     */
    public Primitiva(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Muestra el resultado de la primitiva
     */
    public void show() {
        System.out.println("O resultado do sorteo realizado o " + this.day + " do " + this.month + " do " + this.year + " foi o seguinte: ");
        System.out.print("Numeros premiados: ");
        for (int winners : winnerNumbers) {
            System.out.print(winners + " ");
        }
        System.out.println();
        System.out.println("Complementario: " + this.winnerComplement);
        System.out.println("Reintegro: " + refundNumber);
    }

    /**
     * Rellena un boleto entero
     *
     * @return
     */
    public PrimitivaTicket generateTicket() {

        Scanner scan = new Scanner(System.in);

        int numbers[] = new int[6];
        int refund;

        System.out.println("Introduce el valor para el reintegro:");
        refund = (scan.nextInt());

        PrimitivaTicket ticket = new PrimitivaTicket(numbers, refund);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + " del boleto: ");
            numbers[i] = (scan.nextInt());
        }

        return ticket;
    }

    /**
     * Muestra el premio de el boleto
     *
     * @param ticket boleto a comprobar
     */
    public void showPrize(PrimitivaTicket ticket) {
        int hits = 0;
        boolean hitRefund = false;

        // Comprobar los aciertos
        for (int number : ticket.getNumbers()) {
            for (int winner : winnerNumbers) {
                if (number == winner) {
                    hits++;
                    break;
                }
            }

            if (number == winnerComplement) {
                hitRefund = true;
                break;
            }
        }

        // Mostrar el premio segun los aciertos
        if (hits == 6) {
            System.out.println("6 acertos. Premio de 500000€!");
        } else if (hits == 5 && hitRefund) {
            System.out.println("5 acertos mais o complementario. Premio de 10000€!");
        } else if (hits == 5) {
            System.out.println("5 acertos. Premio de 500€!");
        } else if (hits == 4 && hitRefund) {
            System.out.println("4 acertos mais o complementario. Premio de 20€!");
        } else if (ticket.getRefundNumber() == refundNumber) {
            System.out.println("Reintegro do boleto!");
        } else {
            System.out.println("O billete non ten premio.");
        }
    }

    /**
     * Rellena el boleto con valores aleatorios
     */
    public void makeDraw() {
        for (int i = 0; i < winnerNumbers.length; i++) {
            int value;
            do {
                value = new java.util.Random().nextInt(MAX_NUMBER) + 1;
            } while (isIt(value));
            winnerNumbers[i] = value;

            do {
                this.winnerComplement = new java.util.Random().nextInt(MAX_NUMBER) + 1;
            } while (this.winnerComplement == value);

        }

        this.refundNumber = new java.util.Random().nextInt(MAX_REFUND_NUMBER) + 1;

    }

    /**
     * Comprueba si esta introducido el numero a introducir
     *
     * @param b numero a comprobar
     * @return true si esta introducido, false si no
     */
    private boolean isIt(int b) {
        for (int i = 0; i < winnerNumbers.length; i++) {
            if (b == winnerNumbers[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Inicia la ejecucion
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Primitiva primitiva = new Primitiva(21, 6, 2004);

        primitiva.makeDraw();
        primitiva.show();
        primitiva.showPrize(primitiva.generateTicket());

    }

}
