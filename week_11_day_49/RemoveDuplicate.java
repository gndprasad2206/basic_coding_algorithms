import java.util.*;
class Remove{
  public ArrayList removeduplicate(ArrayList al){
    HashSet hs=new HashSet(al);
    al.clear();
    al.addAll(hs);
    return al;
  }
}
public class RemoveDuplicate{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Remove r=new Remove();
    ArrayList al=new ArrayList();
    System.out.println("Enter the Range of list");
    int n=sc.nextInt();
    System.out.println("Enter Elements");
    for(int i=0;i<n;i++){
      int val=sc.nextInt();
      al.add(val);
    }
    al=r.removeduplicate(al);
    System.out.println("List After remove duplicates");
    Iterator ir=al.iterator();
    while(ir.hasNext()){
      System.out.print(ir.next()+" ");
    }
  }
}