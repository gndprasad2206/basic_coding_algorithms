import java.util.*;
class Collections1{
  public static void main(String[] args){
    ArrayList arr1=new ArrayList();
    arr1.add("G");
    arr1.add("A");
    ArrayList arr=new ArrayList();
    arr.add("N");
    arr.add("A");
    arr.add(".R");
    arr1.addAll(arr);
    System.out.println(arr1.size());
    System.out.println(arr1);
    ArrayList arr2=new ArrayList();
    arr2.add("Prasad");
    arr1.addAll(arr2);
    System.out.println(arr1);
    System.out.println(arr1.remove(".R"));
    System.out.println(arr1);
    Iterator i=arr1.iterator();
    while(i.hasNext()){
      System.out.println(i.next()+" ");
    }
  }
}