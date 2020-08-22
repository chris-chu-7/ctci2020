

public class p22SortStack {

	
	public static void sort1(StackNode<Integer> s) {
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
	
	public static void sort2(StackNode<Integer> s) {
		StackNode<Integer> t = new StackNode<Integer> ();
		StackNode<Integer> u = new StackNode<Integer> ();
		
		while(!s.isEmpty()) {
			int min = Integer.MAX_VALUE;
			int sSize = s.size;
			for(int i = 0; i < sSize; i++) {
				u.push(s.pop());
				if(u.peek() < min) min = u.peek();
			}
			int uSize = u.size;
			for(int j = 0; j < uSize; j++) {
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
