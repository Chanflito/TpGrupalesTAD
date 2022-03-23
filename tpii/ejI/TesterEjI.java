package Algoritmos.TpGrupales.tpii.ejI;

import static Algoritmos.TpGrupales.tpii.ejI.EjercicioI.binarySearch;
import static Algoritmos.TpGrupales.tpii.ejI.EjercicioI.seqSearch;

public class TesterEjI {
    public static void main(String[] agrs){
        int [] array1={1,2,4,5,6,53,4};
        int numer=2;
        System.out.println(seqSearch(numer,array1));
        System.out.println(binarySearch(numer,array1));
    }
}
