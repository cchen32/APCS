// TNPG: CNN - Nicole Zhou + Duck, Corina Chen + Binktop, Nada Hameed + Ray
// APCS pd6
// HW47 -- Guess Again
// 2021-12-15w
// time spent: 0.2 hrs

/***
 * class GuessNumber -- fun fun fun!
 *
 * SKELETON
 *
 * eg, sample interaction with end user:
 *
 * Guess a # fr 1-100: 50
 * Too high
 * Guess a # fr 1-49: 25
 * Too low
 * Guess a # fr 26-49: 38
 * Correct! It took 3 guesses
 ***/

/***
    DISCO:
    - guess = sc.nextLine() will take what the user types in and set it to guess
      -> if you type something that isn't an int, you will get an Exception error
    QCC:
    - when setting _target, we didn't use _lo or _hi in the name of caution
    - under the guise of grammar, it'd make sense to be able to adapt to guessing in one try (v "tries")
    - we could also adapt to a guess that's higher than the given range
 ***/
import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 1;

    //pick random number in range [a,b]

    /* YOUR CODE HERE */
    _target = (int)(Math.random()* Math.max(a,b)) + Math.min(a,b);
  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec()
  {
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();

    //3 cases: we either found it, too hi, too lo

    /* YOUR CODE HERE */
    if(guess > _target){
      _hi = guess - 1;
      _guessCtr++;
      System.out.println("Too high, give it another shot--");
      playRec();
    } else if(guess < _target){
      _lo = guess + 1;
      _guessCtr++;
      System.out.println("Too low, give it another shot--");
      playRec();
    } else{
      System.out.println("Victory! Thou hast guessed correct, after a whopping " + _guessCtr + " tries");
    }
  }


  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess;

    while( true ) {
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
      guess = sc.nextInt();

      //3 cases: we either found it, too hi, too lo

      /* YOUR CODE HERE */
      if(guess > _target){
        System.out.println("Too high, give it another shot--");
        _hi = guess - 1;
      } else if(guess < _target){
        System.out.println("Too low, give it another shot--");
        _lo = guess + 1;
      } else{
        System.out.println("Victory! Thou hast guessed correct, after a whopping " + _guessCtr + " tries");
        break;
      }
      _guessCtr++;
    }
  }


  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    //playRec();
    playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {

    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);

    //start the game
    g.play();
    /*-----------------------------
    -----------------------------*/
  }

}//end class GuessNumber
