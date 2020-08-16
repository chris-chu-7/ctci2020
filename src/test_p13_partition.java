
public class test_p13_partition {
	
	public static boolean test_partition_1_success(){
		/*Tests to see if a particular pattern of nodes
		 * are partitioned successfully.*/
		LinkedList.Node node = new LinkedList.Node(8);
		node.appendToTail(6);
		node.appendToTail(2);
		node.appendToTail(1);
		node.appendToTail(3);
		int partitioned = node.next.next.data;
		node = p13_partition.partition_1(node, 3);
		int[] test_node_array = {2, 1, 8, 6, 3};
		LinkedList.Node test_node = node;
		for(int i = 0; i < test_node_array.length; i++) {
			if(node.data != test_node_array[i]) return false;
			node = node.next;
		}
		return true;
	}
	
	public static boolean test_partition_1_failure() {
		/*Tests to see if a pattern of nodes
		 * results in an invalid partition.*/
		LinkedList.Node node = null;
		node = p13_partition.partition_1(node, 3);
		return node != null;
	}
	
	public static boolean test_partition_2_success(){
		/*Tests to see if a particular pattern of nodes
		 * are partitioned successfully.*/
		LinkedList.Node node = new LinkedList.Node(8);
		node.appendToTail(6);
		node.appendToTail(2);
		node.appendToTail(1);
		node.appendToTail(3);
		int partitioned = node.next.next.data;
		node = p13_partition.partition_2(node, 3);
		int[] test_node_array = {1, 2, 8, 6, 3};
		LinkedList.Node test_node = node;
		for(int i = 0; i < test_node_array.length; i++) {
			if(node.data != test_node_array[i]) return false;
			node = node.next;
		}
		return true;
	}
	
	public static boolean test_partition_2_failure() {
		/*Tests to see if a pattern of nodes
		 * results in an invalid partition.*/
		LinkedList.Node node = null;
		node = p13_partition.partition_2(node, 3);
		return node != null;
	}

	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_partition_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_partition_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_partition_2_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_partition_2_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

}
