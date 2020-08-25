
public class p25MinimalTree {
	
	
	public static void testMinTree() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
		TreeNodeCTCI tree = TreeNodeCTCI.createMinimalBST(array);
		System.out.println("Root? " + tree.data);
		System.out.println("Created BST? " + tree.isBST());
		System.out.println("Height? " + tree.height());
	}

	public static void main(String[] args) {
		testMinTree();
	}

	
}
