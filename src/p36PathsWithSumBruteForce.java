
public class p36PathsWithSumBruteForce {

	
	public int countPathsWithSumFromNode(TreeNodeCTCI node, int targetSum, int currentSum) {
		if(node == null) return 0;
		currentSum += node.data;
		int totalPaths = 0;
		if(currentSum == targetSum) totalPaths++;
		totalPaths += countPathsWithSumFromNode(node.left, targetSum, currentSum);
		totalPaths += countPathsWithSumFromNode(node.right, targetSum, currentSum);
		return totalPaths;
	}
	
	public int countPathsWithSum(TreeNodeCTCI root, int targetSum) {
		if(root == null) return 0;
		int pathsFromRoot = countPathsWithSumFromNode(root, targetSum, 0);
		int pathsFromLeft = countPathsWithSum(root.left, targetSum);
		int pathsFromRight = countPathsWithSum(root.right, targetSum);
		return pathsFromRoot + pathsFromLeft + pathsFromRight;
	}
	
	
}
