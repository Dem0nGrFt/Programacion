/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aitor.martinezparente
 */
public class HogwartsCharacter {
    
    private String nome;
    private String caracteristicas;
    private String codigo;
    private String casa;
    private Pet mascota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public Pet getMascota() {
        return mascota;
    }

    public void setMascota(Pet mascota) {
        this.mascota = mascota;
    }

    public HogwartsCharacter(String nome, String caracteristicas, String codigo, String casa, Pet mascota) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
        this.codigo = codigo;
        this.casa = casa;
        this.mascota = mascota;
    }
    
    
    
}
