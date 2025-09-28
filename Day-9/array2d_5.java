// word search in a 2D array
public class array2d_5 
{
    static public boolean exist(char[][] board, String word) 
    {
        char[] word_arr = word.toCharArray();
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board[0].length; j++) 
            {
                if (board[i][j] == word_arr[0] && exists(board, i, j, word_arr, 0)) 
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    static private boolean exists(char[][] board, int i, int j, char[] word, int idx) 
    {
        if (idx == word.length) 
        {
            return true;
        }
        
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word[idx]) 
        {
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = '*';
        
        boolean res = exists(board, i + 1, j, word, idx + 1) ||
                      exists(board, i - 1, j, word, idx + 1) ||
                      exists(board, i, j + 1, word, idx + 1) ||
                      exists(board, i, j - 1, word, idx + 1);
        
        board[i][j] = temp; 
        
        return res;
    }
    public static void main(String[] args) 
    {
        char[][] board1 = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word1 = "ABCCED";
        System.out.println("Test 1 - ABCCED: " + exist(board1, word1)); 

    }
}