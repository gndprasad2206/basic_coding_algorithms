import java.util.Scanner;
class First_Latter_upper{
  public void upper_Case(String str){
    String upper="";
    String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
      upper=upper+words[i].substring(0,1).toUpperCase()+words[i].substring(1);
      upper=upper+" ";
    }
    System.out.println(upper);
  }
}
public class First_Latter_upper_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    First_Latter_upper call=new First_Latter_upper();
    call.upper_Case(str);
  }
}