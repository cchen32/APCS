//Corina Chen
//APCS
//HW12: Where do BigSibs Come From?
//2021-10-06

public class BigSib{
  public String helloMsg;
  /*public void setHelloMesg(String input){
    setHelloMsg = input;
  }*/
  public BigSib(String setHelloMsg){
    helloMsg = setHelloMsg;
  }
  public String greet(String anInput){
    return helloMsg + " " + anInput;
  }
}
