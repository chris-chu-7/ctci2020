
public class test_p11KthToLast {

	
	public static boolean test_printKthToLast_1_success() {
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(40);
		node.appendToTail(5);
		node.appendToTail(6);
		node.appendToTail(7);
		return true;
	}
	
	public static boolean test_printKthToLast_1_failure() {
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(40);
		node.appendToTail(5);
		node.appendToTail(6);
		node.appendToTail(7);
		return false;
	}
	
	public static boolean test_kthToLast_2_success() {
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(40);
		node.appendToTail(5);
		node.appendToTail(6);
		node.appendToTail(7);
		return (p11KthToLast.kthToLast_2(node, 4, new p11KthToLast.Index()).data) == 40;
	}
	
	public static boolean test_kthToLast_2_failure() {
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(40);
		node.appendToTail(5);
		node.appendToTail(6);
		node.appendToTail(7);
		return (p11KthToLast.kthToLast_2(node, 1, new p11KthToLast.Index()).data) == 0;
	}
	
	public static boolean test_kthToLast_3_success() {
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(40);
		node.appendToTail(5);
		node.appendToTail(6);
		node.appendToTail(7);
		return p11KthToLast.kthToLast_3(node, 4).data == 40;
	}
	
	public static boolean test_kthToLast_3_failure() {
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(40);
		node.appendToTail(5);
		node.appendToTail(6);
		node.appendToTail(7);
		return p11KthToLast.kthToLast_3(node, 3).data == 6;
	}
	
	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_printKthToLast_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_printKthToLast_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_kthToLast_2_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_kthToLast_2_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_kthToLast_3_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_kthToLast_3_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

	
}
