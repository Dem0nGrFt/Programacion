/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Personas.*;
import Aves.*;
import Aparatos.*;
import interfaces.Speaker;


/**
 *
 * @author aitor.martinezparente
 */
public class MainApp {
    
    /**
     * inicia la ejecucion
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Loro loro = new Loro("patagonia", "verde", 'M', 2);
        
        Piolin piolin = new Piolin(40, true, 'M', 150);
        
        Alumno alumno = new Alumno("1CS", "1", "pingodoce", 40);
        
        Profesor profesor = new Profesor("programacion", "progteach@gmail.com", "antonio", 64);
        
        Bedel bedel = new Bedel("dia", "mayor", "augusto", 72);
        
        TV tv = new TV(true, 18, "mas o menos", 199);
        
        Radio radio = new Radio(true, 10, "poquete", 25);
        
        Speaker[] speakers = new Speaker[7];
        
        speakers[0] = loro;
        speakers[1] = piolin;
        speakers[2] = alumno;
        speakers[3] = profesor;
        speakers[4] = bedel;
        speakers[5] = tv;
        speakers[6] = radio;
        
        for (Speaker speaker : speakers) {
            speaker.speak();
        }
    }
    
}
