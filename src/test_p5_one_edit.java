
public class test_p5_one_edit {

	
	public static boolean test_oneEditAway1_success() {
		return p5_one_edit.oneEditAway1("Chris", "Chri") && p5_one_edit.oneEditAway1("Chris", "Christ") && p5_one_edit.oneEditAway1("Chris", "hris");
	}
	
	public static boolean test_oneEditAway1_failure() {
		return p5_one_edit.oneEditAway1("Chris", "Chrisss") && p5_one_edit.oneEditAway1("Chris", "Chr") && p5_one_edit.oneEditAway1("Chris", "Karis");
	}
	
	public static boolean test_oneEditAway2_success() {
		return p5_one_edit.oneEditAway2("Chris", "Chri") && p5_one_edit.oneEditAway1("Chris", "Christ") && p5_one_edit.oneEditAway1("Chris", "hris");
	}
	
	public static boolean test_oneEditAway2_failure() {
		return p5_one_edit.oneEditAway2("Chris", "Chrisss") && p5_one_edit.oneEditAway1("Chris", "Chr") && p5_one_edit.oneEditAway1("Chris", "Karis");
	}
	


	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_oneEditAway1_success()) {
			numPassed++;
		}else {
			numFailed++;
		}
		if(!test_oneEditAway1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_oneEditAway2_success()) {
			numPassed++;
		}else {
			numFailed++;
		}
		if(!test_oneEditAway2_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
	
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}
	
	
}
