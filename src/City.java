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
	
	public City(String name){
		this.name = name;
	}
	
	public void addDistance(Distance distance){
		distances.add(distance);
	}
	
}