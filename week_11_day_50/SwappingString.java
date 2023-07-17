import java.util.Scanner;
class Swap{
  public void swapStrings(String str1,String str2){
    str1=str1+" "+str2;
    String words[]=str1.split(" ");
    str1=words[1];
    str2=words[0];
    System.out.println(str1+"\n"+str2);
  }
}
class SwappingString{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Swap s=new Swap();
    System.out.println("Enter the two Strings");
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    //s.swapStrings(str1, str2);
    str1=str1+" "+str2;
    String words[]=str1.split(" ");
    str1=words[1];
    str2=words[0];
    System.out.println(str1+"\n"+str2);
  }
}