public Class Distance {
   private length;
   private connectingCity;
   
   public Distance(int length, City connectingCity) {
      this.length = length;
      this.connectingCity = connectingCity;
   }
   
   public void setLength(int length) {
      this.length = length;
   }
   
   public int getLength() {
      return length();
   }
   
   public void setCity(City connectingCity) {
      this.connectingCity = connectingCity;
   }
   
   public void getCity(City connectingCity) {
      return connectingCity;
   }
}