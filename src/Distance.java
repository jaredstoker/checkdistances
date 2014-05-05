//Aaron McGhie
public class Distance {
   private int length;
   private City connectingCity;
   
   public Distance(int length, City connectingCity) {
      this.length = length;
      this.connectingCity = connectingCity;
   }
   
   public void setLength(int length) {
      this.length = length;
   }
   
   public int getLength() {
      return length;
   }
   
   public void setCity(City connectingCity) {
      this.connectingCity = connectingCity;
   }
   
   public City getCity() {
      return connectingCity;
   }
}