package Backtracking;

public class AllRoutesForNQueens {
    public static void main(String[] args) {
        int n = 4;
        String[][] board = new String[n][n];
        // Initialize the board with null values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        solveNQueens(board, 0);
    }

    static void solveNQueens(String[][] board, int row) {
        int n = board.length;

        // Base case: All queens are placed
        if (row == n) {
            display(board);
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                // Place the queen
                board[row][col] = "Q";

                // Recurse to the next row
                solveNQueens(board, row + 1);

                // Backtrack: Remove the queen
                board[row][col] = ".";
            }
        }
    }

    static boolean isSafe(String[][] board, int row, int col) {
        int n = board.length;

        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col].equals("Q")) {
                return false;
            }
        }

        // Check the left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }

        // Check the right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }

        return true;
    }

    static void display(String[][] board) {
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
