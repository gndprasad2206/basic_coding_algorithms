//write a java program to print all the palindrome words in a string
import java.util.Scanner;
class Palindrome_Strings{
  public void isPalindrome(String str){
    String words[]=str.split(" ");
    String rev="",dupl="";
    int max=0;
    for(int i=0;i<words.length;i++){
      int n=words[i].length();
      for(int j=n-1;j>=0;j--){
        rev=rev+words[i].charAt(j);
      }
      boolean b=words[i].equals(rev);
      if(b){
        if(max<rev.length()){
          max=rev.length();
          dupl=words[i];
        }
      }
    }
    if(dupl!=""){
    System.out.println("The Largest palindrome word in given String is:"+dupl+" and its length is "+max);
  }
    else{
      System.out.println("There is no Palindrome word in a string");
    }
}
}
public class Palindrome_Strings_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    Palindrome_Strings call=new Palindrome_Strings();
    call.isPalindrome(str);
  }
}