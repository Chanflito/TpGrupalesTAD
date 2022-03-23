package Algoritmos.TpGrupales.tpii.Merge;

public class Merge {
    public int[] array1;
    public int [] array2;

    public Merge (int array1[], int array2[]) {
        this.array1 = array1;
        this.array2 = array2;

    }
    //El merge recibe dos arrays, el cual lo primero que hace es crear  un nuevo arreglo en el cual va a tener la suma del length de los dos
    // Luego comienza a comparar indice por indice del array, si encuentra que uno es menor que otro(sabiendo que los dos arreglos seleccionados estan ordenados de menor a mayor) lo procede a colocar en el nuevo arreglo.
    // Una vez que la condicion del primer while no se cumple, el agoritmo ingresa en uno de los dos while para poder terminar con el recorrido del arreglo.
    // Retorna el la combinacion de los dos arrays ingresados de manera ordenada.
    public int [] merge_algorithm( int L[],int R[]){ // Se puede usar solo este si estan ordenados
        int [] Array=new int[L.length + R.length];
        int nl=L.length;
        int nr=R.length;
        int i=0;
        int j=0;
        int k=0;
        while (i<nl && j<nr){
           if (L[i] <= R[j]){
               Array[k]=L[i];
               k++;
               i++;
           }
           else {
               Array[k]=R[j];
               k++;
               j++;
           }
        }
        while (i<nl){
            Array[k]=L[i];
            i++;
            k++;
        }
        while (j<nr){
            Array[k]=R[j];
            j++;
            k++;
        }
        return Array;
    }

}
