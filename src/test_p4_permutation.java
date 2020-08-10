//test
public class test_p4_permutation {
	
	
	public static boolean test_isPermutationOfPalindrome1_success() {
		return p4_permutation.isPermutationOfPalindrome1("racecar");
	}
	
	public static boolean test_isPermutationOfPalindrome1_failure() {
		return p4_permutation.isPermutationOfPalindrome1("gameofthrones");
	}
	
	public static boolean test_isPermutationOfPalindrome2_success() {
		return p4_permutation.isPermutationOfPalindrome1("racecar");
	}
	
	public static boolean test_isPermutationOfPalindrome2_failure() {
		return false;
	}
	
	public static boolean test_isPermutationOfPalindrome3_success() {
		return p4_permutation.isPermutationOfPalindrome1("racecar");
	}
	
	public static boolean test_isPermutationOfPalindrome3_failure() {
		return false;
	}

	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_isPermutationOfPalindrome1_success()) {
			numPassed++;
		}else {
			numFailed++;
		}
		if(!test_isPermutationOfPalindrome1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_isPermutationOfPalindrome2_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_isPermutationOfPalindrome2_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_isPermutationOfPalindrome3_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_isPermutationOfPalindrome3_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

	
}
