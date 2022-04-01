package Algoritmos.TpGrupales.Sudoku;

public class Sudoku {
    int []whereiszero=new int[2];
    int number=-1;
    public  boolean Finder_0(int [][]sudoku){
        for (int i=0; i<sudoku.length;i++){
            for (int j=0; j<sudoku[i].length;j++){
                if (sudoku[i][j]==0){
                    whereiszero[0]=i;
                    whereiszero[1]=j;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean searchline(int [][]sudoku,int n){
        for (int a:sudoku[whereiszero[0]]){
            if (a==n){
                return false;
            }
        }
        return true;
    }
    public boolean searchcolumn(int [][]sudoku, int n){
        for (int i = 0; i < sudoku.length; i++) {
            if (n==sudoku[i][whereiszero[1]]){
                return false;
            }
        }
        return true;
    }
    public boolean searchcube(int[][]sudoku, int n){

        return true;
    }
    public String whereismycube(int[][]sudoku, int n){
        return "a";
    }
}
