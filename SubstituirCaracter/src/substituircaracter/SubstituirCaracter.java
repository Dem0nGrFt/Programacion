/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package substituircaracter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aitor.martinezparente
 */
public class SubstituirCaracter {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java SubstituirCaracter <ficheiro> <caracter_a_substituir> <caracter_substituto>");
            return;
        }

        String nomeFicheiro = args[0];
        char caracterASubstituir = args[1].charAt(0);
        char caracterSubstituto = args[2].charAt(0);
        String nomeFicheiroCopia = nomeFicheiro + ".copia";

        try (
                FileReader lector = new FileReader(nomeFicheiro); FileWriter escritor = new FileWriter(nomeFicheiroCopia)) {
            int codigoCaracter;
            while ((codigoCaracter = lector.read()) != -1) {
                char caracter = (char) codigoCaracter;
                if (caracter == caracterASubstituir) {
                    escritor.write(caracterSubstituto);
                } else {
                    escritor.write(caracter);
                }
            }
            System.out.println("Ficheiro copiado con éxito: " + nomeFicheiroCopia);
        } catch (IOException e) {
            System.out.println("Erro ao procesar o ficheiro: " + e.getMessage());
        }
    }

}
