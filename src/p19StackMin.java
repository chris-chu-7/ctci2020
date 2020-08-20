import java.util.EmptyStackException;


public class p19StackMin{
	
	
	static class StackNode<T> {
		/*Class that represents a Node in a Stack.*/
		
		
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			/*Stack Node that indicates where data is*/
			this.data = data;
		}
		
		/*top of stack to pop*/
		private StackNode<T> top;
		
		public T pop() {
			/*
			 *  Stack Node that removes the top of the stack
			 * Return the element on the top of the stack 
			 */
			if(top == null) throw new EmptyStackException();
			T item = top.data;
			top = top.next;
			return item;
		}
		
		public void push(T item) {
			/*
			 *  Stack Node that removes the top of the stack
			 *  Return the element on the top of the stack
			 */
			StackNode<T> t = new StackNode<T>(item);
			t.next = top;
			top = t;
		}
		
		public T peek() {
			/*
			 *  Stack node that shows the top data of the stack
			 *  Return the element at the top of the stack. 
			 */
			if(top == null) throw new EmptyStackException();
			return top.data;
		}
		
		public boolean isEmpty() {
			/*
			 *  Stack node if a stack is empty or not
			 *  Returns whether the top of the private stack contains
			 *  data or not.  
			 */
			return top == null;
		}
		
		
	}

	
	class NodeWithMin1 {
		/*Constructor class containing the value of the Node and the Minimum
		 * Value of all the Nodes.*/
		public int value;
		public int min;
		public NodeWithMin1(int v, int min) {
			value = v;
			this.min = min;
		}
	}
	
	
	StackNode<NodeWithMin1> node1 = new StackNode<NodeWithMin1>(null);
	
	public int min1(){
		/*peek the minimum value if it exists, otherwise the max value is returned*/
		if(node1.isEmpty()) return Integer.MAX_VALUE;
		else return node1.peek().min;
	}
	
	public void push1(int value) {
		/*Pushes the minimum value into the stack, if it is the minimum value.*/
		int newMin = Math.min(value, min1());
		node1.push(new NodeWithMin1(value, newMin));
	}
	
	
	class stackWithMin2 {
		
		
		StackNode<Integer> superman;
		StackNode<Integer> s2;
	
		public stackWithMin2() {
			/*Initializes 2 stacks, one with all elements and one with only the minimum value. */
			s2 = new StackNode<Integer>(Integer.MAX_VALUE);
			superman = new StackNode<Integer>(Integer.MAX_VALUE);
		}
		
		public void push(int value) {
			/*Pushes the minimum value into the stack, if it is the minimum value.*/
			if(value <= min()) {
				s2.push(value);
			}
			superman.push(value);
		}
		
		public Integer pop() {
			/*Pop the last value if possible and return the minimum value*/
			int value = superman.pop();
			if(value == min()) s2.pop();
			return value;
		}
		
		public int min() {
			/*peek the minimum value if it exists, otherwise the max value is returned*/
			if(s2.isEmpty()) return Integer.MAX_VALUE;
			else return s2.peek();
		}
	
		
	}
	
	
	public static void main(String[] args) {
		/*Tests to see if the minimum of the stacks are 1 and 2, respectively.*/
		p19StackMin sample = new p19StackMin();
		stackWithMin2 stack1 = sample.new stackWithMin2(); 
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		System.out.println(stack1.s2.peek());
		sample.node1.push(sample.new NodeWithMin1(5, 5));
		sample.node1.push(sample.new NodeWithMin1(2, 1));
		System.out.println(sample.node1.peek().value);
	}
	
	
}
