

public class BinaryTreeNode {

	
	public int name;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int value) {
		this.name = value;
	}
	
	public BinaryTreeNode add(int name) {
		if(this == null) return new BinaryTreeNode(name);
		BinaryTreeNode pointer = this;
		while(true) {
			if(name < this.name) {
				if(pointer.left != null) {
					System.out.println("Adding number to the left: " + name);
					pointer = pointer.left;
				}
				else {
					System.out.println("Adding number to the left: " + name);
					pointer.left = new BinaryTreeNode(name);
					break;
				}
			} 
			else {
				System.out.println(pointer.right);
				if(pointer.right != null) {
					System.out.println("Adding number to the right: " + name);
					pointer = pointer.right;
				}
				else {
					System.out.println("Adding number to the right: " + name);
					pointer.right = new BinaryTreeNode(name);
					break;
				}
			}
		}
		return left;
	}
	
	public void visit(BinaryTreeNode node) {
		System.out.println(node.name);
	}
	
	public void inOrderTraversal(BinaryTreeNode node) {
		if(node != null) {
			inOrderTraversal(node.left);
			visit(node);
			inOrderTraversal(node.right);
		}
	}
	
	public void preOrderTraversal(BinaryTreeNode node) {
		if(node != null) {
			visit(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(BinaryTreeNode node) {
		if(node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			visit(node);
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode node = new BinaryTreeNode(8);
		node.add(10);
		node.add(4);
		node.add(10);
		node.add(20);
		node.add(2);
		node.add(6);
		
		System.out.println(node.left.name);
		System.out.println("Traversing...");
		node.inOrderTraversal(node);
		System.out.println();
		node.preOrderTraversal(node);
		System.out.println();
		node.postOrderTraversal(node);
		
	}
	
	
}
