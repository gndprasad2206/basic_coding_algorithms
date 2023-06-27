import java.util.*;
public class SortedSet1{
  public static void main(String[] args){
    TreeSet ts=new TreeSet();
    ts.add("Gana");
    ts.add("Ravi");
    ts.add("Charan");
    ts.add("Chaitu");
    System.out.println(ts);
    ts.remove("Charan");
    System.out.println(ts);
    System.out.println(ts.contains("Gana"));
  }
}