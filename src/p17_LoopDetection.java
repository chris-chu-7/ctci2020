
public class p17_LoopDetection {
	
	
	public static LinkedList.Node findCollision(LinkedList.Node head){
		/*
		 * This method goes to a specific collision point, then starts over
		 * from the beginning of the linked list to find the intersection. 
		 */
		LinkedList.Node slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		if(fast == null || fast.next == null) return null;
		slow = head;
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}

	
}