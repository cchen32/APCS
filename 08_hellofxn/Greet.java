/*Cheese -- Melody Lew and Corina Chen
APCS
HW8 -- Refactor Freshie Zero
2021-09-30*/

public class Greet{
  public static void main(String[] args){
    System.out.println("Why, hello there, " + greet("Moo") + ". How do you do?");
    System.out.println("Why, hello there, " + greet("Foo") + ". How do you do?");
    System.out.println("Why, hello there, " + greet("Doo") + ". How do you do?");
  }
  public static void greet(String name){
    System.out.println(String);
  }
}

/* 
DISCOVERIES:
Your program must have a main() method. If you do not have a main() method, an error will appear when running the code stating that the main() method is not found.
It does not matter where you put main() in your program; as long as it's there, you are okay.
When the compiler says that an identifier is expected, that means that it expected a parameter. For example, an error occurred when we wrote:
  public static void greet(String)
 because string had to carry a parameter.
 
UNRESOLVED QUESTIONS:
Since void means that the method isn't returning anything, why are we using void here when the method is returning a printed statement?
*/
