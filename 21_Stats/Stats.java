// TNPG Can Josiah Beautify?: Brian Wang, Josiah Moltz, Corina Chen
// APCS pd06
// HW21 -- STAtisTically Speaking... / Statistical Driving / Implementing statistics functions in Stats.java, and testing them in StatsDriver.java
// 2021-10-20

/*
DISCO
	-You can run static methods WITHOUT referencing the object, such as Math.sqrt() (intertrash told us this)
 	 and all of our Stats functions
	-Converting from a double to an int results in a loss of data, (possible lossy conversion)
	 hence java is hesitant to make such a conversion on its own
QCC
	- None?
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

  //main method for testing functionality
  public static void main( String[] args ) {

  }

}//end class
