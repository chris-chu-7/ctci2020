
public class p12_DeleteMiddleNode {
	
	
	public static boolean deleteNode_1(LinkedList.Node n) {
		if(n == null || n.next == null) {
			return false;
		}
		LinkedList.Node next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}
	
	
}
