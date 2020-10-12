class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet < Character > rows = new HashSet < Character > ();
            HashSet < Character > columns = new HashSet < Character > ();
            HashSet < Character > cube = new HashSet < Character > ();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!rows.add(board[i][j])) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    if (!columns.add(board[j][i])) {
                        return false;
                    }
                }
                int rowIndex = 3 * (i / 3);
                int columnIndex = 3 * (i % 3);
                if (board[rowIndex + j / 3][columnIndex + j % 3] != '.' && !cube.add(board[rowIndex + j / 3][columnIndex + j % 3])) {
                    return false;
                }
            }
        }
        return true;
    }
}