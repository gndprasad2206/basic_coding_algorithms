import java.util.*;
public class Vectors1{
  public static void main(String[] args){
    Vector<String> vec=new Vector<String>(2);
    vec.add("G");
    vec.add(1, "A");
    vec.addElement("N");
    vec.addElement("A");
    System.out.println(vec);
    System.out.println("Size of the Vector: "+vec.size());
    System.out.println("Capacity of Vector: "+vec.capacity());
    System.out.println("Element At first index "+ vec.get(1));
    vec.addElement("Prasad");
    System.out.println(vec);
    vec.remove(0);
    System.out.println(vec);
    vec.remove(0);
    System.out.println(vec);
    vec.remove(0);
    System.out.println(vec);
    vec.remove(0);
    System.out.println(vec);
    
  }
}