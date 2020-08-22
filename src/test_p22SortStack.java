
public class test_p22SortStack {
	
	
	public static boolean test_sortStack_1() {
		StackNode<Integer> node = new StackNode<Integer>(4);
		node.push(5);
		node.push(2);
		node.push(6);
		node.push(8);
		node.push(7);
		node.push(9);
		node.push(10);
		p22SortStack.sort1(node);
		int[] solution = {2, 4, 5, 6, 7, 8, 9, 10};
		int pointer = 0;
		while(!node.isEmpty()) {
			int peeky = node.peek();
			if(node.pop() != solution[pointer]) {
				return false;
			}
			pointer++;
		}
		return true;
	}
	
	public static boolean test_sortStack_2() {
		StackNode<Integer> node = new StackNode<Integer>(4);
		node.push(5);
		node.push(2);
		node.push(6);
		node.push(8);
		node.push(7);
		node.push(9);
		node.push(10);
		p22SortStack.sort2(node);
		int[] solution = {2, 4, 5, 6, 7, 8, 9, 10};
		int pointer = 0;
		while(!node.isEmpty()) {
			int peeky = node.peek();
			if(node.pop() != solution[pointer]) {
				return false;
			}
			pointer++;
		}
		return true;
	}

	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_sortStack_1()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_sortStack_2()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println(numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED");
	}

}
