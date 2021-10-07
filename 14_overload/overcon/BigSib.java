//Team Trio Config For One Day: Corina Chen, Anthony Sun, Kevin Xiao
//APCS
//HW14: Customize Your Creation
//2021-10-07

//Disco
//This is the same code from 10/6--hw13 + a defualt value, wchih will be run if there is no parameter.
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
