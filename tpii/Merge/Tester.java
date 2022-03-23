package Algoritmos.TpGrupales.tpii.Merge;

import java.util.Arrays;

public class Tester {
    public static void main (String[] args){
        Merge mimerge2= new Merge (new int[] {1,2,3,4}, new int [] {10,30,70,82});
        mimerge2.merge_algorithm(mimerge2.array1, mimerge2.array2);
        System.out.println(Arrays.toString(mimerge2.merge_algorithm(mimerge2.array1, mimerge2.array2)));



    }
}
