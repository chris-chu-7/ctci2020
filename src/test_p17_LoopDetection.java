
public class test_p17_LoopDetection {
	
	
	public static boolean test_findCollision_success() {
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		LinkedList.Node node2 = new LinkedList.Node(4);
		node2.appendToTail(5);
		node2.appendToTail(6);
		node2.appendToTail(7);
		node2.appendToTail(8);
		node2.appendToTail(9);
		node2.appendToTail(10);
		node2.appendToTail(11);
		LinkedList.Node nodePointer = node2;
		while(nodePointer.next != null) {
			nodePointer = nodePointer.next;
		}
		nodePointer.next = node2;
		node.next = node2;
		int data = p17_LoopDetection.findCollision(node).data;
		return data == 4;
	}
	
	public static boolean test_findCollision_failure() {
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		LinkedList.Node node2 = new LinkedList.Node(4);
		node2.appendToTail(5);
		node2.appendToTail(6);
		node2.appendToTail(7);
		node2.appendToTail(8);
		node2.appendToTail(9);
		node2.appendToTail(10);
		node2.appendToTail(11);
		LinkedList.Node nodePointer = node2;
		while(nodePointer.next != null) {
			nodePointer = nodePointer.next;
		}
		nodePointer.next = node2;
		node.next = node2;
		int data = p17_LoopDetection.findCollision(node).data;
		return data == 0;
	}

	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_findCollision_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_findCollision_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " +  numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

	
}
