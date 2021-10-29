// TNPG: Corina by herself (along with inspirations from Ameer Alnasser and Anthony Sun)
// APCS pd06
// HW26 -- For the love of Strings
// 2021-10-28
// Time Spent: 1.5 hour (1 hour 33 minutes)

/*
DISCO:
- a certain pair of paranthesis certain screws things up
- when returning a recursive function, it can be nested within another method. you don't
  have to return the function but rather can have another part + the function

QCC:
- None as of now :))
*/

public class Rof {
  //Fence function through for loop
  public static String fenceF( int posts ) {
    String fence = "|";
    if ( posts == 0 ) {
      return "This is public property.";
    }
    else if ( posts == 1 ) {
      return fence;
    }
    else {
      for ( int counter = 1; counter < posts; counter++ ){
        fence += "--|";
      }
      return fence;
    }
  }

  //Reverse string through for loop
  public static String reverseF( String s ) {
    String revStr = " ";
    for ( int i = 0; i < s.length(); i++ ) {
      revStr += s.substring(s.length()-(i+1), s.length()-i);
    }
    return revStr;
  }


  //Reverse string through recursion
  public static String reverseR ( String s ) {
    if ( s.length() == 0 ) {
      return "Nothing to see here";
    }
    //base case
    else if ( s.length() == 1 ) {
      return s;
    }
    //reduction case
    else {
      //Much kudos to Anthony Q Sun for his help in moving that set of paranthesis to where it should belong
      //Aka this code instead of 'return s.substring(s.length()-1 + reverseR(s.substring(0, s.length()-1));'
      //Disclaimers: Terminal led me here and it works for some reason, to much of my confusion
      return s.substring(s.length()-1) + reverseR(s.substring(0, s.length()-1));
    }
  }

  public static void main(String[] args){

    //Testing fenceF
    System.out.println(fenceF(0));
    System.out.println(fenceF(1));
    System.out.println(fenceF(2));
    System.out.println(fenceF(3));

    //Testing the reverse strings
    System.out.println(reverseF("stressed"));
    System.out.println(reverseR("stressed"));
  }
}
