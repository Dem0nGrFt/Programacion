package totaltime;

/**
 *
 * @autor aitor.martinezparente
 */

public class TotalTime {

  
    
    public static void main(String[] args) {
        //Declaramos la variable "x" con el total de segundos
        int x=150000;
        //Declaramos variable "y" siendo la division del total de segundos entre 3600 para dar total de horas
        int y=x/3600;
        //Declaramos la variable "z", la cual almacena el resto de la division del total de segundos entre 3600 para conseguir los segundos restantes para luego dividirlo entre 60 y obtener los minutos
        int z=(x%3600)/60;
        //Declaramos la variable "t" siendo esta el resto de la division anterior dando el total de segundos restantes
        int t=(x%3600)%60;
        
        //Mostramos por pantalla el resultado de el total de horas
        System.out.println(x + " segundos totales son " + y + " horas " + z + "minutos" + t + " segundos.");
    }
    
}
