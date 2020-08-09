public class test_p2_is_permutation {
	
	
	public static boolean test_my_implementation_success() {
		boolean test_function = p2_is_permutation.my_implementation("racecar", "areccar");
		return test_function;
	}
	
	public static boolean test_my_implementation_failure() {
		boolean test_function = p2_is_permutation.my_implementation("chrischu", "learnsisawesome");
		return !test_function;
	}
	
	public static boolean test_gayle_implementation_1_success() {
		boolean test_function = p2_is_permutation.gayle_implementation_1("racecar", "areccar");
		return test_function;
	}
	
	public static boolean test_gayle_implementation_1_failure() {
		boolean test_function = p2_is_permutation.gayle_implementation_1("chrischu", "learnsisawesome");
		return !test_function;
	}
	
	public static boolean test_gayle_implementation_2_success() {
		boolean test_function = p2_is_permutation.gayle_implementation_2("racecar", "areccar");
		return test_function;
	}
	
	public static boolean test_gayle_implementation_2_failure() {
		boolean test_function = p2_is_permutation.gayle_implementation_2("chrischu", "learnsisawesome");
		return !test_function;
	}
	
	public static void main(String[] args) {
		int num_passed = 0;
		int num_failed = 0;
		if(test_my_implementation_success()) {
			num_passed++;
		} else {
			num_failed++;
		}
		if(test_my_implementation_failure()) {
			num_passed++;
		} else {
			num_failed++;
		}
		if(test_gayle_implementation_1_success()) {
			num_passed++;
		} else {
			num_failed++;
		}
		if(test_gayle_implementation_1_failure()) {
			num_passed++;
		} else {
			num_failed++;
		}
		if(test_gayle_implementation_2_success()) {
			num_passed++;
		} else {
			num_failed++;
		}
		if(test_gayle_implementation_2_failure()) {
			num_passed++;
		} else {
			num_failed++;
		}
		System.out.println("TEST RESULTS: " + num_passed + " TESTS PASSED, " + num_failed + " TESTS FAILED.");
	}
	
	
}
