import java.util.Scanner;

public class Menu {

    static int iniciar(){
            System.out.println("Menu Caballo");
            System.out.println("1: Se procede a realizar el siguiente salto");
            System.out.println("2: Mostrar el contenido de las pilas");
            System.out.println("3:Salir");
            Scanner input=new Scanner(System.in);
            int opcion=input.nextInt();
            if (opcion==1){
                return iniciar();
            }
            else if (opcion==2){
                //caballo.showpath();
                return iniciar();
            }
            else if(opcion ==3){
                System.out.println("Se cerro el menu");
                return -1;
            }
            else{
                System.out.println("Numero invalido");
                return iniciar();
            }
        }
    }
