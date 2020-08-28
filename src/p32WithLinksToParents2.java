
public class p32WithLinksToParents2 {

	
	public TreeNodeCTCI getSibling(TreeNodeCTCI node) {
		if(node == null || node.parent == null) return null;
		TreeNodeCTCI parent = node.parent;
		return parent.left == node ? parent.right : parent.left;
	}
	
	public boolean covers(TreeNodeCTCI root, TreeNodeCTCI p) {
		if(root == null) return false;
		if(root == p) return true;
		return covers(root.left, p) || covers(root.right, p);
	}
	
	public TreeNodeCTCI commonAncestor(TreeNodeCTCI root, TreeNodeCTCI p, TreeNodeCTCI q) {
		if(!covers(root, p) || !covers(root, q)) return null;
		else if(covers(p, q)) return p;
		else if(covers(q, p)) return q;
		TreeNodeCTCI sibling = getSibling(p);
		TreeNodeCTCI parent = p.parent;
		while(!covers(sibling, q)) {
			sibling = getSibling(parent);
			parent = parent.parent;
		}
		return parent;
	}
	
	
}
