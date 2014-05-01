/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */
public class Cites {
    public void loadCities()
	{
		// This should load up the required cities into our graph
		this.cities = new Vertex[14];

		this.cities[0] = new Vertex<String>("SEA");
		this.cities[1] = new Vertex<String>("SFR");
		this.cities[2] = new Vertex<String>("LA");
		this.cities[3] = new Vertex<String>("LV");
		this.cities[4] = new Vertex<String>("PHO");
		this.cities[5] = new Vertex<String>("OKC");
		this.cities[6] = new Vertex<String>("DAL");
		this.cities[7] = new Vertex<String>("MIN");
		this.cities[8] = new Vertex<String>("MIL");
		this.cities[9] = new Vertex<String>("CHI");
		this.cities[10] = new Vertex<String>("NOR");
		this.cities[11] = new Vertex<String>("NYC");
		this.cities[12] = new Vertex<String>("WDC");
		this.cities[13] = new Vertex<String>("MIA");

		this.graph = new WeightedAdjMatrixGraph<>();

		for (Vertex<String> city : this.cities)
		{
			this.graph.addVertex(city);
		}

		this.graph.addEdge(this.cities[0], 808, this.cities[1]);
		this.graph.addEdge(this.cities[0], 2060, this.cities[9]);
		this.graph.addEdge(this.cities[1], 414, this.cities[2]);
		this.graph.addEdge(this.cities[1], 2257, this.cities[8]);
		this.graph.addEdge(this.cities[2], 272, this.cities[3]);
		this.graph.addEdge(this.cities[2], 1440, this.cities[6]);
		this.graph.addEdge(this.cities[3], 1780, this.cities[9]);
		this.graph.addEdge(this.cities[4], 1771, this.cities[8]);
		this.graph.addEdge(this.cities[5], 792, this.cities[7]);
		this.graph.addEdge(this.cities[6], 949, this.cities[7]);
		this.graph.addEdge(this.cities[6], 571, this.cities[10]);
		this.graph.addEdge(this.cities[6], 1614, this.cities[11]);
		this.graph.addEdge(this.cities[7], 1217, this.cities[11]);
		this.graph.addEdge(this.cities[8], 811, this.cities[12]);
		this.graph.addEdge(this.cities[9], 948, this.cities[10]);
		this.graph.addEdge(this.cities[9], 1423, this.cities[13]);
		this.graph.addEdge(this.cities[11], 237, this.cities[12]);

		this.connectionGraph = new WeightedAdjMatrixGraph();
		for (Vertex<String> city : this.cities)
		{
			this.connectionGraph.addVertex(city);
		}
		this.connectionGraph.addEdge(this.cities[0], this.cities[1]);
		this.connectionGraph.addEdge(this.cities[0], this.cities[9]);
		this.connectionGraph.addEdge(this.cities[1], this.cities[2]);
		this.connectionGraph.addEdge(this.cities[1], this.cities[8]);
		this.connectionGraph.addEdge(this.cities[2], this.cities[3]);
		this.connectionGraph.addEdge(this.cities[2], this.cities[6]);
		this.connectionGraph.addEdge(this.cities[3], this.cities[9]);
		this.connectionGraph.addEdge(this.cities[4], this.cities[8]);
		this.connectionGraph.addEdge(this.cities[5], this.cities[7]);
		this.connectionGraph.addEdge(this.cities[6], this.cities[7]);
		this.connectionGraph.addEdge(this.cities[6], this.cities[10]);
		this.connectionGraph.addEdge(this.cities[6], this.cities[11]);
		this.connectionGraph.addEdge(this.cities[7], this.cities[11]);
		this.connectionGraph.addEdge(this.cities[8], this.cities[12]);
		this.connectionGraph.addEdge(this.cities[9], this.cities[10]);
		this.connectionGraph.addEdge(this.cities[9], this.cities[13]);
		this.connectionGraph.addEdge(this.cities[11], this.cities[12]);

	}

    
}
