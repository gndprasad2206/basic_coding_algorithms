/*2.Write a Java program to display n terms of natural numbers and their sum.

 

Test Data

Input the number: 2

Expected Output :

 

Input number:                                                                    

2                                                                                

The first n natural numbers are :                                                

2                                                                                

1                                                                                

2                                                                                

The Sum of Natural Number upto n terms :                                         

23
*/
import java.util.Scanner;
public class NaturalNumbersSum{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter N Value: ");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
    System.out.println("Sum Of "+n+" Natural Numbers: "+sum);
  }
}