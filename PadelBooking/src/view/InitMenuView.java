/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.InitMenuController;

/**
 *
 * @author aitor.martinezparente
 */
public class InitMenuView {
    
    private InitMenuController controller;

    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
    }
    
    public void showInvalidUser(){
        System.out.println("As credenciales non son correctas!");
    }
    
    public void showLoginMenu(){
        System.out.println("Introduce tu Id: ");
        
        
    }
    
}
