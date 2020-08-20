import java.util.ArrayList;
import java.util.EmptyStackException;


public class p20StackOfPlates {

	public int capacity;
	ArrayList<StackNode<Integer>> stacks = new ArrayList<StackNode<Integer>>();
	
	public p20StackOfPlates(int capacity) {
		this.capacity = capacity;
	}
	
	public StackNode<Integer> getLastStack(){
		return stacks.get(stacks.size() - 1);
	}
	
	public void push(int v) {
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
		StackNode last = getLastStack();
		if(last == null) throw new EmptyStackException();
		Integer v = (Integer) last.pop();
		if(last.size == 0) stacks.remove(stacks.size() - 1);
		return v;
	}
	
	
	
}
