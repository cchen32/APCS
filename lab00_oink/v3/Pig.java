// Can Josiah Beautify?: Corina Chen, Josiah Moltz, Brian Wang
// APCS06
// L00 -- Etterbay Odingcay Oughthray Ollaborationcay / pig latin translator / augmenting functionality to phrases
// 2021-11-09
// time spent: 1.2 hr ( 75 minutes)

/*
DISCO
  -Strings of length 0 no longer wrecks our main method, probably due to scanner functionality
  -toUpperCase() and toLowerCase() twin methods
QCC
  -How do you get scanner to not split phrases up into their individual words?
  -Is there an easy way to detect syllables in a word (concerning y being a vowel)?
  -What punctuations should be considered (outside of what is already included)?
  -What about a word with multiple punctuations for one word!!??!?!
HOW WE UTILIZED SCANNER DEMO
  -We directly used the code from the Scanner Demo to implement Scanner into v3.
   Through testing within the Scanner Demo, we were able to find out how scanner works, its limitations,
   along with the "error" involving the double prints, which were fixed and considered when added into our code.
WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO
  -System.out.println( engToPig( sc.next() ) ) was ran twice every iteration of the while loop.
   The conditional in the while loop only checks if there is one more element to sc, not two.
   Therefore, by incrementing by two while only checking one, we can pass the end of sc.
NEW IN V3
  -Handling of y
  -Handling of capitalization
  -Handling of punctuation
  -Implemented usage of Scanner
*/


/***
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
***/

import java.util.Scanner;

public class Pig
{
  private static final String VOWELS = "aeiouAEIOU";

  private static final String PUNCTUALS = "!.:,;?";


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
    String punct = "";

    if ( punctuated(w) ) {
      punct = w.substring( w.length() - 1 );
      w = w.substring( 0, w.length() - 1 );
    }

    if ( beginsWithVowel( w ) )
      ans = w + "way";

    else {
      int vPos = w.indexOf( firstVowelY(w) );
      ans = w.substring(vPos) + w.substring(0,vPos).toLowerCase() + "ay";
    }

    if ( capitalized( w ) ) {
      ans = ans.substring(0,1).toUpperCase() + ans.substring(1);
    }

    ans += punct;

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

//New stuff for caps cases
//========================================================================

  public static boolean capitalized( String w ) {
    //checks if first letter of w is capitalized
    return w.substring(0,1).equals( w.substring(0,1).toUpperCase() );
  }

//New stuff for punctuation cases
//========================================================================

  public static boolean punctuated( String w ) {
    //checks if last letter of w is a grammar symbol
    return hasA( PUNCTUALS, w.substring( w.length() - 1 ) );
  }

  //New stuff for y (the most evelist fo all the vowyls)
  //========================================================================

    public static String firstVowelY( String w ) {
      int yIndex = w.toLowerCase().indexOf( "y" );

      if ( firstVowel( w ).equals("") && hasA( w , "y" ) ) {
        //SHORT CIRCUITING GENIUS by BW, uses fact that a word either has a vowel, or a y ALWAYS
        return "y";
      }

      else if (yIndex != -1 && w.indexOf( firstVowel( w ) ) - yIndex > 1 ) {
        return "y";
      }

      else{
        return firstVowel( w );
      }
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

    Scanner sc = new Scanner( System.in );

    while( sc.hasNext() ) {
      System.out.println( engToPig( sc.next() ) );
    }

  }//end main()

}//end class Pig
