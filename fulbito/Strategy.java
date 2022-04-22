package Algoritmos.fulbito;

import java.util.Scanner;

public abstract class Strategy {
    public void Algorithm(){
    }
    public String[] Leector(String input) {
        String[] lines= input.split(System.getProperty("line.separator"));
        return lines;
    }
    public int get_partidos(String input){
       String[] inputitos= Leector(input);
       String nums=inputitos[0];
       char numerito= nums.charAt(3);
       return Character.getNumericValue(numerito);
    }
    public int get_equipos(String input){
        String[] inputitos= Leector(input);
        String nums=inputitos[0];
        char numerito= nums.charAt(1);
        return Character.getNumericValue(numerito);
    }


}
