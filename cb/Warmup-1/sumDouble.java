/*
Given two int values, return their sum. Unless the two values are the same,
then return double their sum.
*/

public class sumDouble {
  public static int sumDouble(int a, int b){
    if (a == b) {
      return a * 4;
    }
    return a + b;
  }

  public static void main(String[] args){
    System.out.println(sumDouble(1, 2));
    System.out.println("...should be 3");
    System.out.println(sumDouble(3, 2));
    System.out.println("...should be 5");
    System.out.println(sumDouble(2, 2));
    System.out.println("...should be 8");
  }
}
