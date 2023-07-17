//sort array list elements 
import java.util.*;
class Sort9{
  public ArrayList sort(ArrayList al){
    Collections.sort(al);
    Collections.reverse(al);
    return al;
  }
}
public class SortArrayList2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList al=new ArrayList();
    Sort9 s=new Sort9();
    System.out.println("Enter the range of ArrayList");
    int n=sc.nextInt();
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
      int val=sc.nextInt();
      al.add(val);
    }
    al=s.sort(al);
    System.out.println("After Sort ArrayList");
    Iterator ir=al.iterator();
    while(ir.hasNext()){
       System.out.print(ir.next()+" ");
    }
  }
}