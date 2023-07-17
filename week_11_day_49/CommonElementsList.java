import java.util.*;
class CommonElements{
  public ArrayList<Integer> commomListElements(ArrayList<Integer> al1,ArrayList<Integer> al2){
   al2.retainAll(al1);
  return al2;
    
  }
}
public class CommonElementsList{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> al1=new ArrayList<Integer>();
    ArrayList<Integer> al2=new ArrayList<Integer>();
    CommonElements cm=new CommonElements();
    System.out.println("Enter range of list-1");
    int n1=sc.nextInt();
    System.out.println("Enter the Elements");
    for(int i=0;i<n1;i++){
      int val1=sc.nextInt();
      al1.add(val1);
    }
    System.out.println("Enter range of list-2");
    int n2=sc.nextInt();
    System.out.println("Enter the Elements");
    for(int i=0;i<n2;i++){
      int val2=sc.nextInt();
      al2.add(val2);
    }
    ArrayList<Integer> al;
    al=cm.commomListElements(al1, al2);
    System.out.println("Common Elements In two Lists");
    Iterator ir=al.iterator();
    while(ir.hasNext()){
      System.out.print(ir.next()+" ");
    }
  }
}