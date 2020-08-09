
public class test_p3_replace_spaces {
	
	
	public static boolean test_my_implementation_success() {
		boolean checker = p3_replace_spaces.my_implementation("chris chu owns this channel").equals("chris%20chu%20owns%20this%20channel");
		return checker;
	}
	
	public static boolean test_my_implementation_failure() {
		boolean checker = p3_replace_spaces.my_implementation("chris chu owns this channel").equals("chris%20chu%20owns%20this%2channel");
		return checker;
	}
	
	public static boolean test_gayle_implementation_success() {
		String test_string = "i love gayle! :)";
		char[] string_array = test_string.toCharArray();
		String benchmark = "%20love%20gayle!";
		boolean checker = p3_replace_spaces.gayle_implementation(string_array, string_array.length) == benchmark;
		System.out.println(p3_replace_spaces.gayle_implementation(string_array, string_array.length + 6));
		return checker;
	}
	
	public static boolean test_gayle_implementation_failure() {
		String test_string = "i love gayle! :)";
		char[] string_array = test_string.toCharArray();
		String benchmark = "i%20love%20gayle!20:)";
		boolean checker = p3_replace_spaces.gayle_implementation(string_array, string_array.length + 6) == benchmark;
		return checker;
	}
	
	public static void main(String[] args) {
		int num_passed = 0;
		int num_failed = 0;
		if(test_my_implementation_success()) {
			num_passed++;
		} else {
			num_failed++;
		}
		if(!test_my_implementation_failure()) {
			num_passed++;
		} else {
			num_failed++;
		}
		/*if(test_gayle_implementation_success()) {
			num_passed++;
		} else {
			num_failed++;
		}
		if(!test_gayle_implementation_failure()) {
			num_passed++;
		} else {
			num_failed++;
		}*/
		System.out.println("TEST RESULTS: " + num_passed + " TESTS PASSED, " + num_failed + " TESTS FAILED.");
	}

	
}
