// Can Josiah Beautify?: Corina Chen, Josiah Moltz, Brian Wang
// APCS06
// HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay / filling in PigLatin skeleton / using indexOf()
// 2021-11-03
// time spent: .9 hr ( 52 minutes)

/*
DISCO
  -Capitals and lowercase are read differently (fairly obviosly),
   but we did NOT fix because we figured the assignment was just to get it to work with nothing fanswa
  -indexOf() takes string input via the dot approach ("blah*hoodyhah".indexOf("zero"))
QCC
  -Does the String wrapper class tend to use the dot approach because Strings are objects
   and it is customary to interact with Objects by using the dot?
  -Also, does the Integer wrapper class tend to use the parameter approach because ints are primitive?
  -Is the use of final just for idiot(appologies)proofing?
   It seems just as easy to create VOWELS as non-final and just never edit it.
  -What exactly does it mean that a String is an object? Are new Strings new... classes?
*/

/***
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
***/


public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    return w.indexOf( letter ) != -1;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    return hasA( VOWELS, letter );
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int counter = 0;
    for ( int i = 0; i < w.length(); i += 1 ) {
      if ( isAVowel( w.substring( i, i + 1 ) ) )
      {
        counter += 1;
      }
    }
    return counter;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    return countVowels( w ) > 0;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    String result = "";
    for ( int i = 0; i < w.length(); i += 1 )
    {
      if ( isAVowel( w.substring(i, i + 1) ) )
      {
        result += w.substring( i, i + 1 );
      }
    }
    return result;
  }


  public static void main( String[] args )
  {
    System.out.println( hasA("cat", "a") );
    System.out.println( hasA("cat", "p") );

    System.out.println( isAVowel("a") );
    System.out.println( isAVowel("p") );

    System.out.println( countVowels("meatball") );
    System.out.println( countVowels("wassername") );

    System.out.println( hasAVowel("kenneth") );
    System.out.println( hasAVowel("bcdfghjklmnpqrstvwxyz") );

    System.out.println( allVowels("facetious") );
    System.out.println( allVowels("what happens when spaces are added?"));
    System.out.println( allVowels("wht hppns wtht vwls?") );

    //Washington DC, Ottawa, Mexico City (Capitals just overly long and complicated for funsies)
    System.out.println("Capitals\n");

    System.out.println( isAVowel("A") );
    System.out.println( allVowels("AAAAAAAAAAAAAAAAAH") );
  }//end main()

}//end class Pig
