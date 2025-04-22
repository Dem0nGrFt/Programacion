/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author aitor.martinezparente
 */
public class Player {

    private String id;
    private String password;
    private String name;
    private double score;
    private double balance;

    /**
     * consigue el valor para el id
     *
     * @return el valor del id
     */
    public String getId() {
        return id;
    }

    /**
     * cambia el valor para el id
     *
     * @param id valor del id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * consigue el valor para la contraseña
     *
     * @return el valor de la contraseña
     */
    public String getPassword() {
        return password;
    }

    /**
     * cambia el valor para la contraseña
     *
     * @param password valor para la contraseña
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * consigue el valor para el nombre
     *
     * @return el valor del nombre
     */
    public String getName() {
        return name;
    }

    /**
     * cambia el valor para el nombre
     *
     * @param name valor para el nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * consigue el valor para la puntuacion
     *
     * @return el valor de la puntuacion
     */
    public double getScore() {
        return score;
    }

    /**
     * cambia el valor para la puntuacion
     *
     * @param score valor para la puntuacion
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * consigue el valor para el balance
     *
     * @return el valor del balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * cambia el valor para el balance
     *
     * @param balance valor para el balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * crea un nuevo jugador
     *
     * @param id valor para el id
     * @param password valor para la contraseña
     * @param name valor para el nombre
     * @param score valor para la puntuacion
     * @param balance valor para el balance
     */
    public Player(String id, String password, String name, double score, double balance) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.score = score;
        this.balance = balance;
    }

}
