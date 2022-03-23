package Algoritmos.TpGrupales.tpii.ejI;

public class EjercicioI {
    public static int seqSearch(int number, int[] array) {
        for (int index = 0; index < array.length; index++)
            if (array[index] == number)
                return index;
        return -1;
    }

    //compara con el elemento en la mitad del conjunto. En caso de que no coincidan se compara con la primer mitad o segunda mitad dependiente del valor.
    //A la larga realiza menos comparaciones que la busqueda secuencial.
    public static int binarySearch(int number, int[] array) {
        int min = 0;
        int max = array.length - 1;
        int middle = (min + max) / 2;
        while (min <= max) {
            if (number == array[middle])
                return middle;
            else if (number < array[middle])
                max = middle - 1;
            else
                min = middle + 1;
            middle = (min + max) / 2;
        }
        return -1;
    }
}