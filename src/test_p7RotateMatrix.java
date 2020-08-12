
public class test_p7RotateMatrix {

	
	public static boolean test_rotate_1_success() {
		int[][] to_test = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] test_value = {{7,4,1},{8,5,2},{9,6,3}};
		p7RotateMatrix.rotate_1(to_test);
		for(int i = 0; i < to_test.length; i++) {
			for(int j = 0; j < to_test[0].length; j++) {
				if(to_test[i][j] != test_value[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean test_rotate_1_failure() {
		int[][] to_test = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] test_value = {{7,4,1},{8,5,2},{9,6,4}};
		p7RotateMatrix.rotate_1(to_test);
		for(int i = 0; i < to_test.length; i++) {
			for(int j = 0; j < to_test[i].length; j++) {
				if(to_test[i][j] != test_value[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_rotate_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_rotate_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}
	
}
