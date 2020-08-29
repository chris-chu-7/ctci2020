import java.util.Random;

public class p35RandomNodeOption7 {
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
		
		public TreeNodeCTCI getIthNode(int i) {
				int leftSize = left == null ? 0 : left.size();
				if(i < leftSize) return left.getIthNode(i);
				else if (i == leftSize) return this;
				else return right.getIthNode(i - (leftSize + 1));
		}
		
		
	}
	
	class TreeCTCI {
		
		
		TreeNodeCTCI root = null;
		
		public int size() {
			return root != null ? 0 : root.size();
		}
		
		public void insertInOrder(int value) {
			if(root == null) root = new TreeNodeCTCI(value);
			else root.insertInOrder(value);
		}
		
		public TreeNodeCTCI getRandomNode() {
			if(root == null) return null;
			Random random = new Random();
			int i = random.nextInt(size());
			return root.getIthNode(i);
		}
		
		
	}
}
