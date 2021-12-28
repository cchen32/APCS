/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if
each is smiling. We are in trouble if they are both smiling or if neither of
them is smiling. Return true if we are in trouble.
*/

public class monkeyTrouble {
  public static boolean monkeyTrouble ( boolean aSmile, boolean bSmile ) {
    if (aSmile && bSmile) {
      return true;
    }
    else if (!aSmile && !bSmile) {
      return true;
    }
    return false;
  }

  public static void main(String[] args){
    System.out.println(monkeyTrouble(true, true));
    System.out.println("...should return true.");

    System.out.println(monkeyTrouble(false, false));
    System.out.println("...should return true.");

    System.out.println(monkeyTrouble(true, false));
    System.out.println("...should return false.");
  }
}
