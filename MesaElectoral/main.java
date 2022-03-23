package Algoritmos.TpGrupales.MesaElectoral;

public class main {
    public static void main(String[] args){

        Boleta boleta1 = new Boleta(12, 1);
        Boleta boleta2 = new Boleta(13, 2);
        Boleta boleta3 = new Boleta(14, 3);
        Boleta boleta4 = new Boleta(15, 3);

        Urna miurna = new Urna(200);

        System.out.println(boleta1.getCodigo());

        miurna.votar(boleta1);
        miurna.votar(boleta2);
        miurna.votar(boleta3);
        miurna.votar(boleta4);


        System.out.println(miurna.nroDeVotos());

        System.out.println(miurna.partidoGanador());
    }}