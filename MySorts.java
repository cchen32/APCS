import java.util.ArrayList;

public class MySorts{

// Helper Functions:
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

// Bubble Sort
  public static void bubbleSort(ArrayList<Comparable> ow) {
    //swap counter
    int swpcnt = 0;
    //comparison counter
    int cmprcnt = 0;
    //pass counter
    int pscnt = 0;
    for( int passCtr = 1; passCtr < ow.size(); passCtr++ ) {
      //System.out.println( "commencing pass #" + passCtr + "..." );
      pscnt++;
      //iterate thru first to next-to-last element, comparing to next
      for( int i = 0; i < ow.size()-1; i++ ) {
        cmprcnt++;
        //if element at i > element at i+1, swap
        if ( ow.get(i).compareTo(ow.get(i+1) ) > 0 ){
          ow.set( i, ow.set(i+1,ow.get(i)) );
          swpcnt++;
        }
        //System.out.println(ow); //diag: show current state of list
      }
      // This will print out multiple times depending on how many passes were made.
      // The total number of coparisons would be if we add up all the comparisons made per pass.
    }
    System.out.println("The number of comparisons is " + cmprcnt + ".");
    System.out.println("The number of swaps made is " + swpcnt + ".");
    System.out.println("The number of passes is " + pscnt + ".");
  }

// Selection Sort
  public static void selectionSort(ArrayList<Comparable> ow) {
    //note: this version places greatest value at rightmost end,

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    //swap counter
    int swpcnt = 0;
    //comparison counter
    int cmprcnt = 0;
    //pass counter
    int pscnt = 0;

    for( int pass = ow.size()-1; pass > 0; pass-- ) {
      //System.out.println( "\nbegin pass " + (ow.size()-pass) );//diag
      pscnt++;
      maxPos = 0;
      for( int i = 1; i <= pass; i++ ) {
        cmprcnt++;
        //System.out.println( "maxPos: " + maxPos );//diag
        //System.out.println( ow );//diag
        if ( ow.get(i).compareTo( ow.get(maxPos) ) > 0 ) {
          maxPos = i;
          swpcnt++;
        }
      }
      ow.set( maxPos, ( ow.set( pass, ow.get(maxPos) ) ) );
      //System.out.println( "after swap: " +  ow );//diag
    }
    System.out.println("The number of comparisons is " + cmprcnt + ".");
    System.out.println("The number of swaps made is " + swpcnt + ".");
    System.out.println("The number of passes is " + pscnt + ".");
  }

// Insertion sort
  public static void insertionSort(ArrayList<Comparable> ow) {
    //swap counter
    int swpcnt = 0;
    //comparison counter
    int cmprcnt = 0;
    //pass counter
    int pscnt = 0;

    for( int partition = 1; partition < ow.size(); partition++ ) {
      //partition marks first item in unsorted region

      //diag:
      //System.out.println( "\npartition: " + partition + "\towset:");
      //System.out.println( ow );
      pscnt++;
      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {
        cmprcnt++;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( ow.get(i).compareTo( ow.get(i-1) ) < 0 ) {
          //diag:
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
          ow.set( i, ow.set( i-1, ow.get(i) ) );
          swpcnt++;
        }
        else
          break;
      }
    }
    System.out.println("The number of comparisons is " + cmprcnt + ".");
    System.out.println("The number of swaps made is " + swpcnt + ".");
    System.out.println("The number of passes is " + pscnt + ".");
  }

}
