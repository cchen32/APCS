//Corina Chen
//APCS
//HW13: Where do BigSibs Come From?
//2021-10-06

/*
DISCO:
There's no need for richard.setHelloMsg("Word up") but there is a need to
contain "word up" when declaring new BigSib.
*/

/*
QCC:
One of my errors say "Non-static variable cannot be used in a static context.
What exactly is static and what is it used for?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet
