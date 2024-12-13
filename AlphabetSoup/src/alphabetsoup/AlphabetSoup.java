/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alphabetsoup;

/**
 *
 * @author aitor.martinezparente
 */

public class AlphabetSoup {

    private String title;
    
    /**
     * Numero de filas del calendario
     */
    public static final int ROWS = 4;
    /**
     * Numero de columnas del calendario
     */
    public static final int COLUMNS = 5;
    
    private char soup[][];
    
    private String words [];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char[][] getSoup() {
        return soup;
    }

    public void setSoup(char[][] soup) {
        this.soup = soup;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public AlphabetSoup(String title, char[][] soup, String[] words) {
        this.title = title;
        this.soup = soup;
        this.words = words;
    }

    
    
    public void display(){
        
        System.out.println("Sopa de letras : " + this.title);
      
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(soup[i][j] + " ");
            }
            System.out.println();
        }
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        
    }
}

