// TNPG TinPig: Josiah Moltz and Corina Chen
// APCS pd06
// HW24 -- Get It While You Can / While Loops / Updating Coin.java and running it a bunch of times with a while loop
// 2021-10-25
// Time Spent: 1 hour (60 minutes)

/*
DISCO
  -this() (and this) is NOT static
  -accessors allows us to return PRIVATE variables, because they (the methods) are PUBLIC
  -System.out.println(tinPig.equals(new Coin("quarter"))); returns true ~50% of the time
  -printing an object in java is equivalent to printing object.toString()
  -If .toString is overloaded, java will use the OVERLOADED method instead of its native .toString
  -Not all new className() are equal (even if nothing about them is changed post-creation)
  -MATCHES MEANS TIMES THE UPFACE WAS EQUAL... this caused us a bit of... panic.
QCC
  -What does it mean "this is inherited"? We could NOT runn tinPig.this, or tinPig.this()
   java said tinPig.this couldn't be found, and tinPig.this() needed a ')' in place of '()'
  -Why can't java find the symbol Driver in class Driver?
  -WHAT IS
    ```
    Driver.java:34: error: as of release 8, 'this' is allowed as the parameter name for the receiver type only
    Driver pinTig = new this();
                        ^
      which has to be the first parameter, and cannot be a lambda parameter
    ```
    ???????????????????????
*/

public class Driver {

  public static void main( String[] args ) {
    Coin tinPig = new Coin("quarter");
    Coin intIgp = new Coin("quarter");

    int matches = 0;  //tells us how many matches between tinPig and intIgp occur

    int x = 70000; // minimum number of heads (should be >= to 65536)
    int y = 70000; // minimum number of matches

  	while (matches < y || matches % 2005 != 0 || (tinPig.getHeadsCtr() + intIgp.getHeadsCtr()) < x) {
      //Used De Morgans Law (sorry for the nerdy terminology) to get the above statement since while loops only exit on FALSE, or NOT TRUE
  		tinPig.flip();
      intIgp.flip();
      if (tinPig.equals(intIgp)) {matches += 1;}
    }

  	System.out.println("Heads tinPig: " + tinPig.getHeadsCtr());
  	System.out.println("Tails tinPig: " + tinPig.getTailsCtr());
    System.out.println("Heads intIgp: " + intIgp.getHeadsCtr());
    System.out.println("Tails intIgp: " + intIgp.getTailsCtr());
    System.out.println("Matches: " + matches);
  	System.out.println("Flips: " + tinPig.getFlipCtr());

    //TESTING .equals()
    //--------------------------------------------------------
    // Coin ntiGpi = new Coin("quarter");
    // ntiGpi.reset("heads", 0.5);
    // tinPig.reset("heads", 0.5);
    // System.out.println(ntiGpi);
    // System.out.println(tinPig);
    // System.out.println(tinPig.equals(ntiGpi));
    // ntiGpi.reset("tails", 0.5);
    // tinPig.reset("tails", 0.5);
    // System.out.println(ntiGpi);
    // System.out.println(tinPig);
    // System.out.println(tinPig.equals(ntiGpi));
    // ntiGpi.reset("tails", 0.5);
    // tinPig.reset("heads", 0.5);
    // System.out.println(ntiGpi);
    // System.out.println(tinPig);
    // System.out.println(tinPig.equals(ntiGpi));

    //NUCLEAR TESTING ZONE (watch for flying debris)
    //--------------------------------------------------------
    //Driver pinTig = new Driver();
    //System.out.println(pinTig);
    //System.out.println(pinTig.equals(new Driver()));
    //System.out.println(new Driver());
    //System.out.println(tinPig.equals(new Coin("quarter")));
    //System.out.println(tinPig);

  }//end main()

}//end class
