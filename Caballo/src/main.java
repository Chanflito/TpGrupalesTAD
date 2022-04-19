import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        caballo caballo1=new caballo("A1",4);
        String[] possible_moves=(caballo1.possible_moves("A1"));
        System.out.println(Arrays.deepToString(possible_moves));
        String[] possible_moves2=(caballo1.possible_moves("C2"));
        System.out.println(Arrays.deepToString(possible_moves2));
        caballo1.looper();
    }

}
