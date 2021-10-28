// TNPG Can Josiah Beautify?: Corina Chen, Josiah Moltz, Brian Wang
// APCS pd06
// HW26 -- GCD Three Ways / GCD algorithm / Recursive, While, and Bash methods for GCD(a,b)
// 2021-10-27
// Time Spent: .6 hour (36 minutes)

/*
DISCO
	-A quack is sometimes used in reference to medical frauds
QCC
	-What is 'missing return statement' -- how does java tell if a return statement is "unreachable"?
	 Brian explained that this means that in some alternate universe, for some choice of variables
	 the return statement could be "missed".
	 Ex: if (a < b) {return 3}. If this is your only return, and a = 5 and b = 4
	 you will unfortunately never return anything
	-Why did we put this in stats????
ALGO for computing the GCD of a and b.
Is a > b ???
  T. If a IS greater than b,
     Replace a with (a - b), AND
     Go back to step 1.
  F. If a is NOT greater than b,
     Is a = b ???
    T. If a IS equal to b,
       Return a and we are DONE!
    F. If a is NOT equal to b,
       Replace b with b - a, AND
       Go back to step 1.
*/

public class Stats {

  public static int sqrt(int a) {
    //new sqrt to operate on/return ONLY ints
    if (a < 0) {
      //prints a value to communicate an error for if a is negative
      return -1;
    }
    int guess = 0;
    //original guess of sqrt(a)
    while ((guess + 1) * (guess + 1) <= a) {
      //while the NEXT iteration of guess is less than a, continue to the next iteration
      //once the next iteration of guess is greater than a, we know guess <= sqrt(a) < guess + 1
      guess = guess + 1;
    }
    return guess;
  }

  public static int cbrt(int a) {
    //new cbrt to operate on/return ONLY ints
    if (a < 0){
      return -1;
    }
    int guess = 0;
    while ((guess + 1) * (guess + 1) * (guess + 1) <= a) {
      //same idea as in sqrt
      guess = guess + 1;
    }
    return guess;
  }

  public static int mean(int a, int b) {
	   return (a + b) / 2;
  }

  public static double mean(double a, double b) {
	   return (a + b) / 2.0;
  }

  public static int max(int a, int b) {
	   if (a <= b){
		     return b;
	   }
	   else{
		     return a;
	   }
  }

  public static double max(double a, double b) {
    if (a <= b){
      return b;
	  }
	  else {
      return a;
	  }
  }

  public static int geoMean(int a, int b) {
    return sqrt(a * b);
  }

  public static double geoMean(double a, double b) {
    return Math.sqrt(a * b);
    //uses Math.sqrt since both geoMean and Math.sqrt operate on/return doubles
  }

  public static int max(int a, int b, int c) {
    return max(max(a, b), c);	// that's cheating - BW
  }

  public static double max(double a, double b, double c) {
    return max(max(a, b), c);
  }

  public static int geoMean(int a, int b, int c) {
    return cbrt(a * b * c);
  }

  public static double geoMean(double a, double b, double c) {
    return Math.cbrt(a * b * c);
    //uses Math.cbrt since both geoMean and Math.cbrt operate on/return doubles
  }

  public static int gcd( int a, int b) {
    int min;
    if (a <= b) {
      min = a;
    }
    else { min = b;}

    int currentNum = 1;
    int guess = 1;

    while ( currentNum < min ) {
      if ( a % currentNum == 0 && b % currentNum ==0 ) {
        guess = currentNum;
      }
      currentNum += 1;
    }

    return guess;
  }

  public static int gcdER( int a, int b ) {
    if (a > b) {
      return gcdER( a - b, b);
    }
    else if (a < b) {
      return gcdER( a, b - a );
    }
    else {
      return a;
    }
  }

  public static int gcdEW( int a, int b ) {
    boolean loop = true;

    while ( loop ) {
      if (a > b ) {
        a = a - b;
      }
      else {
        if (a == b) {
          loop = false;
        }
        else {
          b = b - a;
        }
      }
    }

    return a;
  }

  //main method for testing functionality
  public static void main( String[] args ) {
    System.out.println(gcd(2*2*3*3*3*7*97,2*3*7*7*83*97));  //Should be 4074
    System.out.println(gcdER(2*2*3*3*3*7*97,2*3*7*7*83*97));
    System.out.println(gcdEW(2*2*3*3*3*7*97,2*3*7*7*83*97));

    System.out.println(gcd(7*43*47*101*101,23*43*47)); //Should be 2021
    System.out.println(gcdER(7*11*43*47*101,23*43*47));
    System.out.println(gcdEW(7*11*43*47*101,23*43*47));
  }

}//end class
