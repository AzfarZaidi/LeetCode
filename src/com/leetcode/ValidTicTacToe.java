package com.leetcode;

class ValidTicTacToe {
    static char[][] gameBoard = new char[3][3];

    public static void main(String[] args) {
        String[] board = {"XOX", " X ", "   "};
        System.out.println( "Valid :: " + validTicTacToe( board ) );
    }

    public static boolean validTicTacToe(String[] board) {
        convertToMatrix( board );
        return validateGame();
    }

    public static void convertToMatrix(String[] board) {
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) gameBoard[i][j] = board[i].charAt( j );
    }

    public static boolean validateGame() {
        int numX, numO;

        numX = count( 'X' );
        numO = count( 'O' );

        // X goes first
        if (numO > numX) return false;

        // players take turns
        if (numX > numO + 1) return false;

        // both players can't win
        if (winner( 'X' ) && winner( 'O' )) return false;

        // game ends when one player wins
        if (winner( 'X' ) && numX == numO) return false;

        // game ends when one player wins
        if (winner( 'O' ) && numX > numO) return false;

        return true;
    }

    private static int count(char player) {

        int num = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == player) num++;
            }
        }

        return num;
    }

    private static boolean winner(char player) {

        if (validateRows( player )) return true;
        if (validateColumns( player )) return true;
        if (validateDiagonal( player )) return true;

        return false;
    }

    private static boolean validateRows(char player) {
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == player && gameBoard[i][1] == player && gameBoard[i][2] == player)
                return true;
        }

        return false;
    }

    private static boolean validateColumns(char player) {
        for (int i = 0; i < 3; i++) {
            if (gameBoard[0][i] == player && gameBoard[1][i] == player && gameBoard[2][i] == player)
                return true;
        }

        return false;
    }

    private static boolean validateDiagonal(char player) {
        if (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player)
            return true;
        if (gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player)
            return true;

        return false;
    }
}
