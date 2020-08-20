import java.util.ArrayList;
import java.util.EmptyStackException;


public class p20StackOfPlates {

	public int capacity;
	ArrayList<StackNode<Integer>> stacks = new ArrayList<StackNode<Integer>>();
	
	public p20StackOfPlates(int capacity) {
		/*Sets the capacity of the stack*/
		this.capacity = capacity;
	}
	
	public StackNode<Integer> getLastStack(){
		/*returns the last stack*/
		return stacks.get(stacks.size() - 1);
	}
	
	public void push(int v) {
		/*pushes an element on the stack of plates. can either add a plate or 
		 * add to latest plate*/
		StackNode last = getLastStack();
		if(last != null && last.isFull(capacity)) {
			last.push(v);
		} else {
			StackNode stack = new StackNode(capacity);
			stack.push(v);
			stacks.add(stack);
		}
	}
	
	public int pop() {
		/*pops an element on the stack of plates. can either remove a plate or 
		 * remove to latest plate*/
		StackNode last = getLastStack();
		if(last == null) throw new EmptyStackException();
		Integer v = (Integer) last.pop();
		if(last.size == 0) stacks.remove(stacks.size() - 1);
		return v;
	}
	
	
	public class Node {
		
		
		public Node above, below;
		public int value;
		public Node(int value) {
			/*Initializes a value for an element in the stack.*/
			this.value = value;
		}
		
		
	}
	
	
	public class Stack {
		
		
		private int capacity;
		public Node top, bottom;
		public int size = 0;
		
		public Stack(int capacity) {
			/*Sets the capacity of the stack*/
			this.capacity = capacity;
		}
		
		public boolean isFull() {
			/*Checks to see if a stack has reached capacity.*/
			return capacity == size;
		}
		
		public boolean isEmpty() {
			/*Checks to see if a stack has no elements in it*/
			return size == 0;
		}
		
		public void join(Node above, Node below) {
			/*Joins nodes above and below as stack values.*/
			if(below != null) below.above = above;
			if(above != null) above.below = below;
		}
		
		public boolean push(int v) {
			/*pushes an element on the stack of plates. can either add a plate or 
			 * add to latest plate*/
			if(size >= capacity) return false;
			size++;
			Node n = new Node(v);
			if(size == 1) bottom  = n;
			join(n, top);
			top = n;
			return true;
		}
		
		public int pop() {
			/*pops an element on the stack of plates. can either remove a plate or 
			 * remove to latest plate*/
			Node t = top;
			top = top.below;
			size--;
			return t.value;
		}
		
		public int removeBottom() {
			/*removes the bottom of the stack, no below value now.*/
			Node b = bottom;
			bottom = bottom.above;
			if(bottom == null) bottom.below = null;
			size--;
			return b.value;
		}
		
		
	}
	
	public class SetOfStacks{
		
		
		ArrayList<Stack> stacks = new ArrayList<Stack>();
		public int capacity;
		
		public SetOfStacks(int capacity) {
			/*Set up an arraylist of stacks with each stack having a certain capacity.*/
			this.capacity = capacity;
		}
		
		public Stack getLastStack() {
			/*Returns the final stack in the stack arraylist*/
			if(stacks.size() == 0) {
				return null;
			}
			return stacks.get(stacks.size() - 1);
		}
		
		public void push(int v) {
			/*pushes the latest Node in the arrayList of stacks, either can
			 * add a new stack or add to the latest stack*/
			Stack last = getLastStack();
			if(last != null && last.isFull()) {
				last.push(v);
			} else {
				Stack stack = new Stack(capacity);
				stack.push(v);
				stacks.add(stack);
			}
		}
		
		public int pop() {
			/*pops the latest Node in the arrayList of stacks, either can
			 * remove an element from the latest stack or delete the latest stack*/
			Stack last = getLastStack();
			if(last == null) throw new EmptyStackException();
			Integer v = (Integer) last.pop();
			if(last.size == 0) stacks.remove(stacks.size() - 1);
			return v;
		}
		
		
		public int leftShift(int index, boolean removeTop) {
			/*remove the bottom of one stack and push it to the top of the other stack
			 * keep recursively doing this until reaching the beginning of the stack.*/
			Stack stack = stacks.get(index);
			int removed_item = removeTop ? stack.pop() : stack.removeBottom();
			if(stack.isEmpty()) {
				stacks.remove(index);
			} else {
				int v = leftShift(index + 1, false);
				stack.push(v);
			}
			return removed_item;
		}
		
		public int popAt(int index) {
			/*Pop the bottom element of the stack at a particular index.*/
			return leftShift(index, true);
		}
		
		
	}
	
}
