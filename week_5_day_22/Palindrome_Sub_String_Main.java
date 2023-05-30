//write a java program to find the largest palindrome substring in a string
import java.util.Scanner;
import java.lang.StringBuffer;
class Palindrome_Sub_String{
  public void long_Palindrome(String str){
   String largest_Palindome="";
    int length=str.length();
    int max_len=0;
    for(int i=0;i<length;i++){
      for(int j=i+1;j<=length;j++){
        String subString=str.substring(i,j);
        if(isPalindrome(subString)&&subString.length()>max_len){
          largest_Palindome=subString;
          max_len=subString.length();
        }
      }
    }
    System.out.println("The largest palindrome sub-String is "+largest_Palindome+" with length of "+max_len);
  }
  public static boolean isPalindrome(String str){
     StringBuffer str_1=new StringBuffer(str);
    String dup=str_1.toString();
    str_1.reverse();
    String eq_1=str_1.toString();
    String eq_2=dup;
    boolean b=eq_2.equals(eq_1);
    if(b)
      return true;
    else
      return false;
  }
}
public class Palindrome_Sub_String_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    Palindrome_Sub_String call=new Palindrome_Sub_String();
    call.long_Palindrome(str);
    
  }
}