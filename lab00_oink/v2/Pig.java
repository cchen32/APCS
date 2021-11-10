// Can Josiah Beautify?: Corina Chen, Josiah Moltz, Brian Wang
// APCS06
// L00 -- Etterbay Odingcay Oughthray Ollaborationcay / pig latin translator / augmenting functionality to phrases
// 2021-11-08
// time spent: .8 hr ( 48 minutes)

/*
DISCO
  -Arrays have length() function as length (no parentheses)
  -Strings of length 0 ANNIHILATE our code :(
QCC
  -Not that we have ATM
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

  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);

    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/
  public static String engToPigW( String w ) {

    String ans = "";

    if ( beginsWithVowel(w) )
      ans = w + "way";

    else {
      int vPos = w.indexOf( firstVowel(w) );
      ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
    }

    return ans;
  }

//New stuff for phrase cases
//========================================================================

  public static int spaceCounter( String p ) {
    int counter = 0;
    while ( p.indexOf( " " ) != -1 ) {
      counter += 1;
      p = p.substring( p.indexOf( " " ) + 1 );
    }
    return counter;
  }

  public static String[] phraseToWords( String p ) {
    int spaceNum = spaceCounter( p );
    String[] result = new String[ spaceNum + 1 ];

    p = p + " ";  //ensuring that w always has an ending " " to remove, so what line *insert* doesn't throw an error

    int counter = 0;
    while ( counter < spaceNum + 1 ) {
      result[ counter ] = p.substring(0, p.indexOf(" ") );
      p = p.substring( p.indexOf(" ") + 1 );
      counter += 1;
    }

    return result;
  }

  public static String engToPig( String p ) {
    String[] w = phraseToWords( p );
    String result = engToPigW( w[0] );

    for ( int i = 1; i < w.length; i +=1 ) {
      result = result + " " + engToPigW( w[i] );
    }

    return result;
  }


  public static void main( String[] args ) {

    for( String phrase : args ) {
      System.out.println( spaceCounter( phrase ) );

      for( String word : phraseToWords( phrase ) ) {
        // testing phraseToWords since just printing it would yield gibberish
        System.out.println( word );
      }

      System.out.println( engToPig( phrase) );
    }

  }//end main()

}//end class Pig
