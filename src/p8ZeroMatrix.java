
public class p8ZeroMatrix {
	
	
	public static void nullifyRow_1(int[][] matrix, int row) {
		for(int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] = 0;
		}
	}
	
	public static void nullifyColumn_1(int[][] matrix, int column) {
		for(int i = 0; i < matrix.length; i++) {
			matrix[i][column] = 0;
		}
	}
	
	public static void setZeros_1(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for(int i = 0; i < row.length; i++) {
			if (row[i]) nullifyRow_1(matrix, i);
		}
		for(int i = 0; i < column.length; i++) {
			if(column[i]) nullifyColumn_1(matrix, i);
		}
	}
	
	public static void setZeros_2(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;
		for(int i = 0; i < matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				rowHasZero = true;
				break;
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			if(matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for(int i = 1; i < matrix.length; i++) {
			if(matrix[i][0] == 0) {
				nullifyRow_1(matrix, i);
			}
		}
		for(int i = 1; i < matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				nullifyColumn_1(matrix, i);
			}
		}
		if(rowHasZero) {
			nullifyRow_1(matrix, 0);
		}
		if(colHasZero) {
			nullifyColumn_1(matrix, 0);
		}
	}

	
}
