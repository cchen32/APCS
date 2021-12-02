// Corina Chen
// APCS pd6
// HW40 -- Be Rational
// 2021-12-1

/*
DISCOS
- There wasn't a need for "this" as brought up in the piazza post.

QCCS
- Something completely unrelated to the work, but why does DISCOS and QCCS turn
  two different shades of orange while uncommented?
*/

public class Rational {

  private int p; // Tis a denominator
  private int q; // Tis a numberator

  public Rational () {
    //Creates a rational with 0/1
    p = 0;
    q = 1;
  }

  public Rational ( int a, int b ) {
    //Creates a rational number of a/b unless b is equal to zero
    p = a;
    q = b;
    if ( b == 0 ) {
      System.out.println( "Denominator cannot be zero. It will take default value of one until you reconsider." );
      q = 1;
    }
  }

  //Returns a string representation of the rational number
  public String toString() {
    return p + "/" + q;
  }

  // Returns floating point approximation of the number using the most precise
  // floating point primitive
  public double floatValue() {
    return (double) p / q; //type-casting the int into a double
  }

  // Simply fraction multiplication
  public void multiply( Rational input ) {
    p *= input.p;
    q *= input.q;
  }

  // Dividing fractions is equal to muliplying by the inverse of the divisor
  public void divide ( Rational input ) {
    p *= input.q;
    q *= input.p;
  }

  public static void main ( String[] args ) {
    Rational r = new Rational(2,3); // Stores rational number 2/3
    Rational s = new Rational(1,2); // Stores rational number 1/2

    // Testing the toString
    System.out.println( r.toString() ); // Should print out 2/3
    System.out.println( s.toString() ); //Should print out 1/2

    // Testing floatValue
    System.out.println( r.floatValue() ); // Should print out 0.66666...
    System.out.println ( s.floatValue() ); // Should print out 0.5

    // Testing multiply
    r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
    System.out.println( r.toString() ); // To check out what r is after running through multiply
    System.out.println( s.toString() ); // To check that s remains 1/2

    // Testing divide
    r.divide(s);
    System.out.println( r.toString() ); // Should return 2/3 because r is 2/6
    System.out.println( s.toString() ); //Should still return 1/2
  }

}
