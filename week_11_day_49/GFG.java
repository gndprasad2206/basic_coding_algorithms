import java.util.*;
  
public class GFG {
  
    // main method
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
  
        // create ArrayList list1
        ArrayList<Integer>
            list1 = new ArrayList<Integer>();
  
        // Add values in ArrayList
      for(int i=0;i<5;i++){
        int val1=sc.nextInt();
        list1.add(val1);
      }
        /*list1.add(10);
        list1.add(85);
        list1.add(25);
        list1.add(30);*/
  
        // print list 1
        System.out.println("List1: "
                           + list1);
  
        // Create ArrayList list2
        ArrayList<Integer>
            list2 = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
        int val2=sc.nextInt();
        list2.add(val2);
      }
        // Add values in ArrayList
        /*list2.add(10);
        list2.add(65);
        list2.add(30);*/
  
        // print list 2
        System.out.println("List2: "
                           + list2);
  
        // Find the common elements
        list1.retainAll(list2);
  
        // print list 1
        System.out.println("Common elements: "
                           + list1);
      Iterator ir=list1.iterator();
    while(ir.hasNext()){
      System.out.print(ir.next()+" ");
    }
    }
}