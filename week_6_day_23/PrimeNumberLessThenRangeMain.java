import java.util.Scanner;

/*Given an integer n, return the number of prime numbers that are strictly less than n.
 
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.*/
class PrimeNumberLessThenRange{
  public int isPrime(int n){
    int primeCount=0;
    for(int i=2;i<=n;i++){
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0)
          count++;
      }
      if(count==2)
        primeCount++;
    }
    return primeCount;
  }
}
public class PrimeNumberLessThenRangeMain{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    PrimeNumberLessThenRange call=new PrimeNumberLessThenRange();
    int primeCount=call.isPrime(n);
    System.out.println("The prime numbers count is:"+primeCount);
  }
}