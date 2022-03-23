package Algoritmos.TpGrupales.MesaElectoral;
public class Urna {

    private int padronElectoral;
    private Boleta[] boletas;
    private String []partidos = {"Frente de todos","JxC","Avanza libertad","Frente de izquierda"};
    private int []voteCount; //Guarda el numero de votos, cada posicion representa los votos de cada partido, en orden.
    private int []nullifiedvotes = new int [1]; //Guarda el numero de votos con codigos invalidos.

    public Urna(int Padron_Electoral){
        this.voteCount = new int [partidos.length];
        this.padronElectoral = Padron_Electoral;
        this.boletas = new Boleta[Padron_Electoral];
    }

    public void votar(Boleta boleta){      //Coloca la boleta en la primer ocurrencia de Null dentro del array
        this.boletas[nullIndexSearcher()] = boleta;
    }

    public int nroDeVotos(){ //Solo se pueden introducir votos mediante la funcion votar,
        return nullIndexSearcher(); // por ende el numero de votos sera el mismo que la primer coincidencia de null
    }

    private int nullIndexSearcher(){ //Busca la primer coincidencia de null dentro del array de boleta.
        int counter = 0;
        for (Boleta index: this.boletas){
            if (index == null){
                return counter;
            }
            counter++;
        }
        return -1;
    }

    public String partidoGanador(){

        int valorGanador = 0;
        int counter = 0;

        while (counter < nroDeVotos()){
            if (this.boletas[counter].getOpcionDeBoleta() > this.partidos.length || this.boletas[counter].getOpcionDeBoleta() < 0){ //Si el codigo es invalido, no entra al loop para contar votos.
                nullifiedvotes[0] ++;
            }
            this.voteCount[this.boletas[counter].getOpcionDeBoleta() - 1]++; //Suma un voto en la posicion guardada para el partido en voteCount.
            counter ++;
        }

        for (int index : this.voteCount){ //loop para encontrar el mayor valor.
            if (valorGanador < index){
                valorGanador = index ;
            }
        }
        return "el ganador es: " + partidos[seqSearch(valorGanador, this.voteCount)];
    }

    private static int seqSearch(int number, int[] array){
        for ( int index=0; index <array.length; index++)
            if (array[index]==number)
                return index;
        return -1;
    }

}
