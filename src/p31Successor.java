
public class p31Successor {
	
	public TreeNodeCTCI leftMostChild(TreeNodeCTCI n) {
		if(n == null) return null; 
		while(n.left != null) {
			n = n.left;
		}
		return n; 
	}
	
	public TreeNodeCTCI inOrderSucc(TreeNodeCTCI n) {
		if(n == null) return null; 
		if(n.right != null) return leftMostChild(n.right);
		else {
			TreeNodeCTCI q = n;
			TreeNodeCTCI x = q.parent;
			while(x != null && x.left != q) {
				q = x; 
				x = x.parent; 
			}
			return x;
		} 	
	}
	
	
}
