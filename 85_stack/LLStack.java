// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 85: Leon Leonwood Stack
// 2022-03-30r
// time spent: 0.7hrs

import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {

  LinkedList<PANCAKE> stack;

  public LLStack() {
    stack = new LinkedList();
  }

  public boolean isEmpty() {
    return stack.size() == 0;
  }

  public void push( PANCAKE x ) {
    stack.add(x);
  }

  public PANCAKE pop() {
    return stack.removeLast();
  }

  public PANCAKE peekTop() {
    return stack.getLast();
  }
}
