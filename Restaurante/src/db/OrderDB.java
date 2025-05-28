/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.HashMap;
import model.MenuItem;
import model.Order;
import model.OrderItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aitor.martinezparente
 */
public class OrderDB {

    private static java.sql.Connection connection = null;

    private static final MenuItem[] menu = new MenuItem[]{
        new MenuItem(1, "Spaguetti Carbonara", 12.50),
        new MenuItem(2, "Pizza catro queixos mediana", 11.90),
        new MenuItem(3, "Cocacola 33 cl", 2.5),
        new MenuItem(4, "Auga 1l", 3)
    };

    private static HashMap<Integer, Order> orders = new HashMap<>();

    public static MenuItem findDyId(int id) {

        for (MenuItem menuItem : menu) {
            if (id == menuItem.getId()) {
                return menuItem;
            }
        }
        return null;

    }

    public static Order findByTable(int numMesa) {

        try {
            getConnection();
            if (orders.containsKey(numMesa)) {

                String select = "SELECT table_number, item_id, quantity FROM order_items WHERE table_number = (?)";
                try (PreparedStatement st = connection.prepareStatement(select); ResultSet rst = st.executeQuery(select)) {
                    st.setString(1, " " + numMesa);
                    while (rst.next()) {

                    }
                }
                return orders.get(numMesa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return null;
    }

    public static void save(int chave, Order order) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe el numero de mesa");
        String number = scan.nextLine();
        System.out.println("Escribe el id");
        String id = scan.nextLine();
        System.out.println("Escribe la cantidad");
        String quant = scan.nextLine();
        try {

            getConnection();
            String sql = "INSERT INTO order_items (table_number, item_id, quantity) VALUES(?, ?, ?)";
            try (PreparedStatement st = connection.prepareStatement(sql)) {
                st.setString(1, number);
                st.setString(2, id);
                st.setString(3, quant);
                st.executeUpdate();
            }
            orders.put(chave, order);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void saveItem(Order order, OrderItem orderItem) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe el numero de mesa");
        String number = scan.nextLine();
        System.out.println("Escribe el id");
        String id = scan.nextLine();
        System.out.println("Escribe la cantidad");
        String quant = scan.nextLine();
        try {

            getConnection();
            String sql = "INSERT INTO order_items (table_number, item_id, quantity) VALUES(?, ?, ?)";
            try (PreparedStatement st = connection.prepareStatement(sql)) {
                st.setString(1, number);
                st.setString(2, id);
                st.setString(3, quant);
                st.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateItem(Order order, OrderItem orderItem) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe el numero de mesa");
        String number = scan.nextLine();
        System.out.println("Escribe el id");
        String id = scan.nextLine();
        System.out.println("Escribe la cantidad");
        String quant = scan.nextLine();
        try {

            getConnection();
            String sql = "UPDATE order_items SET table_number = (?) SET item_id = (?) SET quantity = (?)";
            try (PreparedStatement st = connection.prepareStatement(sql)) {
                st.setString(1, number);
                st.setString(2, id);
                st.setString(3, quant);
                st.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Order> getAllOrders() {
        try {
            getConnection();
            for (int i = 0; i < orders.size(); i++) {
                //return orders[i];
            }

            System.out.println("Lista de peliculas: ");
            String select = "SELECT * FROM order_items";
            try (Statement st = connection.createStatement(); ResultSet rst = st.executeQuery(select)) {
                while (rst.next()) {
                    System.out.println("Numero de mesa: " + rst.getString("table_number") + ", id: " + rst.getString("item_id")
                            + ", cantidad: " + rst.getString("quantity"));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void removeOrder(int tableNumber) {
        orders.remove(tableNumber);

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe el numero de mesa");
        String number = scan.nextLine();
        System.out.println("Escribe el id");
        String id = scan.nextLine();
        System.out.println("Escribe la cantidad");
        String quant = scan.nextLine();
        try {

            getConnection();
            String sql = "DELETE order_items WHERE table_number = (?) AND item_id = (?) AND quantity = (?)";
            try (PreparedStatement st = connection.prepareStatement(sql)) {
                st.setString(1, number);
                st.setString(2, id);
                st.setString(3, quant);
                st.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeOrderItem(Order order, OrderItem item) {
        order.getItems().remove(item);

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe el numero de mesa");
        String number = scan.nextLine();
        System.out.println("Escribe el id");
        String id = scan.nextLine();
        System.out.println("Escribe la cantidad");
        String quant = scan.nextLine();
        try {

            getConnection();
            String sql = "DELETE order_items WHERE table_number = (?) AND item_id = (?) AND quantity = (?)";
            try (PreparedStatement st = connection.prepareStatement(sql)) {
                st.setString(1, number);
                st.setString(2, id);
                st.setString(3, quant);
                st.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void decreaseOrderItem(Order order, OrderItem item) {
        order.getItems().remove(item);

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe el numero de mesa");
        String number = scan.nextLine();
        System.out.println("Escribe el id");
        String id = scan.nextLine();
        System.out.println("Escribe la cantidad");
        String quant = scan.nextLine();
        try {

            getConnection();
            String sql = "DELETE order_items WHERE table_number = (?) AND item_id = (?) AND quantity = (?)";
            try (PreparedStatement st = connection.prepareStatement(sql)) {
                st.setString(1, number);
                st.setString(2, id);
                st.setString(3, quant);
                st.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void getConnection() throws SQLException {
        if (connection == null) {

            connection = DriverManager.getConnection("jdbc:sqlite:clients.db");

        }
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrderDB.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }

        }

    

    

    public static void fichero() {

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

    /**
     * Método que mostra o contido do ficheiro token a token usando o
     * delimitador recibido como parámetro
     *
     * @param sourceFilePath Ruta do ficheiro a ler
     * @param delimiter Delimitador dos tokens
     * @throws IOException Arróxase en caso de producirse un erro de lectura ou
     * escritura
     */
    public void showTokens(String sourceFilePath, String delimiter)
            throws IOException {
        // Declaramos o scanner
        Scanner in = null;
        try {
            // Abrimos o scanner sobre un reader con buffer
            in = new Scanner(new BufferedReader(new FileReader(sourceFilePath)));
            // Establecemos como delimitador o recibido como parámetro
            in.useDelimiter(delimiter);
            // Lemos todos os tokens e os mostramos
            while (in.hasNext()) {
                System.out.println(in.next());
            }
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos o
            // scanner se está aberto
            if (in != null) {
                in.close();
            }
        }
    }

    /**
     * Método principal, que executa a lectura do ficheiro
     *
     * @param args ruta_ficheiro delimitador
     */
    public static void main(String[] args) {
        // Comprobamos que os argumentos sexan os esperados
        if (args.length == 2) {
            try {
                TokenReader reader = new TokenReader();
                reader.showTokens(args[0], args[1]);
            } catch (IOException e) {
                System.out.println("Erro na lectura/escritura");
            }
        } else {
            System.out.println("Sintaxe: Programa ruta_ficheiro delimitador");
        }
    }

}
