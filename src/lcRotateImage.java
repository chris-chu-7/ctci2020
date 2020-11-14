class Solution {
    
    
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                swap(matrix, i, j);
            }
        }
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N - j - 1];
                matrix[i][N - j - 1] = temp;
            }
        }
    }
    
    public void swap(int[][] m, int row, int column){
        int temp = m[row][column];
        m[row][column] = m[column][row];
        m[column][row] = temp;
    }
    
    
}