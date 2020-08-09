public class testp1IsUnique {
	
	
	public static boolean test_is_unique_chars_complex() {
		boolean test_true = p1isUnique.is_unique_chars_complex("abcdefghijklmnopqrstuvwxyz");
		boolean test_false = p1isUnique.is_unique_chars_complex("nikolatesla");
		return (test_true && !test_false);
	}
	
	public static boolean test_is_unique_chars_simple() {
		boolean test_true = p1isUnique.is_unique_chars_simple("abcdefghijklmnopqrstuvwxyz");
		boolean test_false = p1isUnique.is_unique_chars_simple("nikolatesla");
		return (test_true && !test_false);
	}
	
	public static void main(String[] args) {
		int num_passed = 0;
		int num_failed = 0;
		if(test_is_unique_chars_complex()) {
			System.out.println("is_unique_chars_complex method passed!");
			num_passed++;
		} else {
			System.out.println("is_unique_chars_complex method failed!");
			num_failed++;
		}
		if(test_is_unique_chars_simple()) {
			System.out.println("is_unique_chars_simple method passed!");
			num_passed++;
		} else {
			System.out.println("is_unique_chars_simple method failed!");
			num_failed++;
		}
		System.out.println("TEST RESULTS: " + num_passed + " TESTS PASSED, " + num_failed + " TESTS FAILED.");
	}

	
}
