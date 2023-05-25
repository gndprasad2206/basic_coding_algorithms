//WAP to find highest frequency character in a string.
import java.util.Scanner;
public class Highest_Frequency_Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  a string");
    String str=sc.nextLine();
    Highest_Frequency call=new Highest_Frequency();
    call.frequency(str);
  }
}
class Highest_Frequency{
  public void frequency(String str){
    boolean visited[]=new boolean[str.length()];
    int max=0,index=0;
    //char ch='';
    for(int i=0;i<str.length();i++){
      if(visited[i]==true)
        continue;
      int count=1;
      for(int j=i+1;j<str.length();j++){
        char ch1=str.charAt(i);
        char ch2=str.charAt(j);
        if(ch1==ch2){
          count++;
          visited[j]=true;
        }
      }
        if(max<count){
          max=count;
          index=i;//ch=str.charAt(i);
        }
      }
    System.out.println("maximum count of "+str.charAt(index)+" character is:"+max);
  }
}
 