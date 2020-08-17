
public class p16_Intersection {
	
	
	public static class Result{
		/*
		 * Class that serves as a helper class to finding the intersection
		 * Between 2 Linked Lists. Gives the tail and size
		 * Of the Linked List.
		 */
		public LinkedList.Node tail;
		public int size;
		public Result(LinkedList.Node tail, int size) {
			this.size = size;
			this.tail = tail;
		}
	}
	
	public static LinkedList.Node getKthNode(LinkedList.Node head, int k){
		/*
		 * This method gets the Kth Node of a Linked List
		 */
		LinkedList.Node current = head;
		while(k > 0 && current != null) {
			current = current.next;
			k--;
		}
		return current;
	}
	
	public static Result getTailAndSize(LinkedList.Node list) {
		/*
		 * This method returns the tail and pointer of a Linked List
		 */
		if(list == null) return null;
		int size = 1;
		LinkedList.Node current = list; 
		while(current.next != null) {
			size++;
			current = current.next;
		}
		return new Result(current, size);
	}
	
	public static LinkedList.Node findIntersection(LinkedList.Node list1, LinkedList.Node list2){
		/*
		 * This method finds the intersection pointer of
		 * 2 Different LinkedLists and returns this pointer.
		 */
		if(list1 == null || list2 == null) return null;
		Result result1 = getTailAndSize(list1);
		Result result2 = getTailAndSize(list2);
		if(result1.tail != result2.tail) return null;
		LinkedList.Node shorter = result1.size < result2.size ? list1 : list2;
		LinkedList.Node longer = result1.size < result2.size ? list2 : list1;
		longer = getKthNode(longer, Math.abs(result1.size - result2.size));
		while(shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}
		return shorter;
	}
	
	
}

 