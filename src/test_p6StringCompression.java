
public class test_p6StringCompression {
	
	
	public static boolean test_compressBad_1_success() {
		return p6StringCompression.compressBad_1("aabbbb").equals("a2b4");
	}
	
	public static boolean test_compressBad_1_failure() {
		return p6StringCompression.compressBad_1("aabbbbc").equals("a2b4");
	}
	
	public static boolean test_compress_2_success() {
		return p6StringCompression.compress_2("aabbbb").equals("a2b4");
	}
	
	public static boolean test_compress_2_failure() {
		return p6StringCompression.compress_2("aabbbbc").equals("a2b4");
	}
	
	public static boolean test_compress_3_success() {
		return p6StringCompression.compress_3("aabbbb").equals("a2b4");
	}
	
	public static boolean test_compress_3_failure() {
		return p6StringCompression.compress_3("aabbbbc").equals("a2b4");
	}

	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_compressBad_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_compressBad_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_compress_2_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_compress_2_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_compress_3_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_compress_3_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");

	}

}
