
public class p34CheckSubtreeSimple {

	
	public void getOrderString(TreeNodeCTCI node, StringBuilder sb) {
		if(node == null) {
			sb.append("X");
			return;
		}
		sb.append(node.data + " ");
		getOrderString(node.left, sb);
		getOrderString(node.right, sb);
	}
	
	public boolean containsTree(TreeNodeCTCI t1, TreeNodeCTCI t2) {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		getOrderString(t1, s1);
		getOrderString(t2, s2);
		return s1.indexOf(s2.toString()) != -1;
	}
	
	
}
