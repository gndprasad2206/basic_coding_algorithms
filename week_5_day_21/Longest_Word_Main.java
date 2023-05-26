//write a java program that returns the longest word in the string.If there are two or more words that are the same length, return the first word from the string with that length. Words may also contain numbers, for example "Hello world123 567"
import java.util.Scanner;
class Longest_Word{
  public void longWord(String str){
    String words[]=str.split(" ");
    int max=words[0].length();
    String s1=words[0];
    for(int i=1;i<words.length;i++){
      int len_1=words[i].length();
      if(max<len_1){
        max=words[i].length();
        s1=words[i];
      }
    }
    System.out.println("The longest word in a string is "+s1+" and the length is: "+max);
  }
}
public class Longest_Word_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    Longest_Word call=new Longest_Word();
    call.longWord(str);
    
  }
}