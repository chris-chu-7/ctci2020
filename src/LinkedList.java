

public class LinkedList {
	
	
	public static class Node{
		
		
		Node next = null;
		int data;
		
		public Node(int d) {
			data = d;
		}
		
		void appendToTail(int d) {
			Node end = new Node(d);
			Node n = this;
			while(n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
		
		public Node deleteNode(Node head, int d) {
			if(head == null) return null;
			Node n = head;
			while(n.next != null) {
				if(n.next.data == d) {
					n.next = n.next.next;
					return head;
				}
				n = n.next;
			}
			return head;
		}
		
		public static void printNode(Node head) {
			Node n = head;
			System.out.print(n.data + " -> ");
			while(n.next != null) {
				n = n.next;
				System.out.print(n.data + " -> ");
			}
			System.out.println("end.");
		}
		
		public static int length(Node head) {
			int length = 0;
			LinkedList.Node tracker = head;
			length++;
			while(tracker.next != null) {
				tracker = tracker.next;
				length++;
			}
			return length;
		}
		
		
	}
	
	
}
