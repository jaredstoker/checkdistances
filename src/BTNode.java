//Aaron McGhie
public class BTNode {
	public City city;
	public BTNode leftChild;
	public BTNode rightChild;
	
	public BTNode(City city) {
		this.city = city;
	}
	
	public boolean leadsToDestinationBT(City parentCity, City destination) {
		return(leadsToDestination(parentCity, city, destination));
	}
	
	protected boolean leadsToDestination(City parentCity, City currentCity, City destination) {
		if(currentCity.checkForConnectingCity(destination)) return true;
		else for(int i = 0; i<currentCity.distances.size(); i++) {
			City tempCity = currentCity.distances.get(i).getCity();
			if (tempCity == city || tempCity == parentCity) continue;
			else if(leadsToDestination(currentCity, tempCity, destination)) return true;
		}
		return false;
	}
}
