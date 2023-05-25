//Encryption the given string
import java.util.Scanner;
class Encryption_Code{
  public void encryption(String str,int n){
    String en="";
    int range=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      range=n+(int)ch;
      if(range>='a'&& range<='z'){
        en=en+(char)(ch+n);
      }
      else{
        range=range-122;
        range=range+96;
        en=en+(char)range;
      }
    }
    System.out.println("The encryption code of given String is");
    System.out.println(en);
  }
}
public class Encryption_Code_Main{
  public static void main(String[] args){
    String str;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    System.out.println("Enter the intiger");
    n=sc.nextInt();
    Encryption_Code call=new Encryption_Code();
    call.encryption(str,n);
  }
}