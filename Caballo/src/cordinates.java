public class cordinates {
    static private String toColum( int n){
        if (n==1)
            return "A";
        if (n==2)
            return "B";
        if (n==3)
            return "C";
        if (n==4)
            return "D";
        if (n==5)
            return "E";
        if (n==6)
            return "F";
        if (n==7)
            return "G";
        if (n==8)
            return "H";
        else
            return "Invalid number";

    }
    static private String toRow(int n){
        Integer y= new Integer(n);
        return y.toString();

    }
    static public int tox(String coordinate ){
        char row=coordinate.charAt(0);
        if (row=='A')
            return 1;
        if (row=='B')
            return 2;
        if (row=='C')
            return 3;
        if (row=='D')
            return 4;
        if (row=='E')
            return 5;
        if (row=='F')
            return 6;
        if (row=='G')
            return 7;
        if (row=='H')
            return 8;
        else return -1;
    }
    static public int toy(String cordinate){
        char colum=cordinate.charAt(1);
        return Character.getNumericValue(colum);
    }
    static String toCordinates(int x, int y){
        String X=toColum(x);
        String Y=toRow(y);
        return X+Y;
    }

}
