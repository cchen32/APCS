//Corina Chen
//APCS
//HW12: On Elder Individuality and the Elimination of Radio Fuzz
//2021-10-05

/*
DISCO:
Instance variables can be declared like a normal variable.
*/

/*
QCC:
Why does my main method not run?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet
