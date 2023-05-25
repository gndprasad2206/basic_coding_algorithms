//write a java program to find the frequency of each word in a string
import java.util.Scanner;
class Frequency_Word{
  public void frequency(String str){
    String s1[]=str.split(" ");
    boolean visiter[]=new boolean[s1.length];
    for(int i=0;i<s1.length;i++){
      if(visiter[i]==true){
        continue;
      }
      int count=1;
      for(int j=1+i;j<s1.length;j++){
        boolean b=s1[i].equals(s1[j]);
        if(b){
          count++;
          visiter[j]=true;
        }
      }
      System.out.println("The word "+s1[i]+" count is:"+count);
    }
  }
}
public class Frequency_Word_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    Frequency_Word call =new Frequency_Word();
    call.frequency(str);
    
  }
}