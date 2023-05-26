//program to illustrate StringBuffer methods
public class Str5 {
  public static void main(String args[]) {
    //creating StringBuffer object using default constructor
    StringBuffer sb = new StringBuffer("This is Text");
    System.out.println(sb);
    //insert "a Sample" string after "is"
    //index starts with 0 so the index of s is 6
    sb.insert(7, " a Sample");
    System.out.println("after Inserting:"+sb);
 
    sb.append(" Book");
    System.out.println("after appending:"+sb);
 
    
 
    //replace "Book" with "Message"
    int index=sb.indexOf("Book");
    sb.replace(index,sb.length(),"Message");
    System.out.println("after replacing:"+sb);
 
    //deleting the substring
    sb.delete(index,sb.length());
    System.out.println("after deleting:"+sb);
 
    //reversing the string
    sb.reverse();
    System.out.println("after reversing:"+sb);
    
  }
}