package Algoritmos.TpGrupales.tpii.ejii;

public class EjercicioII {
    //permite ordenar un conjunto al encontrar el menor elemento del mismo e intercambiarlo con el que se encuentra en la primer posicion
    //asi sucesivamente, requiriendo O(n^2) comparaciones.
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
    //permite ordenar un conjunto intercambiando las posiciones entre un valor y su siguiente si no estan ordenados
    //asi sucesivamente, requiriendo O(n^2) comparaciones.
    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    //permite ordenar un conjunto al comparar elementos no ordenados con los que se asume que estan ordenados, y colocarlos a la derecha si su valor es mayor
    //o a la izquierda si es menor, esto se repite en cada iteracion. Requiere O(n^2) comparaciones.

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

}
