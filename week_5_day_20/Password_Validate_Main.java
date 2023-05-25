/*You are tasked with creating a program that validates a user's password based on a specific pattern. The pattern requires the password to meet the following criteria:
 
The password must be at least eight characters long.
The password must contain at least one uppercase letter.
The password must contain at least one lowercase letter.
The password must contain at least one digit.
The password must contain at least one special character from the set: !@#$%^&*()-_+=
*/
import java.util.Scanner;
class Password_Validate{
  public void password(String password){
    int len=password.length();
    if(len>=8){
      int count_1=0,count_2=0,count_3=0,count_4=0;
      for(int i=0;i<len;i++){
        char ch=password.charAt(i);
        if(ch>='A'&&ch<='Z'){
          count_1++;
        }
        else if(ch>='a'&&ch<='z'){
          count_2++;
        }
        else if(ch>='0'&&ch<='9'){
          count_3++;
        }
        else if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='-'||ch=='_'||ch=='+'||ch=='='){
          count_4++;
        }
        }
      if(count_1>=1&&count_2>=1&&count_3>=1&&count_4>=1){
          System.out.println("Password is valid");
        }
        else{
          System.out.println("Password is not valis");
      }
    }
    else
      System.out.println("Password is not valis");
  }
}
public class Password_Validate_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Password");
    str=sc.nextLine();
    Password_Validate call=new Password_Validate();
    call.password(str);
    
  }
}