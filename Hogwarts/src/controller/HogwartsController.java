/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import exceptions.UnderConstructionException;
import model.HogwartsCharacter;
import model.Pet;
import model.Student;
import model.Subject;
import model.Teacher;
import persistance.HogwartsCharacterDB;
import persistance.SubjectDB;
import view.HogwartsView;
import view.JFrameHogwarts;
import view.TextAppHogwarts;

/**
 *
 * @author aitor.martinezparente
 */
public class HogwartsController {
    
    private HogwartsView view;
    
    public HogwartsController() {
        view = new JFrameHogwarts(this);
    }
    
    public void initApp() {
        try {
            HogwartsCharacterDB.getHogwartsCharacters();
            view.showMenu();
            
        } catch (UnderConstructionException e) {
            view.showUnderConstructionMessage("operación mostrar o menú inicial está en construcción");
        }
        
    }
    
    public void showCharacterData(String hogwartsCode) {
        
        try {
            for (HogwartsCharacter hogwartsCharactersDB : HogwartsCharacterDB.getHogwartsCharacters()) {
                hogwartsCharactersDB.equals(hogwartsCode);
                view.showCharacterData(hogwartsCharactersDB);
            }
            
        } catch (UnderConstructionException e) {
            view.showUnderConstructionMessage("operación mostrar o menú inicial está en construcción");
        }
        
    }
    
    public void showsubjectData(String subjectCode) {
        
        try {
            for (Subject subjectsDB : SubjectDB.getSubjects()) {
                subjectsDB.equals(subjectCode);
                view.showSubjectData(subjectsDB);
            }
            
        } catch (UnderConstructionException e) {
            view.showUnderConstructionMessage("operación mostrar o menú inicial está en construcción");
        }
        
    }

    /**
     * Carga os datos de exemplo para o funcionamento da aplicación
     */
    public void loadSampleData() {
        // Creamos uns alumnos e uns profesores
        Student harry = new Student("Harry Potter", "Cicatriz en forma de raio na fronte",
                "A-1992-0001", "Griffindor", new Pet("Curuxa", "Hedwig", 3), "Buscador", 3);
        Student hermione = new Student("Hermione Granger", "Moi observadora e boa estudante",
                "A-1992-0002", "Griffindor", new Pet("Gata", "Crookshanks", 2), "", 3);
        Student draco = new Student("Draco Malfoy", "Inimigo de Harry Potter",
                "A-1992-0004", "Slytherin", null, "Buscador", 3);
        Teacher dumbledore = new Teacher("Albus Dumbledore", "Longa barba", "P-001",
                "", new Pet("Fenix", "Fawkes", 150), "500 anos de experiencia na maxia");
        Teacher minerva = new Teacher("Minerva McGonagall",
                "Moi estrita", "P-002", "Griffindor", null, "Experta en feitizos");
        Teacher snape = new Teacher("Severus Snape", "Apariencia escura", "P-003",
                "Slytherin", null, "Experto en maxia negra");

        // Creamos unhas materias
        Subject trans4 = new Subject("MM-401", "Transformacións 4", 4, minerva);
        trans4.getStudents().add(harry);
        trans4.getStudents().add(hermione);
        trans4.getStudents().add(draco);
        Subject pot4 = new Subject("MM-402", "Pocións 4", 4, snape);

        // Engadimos os alumnos e profes ás personaxes de Howgwarts
        HogwartsCharacterDB.getHogwartsCharacters().add(harry);
        HogwartsCharacterDB.getHogwartsCharacters().add(hermione);
        HogwartsCharacterDB.getHogwartsCharacters().add(draco);
        HogwartsCharacterDB.getHogwartsCharacters().add(dumbledore);
        HogwartsCharacterDB.getHogwartsCharacters().add(minerva);
        HogwartsCharacterDB.getHogwartsCharacters().add(snape);

        // Engadimos as materias á lista de materias de Hogwarts
        SubjectDB.getSubjects().add(trans4);
        SubjectDB.getSubjects().add(pot4);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HogwartsController hogwartsController = new HogwartsController();
        hogwartsController.loadSampleData();
        hogwartsController.initApp();
    }
    
    public void saveCharacter(HogwartsCharacter hogwartsCharacter) {
        
        try {
            HogwartsCharacterDB.save(hogwartsCharacter);
            view.setCharacters(HogwartsCharacterDB.getHogwartsCharacters());
        } catch (UnderConstructionException e) {
            view.showUnderConstructionMessage("a operación mostrar as personaxes está en construcción.");
        }
        
    }
    
    public void updateCharacter(HogwartsCharacter hogwartsCharacter) {
        
        try {
            HogwartsCharacterDB.update(hogwartsCharacter);
            view.setCharacters(HogwartsCharacterDB.getHogwartsCharacters());
        } catch (UnderConstructionException e) {
            view.showUnderConstructionMessage("a operación mostrar as personaxes está en construcción.");
        }
        
    }
    
    public void deleteCharacter(HogwartsCharacter hogwartsCharacter) {
        
        try {
            HogwartsCharacterDB.delete(hogwartsCharacter);
            view.setCharacters(HogwartsCharacterDB.getHogwartsCharacters());
        } catch (UnderConstructionException e) {
            view.showUnderConstructionMessage("a operación mostrar as personaxes está en construcción.");
        }
        
    }
}
