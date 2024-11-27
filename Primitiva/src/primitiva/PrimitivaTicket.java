/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitiva;

/**
 *
 * @author aitor.martinezparente
 */
public class PrimitivaTicket {

    private int numbers[];
    private int refundNumber;

    /**
     * Consigue los valores de los numeros
     *
     * @return los valores de los numeros
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Cambia los valores de los numeros
     *
     * @param numbers los valores de los numeros
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Consigue el valor de el reintegro
     *
     * @return el valor del reintegro
     */
    public int getRefundNumber() {
        return refundNumber;
    }

    /**
     * Cambia el valor del reintegro
     * 
     * @param refundNumber el valor del reintegro
     */
    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }

    /**
     * Crea un nuevo ticket de primitiva
     * 
     * @param numbers los valores de los numeros
     * @param refundNumber el valor del reintegro
     */
    public PrimitivaTicket(int[] numbers, int refundNumber) {
        this.numbers = numbers;
        this.refundNumber = refundNumber;
    }

}
