// TNPG Can Josiah Beautify?: Brian Wang, Josiah Moltz, Corina Chen
// APCS pd6
// HW19 -- Mo Money Mo Problems ...MORE AWESOME / Conditionals / Fixing our Bank Accounts
// 2021-10-18

/**
DISCO (DANCE!!)
  -short (if not used in a variable (courtesy of TNPG Geese 's code)), must start with (short). EX. "(short) 123", or "(short)123"
  -Cents are a real problem, since what should be 0.01 came out to being 0.010000000000005116.
   The reason being is that .01 (in decimal) is a repeating decimal in binary.
  -Boolean values have nice string representations
QCC (Quack Quack go the Duckies!!)
  -Would rounding fix the cents issue?
   How inaccurate will Java get when computing the balance in terms of cents?
   Will it ever actually affect the monetary value (as in can the error affect the hundredths place)?
**/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    if (1000 <= newPin && newPin <= 9998) {
      //Checks to make sure pin will be exactly 4 digits
      pin = newPin;
    }
    else {
      pin = 9999;
      System.out.println("Whoops, please input a FOUR digit Pin!! Have a nice day!!");
    }
    return oldPin;
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum;
    if (100000000 <= newAcctNum && newAcctNum <= 999999998) {
      //Checks to make sure acctNum will be exactly 9 digits
      acctNum = newAcctNum;
    }
    else {
      acctNum = 999999999;    //In case of failure
      System.out.println("Whoops, please input a NINE digit Account Number!! Have a nice day!!");
    }
    return oldAcctNum;
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public boolean withdraw( double withdrawAmount ) {
    if (balance >= withdrawAmount) {
      balance = balance - withdrawAmount;
      return true;
    }
    else {
      System.out.println("Whoops, you would go into debt if you did that (and you wouldn't want that, would you?)!! Please reconsider!!");  //ultra passive-agressive
      return false;
    }
  }
  //---------------------------------------------


  public boolean authenticate( int inpAcctNum, String inpPasswd) {
    return (inpAcctNum == acctNum) && (inpPasswd == passwd);
  }


  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {
    BankAccount ba = new BankAccount();

    //printing OG values
    System.out.println("OG");

    System.out.println(ba);
    System.out.println(ba.toString());

    //setting bank account values (nothing fancy)
    System.out.println("\nMUTATORS");

    System.out.println(ba.setName("Can Josiah Beautify?"));
    System.out.println(ba.setAcctNum(226238705));
    System.out.println(ba.setPin((short)8191));
    System.out.println(ba.setPasswd("hackme"));
    System.out.println(ba.setBalance(42.0));
    System.out.println(ba.toString() + "\n");

    //testing deposit
    System.out.println("\nDEPOSIT");

    ba.deposit(58.0);
    System.out.println(ba.toString() + "\n");

    //testing withdraw
    System.out.println("\nWITHDRAW");

    ba.withdraw(99.99);  //1 cent poses a problem with accuracy (-0.01...5)
    System.out.println(ba.toString() + "\n");

    //testing "error-cases"
    System.out.println("\nERROR CASES!!!");

    System.out.println(ba.setAcctNum(-1));
    System.out.println(ba.setAcctNum(2000000000));
    System.out.println(ba.setPin((short)-1));
    System.out.println(ba.setPin((short)99999));
    ba.withdraw(1.0);

    System.out.println(ba.toString() + "\n");

    //testing authenticate
    System.out.println("\nAUTHENTICATE");

    System.out.println(ba.authenticate(1,"totallyLegit100%RealPassword"));
    System.out.println(ba.authenticate(ba.acctNum,ba.passwd));  //"That's cheating" - BW
  }//end main()

}//end class BankAccount 
