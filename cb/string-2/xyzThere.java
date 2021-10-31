/*
Return true if the given string contains an appearance of "xyz" where the xyz
is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
not.
*/

public class xyzThere {
  public static boolean xyzThere(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("xyz")) {
      return true;
    }
    else if (str.length() < 3) {
      return false;
    }
    for (int i = 0; i < str.length() - 3; i++) {
      if (str.substring(i+1,i+4).equals("xyz")) {
        if (str.substring(i, i+4).equals(".xyz")) {
        }
        else {
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args) {
    System.out.println(xyzThere("abcxyz")); //→ true
    System.out.println(xyzThere("abc.xyz")); //→ false
    System.out.println(xyzThere("xyz.abc")); //→ true
    System.out.println(xyzThere("abcxy")); //→ false
    System.out.println(xyzThere("xyz")); //→ true
    System.out.println(xyzThere("xy")); //→ false
    System.out.println(xyzThere("x")); //→ false
    System.out.println(xyzThere("")); //→ false
    System.out.println(xyzThere("abc.xyzxyz")); //→ true
    System.out.println(xyzThere("abc.xxyz")); //→ true
    System.out.println(xyzThere(".xyz")); //→ false
    System.out.println(xyzThere("12xyz")); //→ true
    System.out.println(xyzThere("12.xyz")); //→ false
    System.out.println(xyzThere("1.xyz.xyz2.xyz")); //→ false

  }
}
