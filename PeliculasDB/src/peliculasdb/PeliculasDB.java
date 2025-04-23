/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peliculasdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class PeliculasDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String url = "jdbc:sqlite:peliculas.db";
        int code;

        try (Connection c = DriverManager.getConnection(url)) {
            System.out.println("Conexion realizada con exito");

            do {
                System.out.println("Selecciona una opcion: ");

                System.out.println("1. Insertar nova pelicula");
                System.out.println("2. Mostrar todasa as peliculas");
                System.out.println("3. Buscar unha pelicula");
                System.out.println("4. Pechar a aplicacion");

                code = scan.nextInt();
                scan.nextLine();

                switch (code) {
                    case 1:
                        System.out.println("Introduce el titulo de la pelicula");

                        String title = scan.nextLine();

                        System.out.println("Introduce su año de salida");

                        String year = scan.nextLine();

                        String sql = "INSERT INTO peliculas (title, year) VALUES(?, ?)";
                        try (PreparedStatement st = c.prepareStatement(sql)) {
                            st.setString(1, title);
                            st.setString(2, year);
                            st.executeUpdate();
                        }
                        break;
                    case 2:
                        System.out.println("Lista de peliculas: ");
                        String select = "SELECT id, title, year FROM peliculas";
                        try (Statement st = c.createStatement(); ResultSet rst = st.executeQuery(select)) {
                            while (rst.next()) {
                                System.out.println("ID: " + rst.getString("id") + ", Titulo: " + rst.getString("title")
                                        + ", Año: " + rst.getString("year"));
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Introduce un id de película:");
                        String id = scan.nextLine();

                        String find = "SELECT title, year FROM peliculas WHERE id=?";

                        try (PreparedStatement pst = c.prepareStatement(find)) {
                            pst.setString(1, id);
                            ResultSet rst = pst.executeQuery();

                            if (rst.next()) {
                                String titulo = rst.getString("title");
                                int año = rst.getInt("year");
                                System.out.println("Título: " + titulo);
                                System.out.println("Ano: " + año);
                            } else {
                                System.out.println("Non se atopou ningunha película con ese id.");
                            }
                        } catch (SQLException e) {

                        }
                        break;
                }

            } while (code != 4);

        } catch (SQLException e) {
            System.out.println("A conexión co servidor de bases de datos non se puido establecer");
        }

    }

}
