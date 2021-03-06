// (Do not be) Consume Arsenic:: Ameer Alnasser, Corina Chen + a happy shoutout to Piazza
// APCS pd 6
// HW 34: A Pirate's Life for Me:: Array work!
// 2021-11-12
// Time: 1.5 hours

/*
DISCOS
- nextInt generates the next integer up to the "nth" number, which is excluded
- helper functions can be helpful in recursing through the functions where we
  have been given parameters because we can use our own parameters within the
  helper functions
- we sort of modelled our helper functions after the iterative function we had
  just done
*/

/*
QCC
- Is there an easy way of recursing through linSearchR and freqRec without a
helper function?
*/

import java.util.Random;

public class Loopier {
  //In which we loop through the length of the inputted array and randomly
  //inserted values into each index
  public static void populateArray ( int[] a ) {
    Random random = new Random();
    for ( int i = 0; i < a.length; i+= 1 ) {
      a[i] = random.nextInt(100);
    }
  }
  //In which we create a String to hold our array and then add each value of
  //the array to the String by iterating through each index of the input array
  public static String returnArray( int[] a ) {
      String output = "[";
      for ( int i = 0; i < (a.length - 1); i+= 1 ) {
          output += a[i] + ", ";
      }
      output += a[a.length-1]+"]";
      return output;
  }

  //In which we iterate through the input array to see if the value in the index
  //is equal to that of the target value;
  public static int linSearch( int[] a, int target ) {
    for( int i = 0;i < a.length; i+= 1 ) {
      if ( a[i] == target ){
        return i;
      }
    }
    return -1;
  }

  //With the inspiration of a Piazza post regarding using helper fucntions:
  private static int lSRHelper( int [] a, int target, int counter ) {
    //counter is sort of used the same way "i" is in the iterative function
    if (a.length <= counter ) {
      return -1; //This is to stop the code when it is completely parsed through
                 //and does not contain the target we want.
    }
    else if (a[counter] == target ) {
      return counter;
    }
    else {
      return lSRHelper (a, target, counter + 1);
    }
  }
  public static int linSearchR (int[] a, int target ) {
    return lSRHelper(a, target, 0);
  }

  //In which we loop through freq to find if a value inside of a is equal to
  //target, and if it is, the counter will increment by 1
  public static int freq (int[] a, int target ) {
    int helper = 0;
    for (int i = 0; i < a.length; i += 1 ) {
      if (a[i] == target ) {
        helper += 1;
      }
    }
    return helper;
  }

  //Helper function once again
  private static int fRHelper (int[] a, int target, int counter, int helper ) {
    //counter to help keep track of the index and helper to keep track of frequency
    if (a.length <= counter ) {
      return helper;
    }
    else if ( a[counter] == target ) {
      return fRHelper(a, target, counter + 1, helper + 1);
    }
    return fRHelper(a, target, counter + 1, helper );
  }
  public static int freqRec ( int[] a, int target ) {
    return fRHelper(a, target, 0, 0);
  }

  public static void main( String args[] ) {
    //creation of array intRand
    int[] intRand = new int[10];
    //deployment of values into intRand randomly
    populateArray(intRand);
    //Printing out the values of intRand -- outcomes should be different each time
    System.out.println(returnArray((intRand)) + "\n");

    System.out.println("Testing out the two linSearch functions");
    int[] targetTest = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(linSearch( targetTest, 1 )); //Outcome should return 0
    System.out.println(linSearch( targetTest, 10 )); //Outcome should return -1
    System.out.println(linSearch( intRand, 50 )); //Outcome should differ
    System.out.println(linSearchR( targetTest, 1 )); //Outcome should be 0
    System.out.println(linSearchR( targetTest, 10 )); //Outcome should be -1
    System.out.println(linSearchR( targetTest, 7 )); //Outcome should be 6
    System.out.println(linSearchR( intRand, 50 ) + "\n"); //Outcome should differ

    System.out.println("Testing out the two freq functions");
    int[] testCases = {2, 3, 3, 9, 9, 10, 15, 8, 9};
    System.out.println(freq( testCases, 3 )); //Outcome should be 2
    System.out.println(freq( testCases, 9 )); //Outcome should be 3
    System.out.println(freq( testCases, 199 )); //Outcome should be 0
    System.out.println(freqRec( testCases, 3 )); //Outcome should be 2
    System.out.println(freqRec( testCases, 9 )); //Outcome should be 3
    System.out.println(freqRec( testCases, 199 )); //Outcome should be 0
  }
}
