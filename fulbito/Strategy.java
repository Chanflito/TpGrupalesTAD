package Algoritmos.fulbito;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Strategy {
    String input;
    public void Algorithm(){
    }
    public String[] Leector(String input) {
        String[] lines= input.split(("\\n"));
        return lines;
    }

    public String[] getline1(String input){
        String[] lines= Leector(input);
        String[] line1=lines[0].split(" ");
        return line1;
    }
    public int getPartidos(String input){
        String[] line1=getline1(input);
        return Integer.valueOf(line1[1]);
    }
    public int getEquipos(String input){
        String [] line1=getline1(input);
        return Integer.valueOf(line1[0]);
    }
    public String[] [] allteams1(String input){
        String[] lines=Leector(input);
        String[] teams=lines[1].split(",");
        String[][] teams2= new String[getEquipos(input)][getEquipos(input)];
        for (int i = 0; i <teams.length ; i++) {
           teams2[i] = teams[i].split(" ");
        }
        return teams2;
        }

    public String[][] allmatches(String input){
        String[] lines=Leector(input);
        String [] matches=lines[2].split(",");
        String[] [] matches2= new String[getPartidos(input)][getPartidos(input)];
        for (int i = 0; i < matches.length; i++) {
            matches2[i]=matches[i].split(" ");
        }
        return matches2;
    }
}





