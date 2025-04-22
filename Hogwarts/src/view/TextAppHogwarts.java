/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.HogwartsController;
import exceptions.UnderConstructionException;
import java.util.ArrayList;
import java.util.Scanner;
import model.HogwartsCharacter;
import model.Subject;

/**
 *
 * @author aitor.martinezparente
 */
public class TextAppHogwarts implements HogwartsView {

    private HogwartsController controller;

    private ArrayList<HogwartsCharacter> hogwartsCharacter;

    public TextAppHogwarts(HogwartsController controller) {
        this.controller = controller;
    }

    @Override
    public void setCharacters(ArrayList<HogwartsCharacter> characters) throws UnderConstructionException {

        for (HogwartsCharacter character : characters) {
            hogwartsCharacter.add(character);
        }

    }

    @Override
    public void setSubjects(ArrayList<Subject> subjects) throws UnderConstructionException {
        throw new UnderConstructionException();
    }

    @Override
    public void showMenu() throws UnderConstructionException {

        Scanner scan = new Scanner(System.in);

        int action = scan.nextInt();
        scan.nextLine();

        do {

            switch (action) {
                case 1:
                    System.out.println("1: Mostrar todos los personajes");
                    for (HogwartsCharacter hogwartsCharacter1 : hogwartsCharacter) {
                        System.out.println(hogwartsCharacter1.getCodigo() + " - " + hogwartsCharacter1.getNome() + "("
                                + hogwartsCharacter1.getCasa() + ": " + ")" + hogwartsCharacter1.getCaracteristicas() + ", ");
                    }
                    break;
                case 2:
                    System.out.println("Introduce el codigo del personaje");
                    String code = scan.nextLine();
                    controller.showCharacterData(code);
                    break;
                case 3:
                    System.out.println("Listar todas as materias");
                    break;
                case 4:
                    System.out.println("Introduce el codigo del personaje");
                    String codigo = scan.nextLine();
                    controller.showsubjectData(codigo);
                    break;
                case 5:
                    System.out.println("Salir de Hogwarts");
                    break;
                default:
                    System.out.println("Opción incorrecta!");
            }
        } while (action == 5);

    }

    @Override
    public void showCharacterData(HogwartsCharacter character) throws UnderConstructionException {
        throw new UnderConstructionException();
    }

    @Override
    public void showSubjectData(Subject subject) throws UnderConstructionException {
        throw new UnderConstructionException();
    }

    @Override
    public void showUnderConstructionMessage(String operationName) {
        System.out.println("A operación" + operationName + "aínda está en construcción");
    }

}
