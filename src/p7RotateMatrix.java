
public class p7RotateMatrix {

	
	public static int[][] rotate_1(int[][] matrix) {
		if(matrix.length == 0 || matrix.length != matrix[0].length) return matrix;
		int n = matrix.length;
		for(int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
			}
		}
		return matrix;
	}
	
	
}
