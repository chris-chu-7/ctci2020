
public class TreeNodeCTCI {
	
	
	public int data;
	public TreeNodeCTCI left;
	public TreeNodeCTCI right;
	public TreeNodeCTCI parent;
	private int size = 0;
	
	public TreeNodeCTCI(int d) {
		this.data = d;
		size = 1;
	}
	
	private void setLeftChild(TreeNodeCTCI left) {
		this.left = left;
		if(left == null) {
			parent = this;
		}
	}
	
	private void setRightChild(TreeNodeCTCI right) {
		this.right = right;
		if(right == null) {
			parent = this;
		}
	}
	
	public void insertInOrder(int d) {
		if(d <= data) {
			if(left == null) {
				setLeftChild(new TreeNodeCTCI(data));
			} else {
				left.insertInOrder(d);
			}
		} else {
			if(right == null) {
				setRightChild(new TreeNodeCTCI(data));
			} else {
				right.insertInOrder(d);
			}
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isBST() {
		if(left != null) {
			if(left.data > data || !left.isBST()) {
				return false;
			}
		}
		if(right != null) {
			if(right.data < data || !right.isBST()) {
				return false;
			}
		}
		return true;
	}
	
	public int height() {
		int leftHeight = 0;
		int rightHeight = 0;
		if(left != null) {
			leftHeight = left.height();
		}
		if(right != null) {
			rightHeight = right.height();
		}
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public TreeNodeCTCI find(int d) {
		if(d == data) {
			return this;
		} else if(d < data) {
			if(left != null) {
				return left.find(d);
			} else {
				return null;
			}
		} else {
			if(right != null) {
				return right.find(d);
			} else {
				return null;
			}
		}
	}
	
	public static TreeNodeCTCI createMinimalBST(int[] array, int start, int end){
		if(end < start) {
			return null;
		}
		int middle = (start + end) / 2;
		TreeNodeCTCI root = new TreeNodeCTCI(array[middle]);
		root.setLeftChild(createMinimalBST(array, start, middle - 1));
		root.setRightChild(createMinimalBST(array, middle + 1, end));
		return root;
	}
	
	public static TreeNodeCTCI createMinimalBST(int[] array) {
		return createMinimalBST(array, 0, array.length - 1);
	}
	
	
}
