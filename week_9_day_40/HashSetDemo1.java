import java.util.*;
public class HashSetDemo1{
  public static void main(String[] args){
    HashSet<String> hs=new HashSet<String>();
    hs.add("Gana");
    hs.add("ravi");
    hs.add("Naveen");
    hs.add("charan");
    System.out.println(hs);
    hs.remove("Naveen");
    System.out.println(hs);
    LinkedHashSet<String> lhs=new LinkedHashSet<String>();
    lhs.add("Gana");
    lhs.add("Ravi");
    lhs.add("Naveen");
    lhs.add("Charan");
    lhs.add("Gana");
    System.out.println(lhs);
    lhs.remove("Ravi");
    System.out.println(lhs);
  }
}