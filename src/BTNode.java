//Aaron McGhie
public class BTNode {
	public City city;
	public BTNode leftChild;
	public BTNode rightChild;
	
	public BTNode(City city) {
		this.city = city;
	}
	
	public boolean leadsToDestinationBT(City parentCity, City destination) {
		return(leadsToDestination(parentCity, destination));
	}
	
	protected boolean leadsToDestination(City parentCity, City destination) {
		if(city.checkForConnectingCity(destination)) return true;
		else for(int i = 0; i<city.distances.size(); i++) {
			City currentCity = city.distances.get(i).getCity();
			if (currentCity == city || currentCity == parentCity) continue;
			else if(leadsToDestination(currentCity, destination)) return true;
		}
		return false;
	}
}
