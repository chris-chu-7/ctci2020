
public class test_p15_Palindrome {

	public static boolean test_isPalindrome_1_success() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(3);
		list.appendToTail(2);
		list.appendToTail(1);
		return p15_Palindrome.isPalindrome_1(list);
	}
	
	public static boolean test_isPalindrome_1_failure() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(2);
		list.appendToTail(1);
		return p15_Palindrome.isPalindrome_1(list);
	}
	
	public static boolean test_isPalindrome_2_success() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(3);
		list.appendToTail(2);
		list.appendToTail(1);
		return p15_Palindrome.isPalindrome_2(list);
	}
	
	public static boolean test_isPalindrome_2_failure() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(2);
		list.appendToTail(1);
		return p15_Palindrome.isPalindrome_2(list);
	}
	
	public static boolean test_isPalindrome_3_success() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(3);
		list.appendToTail(2);
		list.appendToTail(1);
		return p15_Palindrome.isPalindrome_3(list);
	}
	
	public static boolean test_isPalindrome_3_failure() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(2);
		list.appendToTail(1);
		return p15_Palindrome.isPalindrome_3(list);
	}
	
	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_isPalindrome_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		} 
		if(!test_isPalindrome_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_isPalindrome_2_success()) {
			numPassed++;
		} else {
			numFailed++;
		} 
		if(!test_isPalindrome_2_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_isPalindrome_3_success()) {
			numPassed++;
		} else {
			numFailed++;
		} 
		if(!test_isPalindrome_3_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}
	
}
