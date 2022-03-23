package Algoritmos.TpGrupales.tpii.ejii;
import java.util.Arrays;
public class TesterSort {
    public static void main(String[] args){
        int[] bubble = {20,80,10,5,4};
        EjercicioII.bubbleSort(bubble);
        System.out.println(Arrays.toString(bubble));

        int[] selection = {60,5,1,14,9};
        EjercicioII.selectionSort(selection);
        System.out.println(Arrays.toString(selection));

        int[] insertion = {75,74,73,12,1};
        EjercicioII.insertionSort(insertion);
        System.out.println(Arrays.toString(insertion));
    }
}
