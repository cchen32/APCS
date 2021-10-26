// TNPG TinPig: Josiah Moltz and Corina Chen
// APCS pd06
// HW24 -- Get It While You Can / While Loops / Updating Coin.java and running it a bunch of times with a while loop
// 2021-10-25
// Time Spent: .7 hours (42 minutes)

/*
DISCO
  -this() (and this) is NOT static
  -accessors allows us to return PRIVATE variables, because they (the methods) are PUBLIC
  -System.out.println(tinPig.equals(new Coin("quarter"))); returns true ~50% of the time
  -printing an object in java is equivalent to printing object.toString()
  -If .toString is overloaded, java will use the OVERLOADED method instead of its native .toString
  -.equals compares the .toString representations of objects (?)
  -Not all new className() are equal (even if nothing about them is changed post-creation)
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

	while (tinPig.getFlipCtr() < 65536 || tinPig.getFlipCtr() % 2005 != 0) {
    //Used De Morgan's law to go from !(flips > 65536 && flips % 2005 == 0) to the above
    //very nerdy sorry
		tinPig.flip();
	}
	System.out.println("Heads: " + tinPig.getHeadsCtr());
	System.out.println("Tails: " + tinPig.getTailsCtr());
	System.out.println("Flips: " + tinPig.getFlipCtr());

  //NUCLEAR TESTING ZONE (watch for flying debris)
  //--------------------------------------------------------
  //Driver pinTig = new Driver();
  //System.out.println(pinTig);
  //System.out.println(pinTig.equals(new Driver()));
  //System.out.println(new Driver());

  //System.out.println(tinPig.equals(new Coin("quarter")));
  //System.out.println(tinPig);
  //System.out.println(new Coin("quarter"));
  //System.out.println(tinPig.equals(new Coin("quarter")));
  //System.out.println(Driver);
  }//end main()

}//end class
