// Corina Chen
// APCS pd6
// HW43 -- encapsulation (basic SuperArray functionality)
// 2021-12-07t

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

 /*
Discos
- In order to expand (or double in this case), one must create a separate array
  to hold original values before copying over the original value.

QCCS
- Is there a particular reason for "_" other than easier identification? (I find
  it quite harsh on the eyes.)
 */

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    /* YOUR IMPLEMENTATION HERE */
    _data = new int[10];
    _size = _data.length;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    /* YOUR IMPLEMENTATION HERE */
    String s = "[";
    for ( int e : _data ) {
      s = s + e + "," ;
    }
    s = s.substring( 0 , s.length() - 1 ) + "]";
    return s;
  }


  //double capacity of SuperArray
  private void expand()
  {
    /* YOUR IMPLEMENTATION HERE */
    int[] hold = new int[2 * _size];
    for ( int i = 0; i < _size; i++ ) {
      hold[i] = _data[i];
    }
    _data = new int[2 * _size];
    for ( int i = 0; i < _size; i++ ) {
      _data[i] = hold[i];
    }
    _size = _data.length;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    /* YOUR IMPLEMENTATION HERE */
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */
    int oldVal = _data[index];
    _data[index] = newVal;
    return oldVal;
  }


  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
