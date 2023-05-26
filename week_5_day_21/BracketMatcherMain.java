/*write the method BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly
matched and each one is accounted for. Otherwise return 0. For example: if str is "(hello (world))", 
then the output should be 1, but if str is "((hello (world))" the the output should be 0
because the brackets do not correctly match up. Only "(" and ")" will be used as brackets. 
If str contains no brackets return 1.*/
import java.util.Scanner;
class BracketMatcher{
  public int isMatch(){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    int count_1=0,count_2=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='('){
        count_1++;
      }
      if(str.charAt(i)==')'){
        count_2++;
      }
    }
    if(count_1==count_2){
      return 1;
    }
    else{
      return 0;
    }
  }
}
public class BracketMatcherMain{
  public static void main(String[] args){
    BracketMatcher call=new BracketMatcher();
    System.out.println(call.isMatch());
  }
}