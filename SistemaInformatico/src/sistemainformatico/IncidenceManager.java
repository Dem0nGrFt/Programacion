/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainformatico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class IncidenceManager {

    private Scanner scan = new Scanner(System.in);

    public void showInitMenu() {
        boolean continuar = true;

        System.out.println("Benvid@ á aplicación de notificación de incidencias");

        while (continuar) {
            User usuario = null;

            while (usuario == null) {
                System.out.print("Nome de usuario: ");
                String username = scan.nextLine();

                System.out.print("Contrasinal: ");
                String password = scan.nextLine();

                User encontrado = UserDB.findByName(username);

                if (encontrado != null && encontrado.getPassword().equals(password)) {
                    usuario = encontrado;
                    System.out.println("Benvid@, " + usuario.getName());
                    if (usuario.getType() == User.ADMIN) {
                        IncidenceAdmin incidenceAdmin = new IncidenceAdmin();
                        incidenceAdmin.setVisible(true);
                    } else {
                        showIncidencesMenu(usuario);
                    }
                } else {
                    System.out.println("Credenciais incorrectas. Téntao de novo.");
                }
            }

            System.out.print("Queres pechar a aplicación? (s/n): ");
            String resposta = scan.nextLine();
            if (resposta.equals("s")) {
                continuar = false;
                System.out.println("Pechando a aplicación. Ata logo!");
            }
        }
    }

    private void showIncidencesMenu(User user) {
        int code;
        Scanner scan = new Scanner(System.in);

        System.out.println("As túas incidencias:");

        do {
            ArrayList<Incidence> incidencias = IncidenceDB.findByUser(user.getUsername());

            if (incidencias.isEmpty()) {
                System.out.println("Non tes incidencias rexistradas.");
            } else {
                for (Incidence inc : incidencias) {
                    String estado = null;
                    switch (inc.getStatus()) {
                        case Incidence.STATUS_UNSOLVED:
                            estado = "Sen resolver";
                            break;
                        case Incidence.STATUS_PENDING:
                            estado = "Pendente";
                            break;
                        case Incidence.STATUS_SOLVED:
                            estado = "Resolto";
                            break;
                    }

                    String descripcion = inc.getDescription();
                    String equipo = inc.getComputer();

                    System.out.println("ID: " + inc.getId()
                            + " | Estado: " + estado
                            + " | Equipo: " + equipo
                            + " | Descrición: " + descripcion);
                }
            }

            // Menú de opcións
            System.out.println("Escolle unha opción: ");
            System.out.println("1. Crear unha incidencia");
            System.out.println("2. Pechar a sesión");

            code = scan.nextInt();
            scan.nextLine();

            switch (code) {
                case 1:

                    System.out.println("Introduce a descrición da incidencia: ");
                    String descripcion = scan.nextLine();

                    System.out.println("Introduce o nome do equipo: ");
                    String equipo = scan.nextLine();

                    Incidence novaIncidencia = new Incidence(
                            0,
                            descripcion,
                            equipo,
                            "",
                            Incidence.STATUS_UNSOLVED,
                            user
                    );

                    IncidenceDB.save(novaIncidencia);
                    System.out.println("Incidencia creada correctamente.");
                    break;

                case 2:
                    System.out.println("Sesión pechada.");
                    break;

                default:
                    System.out.println("Opción non válida. Inténtao de novo.");
            }

        } while (code != 2);
    }

    public static void main(String[] args) {
        IncidenceManager manager = new IncidenceManager();
        manager.showInitMenu();
    }

}
