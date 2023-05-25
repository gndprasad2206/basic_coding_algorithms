//write a java program to find the frequency of characters of last word of a string
import java.util.Scanner;
class Frequnecy_Last_Char{
  public void frequency(String str){
    String[] s1=str.split(" ");
    int n=s1.length-1;
    boolean visiter[]=new boolean[s1[n].length()];
    String duplicate =s1[s1.length-1];
    for(int i=0;i<s1[n].length();i++){
      if(visiter[i]== true)
        continue;
      int count=1;
      for(int j=1+i;j<s1[n].length();j++){
        char ch1=duplicate.charAt(i);
        char ch2=duplicate.charAt(j);
        if(ch1==ch2){
          count++;
          visiter[j]=true;
        }
      }
      System.out.println("The charecter "+duplicate.charAt(i)+" count is:"+count);
    }
  }
}
public class Frequnecy_Last_Char_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String ");
    str=sc.nextLine();
    Frequnecy_Last_Char call=new Frequnecy_Last_Char();
    call.frequency(str);
  }
}