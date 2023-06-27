import java.util.*;
public class SortedSet3{
  public static void main(String[] args){
    TreeSet ts=new TreeSet(new MyComparator());
    ts.add("Gana");
    ts.add("Charan");
    ts.add("Ravi");
    ts.add("Vamsi");
    System.out.println(ts);
  }
}
class MyComparator implements Comparator{
  public int compare(Object obj1,Object obj2){
    String str1=(String)obj1;
    String str2=(String)obj2;
    return - str1.compareTo(str2);
  }
}