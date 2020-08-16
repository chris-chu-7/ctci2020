
public class p14_Sum_Lists {
	
	
	public static class PartialSum {
		/*
		 * Helper Class Carrying the Sum and Carry Value of Two One-Digit Numbers.
		 */
		public LinkedList.Node sum = null;
		public int carry = 0; 
	}

	public static LinkedList.Node insertInFront(LinkedList.Node list, int data){
		/*
		 * Function that adds data to the front of the Linked List
		 * Returns the New Linked List
		 */
		LinkedList.Node node = new LinkedList.Node(data);
		if(list != null) {
			node.next = list;
		}
		return node;
	}
	
	public static LinkedList.Node padList(LinkedList.Node list, int padding){
		/*
		 * Function that "Pads" Linked List with Zeroes if one list is longer than the other
		 * Returns the New Linked List
		 */
		LinkedList.Node head = list;
		for(int i = 0; i < padding; i++) {
			head = insertInFront(head, 0);
		}
		return head;
	}
	
	public static PartialSum addListHelper(LinkedList.Node l1, LinkedList.Node l2) {
		/*
		 * Function that recursively calls itself to add Multiple Linked List digits Together
		 * Returns the new Linked List containing the Sum. 
		 */
		if(l1 == null && l2 == null) {
			PartialSum sum = new PartialSum();
			return sum;
		}
		PartialSum sum = addListHelper(l1.next, l2.next);
		int val = sum.carry + l1.data + l2.data;
		LinkedList.Node fullResult = insertInFront(sum.sum, val % 10);
		sum.sum = fullResult;
		sum.carry = val / 10;
		return sum;
	}
	
	public static LinkedList.Node addList(LinkedList.Node l1, LinkedList.Node l2){
		/*
		 * Function that calls the helped and pads the list before calling the helper, adding
		 * the final Carry.
		 * Returns the final Linked List Sum Result.
		 */
		int len1 = LinkedList.Node.length(l1);
		int len2 = LinkedList.Node.length(l2);
		if(len1 < len2) {
			l1 = padList(l1, len2 - len1);
		} else {
			l2 = padList(l2, len1 - len2);
		}
		PartialSum sum = addListHelper(l1, l2);
		if(sum.carry == 0) {
			return sum.sum;
		} else {
			LinkedList.Node padThis = insertInFront(sum.sum,sum.carry);
			return padThis;
		}
	}
	
	
}
