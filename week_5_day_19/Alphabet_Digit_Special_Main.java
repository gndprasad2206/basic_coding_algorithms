//count of the Alphabets,Digits and Special Symboles in a String
import java.util.Scanner;
class Aplphabet_Digit_Special{
  public void checking(){
    String str;
    int count_a=0,count_d=0,count_s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
        count_a++;
      }
      else if(ch>='0'&&ch<='9'){
        count_d++;
      }
      else{
        count_s++;
      }
    }
    System.out.println("count of alphabets is:"+count_a);
    System.out.println("count of digits is:"+count_d);
    System.out.println("count of special charecters is:"+count_s);
  }
}
public class Alphabet_Digit_Special_Main{
  public static void main(String[] args){
    Aplphabet_Digit_Special call=new Aplphabet_Digit_Special();
    call.checking();
  }
}