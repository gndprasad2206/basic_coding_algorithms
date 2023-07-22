//2.Write a Java program to concatenate a given string to the end of another string.
import java.util.Scanner;
class Concatenate{
  public String concatenateString(String str1,String str2){
    return (str1+" "+str2);
  }
}
public class ConcatenateMain{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Concatenate c=new Concatenate();
    System.out.println("Enter the String-1");
    String str1=sc.nextLine();
    System.out.println("Enter the String-2");
    String str2=sc.nextLine();
    System.out.println("Strings After Concatenation: "+c.concatenateString(str1, str2));
  }
}