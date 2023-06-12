class Program{
  public void method(String str){
    String reverse="",longPalindrome="";
    int max=0;
    String words[]= str.split(" ");
    int length=words.length;
    for(int i=0;i<length;i++){
      for(int j=words[i].length()-1;j<=0;j--){
         reverse=reverse+words[i].charAt(j);
        System.out.println(words[i].charAt(j));
      }
      System.out.println(reverse);
      if(str.equals(reverse)){
      if(reverse.length()>max){
        max=reverse.length();
        longPalindrome=words[i];
      }
    }
  }
    System.out.println(longPalindrome);
  }
}
public class ProgramMian{
  public static void main(String[] args){
    String str="malayalam madam";
    Program call=new Program();
    call.method(str);
  }
}