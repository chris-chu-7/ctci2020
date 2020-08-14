
public class p11KthToLast {

	
	public static int printKthToLast_1(LinkedList.Node head, int k) {
		if(head == null) {
			return 0;
		}
		int index = printKthToLast_1(head.next, k) + 1;
		if(index == k) {
			System.out.println(k + "th to last node is " + head.data);
			return k;
		}
		return index;
	}
	
	public static class Index{
		public int value = 0;
	}
	
	public static LinkedList.Node kthToLast_1(LinkedList.Node head, int k){
		Index idx = new Index();
		return kthToLast_2(head, k, idx);
	}
	
	public static LinkedList.Node kthToLast_2(LinkedList.Node head, int k, Index idx){
		if(head == null) {
			return null;
		}
		LinkedList.Node node = kthToLast_2(head.next, k, idx);
		idx.value++;
		if(idx.value == k) {
			return head;
		}
		return node;
	}
	
	public static LinkedList.Node kthToLast_3(LinkedList.Node head, int k){
		LinkedList.Node firstPointer = head, secondPointer = head;
		for(int i = 0; i < k; i++) {
			if(firstPointer == null) {
				return null;
			}
			firstPointer = firstPointer.next;
		}
		while(firstPointer != null) {
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next;
		}
		return secondPointer;
	}
	
	
}
