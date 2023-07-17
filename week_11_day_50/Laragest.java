import java.util.*;
class AA{
  public void isPalindrome(String str){
    String words[]=str.split(" ");
    String larg="";
    int max=words[0].length();
    for(int i=0;i<words.length;i++){
      String rev="";
      for(int j=words[i].length()-1;j>=0;j--){
        rev=rev+words[i].charAt(j);
      }
     // System.out.println(rev);
      if(rev.equals(words[i])){
        if(words[i].length()<max){//max=0,max=5
          max=words[i].length();
          larg=words[i];
        }
      }
    }
    System.out.println("Largest Palindrome word is: "+larg);
  }
}
public class Laragest{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    AA s=new AA();
    s.isPalindrome(str);
  }
}