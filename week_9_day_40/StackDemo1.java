import java.util.*;
public class StackDemo1{
  public static void main(String[] args){
    Stack<String> s=new Stack<String>();
    s.push("G");
    s.add(1, "A");
    s.addElement("N");
    s.push("A");
    System.out.println(s);
    System.out.println(s.peek());
    s.push("Prasad");
    System.out.println(s.search("Prasad"));
    s.pop();
    System.out.println(s);
  }
}