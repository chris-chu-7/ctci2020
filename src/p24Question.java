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

	
}
 