
public class test_p21StackQueue {
	
	public static boolean test_push_and_peek() {
		p21StackQueue instance = new p21StackQueue();
		p21StackQueue.MyQueue<Integer> queue = instance.new MyQueue<Integer>();
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);
		return queue.peek() == 4; 
	}
	
	public static boolean test_size() {
		p21StackQueue instance = new p21StackQueue();
		p21StackQueue.MyQueue<Integer> queue = instance.new MyQueue<Integer>();
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);
		return queue.size() == 4;
	}
	
	public static boolean test_remove() {
		p21StackQueue instance = new p21StackQueue();
		p21StackQueue.MyQueue<Integer> queue = instance.new MyQueue<Integer>();
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);
		queue.remove();
		return queue.size() == 3 && queue.peek() == 3;
	}

	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_push_and_peek()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_size()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_remove()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println(numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED");
	}

}
