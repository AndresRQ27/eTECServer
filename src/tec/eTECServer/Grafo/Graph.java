package tec.eTECServer.Grafo;

import java.util.List;
/**
 * Created by andre on 28/11/2016.
 * Project: TEC
 * Using IntelliJ
 */
class Graph {
	private final List<Vertex> vertexes;
	private final List<Edge> edges;
	
	public Graph(List<Vertex> vertexes, List<Edge> edges) {
		this.vertexes = vertexes;
		this.edges = edges;
	}
	
	public List<Vertex> getVertexes() {
		return vertexes;
	}
	
	public List<Edge> getEdges() {
		return edges;
	}
	
}
