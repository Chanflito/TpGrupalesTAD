package Algoritmos.fulbito;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String partidos= "2 1\nBarcelona 1,Madrid 1\nBarcelona Madrid";
        BruteForce hola= new BruteForce();
        System.out.println(Arrays.deepToString(hola.Leector(partidos)));
        System.out.println(Arrays.deepToString(hola.getline1(partidos)));
        System.out.println(hola.getEquipos(partidos));
        System.out.println(hola.getPartidos(partidos));
        System.out.println(Arrays.deepToString(hola.allteams1(partidos)));
        System.out.println(Arrays.deepToString(hola.allmatches(partidos)));

    }
}
