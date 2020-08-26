
public class p27CheckBalanced {

	
	public int getHeight1(TreeNodeCTCI root) {
		if(root == null) return -1;
		return Math.max(getHeight1(root.left), getHeight1(root.right)) + 1;
	}
	
	public boolean isBalanced1(TreeNodeCTCI root) {
		if(root == null) return true;
		int heightDiff = Math.abs(getHeight1(root.left) - getHeight1(root.right));
		if(heightDiff > 1) {
			return false;
		} else {
			return isBalanced1(root.left) && isBalanced1(root.right);
		}
	}
	
	public int checkHeight2(TreeNodeCTCI root) {
		if(root == null) return -1;
		int leftHeight = checkHeight2(root.left);
		if(leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		int rightHeight = checkHeight2(root.right);
		if(rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		int heightDiff = Math.abs(leftHeight - rightHeight);
		if(heightDiff > 1) {
			return Integer.MIN_VALUE;
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}		
	}
	
	public boolean isBalanced2(TreeNodeCTCI root){
		return checkHeight2(root) != Integer.MIN_VALUE;
	}
	
	
}
