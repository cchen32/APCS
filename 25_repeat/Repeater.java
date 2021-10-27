// TNPG Can Josiah Beautify?: Corina Chen, Josiah Moltz, Brian Wang
// APCS pd06
// HW25 -- Do I repeat myself? / While + Recursion / Printing a fence of length n with a recursive and while loop method
// 2021-10-26
// Time Spent: .4 hour (24 minutes)

/*
DISCO
  -Nothing for now
QCC
  -Nothing for now
*/

public class Repeater{

  /*
  fenceW
  precond: numPosts is non-negative
  postcond:
  */

  public static String fenceW( int numPosts ) {
    if ( numPosts == 0 ) { return "Public Property"; } //non-negatives include 0
    String fence = "|";  //initializes AND sets the starting value to what we want it. The death of two stones hath occureth.
    while ( numPosts > 1 ) {
      fence += "--|";
      numPosts -= 1;
    }
    return fence;
  }

  /*
  fenceR
  precond: numPosts is non-negative
  postcond:
  */

  public static String fenceR( int numPosts) {
    if ( numPosts == 0 ) { return "Public Property"; }
    if ( numPosts == 1 ) {
      //BASE case
      return "|";
    }
    else {
      //REDUCTION case
      return fenceR( numPosts - 1 ) + "--|";
    }
  }

  public static void main( String[] arggggghhhs ) {
    System.out.println("WHILE BEGINS HERE \n");
    System.out.println(fenceW(0));
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceW(3));

    System.out.println("\n\nRECURSION BEGINS HERE \n");
    System.out.println(fenceR(0));
    System.out.println(fenceR(1));
    System.out.println(fenceR(2));
    System.out.println(fenceR(3));

    System.out.println("\n\nEND OF FENCE. See Repeater.java for more");
  }

}
