// TNPG Can Josiah Beautify?: Corina Chen, Josiah Moltz, Brian Wang
// APCS pd06
// HW29 -- Which Way Do You Roll? / Inserting commas into numbers / String manipuluation, Integer class, FOREACH loops
// 2021-11-1
// Time Spent: .8 hour ( 45 minutes)

/*
DISCO
  -parsInt and toString from Integer REQUIRE Integer. to precede
  -RUNNING STUFF FROM THE TERMINAL <3
  -The FOREACH loop definition used String s to refer to the ELEMENT of args, not the item we iterate on (oops)
QCC
  -Why does Integer wrapper class require Integer.<method>() while the String wrapper class does not?
  -What is a wrapper class?
  -Why does Integer take arguments, while String uses the <String>.method() way of using arguments?
   Does it have anything to do with primitive data types??
*/

public class Commafier {
  public static String commafyR( int n ) {
    String str = Integer.toString( n ); //found on Java API
    int len = str.length();

    if ( len <= 3 ) {
      //Base case
      return str;
    }
    else {
      //Recursive case
      String lastThree = str.substring( len - 3 );
      int beforeThree = Integer.parseInt( str.substring( 0, len - 3 ) );
      return commafyR( beforeThree ) + "," + lastThree;
      //commafy the last three characters, then rely on recursion to commafy the sections before that
    }
  }

  public static String commafyF( int n ) {
    String str = Integer.toString( n );
    int len = str.length();

    for ( int i = len - 3; i > 0; i -= 3 ) {
      String lastGroup = str.substring( i );
      String beforeGroup = str.substring( 0, i );
      str = beforeGroup + "," + lastGroup;
      //Splicing str and stabbing a "," where we spliced
    }

    return str;
  }

  public static void main( String[] args ) {
    for ( String element : args ) {
      System.out.println( commafyR( Integer.parseInt( element ) ) );
    }
    /*
    System.out.println(commafyR(1)); // 1
    System.out.println(commafyR(10)); // 10
    System.out.println(commafyR(101)); // 101
    System.out.println(commafyR(1000)); // 1,000
    System.out.println(commafyR(12345)); // 12,345
    System.out.println(commafyF(1)); // 1
    System.out.println(commafyF(10)); // 10
    System.out.println(commafyF(101)); // 101
    System.out.println(commafyF(1000)); // 1,000
    System.out.println(commafyF(12345)); // 12,345
    */
  }
}
