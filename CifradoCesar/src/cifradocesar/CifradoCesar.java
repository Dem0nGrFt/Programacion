/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifradocesar;

import java.io.*;

/**
 *
 * @author aitor.martinezparente
 */
public class CifradoCesar {

    public static void main(String[] args) {
        if (args.length != 2 || (!args[0].equals("-c") && !args[0].equals("-d"))) {
            return;
        }

        String modo = args[0];
        String rutaFicheiro = args[1];

        Console consola = System.console();
        int desprazamento = 0;

        if (consola != null) {
            try {
                char[] entrada = consola.readPassword("Introduce o número de desprazamento: ");
                desprazamento = Integer.parseInt(new String(entrada));
            } catch (NumberFormatException e) {
                System.out.println("Erro: número de desprazamento non válido.");
                return;
            }
        } else {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Introduce o número de desprazamento: ");
                desprazamento = Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("Erro ao ler o número de desprazamento.");
                return;
            }
        }

        if (modo.equals("-d")) {
            desprazamento = -desprazamento;
        }

        String rutaSaida = rutaFicheiro + (modo.equals("-c") ? ".cif" : ".des");

        try (
                FileInputStream entrada = new FileInputStream(rutaFicheiro); FileOutputStream saida = new FileOutputStream(rutaSaida)) {
            int byteLido;
            while ((byteLido = entrada.read()) != -1) {
                int byteModificado = (byteLido + desprazamento) & 0xFF;
                saida.write(byteModificado);
            }
            System.out.println("Ficheiro procesado correctamente: " + rutaSaida);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro non atopado.");
        } catch (IOException e) {
            System.out.println("Erro de lectura/escritura no ficheiro.");
        }
    }
}
