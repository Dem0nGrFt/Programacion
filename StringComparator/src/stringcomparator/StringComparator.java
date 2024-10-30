/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcomparator;

/**
 * Clase que representa a un comparador de palabras
 *
 * @author aitor.martinezparente
 */
public class StringComparator {

    private String str1;
    private String str2;
    private String str3;

    /**
     * Ejecuta y muestra el resultado de la mayor longitud
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StringComparator comparator = new StringComparator("Aitor", "Antonio", "Omi");
        System.out.println("El String mas grande es: " + comparator.getBigger());
    }

    /**
     * Crea un nuevo comparador
     *
     * @param str1 Primera cadena de texto
     *
     * @param str2 Segunda cadena de texto
     *
     * @param str3 Tercera cadena de texto
     */
    public StringComparator(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    /**
     * Consigue el string de mayor longitud
     * 
     * @return cadena de texto con mayor longitud
     */
    public String getBigger() {
        String mayor = str1;
        if ((str1.length() > str2.length()) && (str1.length() > str3.length())) {
            mayor = str1;
        } else if (str2.length() > str3.length()) {
            mayor = str2;
        } else {
            mayor = str3;
        }
        return mayor;
    }
}
