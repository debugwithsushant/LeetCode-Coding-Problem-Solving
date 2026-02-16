// 79. Word Search

public class Day19 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        int k = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(searchWord(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchWord(char[][] board, String word, int i, int j, int index) {
        if(index == word.length()) {
            return true;
        }

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }

        if(board[i][j] != word.charAt(index)) {
            return false;
        }

        char currentChar = board[i][j];
        board[i][j] = '*';

        boolean found = searchWord(board, word, i+1, j, index+1) || searchWord(board, word, i-1, j, index+1) || searchWord(board, word, i, j+1, index+1) || searchWord(board, word, i, j-1, index+1);

        board[i][j] = currentChar;

        return found;
    }

    public static void main(String[] args) {
        Day19 day19 = new Day19();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(day19.exist(board, word)); // Output: true
    }
}
