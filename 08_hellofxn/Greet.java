/*Cheese -- Melody Lew and Corina Chen
APCS
HW8 -- Refactor Freshie Zero
2021-09-30*/

public class Greet {
  public static void main(String[] args){
    greet("Foo");
    greet("Moo");
    greet("Doo");
  }    
  public static void greet (String name){
    System.out.println("Why, hello there, " + name + ". How do you do?");
  }
}

/* 
DISCOVERIES:
"Identifier expected" means that there's supposed to a parameter in there somewhere. For example, if you say "String...", there needs to be a name for the String that
you are taking in, thus "String name". 
 
UNRESOLVED QUESTIONS:
Why do we use void? (What's the benefit of using void?)
*/
