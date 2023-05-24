//WAP to find last occurrence of a character in a given string.
import java.util.Scanner;
class Last_Occurrence{
  public void lastChar(){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    System.out.println("Enter the charecter");
    char ch=sc.next().charAt(0);
    int index=str.lastIndexOf(ch);
    if(index>=0)
      System.out.println("The "+ch+" in index of "+index);
    else
      System.out.println("The char is not present in the String");
  }
}
public class Last_Occurrence_Main{
  public static void main(String[] args){
    Last_Occurrence call=new Last_Occurrence();
    call.lastChar();
  }
}