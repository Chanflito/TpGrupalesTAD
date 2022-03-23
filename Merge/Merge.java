package Algoritmos.TpGrupales.Merge;

public class Merge {
    public int[] array1;
    public int [] array2;
    public int[]array3;

    public Merge (int array1[], int array2[]){
        this.array1=array1;
        this.array2=array2;

        //first_step(array1,array2);
    }
//    public int[] first_step(int a[],int b[]){
//        array3=new int[a.length + b.length]; Esto era para combinar los dos arrays si estaban desordenados
//        int ultimate_index=0;
//        for (int i=0; i<a.length;i++) {
//            if (array3[i] == 0) {
//                array3[i] = a[i];
//                ultimate_index += 1;
//            }
//        }
//        for (int j=0;j<b.length;j++){
//            if (array3[ultimate_index]==0){
//                array3[ultimate_index]=b[j];
//                ultimate_index+=1;
//            }
//        }
//        return array3;

    //}
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
//    public int[] merge_sort(int []Array){
//        int n=Array.length;
//        if (n<2){ // Caso base del algoritmo
//            return Array;
//        }
//        int mid= (n/2);
//        int[] left = new int [mid];
//        int[] right = new int [n- mid];
//        for (int i=0;i<(mid);i++){
//            if (i == mid){
//                break;
//            }
//            left[i]=Array[i];
//        }
//        for (int j=mid; j<(Array.length);j++){
//
//            right[j-mid]=Array[j];
//        }
//        merge_sort(left);
//        merge_sort(right);
//        merge_algorithm(left,right,Array);
//        return Array;
//    }
}
