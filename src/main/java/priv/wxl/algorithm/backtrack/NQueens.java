package priv.wxl.algorithm.backtrack;

/**
 * @author xueli.wang
 * @since 2020/12/27 10:43
 */

public class NQueens {
    public static void main(String[] args) {
        int n = 6;
        boolean[][] board = new boolean[n][n];
        solveNQueens(board, 0);
    }

    private static void solveNQueens(boolean[][] board, int row) {
        int n = board.length;
        if (row >= n) {
            // 结束
            System.out.println("解法：");
            for (boolean[] row1 : board) {
                for (boolean col1 : row1) {
                    System.out.print(col1 ? "Q" : "-");
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }

            board[row][col] = true;
            solveNQueens(board, row + 1);
            board[row][col] = false;
        }
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i--][j--]) {
                return false;
            }
        }

        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < board.length) {
            if (board[i--][j++]) {
                return false;
            }
        }

        return true;
    }
}
