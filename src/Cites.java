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

		this.cities[0] = new city<String>("SEA");
		this.cities[1] = new city<String>("SFR");
		this.cities[2] = new city<String>("LA");
		this.cities[3] = new city<String>("LV");
		this.cities[4] = new city<String>("PHO");
		this.cities[5] = new city<String>("OKC");
		this.cities[6] = new city<String>("DAL");
		this.cities[7] = new city<String>("MIN");
		this.cities[8] = new city<String>("MIL");
		this.cities[9] = new city<String>("CHI");
		this.cities[10] = new city<String>("NOR");
		this.cities[11] = new city<String>("NYC");
		this.cities[12] = new city<String>("WDC");
		this.cities[13] = new city<String>("MIA");

		this.graph = new WeightedAdjMatrixDistance<>();

		for (city<String> city : this.cities)
		{
			this.graph.addcity(city);
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

		this.connectionDistance = new WeightedAdjMatrixDistance();
		for (city<String> city : this.cities)
		{
			this.connectionDistance.addVertex(city);
		}
		this.connectionDistance.addEdge(this.cities[0], this.cities[1]);
		this.connectionDistance.addEdge(this.cities[0], this.cities[9]);
		this.connectionDistance.addEdge(this.cities[1], this.cities[2]);
		this.connectionDistance.addEdge(this.cities[1], this.cities[8]);
		this.connectionDistance.addEdge(this.cities[2], this.cities[3]);
		this.connectionDistance.addEdge(this.cities[2], this.cities[6]);
		this.connectionDistance.addEdge(this.cities[3], this.cities[9]);
		this.connectionDistance.addEdge(this.cities[4], this.cities[8]);
		this.connectionDistance.addEdge(this.cities[5], this.cities[7]);
		this.connectionDistance.addEdge(this.cities[6], this.cities[7]);
		this.connectionDistance.addEdge(this.cities[6], this.cities[10]);
		this.connectionDistance.addEdge(this.cities[6], this.cities[11]);
		this.connectionDistance.addEdge(this.cities[7], this.cities[11]);
		this.connectionDistance.addEdge(this.cities[8], this.cities[12]);
		this.connectionDistance.addEdge(this.cities[9], this.cities[10]);
		this.connectionDistance.addEdge(this.cities[9], this.cities[13]);
		this.connectionDistance.addEdge(this.cities[11], this.cities[12]);

	}

    
}
