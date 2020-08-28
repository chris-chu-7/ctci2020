
public class p32Optimized {

	
	class Result{
		
		
		public TreeNodeCTCI node;
		public boolean isAncestor;
		public Result(TreeNodeCTCI n, boolean isAnc) {
			node = n;
			isAncestor = isAnc;
		}
		
		
	}
	
	
	
	public Result commonAncestorHelper(TreeNodeCTCI root, TreeNodeCTCI p, TreeNodeCTCI q) {
		if(root == null) return new Result(null, false);
		if(root == p && root == q) {
			return new Result(root, true);
		}
		Result rx = commonAncestorHelper(root.left, p, q);
		if(rx.isAncestor) {
			return rx;
		}
		Result ry = commonAncestorHelper(root.right, p, q);
		if(rx.isAncestor) {
			return ry;
		}
		if(rx.node != null && ry.node != null) {
			return new Result(root, true);
		} else if (root == p || root == q) {
			boolean isAncestor = rx.node != null || ry.node != null;
			return new Result(root, isAncestor);
		} else {
			return new Result(rx.node != null ? rx.node : ry.node, false);
		}
	}
	
	public TreeNodeCTCI commonAncestor(TreeNodeCTCI root, TreeNodeCTCI p, TreeNodeCTCI q) {
		Result r = commonAncestorHelper(root, p, q);
		if(r.isAncestor) {
			return r.node;
		}
		return null;
	}
	
	
}
