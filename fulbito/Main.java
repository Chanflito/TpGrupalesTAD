package Algoritmos.fulbito;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String partidos= " 2 1\nBarcelona 1 \n Madrid 1 \n Barcelona Madrid";
        BruteForce hola= new BruteForce();
        System.out.println(Arrays.deepToString(hola.Leector(partidos)));
        System.out.println(hola.get_partidos(partidos));
        System.out.println(hola.get_equipos(partidos));

    }
}
