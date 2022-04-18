import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        caballo caballo1=new caballo(3,4);
        String[] possible_moves=(caballo1.possible_moves("A1"));
        System.out.println(Arrays.deepToString(possible_moves));
        caballo1.showall_movements();
    }

}
