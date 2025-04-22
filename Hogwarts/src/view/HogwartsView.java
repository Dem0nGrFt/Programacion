/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import exceptions.*;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author aitor.martinezparente
 */
public interface HogwartsView {

    public void setCharacters(ArrayList<HogwartsCharacter> characters) throws UnderConstructionException;
    
    public void setSubjects(ArrayList<Subject> subjects) throws UnderConstructionException;
    
    public void showMenu() throws UnderConstructionException;
    
    public void showCharacterData(HogwartsCharacter character) throws UnderConstructionException;
    
    public void showSubjectData(Subject subject) throws UnderConstructionException;
    
    public void showUnderConstructionMessage(String operationName);
}
