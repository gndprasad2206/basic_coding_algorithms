import java.util.*;
import java.util.ArrayList;
import java.util.ListIterator;
public class Collections3{
  public static void main(String[] args){
    ArrayList<String> arr=new ArrayList<String>();
    arr.add("A");
    arr.add("B");
    arr.add("C");
    arr.add("D");
    arr.add("T");
    System.out.println("The Original List");
    for(String s:arr){
      System.out.print(s+" ");
    }
    arr.add(5,"E");
    arr.add(6,"F");
    System.out.println();
    System.out.println("List After adding new values in Forward direction");
    ListIterator ir=arr.listIterator();
    while(ir.hasNext()){
      System.out.print(ir.next()+" ");
    }
    System.out.println();
    System.out.println("List In backward direction");
    while(ir.hasPrevious()){
      System.out.print(ir.previous()+" ");
    }
  }
}