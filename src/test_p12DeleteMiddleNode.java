
public class test_p12DeleteMiddleNode {
	
	public static boolean test_deleteNode_1_success(){
		/*Tests the deletion of a linkedlist nested node.
		 * This node exists so it should delete successfully.
		 */
		LinkedList.Node node = new LinkedList.Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(4);
		node.appendToTail(5);
		LinkedList.Node toDelete = node.next.next;
		p12_DeleteMiddleNode.deleteNode_1(toDelete);
		return node.next.next.data == 4;
	}
	
	public static boolean test_deleteNode_1_failure() {
	/*Tests the deletion of a linkedList nested node
	 * This node does not exist should thus return false.*/
		LinkedList.Node node = null;
		return p12_DeleteMiddleNode.deleteNode_1(node);
	}
	
	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_deleteNode_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_deleteNode_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

}
