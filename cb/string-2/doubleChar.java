public class doubleCar {
    public String doubleChar(String str) {
      String dble = "";
      for ( int i = 0; i < str.length(); i++ ) {
        dble = dble + str.substring(i, i+1) + str.substring(i, i+1);
      }
      return dble;
  }
}
