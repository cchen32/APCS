public class factorial{
  public int factorial(int n) {
    if (n==0){
      return 1;
    }
    return factorial(n-1) * n;
  }
}
