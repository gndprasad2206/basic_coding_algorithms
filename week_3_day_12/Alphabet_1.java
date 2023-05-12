//7. WAP to check whether a character is alphabet or not.
import java.util.Scanner;
class Alphabet_1{
  public static void main(String[] args){
    char varible;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the charecter");
    varible=sc.next().charAt(0);
    if((varible>='a' && varible<='z')||(varible>='A' && varible<='Z')){
      System.out.println("The entered charecter is a Alphabet");
    }
    else{
      System.out.println("The entered charecter is not a alphabet");
    }
  }
}