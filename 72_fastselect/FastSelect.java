// Corina Chen
// APCS
// HW72: So So Fast
// 2022-03-08
// time spent:

/*
 * ALGO:
 * - Partition the array in the middle.
 * - Compare the pivot point (the index num) with "y"
 *    - If they are equal, then the answer will be index at pivot
 *    - If y is greater, then parition the greater half of array
 *    - If y is less, then parition the smaller half
 * - Compare until pivot point == "y"
 *
 * BEST CASE SCENARIO:
 *
 *
 * WORST CASE SCENARIO:
 *
 *
 * DISCO
 *
 *
 * QCC
 *
 *
 */

public class FastSelect {

  //--------------v  HELPER METHODS  v--------------
  // Borrowed from partitions
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------

  //--------------v  PARTITIONER  v--------------
  public static int partitioner( int[] arr, int a, int b, int c)
  {
    int v = arr[c];

    swap( c, b, arr);
    int s = a;

    for( int i = a; i < b; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,b,arr);

    return s;
  }//end PARTITIONER
  //--------------^  PARTITIONER  ^--------------

  public static int fastSelecter(int[] arr, int low, int high, int piv, int y)
  { // need to include a helper function probably
    //int piv = arr.length / 2;
    partitioner(arr, low, high, piv);
    if (piv == y) {
       return arr[piv];
     }
    else if (y == 0) {
       return arr[0];
     }
    else if (y == arr.length-1) {
       return arr[arr.length-1];
     }
    else {
      if ( piv > y ) {
        int newP = (piv + high) / 2;
        return fastSelecter(arr, low, high, newP, y);
      }
      else if ( piv < y) {
        int newP = (piv + low) / 2;
        return fastSelecter (arr, low, high, newP, y);
      }
    }
  }

  public static int fastSelect(int[] arr, int y) {
    int piv = arr.length / 2;
    int low = 0;
    int high = arr.length-1;
    return fastSelecter (arr, low, high, piv, y);
  }

  public static void main (String[] args) {
    //need to do some testing yikes;
  }

}
