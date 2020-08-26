import java.util.ArrayList;
import java.util.HashMap; 
import java.util.Stack;

public class p29BuildOrder2 {

	//Additionally, can use DFS to find the build path
	//The terminating nodes are the last projects that can become built. 
	//DFS(b) 
	//	DFS(h)
	//		build order ..., h
	//	DFS(a) 
	//		DFS(e) 
	//			build order = ..., e, h
	//	DFS(e) -> return 
	//			build order ..., b, a, e, h
	//	...
	//...
	//We know that A's children need to appear after a
	//We also notice that everything has to appear after b, after completing all of b's children,
	//return everything to the front. 
	//Sometimes and unfortunately often nodes will get into cycles. 
	//No possible build order if there is a cycle. Need to also have a state that you've build this node,
	//such that it does not happen again.
	//3 states, COMPLETED, PARTIAL, BLANK. 
	
	public static class Project {
		
		
		public enum State{COMPLETE, PARTIAL, BLANK};
		public ArrayList<Project> children = new ArrayList<Project>();
		public HashMap<String, Project> map = new HashMap<String, Project>(); 
		private String name; 
		private State state = State.BLANK; 
		
		public Project(String n) {
			name = n;
		}
		
		public String getName() {
			return name;
		}
		
		public void addNeighbor(Project node) {
			if(!map.containsKey(node.getName())) {
				children.add(node);
				map.put(node.getName(), node);
			}
		}
		
		public State getState() {
			return state; 
		}
		
		public void setState(State st) {
			state = st;
		}
		
		public ArrayList<Project> getChildren(){
			return children;
		}
		
		
	}
	
	public class Graph{
		
		
		private ArrayList<Project> nodes = new ArrayList<Project>();
		private HashMap<String, Project> map = new HashMap<String, Project>(); 
		
		public Project getOrCreateNode(String name) {
			if(!map.containsKey(name)) {
				Project node = new Project(name);
				nodes.add(node);
				map.put(node.getName(), node);
			}
			return map.get(name);
		}
		
		public void addEdge(String startName, String endName) {
			Project start = getOrCreateNode(startName);
			Project end = getOrCreateNode(endName);
			start.addNeighbor(end);
		}
		
		public ArrayList<Project> getNodes() {
			return nodes; 
		}
		
		
	}
	
	
	public static Graph buildGraph(String[] projects, String[][] dependencies) {
		Graph graph = null;
		for(String[] dependency : dependencies) {
			String first = dependency[0];
			String second = dependency[1];
			graph.addEdge(first, second);
		}
		return graph;
	}
	
	public static boolean doDFS(Project project, Stack<Project> stack) {
		if(project.getState() == project.state.PARTIAL) return false;
		if(project.getState() == project.state.BLANK) {
			project.setState(project.state.PARTIAL);
			ArrayList<Project> children = project.getChildren();
			for(Project child: children) {
				if(!doDFS(child, stack)) {
					return false;
				}
			}
			project.setState(Project.State.COMPLETE);
			stack.push(project);
		}
		return true;
	}
	
	public static Stack<Project> orderProjects(ArrayList<Project> projects){
		Stack<Project> stack = new Stack<Project>();
		for(Project project : projects) {
			if(project.getState() == project.state.BLANK) {
				if(!doDFS(project, stack)) return null;
			}
		}
		return stack;
	}
	
	public static Stack<Project> findBuildOrder(String[] projects, String[][] dependencies){
		Graph graph = buildGraph(projects, dependencies);
		return orderProjects(graph.getNodes());
	}
	


	
}
