package Algoritmos.TpGrupales.Sudoku;

public class Tester {
    public static void main (String[] agrs){
        int [][] sudoku={{2,0,9,0,0,0,6,0,0},
                {0,4,0,8,7,0,0,1,2},
                {8,0,0,0,1,9,0,4,0},
                {0,3,0,7,0,0,8,0,1},
                {0,6,5,0,0,8,0,3,0},
                {1,0,0,0,3,0,0,0,7},
                {0,0,0,6,5,0,7,0,9},
                {6,0,4,0,0,0,0,2,0},
                {0,8,0,3,0,1,4,5,0}};
        Sudoku sudoku1= new Sudoku();
        sudoku1.Finder_0(sudoku);
        sudoku1.searchline(sudoku,1);
        sudoku1.searchcolumn(sudoku,1);

    }

}
