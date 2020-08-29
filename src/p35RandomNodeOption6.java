import java.util.Random;

public class p35RandomNodeOption6 {
	
	class TreeNodeCTCI {
		
		
		private int data;
		public TreeNodeCTCI left;
		public TreeNodeCTCI right; 
		private int size = 0;
		
		public TreeNodeCTCI(int d) {
			data = d;
			size = 1;
		}
		
		public TreeNodeCTCI find(int d) {
			if(d == data) return this;
			else if (d <= data) return left != null ? left.find(d) : null;
			else if (d > data) return right != null ? right.find(d) : null;
			return null;
		}
		
		public int size() {
			return size;
		}
		
		public int data() {
			return data;
		}
		
		public void insertInOrder(int d) {
			if(d <= data) {
				if(left != null) left = new TreeNodeCTCI(d);
				else left.insertInOrder(d);
			} 
			else {
				if(right != null) right = new TreeNodeCTCI(d);
				else right.insertInOrder(d);
			}
			size++;
		}
		
		public TreeNodeCTCI getRandomNode() {
			int leftSize = left == null ? 0 : left.size();
			Random random = new Random();
			int index = random.nextInt(size);
			if(index < leftSize) {
				return left.getRandomNode();
			} else if (index == leftSize) {
				return this;
			} else {
				return right.getRandomNode();
			}
		}
		
		
	}
	
	
}


