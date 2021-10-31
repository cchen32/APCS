/*
Return the number of times that the string "code" appears anywhere in the given
string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
*/

public class countCode {
  public static int countCode(String str) {
    int counter = 0;
    for (int i = 0; i < str.length()-3; i++) {
      if (str.substring(i, i+2).equals("co") && str.substring(i+3, i+4).equals("e")) {
        counter += 1;
      }
    }
    return counter;
  }
  //testing
  public static void main(String[] args) {
    System.out.println(countCode("aaacodebbb")); //→ 1
    System.out.println(countCode("codexxcode")); //→ 2
    System.out.println(countCode("cozexxcope")); //→ 2
    System.out.println(countCode("cozfxxcope")); //→ 1
    System.out.println(countCode("xxcozeyycop")); //→ 1
    System.out.println(countCode("cozcop")); //→ 0
    System.out.println(countCode("abcxyz")); //→ 0
    System.out.println(countCode("code")); //→ 1
    System.out.println(countCode("ode")); //→ 0
    System.out.println(countCode("c")); //→ 0
    System.out.println(countCode("")); //→ 0
    System.out.println(countCode("AAcodeBBcoleCCccoreDD")); //→ 3
    System.out.println(countCode("AAcodeBBcoleCCccorfDD")); //→ 2
    System.out.println(countCode("coAcodeBcoleccoreDD")); //→ 3
  }
}
