import java.util.Stack;


public class p15_Palindrome {
	
	
	public static boolean isEqual_1(LinkedList.Node one, LinkedList.Node two) {
		/*
		 * Function that checks to see if 2 linked lists have identical content.
		 * Returns if the Linked Lists are Equal.
		 */
		while(one != null && two != null) {
			if(one.data != two.data) return false;
			one = one.next;
			two = two.next;
		}
		return one == null && two == null;
	}
	
	public static LinkedList.Node reverseAndClone_1(LinkedList.Node node){
		/*
		 * Function that Reverses a Linked List
		 * Returns the Reverse Linked List. 
		 */
		LinkedList.Node head = null;
		while(node != null) {
			LinkedList.Node n = new LinkedList.Node(node.data);
			n.next = head;
			head = n;
			node = node.next;
		}
		return head;
	}
	
	public static boolean isPalindrome_1(LinkedList.Node head) {
		/*
		 * Function that checks if 2 different Linked Lists are palindrome.
		 * Returns if the Lists are palindromes.
		 */		
		LinkedList.Node reversed = reverseAndClone_1(head);
		return isEqual_1(head, reversed);
	}
	
	public static boolean isPalindrome_2(LinkedList.Node head) {
		/*
		 * Function that checks if 2 different Linked Lists are palindrome.
		 * Returns if the Lists are palindromes.
		 */	
		LinkedList.Node fast = head, slow = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null) {
			slow = slow.next;
		}
		while(slow != null) {
			int top = stack.pop().intValue();
			if(top != slow.data) return false;
			slow = slow.next;
		}
		return true;
	}
	
	public static class Result{
		/*
		 * Class that serves as a helper for recursing through a potentially palindromic
		 * node. 
		 */

		LinkedList.Node node;
		boolean result;
		public Result(LinkedList.Node node, boolean result) {
			this.node = node;
			this.result = result;
		}
	}
	
	public static Result isPalindrome_Recurse_1(LinkedList.Node head, int length) {
		/*
		 * Function that Recurses through all lists and checks if each list is a palindrome.
		 * This function compresses the list.
		 * Returns the Result containing the remaining node (should be null or one element) and whether
		 * The function is a palindrome (boolean result) 
		 */
		if(head == null || length <= 0) {
			return new Result(head, true);
		} else if(length == 1) {
			return new Result(head.next, true);
		}
		Result res = isPalindrome_Recurse_1(head.next, length - 2);
		if(!res.result || res.node == null) return res;
		res.result = (head.data == res.node.data);
		res.node = res.node.next;
		return res;
	}
	
	public static boolean isPalindrome_3(LinkedList.Node head) {
		/*
		 * Function that checks if 2 different Linked Lists are palindrome.
		 * Returns if the Lists are palindromes.
		 */	
		int length = LinkedList.Node.length(head);
		Result p = isPalindrome_Recurse_1(head, length);
		return p.result;
	}
	
	
}
