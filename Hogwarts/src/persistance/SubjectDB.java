/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistance;

import java.util.ArrayList;
import model.Subject;

/**
 *
 * @author aitor.martinezparente
 */
public class SubjectDB {
    
    private static ArrayList<Subject> subjects = new ArrayList();

    public static ArrayList<Subject> getSubjects() {
        return subjects;
    }
    
    public static Subject findByCode(String codigo){
        
        for (Subject asignatura : subjects) {
            if(asignatura.getCodigo().equals(codigo))
                return asignatura;
        }
        return null;
    }
    
}
