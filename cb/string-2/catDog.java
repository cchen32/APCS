/*
Return true if the string "cat" and "dog" appear the same number of times in
the given string.
*/

public class catDog {
  public static boolean catDog(String str) {
    int catC = 0;
    int dogeC = 0;
    for (int i = 0; i < str.length()-2; i++) {
      if (str.substring(i, i+3).equals("cat")) {
        catC += 1;
      }
    }
    for (int i = 0; i < str.length()-2; i++) {
      if (str.substring(i, i+3).equals("dog")) {
        dogeC += 1;
      }
    }
    if (catC == dogeC ) {
      return true;
    }
    return false;
  }

  public static void main (String[] args) {
    System.out.println(catDog("catdog")); //→ true
    System.out.println(catDog("catcat")); //→ false
    System.out.println(catDog("1cat1cadodog")); //→ true
    System.out.println(catDog("catxxdogxxxdog")); //→ false
    System.out.println(catDog("catxdogxdogxcat")); //→ true
    System.out.println(catDog("catxdogxdogxca")); //→ false
    System.out.println(catDog("dogdogcat")); //→ false
    System.out.println(catDog("dogogcat")); //→ true
    System.out.println(catDog("dog")); //→ false
    System.out.println(catDog("cat")); //→ false
    System.out.println(catDog("ca")); //→ true
    System.out.println(catDog("c")); //→ true
    System.out.println(catDog("")); //→ true
  }
}
