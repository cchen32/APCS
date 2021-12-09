/*
TNPG: CNN - Nicole Zhou + Duck, Corina Chen + Binktop, Nada Hameed + Ray
APCS1 pd6
HW45 - Array of Titanium / Practicing with Interfaces
2021-12-09
time spent:  0.7 hrs

DISCOS:
- Interfaces don't need {} since there's no method body
- We don't actually have to change much to SuperArray other than adding true/false to certain methods
QCCS:
- What is java.util.Collection?
- Why must 'add' return true?
- When testing out ListInt's methods, can you create a ListInt instance?
*/

public class SuperArray implements ListInt {

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //adds an item after the last item
  public boolean add( int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */

    if( _size >= _data.length ) {
      expand();
    }

      _data[_size] = newVal;
      _size++;
      return true;
  }


  //inserts an item at index
  public boolean add( int index, int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */
    if ( index >= _data.length ) {
      return false;
    }

    if(_size >= _data.length){
      expand();
    }
    for (int i = _size; i > index; i--) {
      _data[i] = _data[i - 1];
    }
    _size++;
    _data[index] = newVal;
    return true;
  }


  // //removes the item at index
  // //shifts elements left to fill in newly-empted slot
  public boolean remove( int index )
  {
    /* YOUR IMPLEMENTATION HERE */
    _size--;
    for(int i = index; i < _size; i ++){
      _data[i] = _data[i + 1];
    }
    return true;
  }


  //return number of meaningful items in _data
  public int size()
  {
    /* YOUR IMPLEMENTATION HERE */
    return _size;
  }



  //main method for testing
  public static void main( String[] args )
  {
      // These test out the ListInt as they are all methods in ListInt
      SuperArray mayfield = new SuperArray();
      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);

      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);

      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
  }//end main()


}//end class
