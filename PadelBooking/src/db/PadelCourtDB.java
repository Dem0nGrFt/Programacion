/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import model.PadelCourt;

/**
 *
 * @author aitor.martinezparente
 */
public class PadelCourtDB {

    public static ArrayList<PadelCourt> getAllCourts() {
        return PadelManagerDB.getCourts();
    }

}
