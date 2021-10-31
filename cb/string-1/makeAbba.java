/*
Given two strings, a and b, return the result of putting them together in the
order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
*/

public class makeAbba {
  public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }
  public static void main( String[] args ) {
    System.out.println(makeAbba("Hi", "Bye")); //→ "HiByeByeHi"
    System.out.println(makeAbba("Yo", "Alice")); //→ "YoAliceAliceYo"
    System.out.println(makeAbba("What", "Up")); //→ "WhatUpUpWhat"
    System.out.println(makeAbba("aaa", "bbb")); //→ "aaabbbbbbaaa"
    System.out.println(makeAbba("x", "y")); //→ "xyyx"
    System.out.println(makeAbba("x", "")); //→ "xx"
    System.out.println(makeAbba("", "y")); //→ "yy"
    System.out.println(makeAbba("Bo", "Ya")); //→ "BoYaYaBo"
    System.out.println(makeAbba("Ya", "Ya")); //→ "YaYaYaYa"
    }
}
