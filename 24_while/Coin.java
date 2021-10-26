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
POST-v0 MODS
  -Changed assignValue to include "half dollar"
  -Changed reset to reset flipCtr, headsCtr, and tailsCtr in addition to value and bias
  -Changed flip to show tails if the random number is >= to the bias, as opposed to <= to the bias
*/

public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
    headsCtr = 0;
    tailsCtr = 0;
    upFace = "heads";
    bias = 0.5;
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    name = s;
    headsCtr = 0;
    tailsCtr = 0;
    upFace = "heads";
    bias = 0.5;
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    name = s;
    upFace = nowFace;
    headsCtr = 0;
    tailsCtr = 0;
    upFace = "heads";
    bias = 0.5;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return this.upFace;
  }

  public int getFlipCtr() {
    return this.flipCtr;
  }

  public double getValue() {
    return this.value;
  }

  public int getHeadsCtr() {
    return this.headsCtr;
  }

  public int getTailsCtr() {
    return this.tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
    if (s.equals("penny")) {
        value = 0.01;
    }
    else if (s.equals("nickel")) {
        value = 0.05;
    }
    else if (s.equals("dime")) {
        value = 0.1;
    }
    else if (s.equals("quarter")) {
        value = 0.25;
    }
    else if (s.equals("half dollar")) {
    	value = 0.5;
    }
    else if (s.equals("dollar")) {
        value = 1.00;
    }
    else {
        System.out.println("'tis not a coin");
    }
    return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    flipCtr = 0;
    tailsCtr = 0;
    headsCtr = 0;
    upFace = s;
    bias = d;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    flipCtr = flipCtr + 1;
    double flipRand = Math.random();
    if (flipRand >= bias) {
        tailsCtr = tailsCtr + 1;
        upFace = "tails";
        return "tails";
    }
    else {
        headsCtr = headsCtr + 1;
        upFace = "heads";
        return "heads";
    }
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
      return getUpFace().equals(other.getUpFace());
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    //OVERWRITING native .toString
    return name + " -- " + upFace;
  }

}//end class
