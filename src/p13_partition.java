
public class p13_partition {
	
	
	public static LinkedList.Node partition_1(LinkedList.Node node, int x){
		/*
		 * This method creates 2 different linked lists
		 * One linked List has elements less than x
		 * The other linked list has elements greater than x  
		 */
		LinkedList.Node beforeStart = null;
		LinkedList.Node beforeEnd = null;
		LinkedList.Node afterStart = null;
		LinkedList.Node afterEnd = null;
		while(node != null) {
			LinkedList.Node next = node.next;
			node.next = null;
			if(node.data < x) {
				if(beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart; 
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if(afterStart == null) {
					afterStart = node;
					afterEnd = afterStart; 
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = node.next;
		}
		if(beforeStart == null) return afterStart;
		if(afterStart == null) return beforeStart;
		beforeEnd.next = afterStart;
		return beforeStart;
	}
	
	public static LinkedList.Node partition_2(LinkedList.Node node, int x){
		/*
		 * This method goes one by one and makes a new linked list
		 * Placing less than nodes before the proper position and greater than
		 * node after.
		 */
		LinkedList.Node head = node;
		LinkedList.Node tail = node;
		while (node != null) {
			LinkedList.Node next = node.next;
			if(node.data < x) {
				node.next = head;
				head = node;
			} else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		return head;
	}

	
}
