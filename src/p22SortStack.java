

public class p22SortStack {

	
	public void sort1(StackNode<Integer> s) {
		StackNode<Integer> t = new StackNode<Integer>();
		while(!s.isEmpty()) {
			int temp = s.pop();
			while(!t.isEmpty() && t.peek() > temp) {
				s.push(t.pop());
			}
			t.push(temp);
		}
		while(!t.isEmpty()) {
			s.push(t.pop());
		}
	}
	
	public void sort2(StackNode<Integer> s) {
		StackNode<Integer> t = new StackNode<Integer> ();
		StackNode<Integer> u = new StackNode<Integer> ();
		int sSize = s.size;
		while(!s.isEmpty()) {
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < s.size; i++) {
				if(s.peek() < min) min = s.peek();
				u.push(s.pop());
			}
			for(int i = 0; i < u.size; i++) {
				int value = u.peek();
				if (value == min) {
					t.push(u.pop());
				} else {
					s.push(u.pop());
				}
			}
		}
		while(!t.isEmpty()) {
			s.push(t.pop());
		}
	}
	
	
}
