import java.util.ArrayList;

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
	
	public City(String name, ArrayList<Distance> distances){
		this.name = name;
		this.distances = distances;
	}
	
	public void addDistance(Distance distance){
		distances.add(distance);
	}
	
}