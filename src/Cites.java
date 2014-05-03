/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
	import java.util.*;
/**
 *
 * @author Jeremy
 */
public class Cites {
	
	
	// Class:  City
	// Purpose: To represent a place in the world that you can fly from/to.    
	class City
	{
	    private final String City = null;
		private String name;        // The name of the City
	    private ArrayList<City> connectsWith;       // Which cities are connected to this one
		private City[] cities;
		private Object distance;

	    public City(String cityName)
	    {
	        name = cityName;
	        connectsWith = new ArrayList<City>();
	    }

	    // Method: addConnection
	    // Purpose: To note that you can catch a flight to the destination, from this city
	    // Passed:
	    //     destination - The City which you can fly to.
	    public  void addConnection(City destination)
	    {
	        if (destination != null && destination != this)
	            connectsWith.add(destination);
	    }

	    // Method:  getConnections
	    // Purpose: To retrieve a list of cities you can reach from this one.
	    // Note: You are given a clone, (to avoid a privacy leak), and can manipulate it however 
	    //    you like. E.g. you could delete elements.
	    public ArrayList<City> getConnections()
	    {
	        return (ArrayList<City>) connectsWith.clone();
	    }

	    public String getName()
	    {
	        return name;
	    }

	    public String toString()
	    {
	        return name;
	    }
	
    public void loadCities(){
		
     	
    	// This should load up the required cities into our graph
		this.cities = new City[14];

		this.cities[0] = new City("SEA");
		this.cities[1] = new City("SFR");
		this.cities[2] = new City("LA");
		this.cities[3] = new City("LV");
		this.cities[4] = new City("PHO");
		this.cities[5] = new City("OKC");
		this.cities[6] = new City("DAL");
		this.cities[7] = new City("MIN");
		this.cities[8] = new City("MIL");
		this.cities[9] = new City("CHI");
		this.cities[10] = new City("NOR");
		this.cities[11] = new City("NYC");
		this.cities[12] = new City("WDC");
		this.cities[13] = new City("MIA");

		for (City city : this.cities)
		{
			this.distance(City);
		}

		this.distance(this.cities[0], 808, this.cities[1]);
		this.distance(this.cities[0], 2060, this.cities[9]);
		this.distance(this.cities[1], 414, this.cities[2]);
		this.distance(this.cities[1], 2257, this.cities[8]);
		this.distance(this.cities[2], 272, this.cities[3]);
		this.distance(this.cities[2], 1440, this.cities[6]);
		this.distance(this.cities[3], 1780, this.cities[9]);
		this.distance(this.cities[4], 1771, this.cities[8]);
		this.distance(this.cities[5], 792, this.cities[7]);
		this.distance(this.cities[6], 949, this.cities[7]);
		this.distance(this.cities[6], 571, this.cities[10]);
		this.distance(this.cities[6], 1614, this.cities[11]);
		this.distance(this.cities[7], 1217, this.cities[11]);
		this.distance(this.cities[8], 811, this.cities[12]);
		this.distance(this.cities[9], 948, this.cities[10]);
		this.distance(this.cities[9], 1423, this.cities[13]);
		this.distance(this.cities[11], 237, this.cities[12]);

		//this.connectionDistance = new dis();
		//for (city<String> city : this.cities)
		//{
		//	this.connectionDistance.addVertex(city);
		//}
		this.connectionDistance(this.cities[0], this.cities[1]);
		this.connectionDistance(this.cities[0], this.cities[9]);
		this.connectionDistance(this.cities[1], this.cities[2]);
		this.connectionDistance(this.cities[1], this.cities[8]);
		this.connectionDistance(this.cities[2], this.cities[3]);
		this.connectionDistance(this.cities[2], this.cities[6]);
		this.connectionDistance(this.cities[3], this.cities[9]);
		this.connectionDistance(this.cities[4], this.cities[8]);
		this.connectionDistance(this.cities[5], this.cities[7]);
		this.connectionDistance(this.cities[6], this.cities[7]);
		this.connectionDistance(this.cities[6], this.cities[10]);
		this.connectionDistance(this.cities[6], this.cities[11]);
		this.connectionDistance(this.cities[7], this.cities[11]);
		this.connectionDistance(this.cities[8], this.cities[12]);
		this.connectionDistance(this.cities[9], this.cities[10]);
		this.connectionDistance(this.cities[9], this.cities[13]);
		this.connectionDistance(this.cities[11], this.cities[12]);

	}

	private void distance(City city2, int i, City city3) {
		// TODO Auto-generated method stub
		
	}

	private void distance(String city2) {
		// TODO Auto-generated method stub
		
	}

	private void connectionDistance(City city2, City city3) {
		// TODO Auto-generated method stub
		
	}


	}
    
}
