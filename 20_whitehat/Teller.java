// TNPG Can Josiah Beautify?: Brian Wang, Josiah Moltz, Corina Chen
// REVIEWEE TNPG UnicornHead: Lior Polischouk, Melody Lew, Ariella Katz
// APCS pd6
// HW20 -- External Audit / WH "Hacking" / Testing the functionalities and weaknesses of UnicornHead's BankAccount
// 2021-10-19


/*
DISCO
	-main() is a PAIN to call from non command-line
	 Can still be called by making a String[] variable to be used as its args
	-We cannot DIRECTLY edit/print their instance variables bc they are private
	-A file is still COMPILABLE with a private main, but it is not EXECUTABLE
	 This is because a main method in Java HAS to be "public static void main(String[] args)",
	 if it is not, it will become a normal method, and therefore render the program unexecutable.
QCC
	-Is it convention to run BankAccount.java's main method from here, or would it be easier to simply copy and paste it
	-Is there some way to still have a file executable, but ensure that another file cannot call the main() method?
*/
public class Teller {
	public static void main(String[] args) {
		BankAccount cjb = new BankAccount();
		String[] pirate = new String[0];	//main requires a String[] arg, this generates such an arg
		cjb.main(pirate);	//testing out main

		/*
		Testing printing their variables to see if we can view them on their own
		It FAILED :( (since all the variables are private)
		Errors: varName has private access in BankAccount
		System.out.println(cjb.name);
		System.out.println(cjb.passwd);
		System.out.println(cjb.pin);
		System.out.println(cjb.acctNum);
		System.out.println(cjb.balance);
		*/

		//testing mutators
		cjb.setName("Can Josiah Beautify");
		cjb.setPasswd("TheAnswerIsNo");
		cjb.setPin((short) 2005);
		cjb.setAcctNum(123458822);
		cjb.setBalance(10.01);
		System.out.println("\n"+cjb.toString());

		//testing deposit and withdraw
		cjb.deposit(1234567);
		System.out.println("\n"+cjb.toString());
		cjb.withdraw(1234567);
		System.out.println(cjb.toString());


		//testing illegal values
		cjb.setName("\nnewlines\n");	//having new lines in names could be a pain for formatting and storing data
		cjb.setPasswd("\ncould these break a database?\n");
		cjb.setPin((short) -32000);	//illegal pin, 5 digits, negative
		cjb.setAcctNum(-2000000000);	//illegal acctNum, 10 digits, negative
		cjb.setBalance(-100.0);	//illegal balance, YOU'RE BROKE FAM
		cjb.deposit(-10000000);	//negative deposit (withdrawing)
		System.out.println("\n" + cjb.toString());
		cjb.withdraw(-10000000); //negative withdraw (depositing)
		System.out.println(cjb.toString());
	}



}
