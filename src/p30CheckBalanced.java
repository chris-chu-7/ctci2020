
public class p30CheckBalanced {
	
	
	public int getHeight(TreeNodeCTCI root) {
		if(root == null) return -1; 
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
	
	public boolean isBalanced(TreeNodeCTCI root) {
		if(root == null) return true; 
		int heightDifference = getHeight(root.left) - getHeight(root.right);
		if(Math.abs(heightDifference) > 1) return false; 
		else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}
	

}
