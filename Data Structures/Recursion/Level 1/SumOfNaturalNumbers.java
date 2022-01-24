class SumOfNaturalNumbers{
  public static void sumOfNumbers(int i, int n, int sum){
    if(i==n){
      sum +=i;
      System.out.println("sum= "+sum);
      return;
    }
    sum+=i;
    sumOfNumbers(i+1,n,sum);
  }
  public static void main(String[] args) {
       sumOfNumbers(1,5,0);
  }
}
