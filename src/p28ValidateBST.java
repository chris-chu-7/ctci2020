
public class p28ValidateBST {
	
	
	int index = 0; 
	
	public void copyBST1(TreeNodeCTCI root, int[] array) {
		if(root == null) return;
		copyBST1(root.left, array);
		array[index] = root.data;
		index++;
		copyBST1(root.right, array);
	}
	
	public boolean checkBST1(TreeNodeCTCI root) {
		int[] array = new int[root.size()];
		copyBST1(root, array);
		for(int i = 0; i < array.length; i++) {
			if(array[i] <= array[i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	 public boolean checkBST2(TreeNodeCTCI n, Integer min, Integer max) {
		 if(n == null) {
			 return true;
		 }
		 if((min != null && n.data <= min)) return false;
		 if(max != null && n.data > max) return false;
		 if(!checkBST2(n.left, min, n.data) || !checkBST2(n.right, n.data, max)) return false;
		 return true;
	 }
	
	
}
