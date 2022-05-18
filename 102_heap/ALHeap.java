// Team NDA: Corina Chen, Jing Yi Feng, Nicole Zhou
// APCS Pd06
// HW 102
// 2022-05-17
// Time Spent:

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

 /*
 DISCOS:
 0. The equations to find parent/child position came into use.
 1. It is better to use while loop because we repeat the algo until a condition is false.

 QCC:
 0. Chose to go simple with toString.
 1. Is it true in every case that if the leftChild is empty that the rightChild must also be empty?
    That is if we go by the fact that each position must be filled up before going to the next leve.
 */

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString() // Choosing to go with simple
  {
    String retStr = "";
    for (int i = 0; i < _heap.size(); i++){
      retStr += _heap.get(i) + " ";
    }
    return retStr;
  }//O(n) - Dependent on length of ArrayList


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return _heap.size() == 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0);
    //Returns value at index 0, which should be the minimum value in a minheap.
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * 0. Append addVal to the end of the array.
   * 1. Use the equation to find the index of its parent.
   * 2. Compare addVal to the parent.
   * 3. If addVal is greater than its parent, swap with parent.
   * 4. Check with parent and grandparent, swap if necessary. Repeat until root if necessary.
   */
  public void add( Integer addVal )
  {
    _heap.add(addVal);
    if (_heap.size() == 1){
      return;
    }
    int pIndex = (_heap.indexOf(addVal) - 1) / 2;
    while (minOf(addVal, _heap.get(pIndex)) == addVal){
      int addValIndex = _heap.get(addVal);
      swap(addValIndex, pIndex);
      pIndex = (_heap.indexOf(addVal) - 1) / 2;
    }
  }//O(n) - Traversing through ArrayList once, dependent on length


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * 0. Swap the element you want to remove with last element.
   * 1. Remove last element
   * 2. If there is another child, compare the child to shared parents. Swap as necessary.
   * 3. Repeat Step 4 from add() until all is well.
   */
  public Integer removeMin()
  {
    if (isEmpty()) {
      return null;
    }
    Integer ans = _heap.get(0);
    swap(0, _heap.get(_heap.size() - 1));
    _heap.set(_heap.size() - 1, null);
    int index = 0;
    while (minChildPos(index) != -1){
      swap(index, _heap.indexOf(minChildPos(index)));
      index = _heap.indexOf(minChildPos(index));
    }
    return ans;
  }//O(n) - Traversing through ArrayList once, dependent on length


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    int leftChild = 2 * pos + 1;
    int rightChild = 2 * pos + 2;
    if (_heap.get(pos) == null){
      return -1;
    }
    else if (_heap.get(leftChild) == null) { // BC rightChild can't exist if leftChild doesn't exist
      return -1;
    }
    else if (_heap.get(leftChild) > _heap.get(rightChild)) {
      return rightChild;
    }
    return leftChild;
  }//O(1) - Consistent despite ArrayList length,


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
