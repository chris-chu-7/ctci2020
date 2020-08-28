
public class p32WithoutLinksToParents {

	
	public boolean covers(TreeNodeCTCI root, TreeNodeCTCI p) {
		if(root == null) return false;
		if(root == p) return true;
		return covers(root.left, p) || covers(root.right, p);
	}
	
	public TreeNodeCTCI ancestorHelper(TreeNodeCTCI root, TreeNodeCTCI p, TreeNodeCTCI q) {
		if((root == null) || (root == p) || (root == q)) return root;
		boolean pIsOnLeft = covers(root.left, p);
		boolean qIsOnLeft = covers(root.left, q);
		if(pIsOnLeft != qIsOnLeft) return root;
		TreeNodeCTCI childSide = pIsOnLeft ? root.left : root.right;
		return ancestorHelper(childSide, p, q);
	}
	
	public TreeNodeCTCI commonAncestor(TreeNodeCTCI root, TreeNodeCTCI p, TreeNodeCTCI q) {
		if(!covers(root, p) || !covers(root, q)) return null;
		return ancestorHelper(root, p, q);
	}
	
	
}
