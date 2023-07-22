//1.Write a Java program to get the character (Unicode code point) at the given index within the string.
import java.util.Scanner;
class UniCode{
  public int getUniCodeOfChar(String str,int index){
    char ch;
    if(str.length()>index){
      ch=str.charAt(index);
     int unicode=ch;
      return unicode;
    }
    else{
      return -1;
    }
  }
}
public class UniCodeOfCharecter{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The String");
    String str=sc.nextLine();
    UniCode uc=new UniCode();
    System.out.println("Enter the Index Value");
    int index=sc.nextInt();
    if(uc.getUniCodeOfChar(str,index)!=-1){
      System.out.println("The UniCode Value of "+str.charAt(index)+": "+uc.getUniCodeOfChar(str,index));
    }
    else{
      System.out.println("Invalid index value");
    }
  }
}