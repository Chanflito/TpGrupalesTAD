import java.util.ArrayList;
import java.util.Stack;

public class caballo {
    int current_positionx;
    int current_positiony;
    ArrayList<Stack> all_movements=new ArrayList<Stack>();
    String current_cordinate;

    caballo(int current_positionx,int current_positiony){
        this.current_positiony=current_positiony;
        this.current_positionx=current_positionx;
        this.current_cordinate=cordinates.toCordinates(this.current_positionx,this.current_positiony);
        Stack startingstack=new Stack();
        startingstack.push(this.current_cordinate);
        all_movements.add(startingstack);
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

    public void movepieceto(String boardplace){
        this.current_positionx=cordinates.tox(boardplace);
        this.current_positiony=cordinates.toy(boardplace);
        this.current_cordinate=cordinates.toCordinates(this.current_positionx,this.current_positiony);
    }

    public void move(){
        for (int i = 0; i <all_movements.size() ; i++) {

        }

        }

    public void showall_movements(){
        for (int i = 0; i <all_movements.size() ; i++) {
            System.out.println(all_movements.get(i));
        }
    }

}
