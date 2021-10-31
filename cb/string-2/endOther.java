/*
Given two strings, return true if either of the strings appears at the very end
of the other string, ignoring upper/lower case differences (in other words, the
computation should not be "case sensitive"). Note: str.toLowerCase() returns
the lowercase version of a string.
*/
public class endOther{
  public static boolean endOther(String a, String b) {
    String lowerA = a.toLowerCase();
    String lowerB = b.toLowerCase();
    if (a.length() > b.length()) {
      return lowerA.substring(a.length() - b.length()).equals(lowerB);
    }
    return lowerB.substring(b.length() - a.length()).equals(lowerA);
  }
  public static void main(String[] args){
    System.out.println(endOther("Hiabc","abc")); //→ true
    System.out.println(endOther("AbC", "HiaBc")); //→ true
    System.out.println(endOther("abc", "abXabc")); //→ true
    System.out.println(endOther("Hiabc", "abcd")); //→ false
    System.out.println(endOther("Hiabc", "bc")); //→ true
    System.out.println(endOther("Hiabcx", "bc")); //→ false
    System.out.println(endOther("abc", "abc")); //→ true
    System.out.println(endOther("xyz", "12xyz")); //→ true
    System.out.println(endOther("yz", "12xz")); //→ false
    System.out.println(endOther("Z", "12xz")); //→ true
    System.out.println(endOther("12", "12")); //→ true
    System.out.println(endOther("abcXYZ", "abcDEF")); //→ false
    System.out.println(endOther("ab", "ab12")); //→ false
    System.out.println(endOther("ab", "12ab")); //→ true
  }
}
