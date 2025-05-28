/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerarliñas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aitor.martinezparente
 */
public class NumerarLiñas {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java NumerarLiñas <ficheiro>");
            return;
        }

        String nomeFicheiro = args[0];
        String nomeFicheiroDestino = nomeFicheiro + ".lines";

        try (
                BufferedReader lector = new BufferedReader(new FileReader(nomeFicheiro)); BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeFicheiroDestino))) {
            String liña;
            int numeroLiña = 1;

            while ((liña = lector.readLine()) != null) {
                escritor.write(numeroLiña + ". " + liña);
                escritor.newLine();
                numeroLiña++;
            }

            System.out.println("Ficheiro copiado con numeración: " + nomeFicheiroDestino);

        } catch (IOException e) {
            System.out.println("Erro ao procesar o ficheiro: " + e.getMessage());
        }
    }
}
