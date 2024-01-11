package org.example.excercises;

public class TicTacToeChecker {
    public static int isSolved(int[][] board) {
        int empty = 0;
        int xInPosDiagonal = 0;
        int oInPosDiagonal = 0;
        int xInNegDiagonal = 0;
        int oInNegDiagonal = 0;

        for (int i = 0; i < board.length; i++) {
            int xInRow = 0;
            int oInRow = 0;
            int xInCol = 0;
            int oInCol = 0;

            for (int j = 0; j < board.length; j++) {
                int currentValue = board[i][j];
                if (currentValue == 0) {
                    empty++;
                }
                    //Row check
                if (currentValue == 1) {
                    xInRow++;
                } else if (currentValue == 2) {
                    oInRow++;
                }

                //Column check
                if (board[j][i] == 1) {
                    xInCol++;
                } else if (board[j][i] == 2) {
                    oInCol++;
                }

                //Positive diagonals
                if (i == j) {
                    if (currentValue == 1) {
                        xInPosDiagonal++;
                    } else if (currentValue == 2) {
                        oInPosDiagonal++;
                    }
                }
                //Negative diagonals
                if (i + j == board.length -1) {
                    if (currentValue == 1) {
                        xInNegDiagonal++;
                    } else if (currentValue == 2) {
                        oInNegDiagonal++;
                    }
                }
            }
            //Validate x and o
            if (xInRow == 3 || xInPosDiagonal == 3 || xInNegDiagonal == 3 || xInCol == 3) {
                return 1;
            } else if (oInRow == 3 || oInPosDiagonal == 3 || oInNegDiagonal == 3 || oInCol == 3) {
                return 2;
            }
        }
        if (empty != 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
