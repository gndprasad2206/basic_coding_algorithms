import java.util.*;
public class SortedSet2{
  public static void main(String[] args){
    TreeSet ts=new TreeSet();
    ts.add(100);
    ts.add(10);
    ts.add(55);
    ts.add(68);
    System.out.println(ts);
    System.out.println(ts.equals(100));
    ts.remove(55);
    System.out.println(ts);
  }
}