
public class p32WithLinksToParents {
	
	
	public int depth(TreeNodeCTCI node) {
		int depth = 0;
		while(node != null) {
			node = node.parent;
			depth++;
		}
		return depth;
	}
	
	public TreeNodeCTCI goUpBy(TreeNodeCTCI node, int delta) {
		while(delta > 0 && node != null) {
			node = node.parent;
			delta--;
		}
		return node;
	}
	
	public TreeNodeCTCI commonAncestor(TreeNodeCTCI p, TreeNodeCTCI q) {
		int delta = depth(p) - depth(q);
		TreeNodeCTCI first = delta > 0 ? q : p;
		TreeNodeCTCI second = delta > 0 ? p : q;
		second = goUpBy(second, delta);
		while(first != second && first != null && second != null) {
			first = first.parent;
			second = second.parent;
		}
		return (first == null || second == null) ? null : first;
	}
	
	
}
