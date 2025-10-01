// replace all 'O's that are note connected to boundary 'O's with 'X's in a 2D board.
public class array2d_2 {

    static boolean isValid(char[][] board, int i, int j) {
        return (i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j] == 'O');
    }

    static void dfs(char[][] board, int i, int j) {
        int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        board[i][j] = '-';

        for (int[] dir : direction) {
            int newi = i + dir[0];
            int newj = j + dir[1];

            if (isValid(board, newi, newj)) {
                dfs(board, newi, newj);
            }
        }
    }

    static void find(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        // Step 1: DFS from boundary O's
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][m - 1] == 'O') dfs(board, i, m - 1);
        }

        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[n - 1][j] == 'O') dfs(board, n - 1, j);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public static void main(String args[]) {
        char board[][] = {
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'}
        };

        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        find(board);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
