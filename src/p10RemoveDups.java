import java.util.HashSet;


public class p10RemoveDups {

	//I don't see this doing anything.
	public static void deleteDups_1(LinkedList.Node n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedList.Node previous = null;
		while(n != null) {
			if(set.contains(n.data)) {
				previous = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	public static void deleteDups_2(LinkedList.Node head) {
		LinkedList.Node current = head;
		while(current != null) {
			LinkedList.Node runner = current;
			while(runner.next != null) {
				if(runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	
}
