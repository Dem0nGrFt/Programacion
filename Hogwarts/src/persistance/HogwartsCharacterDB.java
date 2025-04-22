/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistance;

import java.util.ArrayList;
import model.HogwartsCharacter;

/**
 *
 * @author aitor.martinezparente
 */
public class HogwartsCharacterDB {

    private static ArrayList<HogwartsCharacter> hogwartsCharacters = new ArrayList();

    public static ArrayList<HogwartsCharacter> getHogwartsCharacters() {
        return hogwartsCharacters;
    }

    public static HogwartsCharacter findByCode(String codigo) {

        for (HogwartsCharacter hogwartsCharacter : hogwartsCharacters) {
            if (hogwartsCharacter.getCodigo().equals(codigo)) {
                return hogwartsCharacter;
            }
        }
        return null;
    }

    public static void save(HogwartsCharacter hogwartsCharacter) {

        hogwartsCharacters.add(hogwartsCharacter);

    }

    public static void update(HogwartsCharacter hogwartsCharacter) {
        
        hogwartsCharacters.set(0, hogwartsCharacter);

    }

    public static void delete(HogwartsCharacter hogwartsCharacter) {

        hogwartsCharacters.remove(hogwartsCharacter);

    }

}
