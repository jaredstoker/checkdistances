import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Xcetra
 *
 */
public class City {
	private String name;
	private ArrayList<Distance> distances;
	private ArrayList<City> connectedCities;
	
	public City(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addDistance(Distance distance){
		distances.add(distance);
	}
	
	public void addConnectedCity(City city){
		connectedCities.add(city);
	}
	
	public void getConnectedCity(){
		for(int i = 0; i < connectedCities.size(); i++){
			City city = connectedCities.get(i);
			JOptionPane.showInputDialog(city.getName() + " is connected to " + this.name);
		}
	}
}