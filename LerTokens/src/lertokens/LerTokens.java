/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lertokens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class LerTokens {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java LerTokens <ruta_ficheiro> <delimitador>");
            return;
        }

        String rutaFicheiro = args[0];
        String delimitador = args[1];

        try (Scanner scan = new Scanner(new File(rutaFicheiro))) {
            scan.useDelimiter(delimitador);

            while (scan.hasNext()) {
                String token = scan.next();
                System.out.println(token);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro non atopado: " + rutaFicheiro);
        }
    }
}
