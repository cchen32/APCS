// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 85: Leon Leonwood Stack
// 2022-03-30r
// time spent: 0.7hrs

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE> {

  ArrayList<PANCAKE> stack;

  public ALStack() {
    stack = new ArrayList();
  }

  public boolean isEmpty() {
    return stack.size() == 0;
  }

  public PANCAKE peekTop() {
    return stack.get(stack.size() - 1);
  }

  public void push( PANCAKE x ) {
    stack.add(x);
  }

  public PANCAKE pop() {
    return stack.remove(stack.size() - 1);
  }

}
