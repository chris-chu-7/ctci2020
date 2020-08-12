
public class test_p9StringRotation {
	
	
	public static boolean test_isRotation_1_success() {
		return p9StringRotation.isRotation_1("waterbottle", "erbottlewat");
	}
	
	public static boolean test_isRotation_1_failure() {
		return p9StringRotation.isRotation_1("waterbottle!", "erbottlewat");
	}

	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_isRotation_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_isRotation_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

	
}
