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
	public ArrayList<Distance> distances;
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
	
	public boolean checkForConnectingCity(City connectingCity) {
		for(int i = 0; i<distances.size(); i++) {
			if (distances.get(i).getCity() == connectingCity) return true;
		}
		return false;
	}//Aaron McGhie
	
	public Distance getDistanceBySize(int nthSmallest) {
		ArrayList<Distance> tempList = new ArrayList();
		for(Distance d : distances) {
			tempList.add(d);
		}
		Distance currentDistance = tempList.get(0);
		int j = 0;
		do {
			for(Distance d : tempList) {
				if(currentDistance.getLength() > d.getLength()) currentDistance = d; 
			}
			if(j==nthSmallest) break;
			else {
				j++;
				for(int i = 0; i<tempList.size(); i++) if (currentDistance == tempList.get(i)) tempList.remove(i);
			}
		}
		while(j < nthSmallest);
		return currentDistance;
	}//Aaron McGhie
}