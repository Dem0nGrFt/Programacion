/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author aitor.martinezparente
 */
public class MyJDBCApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:clients.db")) {
            // Obtemos unha conexión coa base de datos
            System.out.println("Conexion realizada con exito");
            System.out.println("Introduza o nome do usuario");
            
            String name = scan.nextLine();
            
            String sql = "INSERT INTO clients VALUES(?)";
            try (PreparedStatement st = c.prepareStatement(sql)) {
                st.setString(1, name);
                st.executeUpdate();
            }
            
            System.out.println("Lista de clientes: ");
            String select = "SELECT name FROM clients";
            try (Statement st = c.createStatement(); ResultSet rst = st.executeQuery(select)) {
                while (rst.next()) {                    
                    System.out.println("Nome: " + rst.getString("name"));
                }
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
