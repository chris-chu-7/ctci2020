import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class GraphSearch {

	
	public GraphSearch() {
		
	}
	
	
	class Node {
		
		
		String name;
		List<Node> neighbors = new ArrayList<Node>();
		
		private Node(String name) {
			this.name = name;
		}
		
		private String getName() {
			return this.name;
		}
		
		private void addNeighbor(Node neighbor) {
			neighbors.add(neighbor);
		}
		
		private List<Node> getNeighbors(){
			return neighbors;
		}
		
		
		
	}
	
	private static Map<String, Node> nodes = new HashMap<String, Node>();

	public void addEdge(String nodeName1, String nodeName2) {
		Node node1 = nodes.get(nodeName1);
		if(node1 == null) {
			node1 = new Node(nodeName1);
		}
		Node node2 = nodes.get(nodeName2);
		if(node2 == null) {
			node2 = new Node(nodeName2);
		}
		node1.addNeighbor(node2);
		node2.addNeighbor(node1);
		nodes.put(nodeName1, node1);
		nodes.put(nodeName2, node2);
	}
	
	public List<Node> BFS(String rootName){
		List<Node> result = new ArrayList<Node>();
		List<Node> temp = new ArrayList<Node>();
		Set<String> visited = new HashSet<String>();
		Node root = nodes.get(rootName);
		temp.add(root);
		visited.add(rootName);
		while(temp.size() > 0) {
			Node currentNode = temp.get(0);
			List<Node> neighbors = currentNode.getNeighbors();
			for(int i = 0; i < neighbors.size(); i++) {
				Node neighbor = neighbors.get(i);
				if(visited.contains(neighbor.getName())) {
					continue;
				} else {
					temp.add(neighbor);
					visited.add(neighbor.getName());
				}
			}
			temp.remove(0);
			result.add(currentNode);
		}
		return result;
	}

	static Set<String> visited = new HashSet<String>();

	public static List<Node> DFS(String rootName) {
		List<Node> result = new ArrayList<Node>();
	    List<Node> temp = new ArrayList<Node>();
	    visited.add(rootName);
	    Node root = nodes.get(rootName);
	    result.add(root);
	    List<Node> neighbors = root.getNeighbors();
	    for(int i = 0; i < neighbors.size(); i++) {
	    	if(!visited.contains(root.name)) {
	    		DFS(nodes.get(i).getName());
	        }
	    }
	    return result;
	 } 
	
	
	
}
