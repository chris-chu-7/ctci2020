import java.util.ArrayList;
import java.util.LinkedList;

public class p26ListOfDepths {
	

	public void createLevelLinkedList1(TreeNodeCTCI root, ArrayList<LinkedList<TreeNodeCTCI>> lists, int level) {
		if(root == null) {
			return;
		}
		
		LinkedList<TreeNodeCTCI> list = null;
		if(lists.size() == level) {
			list = new LinkedList<TreeNodeCTCI>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList1(root.left, lists, level + 1);
		createLevelLinkedList1(root.right, lists, level + 1);
	}
	
	public ArrayList<LinkedList<TreeNodeCTCI>> createLevelLinkedList1(TreeNodeCTCI root){
		ArrayList<LinkedList<TreeNodeCTCI>> lists = new ArrayList<LinkedList<TreeNodeCTCI>>();
		createLevelLinkedList1(root, lists, 0);
		return lists;
	}
	
	public ArrayList<LinkedList<TreeNodeCTCI>> createLevelLinkedList2(TreeNodeCTCI root){
		ArrayList<LinkedList<TreeNodeCTCI>> result = new ArrayList<LinkedList<TreeNodeCTCI>>();
		LinkedList<TreeNodeCTCI> current = new LinkedList<TreeNodeCTCI>();
		if(root != null) {
			current.add(root);
		}
		while(current.size() > 0) {
			result.add(current);
			LinkedList<TreeNodeCTCI> parents = current;
			current = new LinkedList<TreeNodeCTCI>();
			for(TreeNodeCTCI parent: parents) {
				current.add(parent.left);
				current.add(parent.right);
			}
		}
		return result;
	}
 	
	
}
