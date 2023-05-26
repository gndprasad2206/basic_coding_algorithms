//Multiple String Methods
class String_Methods{
  public void stringMethods(){
    StringBuffer str =new StringBuffer("Vijayawada City view");
    System.out.println("The orginal string:"+str+"\n");
    str.insert(15," is have good");        //inserting a string
    System.out.println("string after insert a string:"+str+"\n");
    str.append(" at krishna");              //Appending a string
    System.out.println("String after append:"+str+"\n");
    int index=str.indexOf("krishna");
    str.replace(index,str.length()," temple");   //replace String
    System.out.println("String after replace:"+str+"\n");
    str.delete(11,19);                    //deleting String
    System.out.println("String after deletion:"+str+"\n");
    System.out.println("String after reverse "+str.reverse());//reverse the String
  }
}
public class String_Methods_Main{
  public static void main(String[] args){
    String_Methods call=new String_Methods();
    call.stringMethods();
  }
}