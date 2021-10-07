//Team Trio Config For One Day: Corina Chen, Anthony Sun, Kevin Xiao
//APCS
//HW14: Customize Your Creation
//2021-10-07

//Disco
//The constructor can be overloaded to perform different tasks if given different argument inputs.
//You can stack multiple constructors of the same name in the same file (overloading).
//Each Other's Ducky Names

//QCC
//What happens if a constructor is private?
//Why doesn't a constructor have "static"?
//

public class BigSib{
	public String helloMsg;
	
	public BigSib(){
		helloMsg = "Hello";
	}
	public BigSib(String setHelloMsg){
		helloMsg = setHelloMsg;
	}
	
	public String greet(String input){
		return helloMsg + " " + input;
	}
}
