// TNPG Tin Pig: Josiah Moltz and Corina Chen
// APCS pd06
// HW23 -- What Does Equality Look Like? / Pair Programming / Creating Coin.java and testing it in Driver.java
// 2021-10-24
// Time Spent: 0.7 hours (42 minutes)

/*

DISCO
* Null can be compared (bc it worked in our code and did not return errors!)
  (Even when it's not set to a certain value, it still ran)
* "this.<name>" help clears up name-space errors

QCC
* Does Java always initialize variables as null?
* Are there any other uses for "this.<name>"?

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
    return this.upFace; //????????????????????????????????
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
    name = s;
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
    if (flipRand <= bias) {
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
      return name + " -- " + upFace;
  }

}//end class
