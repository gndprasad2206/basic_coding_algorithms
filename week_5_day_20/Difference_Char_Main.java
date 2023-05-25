//write a java program to find the difference between number of characters of first word and last word in a string
import java.util.Scanner;
import java.lang.Math;
class Difference_Char{
  public void differenece(String str){
    String[] s1=str.split(" ");
    int first=s1[0].length();
    int last=s1[s1.length-1].length();
    int diff=Math.abs(first-last);
    System.out.println("The charecters  difference between first and last words in given string is:"+diff);
}
}
public class Difference_Char_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    Difference_Char call=new Difference_Char();
    call.differenece(str);
  }
}
