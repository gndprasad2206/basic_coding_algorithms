//write a java program to print all the palindrome words in a string
import java.util.Scanner;
class Palindrome_Strings_1{
  public void isPalindrome(String str){
    String s1="";
    int count=0;
    String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
      int n=words[i].length();
      String rev="";
      for(int j=n-1;j>=0;j--){
        rev=rev+words[i].charAt(j);
      }
      System.out.println(rev);
      boolean b=words[i].equals(rev);
      if(b){
        s1=s1+words[i]+",";
        count++;
      }
    }
    if(count>=1)
      System.out.println("In given String the Palindrome Words are: "+s1.trim());
    else
      System.out.println("There is no palidrome words in given String");
}
}
public class Palindrome_Strings_Main_1{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    Palindrome_Strings_1 call=new Palindrome_Strings_1();
    call.isPalindrome(str);
  }
}