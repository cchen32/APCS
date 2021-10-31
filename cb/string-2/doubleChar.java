/*
Given a string, return a string where for every char in the original, there are
two chars.
*/

public class doubleChar {
    public static String doubleChar(String str) {
      String dble = "";
      for ( int i = 0; i < str.length(); i++ ) {
        dble = dble + str.substring(i, i+1) + str.substring(i, i+1);
      }
      return dble;
  }
  public static void main(String[] args) {
    System.out.println(doubleChar("The")); //→"TThhee"
    System.out.println(doubleChar("AAbb")); //→"AAAAbbbb"
    System.out.println(doubleChar("Hi-There")); //→"HHii--TThheerree"
    System.out.println(doubleChar("!!")); //→"!!!!"
    System.out.println(doubleChar("")); //→""
    System.out.println(doubleChar("a")); //→"aa"
    System.out.println(doubleChar(".")); //→".."
    System.out.println(doubleChar("aa")); //→"aaaa"
    System.out.println(doubleChar("Word")); //→"WWoorrdd"
  }
}
