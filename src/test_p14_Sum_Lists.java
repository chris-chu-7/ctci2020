
public class test_p14_Sum_Lists {
	
	
	public static boolean test_addList_success() {
		LinkedList.Node node1 = new LinkedList.Node(1);
		node1.appendToTail(1);
		node1.appendToTail(2);
		LinkedList.Node node2 = new LinkedList.Node(1);
		node2.appendToTail(3);
		LinkedList.Node result = p14_Sum_Lists.addList(node1, node2);
		LinkedList.Node resultPointer = result;
		int[] checker = {1, 2, 5};
		for(int i = 0; i < checker.length; i++) {
			if(resultPointer.data != checker[i]) return false;
			resultPointer = resultPointer.next;
		}
		return true;
	}
	
	public static boolean test_addList_failure() {
		LinkedList.Node node1 = new LinkedList.Node(1);
		node1.appendToTail(3);
		node1.appendToTail(5);
		node1.appendToTail(7);
		LinkedList.Node node2 = new LinkedList.Node(2);
		node2.appendToTail(6);
		node2.appendToTail(4);
		LinkedList.Node result = p14_Sum_Lists.addList(node1, node2);
		LinkedList.Node resultPointer = result;
		int[] checker = {1, 6, 3, 1};
		for(int i = 0; i < checker.length; i++) {
			if(resultPointer.data != checker[i]) return false;
			resultPointer = resultPointer.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_addList_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_addList_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

	
}
