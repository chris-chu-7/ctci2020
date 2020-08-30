class Vertex:
    
    
    def __init__(self, n):
        self.name = n
        self.neighbors = list()
        
    def add_neighbor(self, v, weight):
        if v not in self.neighbors:
            self.neighbors.append((v, weight))
            self.neighbors.sort()
    
    
class Graph:
    
    
    vertices = {}
    
    def add_vertex(self, vertex):
        if isinstance(vertex, Vertex) and vertex.name not in self.vertices:
            self.vertices[vertex.name] = vertex
            return True
        else:
            return False
            
    def add_edge(self, u, v, weight = 0):
        if u in self.vertices and v in self.verices:
            self.vertices[u].add_neighbor(v, weight)
            self.vertices[v].add_neighbor(u, weight)
            return True
        else: 
            return False
        
    def print_graph(self):
        for key in sorted(list(self.vertices.keys())):
            print(keyy + str(self.vertices[key].neighbors))