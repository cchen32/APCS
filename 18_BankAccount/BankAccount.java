// TNPG Can Josiah Beautify?: Brian Wang, Josiah Moltz, Corina Chen
// APCS
// HW18 -- CPA-One / Building code from UML / Creating a java code for a Bank Account (from UML)
// 2021-10-14

/*
DISCO
- Originally we had the same name for instance variables and function parameters
  This would have led to the awkward statement "name=name;" for two different names
- Printing the BankAccount cjb yields BankAccount@1eb44e46
- There is no default .toString() method for objects (?)
- static means outside the class (?)
	so when trying to run (in main method) non-static methods
	we have to specify from what object they are coming from for main to recognize them.
	However by creating an OBJECT, and referencing methods from the OBJECT (object.method)
	main knows where to operate.
- Creating an OBJECT of BankAccount in a non-static method of BankAccount,
	and then trying to operate on that OBJECT yields an infinite loop (muy mal) (tested with foo in printInfo)
- \n is a new line

QCC
- Can you call an OBJECT of ANOTHER class inside a non-static method?
- What exactly does it mean to be static/outside the class????
	How would this compile since its its generating a class?
-

Team Can Josiah Beautify's Latest and Greatest Q2 Response:
Java still allows us to create an object of class BigSib even though we have not yet written the constructor for BigSib because there is a default constructor.

Team Can Josiah Beautify's Latest and Greatest Q3 Response:
Print it!!! See if the result is giberish (type@num) or readable
See if .toString() method changes the result of printing the object to make it readable by humans
*/


public class BankAccount {
	//instance variables
	private String name;
	private Integer accountNum;
	private Integer pin;
	private String password;
	private Double balance; // In cents

	//constructors
	public BankAccount() {
		//NA
	}

	public BankAccount(String inName, Integer inAccountNum, Integer inPin, String inPassword, Double inBalance) {
		name = inName;
		accountNum = inAccountNum;
		pin = inPin;
		password = inPassword;
		balance = inBalance;
	}

	//methods
	public void setName(String inName) {
		name = inName;
	}

	public void setAccountNum(int inAccountNum) {
		if (0 <= inAccountNum && inAccountNum < 1000000000) {
			//making sure accountNum is 9 digits (or less)
			accountNum = inAccountNum;
		}
		else {
			System.out.println("Please input an account number NINE digits or less!!! (also have a great day!!)");
		}
	}

	public void setPin(int inPin) {
		if (0 <= inPin && inPin < 10000) {
			//making sure pin is 4 digits (or less)
			pin = inPin;
		}
		else {
			System.out.println("Please input a pin FOUR digits or less!!! (also have a great day!!)");
		}
	}

	public void setPassword(String inPassword) {
		password = inPassword;
	}

	public void setBalance(Double inBalance) {
		balance = inBalance;
	}

	public void withdraw(Double inAmount) {
		inAmount *= 100;	//Converting from dollars to cents
		balance -= inAmount;
	}

	public void deposit(Double inAmount) {
		inAmount *= 100;
		balance += inAmount;
	}

	public void printInfo() {
		System.out.println("NAME: " + name);
		System.out.println("ACCOUNT NUM: " + accountNum);
		System.out.println("PIN: " + pin);
		System.out.println("PASSWORD: " + password + " (SECURITY COMPROMISED!!!)");
		System.out.println("BALANCE: " + balance / 100.0 + "\n");
		//BankAccount foo = new BankAccount();
		//foo.printInfo();
	}

	//main
	public static void main(String[] args) {
		BankAccount cjb = new BankAccount("Lawrence Parker", 123456789, 3579, "password", -42.0);
		cjb.printInfo();

		cjb.setName("Can Josiah Beautify?");
		cjb.setAccountNum(226238705);
		cjb.setPin(8191);
		cjb.setPassword("hackme");
		cjb.setBalance(4200.0);
		cjb.printInfo();

		cjb.deposit(58.0);
		cjb.printInfo();

		cjb.withdraw(100.01);
		cjb.printInfo();

		cjb.setAccountNum(-1);
		cjb.setAccountNum(2000000000);
		cjb.setPin(-1);
		cjb.setPin(99999);
		cjb.printInfo();
		//System.out.println(cjb);
		//System.out.print(cjb + " hello");
		//System.out.println(cjb.toString());
	}
}
