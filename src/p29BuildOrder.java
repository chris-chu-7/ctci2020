import java.util.ArrayList;
import java.util.HashMap;


public class p29BuildOrder {
	
	//first add the nodes with no incoming edges
	//removed outgoing edges from these roots.
	//Find the nodes with no dependences, add them the build order,
	//remove the outgoing edges, then repeat. 
	//If there are no nodes remaining but they all have dependences, there is no 
	//way to build the system, so return an error. 
	
	
	//Solution 1: topological sort algorithm 
	public class Project{
		
		
		private ArrayList<Project> children = new ArrayList<Project>();
		private HashMap<String, Project> map = new HashMap<String, Project>();
		private String name;
		private int dependencies = 0; 
		
		public Project(String n) {
			name = n;
		}
		
		public String getName() {
			return name;
		}
		
		public void addNeighbor(Project node) {
			children.add(node);
			map.put(node.getName(), node);
		}
		
		public void incrementDependences() {
			dependencies++; 
		}
		
		public void decrementDependencies() {
			dependencies--; 
		}
		
		public ArrayList<Project> getChildren(){
			return children;
		}
		
		public int getNumDependencies(){
			return dependencies;
		}
		
		
	}
	
	
	public class Graph {
		private ArrayList<Project> nodes = new ArrayList<Project>();
		private HashMap<String, Project> map = new HashMap<String, Project>(); 
		
		public Project getOrCreateNode(String name) {
			if(!map.containsKey(name)) {
				Project node = new Project(name);
				nodes.add(node);
				map.put(name, node);
			} 
			return map.get(name);
		}
		
		public void addEdge(String startName, String endName) {
			Project start = getOrCreateNode(startName);
			Project end = getOrCreateNode(endName);
			start.addNeighbor(end);
		}
		
		public ArrayList<Project> getNodes(){
			return nodes;
		}
		
		
	}
	
	
	public int addNonDependent(Project[] order, ArrayList<Project> projects, int offset) {
		for(Project project: projects) {
			if(project.getNumDependencies() == 0) {
				order[offset] = project;
				offset++;
			}
		}
		return offset; 
	}
	 
	public Project[] orderProjects(ArrayList<Project> projects) {
		Project[] order = new Project[projects.size()];
		int endOfList = addNonDependent(order, projects, 0);
		int toBeProcessed = 0;
		while(toBeProcessed < order.length) {
			Project current = order[toBeProcessed];
			if(current == null) return null; 
			ArrayList<Project> children = current.getChildren(); 
			for(Project child: children) {
				child.decrementDependencies();
			}
			endOfList = addNonDependent(order, children, endOfList);
			toBeProcessed++;
		}
		return order;
	}
	
	public Graph buildGraph(String[] projects, String[][] dependencies) {
		Graph graph = new Graph();
		for(String[] dependency: dependencies) {
			String from = dependency[0];
			String to = dependency[1];
			graph.addEdge(from, to);
		}
		return graph;
	}
	
	public Project[] findBuildOrder(String[] projects, String[][] dependencies) {
		Graph graph = buildGraph(projects, dependencies);
		return orderProjects(graph.getNodes());
	}
	
	
}
