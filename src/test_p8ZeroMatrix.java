

public class test_p8ZeroMatrix {
	
	
	public static boolean test_setZeros_1_success() {
		int[][] toTest = new int[][] {{1, 2, 0}, {4, 5, 6}, {7, 8, 9}};
		int[][] expected = new int[][] {{0, 0, 0}, {4, 5, 0}, {7, 8, 0}};
		p8ZeroMatrix.setZeros_1(toTest);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(toTest[i][j] != expected[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean test_setZeros_1_failure() {
		int[][] toTest = new int[][] {{1, 2, 0}, {4, 5, 6}, {0, 8, 9}};
		int[][] expected = new int[][] {{0, 0, 0}, {4, 5, 0}, {7, 8, 0}};
		p8ZeroMatrix.setZeros_1(toTest);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(toTest[i][j] != expected[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean test_setZeros_2_success() {
		int[][] toTest = new int[][] {{1, 2, 0}, {4, 5, 6}, {7, 8, 9}};
		int[][] expected = new int[][] {{0, 0, 0}, {4, 5, 0}, {7, 8, 0}};
		p8ZeroMatrix.setZeros_2(toTest);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(toTest[i][j] != expected[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean test_setZeros_2_failure() {
		int[][] toTest = new int[][] {{1, 2, 0}, {4, 5, 6}, {0, 8, 9}};
		int[][] expected = new int[][] {{0, 0, 0}, {4, 5, 0}, {7, 8, 0}};
		p8ZeroMatrix.setZeros_1(toTest);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(toTest[i][j] != expected[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_setZeros_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_setZeros_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_setZeros_2_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_setZeros_2_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

	
}
