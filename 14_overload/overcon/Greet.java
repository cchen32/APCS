public class Greet{
	public static void main ( String[] args ) {
		String greeting;
		BigSib richard = new BigSib("Word up");
                BigSib grizz = new BigSib("Hey ya");
                BigSib dotCom = new BigSib("Sup");
                BigSib tracy = new BigSib("Salutations");
		greeting = richard.greet("freshman");
		System.out.println(greeting);
                greeting = richard.greet("Dr. Spaceman");
                System.out.println(greeting);
                greeting = richard.greet("Kong Fooey");
                System.out.println(greeting);
                greeting = richard.greet("mom");
                System.out.println(greeting);
	}
}
