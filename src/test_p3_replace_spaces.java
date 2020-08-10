
public class test_p3_replace_spaces {
	
	
	public static boolean test_my_implementation_success() {
		boolean checker = p3_replace_spaces.my_implementation("chris chu owns this channel").equals("chris%20chu%20owns%20this%20channel");
		return checker;
	}
	
	public static boolean test_my_implementation_failure() {
		boolean checker = p3_replace_spaces.my_implementation("chris chu owns this channel").equals("");
		return checker;
	}
	
	public static boolean test_gayle_implementation_success() {
        String test_string = "i love gayle!";
        char[] string_array = new char[100];
        for (int i = 0; i < test_string.length(); i++) string_array[i]=test_string.charAt(i);
        string_array[test_string.length()] = '\0';
        String benchmark = "i%20love%20gayle!";
        boolean checker = p3_replace_spaces.gayle_implementation(string_array, test_string.length()) == benchmark;
        System.out.println(p3_replace_spaces.gayle_implementation(string_array, test_string.length()));
        return checker;
    }
	
	public static boolean test_gayle_implementation_failure() {
		String test_string = "i love gayle! :)";
		char[] string_array = test_string.toCharArray();
		String benchmark = "i%20love%20gayle!20:)";
		boolean checker = p3_replace_spaces.gayle_implementation(string_array, string_array.length + 6) == benchmark;
		return checker;
	}
	
	public static boolean test_my_implementation_backwards_success() {
		String str = "gael lopez is a fraud ";
		char[] str_array = str.toCharArray();
		System.out.println(p3_replace_spaces.my_implementation_backwards(str_array, str.length()));
		return p3_replace_spaces.my_implementation_backwards(str_array, str.length()).equals("gael%20lopez%20is%20a%20fraud");
	}
	
	public static boolean test_my_implementation_backwards_failure() {
		String str = "gael lopez is a fraud ";
		char[] str_array = str.toCharArray();
		return p3_replace_spaces.my_implementation_backwards(str_array, str.length()).equals("gael%20lopez%20is%20a%20fraud ");
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
		if(test_my_implementation_backwards_success()) {
			num_passed++;
		} else {
			num_failed++;
		}
		if(!test_my_implementation_backwards_failure()) {
			num_passed++;
		} else {
			num_failed++;
		}
		System.out.println("TEST RESULTS: " + num_passed + " TESTS PASSED, " + num_failed + " TESTS FAILED.");
	}

	
}
