package sistemainformatico;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aitor.martinezparente
 */
public class IncidenceDB {

    private static ArrayList<Incidence> incidences = new ArrayList<>();

    public static ArrayList<Incidence> findByUser(String username) {

        ArrayList<Incidence> result = new ArrayList<>();

        for (Incidence incidence : incidences) {
            if (incidence.getSender().getUsername().equals(username)) {
                result.add(incidence);
            }
        }
        return result;
    }

    public static ArrayList<Incidence> findByStatus(int status) {
        
        ArrayList<Incidence> result = new ArrayList<>();

        for (Incidence incidence : incidences) {
            if (incidence.getStatus() == status) {
                result.add(incidence);
            }
        }
        return result;

    }

    public static void save(Incidence incidence) {
        incidence.setId(incidences.size());
        incidences.add(incidence);
    }
}
