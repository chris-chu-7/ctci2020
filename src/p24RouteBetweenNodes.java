import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedList;


/*Given a directed graph and two nodes, design an algorithm
 * to find out whether there is a route from S to E*/
public class p24RouteBetweenNodes {
	
	
	
	enum State {UnVisited, Visited, Visiting;}
	
	class Node{
		public String name;
		public ArrayList<Node> adjacentNodes;
		public State state;
		public Node(String name) {
			this.name = name;
			this.adjacentNodes = new ArrayList<Node>();
		}
	}

	class Graph{
		private HashMap<String, ArrayList<Node>> adjacencyList;
		public Graph() {
			adjacencyList = new HashMap<String, ArrayList<Node>>();
		}
		public void addNode(String name, String parent) {
			if(adjacencyList.containsKey(name)) return;
			adjacencyList.put(name, new ArrayList<Node>());
			ArrayList<Node> key = adjacencyList.get(parent);
			Iterator it = adjacencyList.entrySet().iterator();
			key.add(new Node(name));
		}
		public HashMap<String, ArrayList<Node>> getNodes(){
			return adjacencyList;
		}
		
	}
	
	
	public boolean search(Graph g, Node start, Node end) {
		if(start == end) return true;
		LinkedList<Node> q = new LinkedList<Node>();
		for (Map.Entry<String, ArrayList<Node>> v : g.getNodes().entrySet()) {
			for(int i = 0; i < v.getValue().size(); i++) {
				v.getValue().get(i).state = State.UnVisited;
			}
		}
		start.state = State.Visiting;
		q.add(start);
		Node u;
		while(!q.isEmpty()) {
			u = q.removeFirst();
			if(u != null) {
				for(int j = 0; j < u.adjacentNodes.size(); j++) {
					Node v = u.adjacentNodes.get(j);
					if(v.state == State.UnVisited) {
						if(v == end) return true;
						else {
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
				u.state = State.Visited;
			}
		}	
		return false;
	}
	
	
}
