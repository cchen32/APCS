//Given a string name, e.g. "Bob", return a greeting of the
//form "Hello Bob!".

public class helloName {
  public static String helloName( String name ) {
    return "Hello " + name + "!";
  }
  public static void main( String[] Args ) {
    System.out.println(helloName("Bob")); //→ "Hello Bob!"
    System.out.println(helloName("Alice")); //→ "Hello Alice!"
    System.out.println(helloName("X")); //→ "Hello X!"
    System.out.println(helloName("Dolly")); //→ "Hello Dolly!"
    System.out.println(helloName("Alpha")); //→ "Hello Alpha!"
    System.out.println(helloName("Omega")); //→ "Hello Omega!"
    System.out.println(helloName("Goodbye")); //→ "Hello Goodbye!"
    System.out.println(helloName("ho ho ho")); //→ "Hello ho ho ho!"
    System.out.println(helloName("xyz")); //→ "Hello xyz!"
    System.out.println(helloName("Hello")); //→ "Hello Hello!"
  }
}
