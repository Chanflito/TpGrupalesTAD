package Algoritmos.TpGrupales.MesaElectoral;

public class Boleta {

    private int codigo;
    private int opcionDeBoleta;

    public Boleta( int codigo, int opcionDeBoleta){
        this.codigo = codigo;
        this.opcionDeBoleta = opcionDeBoleta;
    }

    public int getOpcionDeBoleta(){
        return this.opcionDeBoleta;
    }

    public int getCodigo(){
        return this.codigo;
    }

}