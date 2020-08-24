

public class BinaryTreeNode {

	
	public int name;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int value) {
		this.name = value;
	}
	
	public BinaryTreeNode add(BinaryTreeNode node, int name) {
		if(node == null) return new BinaryTreeNode(name);
		BinaryTreeNode pointer = node;
		while(true) {
			if(name < pointer.name) {
				if(pointer.left != null) {
					pointer = pointer.left;
				}
				else {
					pointer.left = new BinaryTreeNode(name);
					break;
				}
			} 
			else {
				if(pointer.right != null) {
					pointer = pointer.right;
				}
				else {
					pointer.right = new BinaryTreeNode(name);
					break;
				}
			}
		}
		return pointer;
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
		node.add(node, 4);
		node.add(node, 10);
		node.add(node, 20);
		node.add(node, 2);
		node.add(node, 6);
		
		System.out.println("Traversing...");
		System.out.println();
		System.out.println();
		System.out.println("In-order: ");
		System.out.println();
		node.inOrderTraversal(node);
		System.out.println();
		System.out.println("Pre-order: ");
		System.out.println();
		node.preOrderTraversal(node);
		System.out.println();
		System.out.println("Post-order: ");
		System.out.println();
		node.postOrderTraversal(node);
		
	}
	
	
}
