/*5.

Write a Java program to display the pattern like a right angle triangle with a number.

 

Test Data

Input number of rows : 10

Expected Output :

 

1                                                                                

12                                                                               

123                                                                              

1234                                                                             

12345                                                                            

123456                                                                           

1234567                                                                          

12345678                                                                         

123456789                                                                        

12345678910*/
import java.util.Scanner;
public class PrintPatteren{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the N value: ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){ //i=3 3<=3 i=2
      for(int j=1;j<=i;j++){// j=4 4<=3
        System.out.print(j);// 123
      }
      System.out.println();
    }
  }
}