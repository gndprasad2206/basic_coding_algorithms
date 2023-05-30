//write a java program to  check whether two strings are anagrams or not 
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
class Anagrams_String{
  public boolean isAnagram(String str_1,String str_2){
    int len_1=str_1.length();
    int len_2=str_2.length();
    if(len_1==len_2){
      str_1=str_1.toLowerCase();
      str_2=str_2.toLowerCase();
      char arr_1[]=str_1.toCharArray();
      char arr_2[]=str_2.toCharArray();
      Arrays.sort(arr_1);
      Arrays.sort(arr_2);
      String str1=new String(arr_1);
      String str2=new String(arr_2);
      boolean b=str1.equalsIgnoreCase(str2);
      if(b)
        return true;
      else
        return false;
    }
    else{
    return false;
    }
  }
}
public class Anagrams_String_Main{
  public static void main(String[] args){
    String str_1,str_2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String_1 and String_2");
    str_1=sc.nextLine();
    str_2=sc.nextLine();
    Anagrams_String call=new Anagrams_String();
    boolean s=call.isAnagram(str_1,str_2);
    if(s)
      System.out.println("The given strings are Anagram Strings");
    else
      System.out.println("The given Strings are not a Anagram Strings");
  }
}