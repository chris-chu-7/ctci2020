import java.util.LinkedList;
public class p24Question {
	
	
	public enum State{
		Unvisited, Visited, Visiting;
	}
	
	public static boolean search(p24Graph g, p24Node start, p24Node end) {
		LinkedList<p24Node> q = new LinkedList<p24Node>();
		for(p24Node u: g.getNodes()) {
			u.state = State.Unvisited;
		}
		start.state = State.Visiting;
		q.add(start);
		p24Node u;
		while(!q.isEmpty()) {
			u = q.removeFirst();
			if(u != null) {
				for(p24Node v: u.getAdjacent()) {
					if(v.state == State.Unvisited) {
						if(v == end) {
							return true;
						} else {
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
	
	public static p24Graph createNewGraph() {
		p24Graph g = new p24Graph();
		p24Node[] temp = new p24Node[6];
		temp[0] = new p24Node("a", 3);
		temp[1] = new p24Node("b", 0);
		temp[2] = new p24Node("c", 0);
		temp[3] = new p24Node("d", 1);
		temp[4] = new p24Node("e", 1);
		temp[5] = new p24Node("f", 0);
		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		for(int i = 0; i < temp.length; i++) {
			g.addNode(temp[i]);
		}
		return g;				
	}
	
	public static void main(String[] args) {
		p24Graph g = createNewGraph();
		p24Node[] n = g.getNodes();
		p24Node start;
		p24Node end;
		for(int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5; j++) {
				start = n[i];
				end = n[j];
				System.out.println("Point from " + i + " to " + j + ": " + search(g, start, end));
			}
		}
		
	}

	
}
 