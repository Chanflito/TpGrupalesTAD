package Algoritmos.TpGrupales.Merge;

import java.util.Arrays;

public class Tester {
    public static void main (String[] args){
        //Merge mimerge= new Merge(new int[]{1, 4, 2, 2, 1, 46, 54},new int[]{2,4,5,6,7,32,2});
        Merge mimerge2= new Merge (new int[] {1,2,3,4}, new int [] {10,30,70,82});
        mimerge2.merge_algorithm(mimerge2.array1, mimerge2.array2);
        System.out.println(Arrays.toString(mimerge2.merge_algorithm(mimerge2.array1, mimerge2.array2)));



    }
}
