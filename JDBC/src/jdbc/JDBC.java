/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aitor.martinezparente
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:/home/aitor.martinezparente/myfirstdb.db", "", "")) {
            // Obtemos unha conexión coa base de datos
            System.out.println("Conexion realizada con exito");
            
            String sql = "INSERT INTO clients VALUES('juan')";
            try (Statement st = c.createStatement()) {
                st.executeUpdate(sql);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
