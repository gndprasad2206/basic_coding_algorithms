/*3.

Write a Java program to display the cube of the given number up to an integer.

 

Test Data

Input number of terms : 4

Expected Output :

 

Number is : 1 and cube of 1 is : 1                                               

Number is : 2 and cube of 2 is : 8                                               

Number is : 3 and cube of 3 is : 27                                              

Number is : 4 and cube of 4 is : 64
*/
import java.util.Scanner;
class Cube{
  public int cubeValue(int n){
    return (n*n*n);
  }
}
public class CubeOfNumbers{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the N value: ");
    int n=sc.nextInt();
    Cube c=new Cube();
    System.out.println("Number is:"+n+" And Cube Of "+n+" is:"+c.cubeValue(n));
  }
}