
public class p21StackQueue {
	class MyQueue<T> {
		
		
		StackNode<T> stackNewest, stackOldest; 
		
		public MyQueue() {
			stackNewest = new StackNode<T>();
			stackOldest = new StackNode<T>();
		}
		
		public int size(){
			return stackNewest.size + stackOldest.size;
		}
		
		public void add(T value) {
			reverseStacks();
			stackNewest.push(value);
		}
		
		private void shiftStacks() {
			if(stackOldest.isEmpty()) {
				while(!stackNewest.isEmpty()) {
					stackOldest.push(stackNewest.pop());
				}
			}
		}
		
		private void reverseStacks() {
			if(stackNewest.isEmpty()) {
				while(!stackOldest.isEmpty()) {
					stackNewest.push(stackOldest.pop());
				}
			}
		}
		
		public T peek() {
			shiftStacks();
			return stackOldest.peek();
		}
		
		public T remove() {
			shiftStacks();
			return stackOldest.pop();
		}
		
		
	}
}

