import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class caballo {
    int current_positionx;
    int current_positiony;
    Stack<String>[] movepiles;
    String current_cordinate;
    int movements;

    caballo(String position, int movements){
        this.current_positiony=cordinates.toy(position);
        this.current_positionx=cordinates.tox(position);
        this.current_cordinate=position;
        this.movepiles=(Stack<String>[]) new Stack[movements];
        this.movements=movements;
        for (int i = 0; i < movepiles.length; i++) {
            this.movepiles[i]=new Stack<String>();
        }
        for (int i = 0; i<possible_moves(this.current_cordinate).length ; i++) {
            this.movepiles[0].push(possible_moves(this.current_cordinate)[i]);
        }
    }

    public String[] possible_moves(String position){
        String[] possible_moves=new String[8];
        int[] X_moves={2,2,-2,-2,1,1,-1,-1};
        int[] y_moves={1,-1,1,-1,2,-2,2,-2};
        int positionx=cordinates.tox(position);
        int positiony=cordinates.toy(position);

        for (int i = 0; i < 8; i++) {
            int x_position=positionx+ X_moves[i];
            int y_position=positiony+ y_moves[i];

            if (x_position>=1 && x_position<=8 && y_position>=1 && y_position<=8){
                possible_moves[i]=cordinates.toCordinates(x_position,y_position);}
            }
        int number_of_possible_moves=0;
        int i=0;
        while (i<8){
            if (possible_moves[i]!=null)
                number_of_possible_moves++;
            i++;
        }
        String[] actual_possible_moves=new String[number_of_possible_moves];
        int positioni=0;
        for (int j = 0; j < 8 ; j++) {
            if(possible_moves[j]!=null){
                actual_possible_moves[positioni]=possible_moves[j];
                positioni++;}
        }
        return actual_possible_moves;}

    public void fillpiles(){ //rellena cualquier pila que encunetre vacia, con los momvimientos possibles del tope de la anterior.
        for (int i = 1; i < this.movepiles.length; i++) {
            if (this.movepiles[i].empty()){
                String corrdinates=this.movepiles[i-1].peek();
                for (int j = 0; j < possible_moves(corrdinates).length; j++) {
                    this.movepiles[i].push(possible_moves(corrdinates)[j]);
                }
            }
        }
    }

    public void aaaaa(int counter){
        if (counter==1 && (!this.movepiles[0].empty())){
            System.out.println(" No hay pilas por ver");
            System.out.println("caca");
        }
        if (!this.movepiles[counter-1].empty()){
            printer();
            this.movepiles[counter-1].pop();
            aaaaa(counter); //hasta aca bien. yey :D
        }
        if (this.movepiles[counter-1].empty()){
            counter--;
            this.movepiles[counter-1].pop();
            if (this.movepiles[counter-1].empty()){
                counter--;
                this.movepiles[counter-1].pop();
                fillpiles();
                counter++;
                aaaaa(counter);
            }
            else{
                fillpiles();
                counter++;
                aaaaa(counter);
            }
        }
    }

    public void auxaaaaa(){
        int counter=this.movements;
        fillpiles();
        aaaaa(counter);
    }

    public boolean looper(){
        fillpiles();
        for (int j = 0; j < 10; j--) {

            for (int i = 0; i < this.movepiles[this.movements - 1].size(); i++) {
                printer();
                this.movepiles[this.movements - 1].pop();
            }
            int n = this.movements - 1;
            for (int i = 0; i < n; i++) {
                if (this.movepiles[n].size() != 0) {
                    this.movepiles[n].pop();
                    if(this.movepiles[n].size() == 0) {
                        // aca va un while
                    }
                    fillpiles();
                } else {
                    n--;
                }
            }
            if (this.movepiles[0].size() == 0) {
                return true;
            }
        }
        return false;
    }




    public void printer(){
        String[] arreglo= new String[8];
        for (int i = 0; i < this.movements; i++) {
            arreglo[i]=this.movepiles[i].peek();
        }
        System.out.println(this.current_cordinate+ Arrays.deepToString(arreglo));
        }

}
