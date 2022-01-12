// CNN: Nicole Zhou + Duck, Corina Chen + BinkTop, Nada Hameed + Ray
// APCS pd06
// HW55 -- Never Fear, Big Oh Is Here!
// 2022-01-11
// time spent: 0.25 hrs

import java.util.ArrayList;

public class OrderedArrayList {

  private ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<Integer> (10);
  }

  // Best + Worst Case: Tis moot and execution time is O(1)
  // Tis because it's not running through anything
  public String toString() {
    return _data.toString();
  }

  // Best + Worst Case: Moot because it matters not the length or index
  // Execution time is O(n) because it's only iterating through once and removing
  public Integer remove( int i ) {
    return _data.remove(i);
  }

  // Best + Worst: Moot because nothing is taken into consideration
  // Execution time: O(1) -- constant because no iteration is needed
  public int size() {
    return _data.size();
  }

  // Best + Worst: Moot because it matters not the length
  // Execution time: O(1) because it's iterating but not performing any specific function
  public Integer get( int i ) {
    return _data.get(i);
  }

  // Best: size is 0 because it's easy adding
  // Worst: Bigger arrays because you have to iterate through a lot of values
  // Execution time: O(n) because iteration once to compare with newVal and performing a function when necessary
  public void addLinear(Integer newVal)
  {
    if (size() == 0){
      _data.add(newVal);
    }
    else {
      for (int i = 0; i < size(); i++){
        if (newVal <= _data.get(i)){
          _data.add(i, newVal);
          return;
        }
      }
      _data.add(newVal);
    }
  }

  // Best: size is 0, with instant newVal adding
  // Worst: newVal is the smallest or largest within the arrayList
  // O(log2(x)) because Mr.Mykolyk said so :))))
  // Just kidding. But it's because we're dividing the arraylist into two (again and again)
  public void addBinary(Integer newVal) {
    int left = 0;
    int right = size() - 1;
    if ( size() == 0 ) {
      _data.add(newVal);
    }
    else {
      while (left < right ) {
        int mid = ( left + right ) / 2;
        if (_data.get(mid) == newVal) {
          _data.add(mid, newVal);
          break;
        }
        else if (_data.get(mid) < newVal ) {
          left = mid + 1;
        }
        else {
          right = mid - 1;
        }
      }
      _data.add(newVal);
    }
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
