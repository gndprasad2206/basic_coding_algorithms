//program to find the frequency of a charecters in a String
import java.util.Scanner;
class Frequency_String{
  public void frequency(){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    boolean visiter[]=new boolean[str.length()];
    for(int i=0;i<visiter.length;i++){
      if(visiter[i]==true)
        continue;
      int count=1;
      for(int j=1+i;j<visiter.length;j++){
        char ch_1=str.charAt(i);
        char ch_2=str.charAt(j);
        if(ch_1==ch_2){
          count++;
          visiter[j]=true;
        }
      }
      System.out.println("The count of "+str.charAt(i)+" is:"+count);
    }
    
  }
}
public class Frequency_String_Main{
  public static void main(String[] args){
    Frequency_String call=new Frequency_String();
    call.frequency();
  }
}