//write a java program to reverse each word at its place in a string                                                           Sample input: Learning made easy at bitLabs
                    //Expected output: gninraeL edam ysae ta sbaLtib
import java.util.Scanner;
class Encryption_Code_1{
  public void encryption(String str){
    String en="";
    int position=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      int n=ch;
      en=en+(char)(122-(n-97));
    }
    System.out.println(en);
  }
}
public class Encryption_Code_Main_1{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    Encryption_Code_1 call=new Encryption_Code_1();
    call.encryption(str);
  }
}