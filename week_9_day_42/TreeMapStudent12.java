import java.util.*;
class TreeMapStudent1{
  private String name;
  private double marks;
  public TreeMapStudent1(String name,double marks){
    this.name=name;
    this.marks=marks;
  }
  public String getName(){
    return name;
  }
  public double getMarks(){
    return marks;
  }
  public String toString(){
    return name+" "+marks;
  }
}
class MyComparator_4 implements Comparator<TreeMapStudent1>{
  public int compare(TreeMapStudent1 s1,TreeMapStudent1 s2){
    /*if(s1.getMarks()<s2.getMarks()){
      return 1;
    }
    else if(s1.getMarks()<s2.getMarks()){
      return -1;
    }
    else{
      return 0;
    }*/
    return s1.getName().compareTo(s2.getName());
  }
}
public class TreeMapStudent12{
  public static void main(String[] args){
    TreeMap<TreeMapStudent1,String>tmp=new TreeMap<TreeMapStudent1,String>(new MyComparator_4());
    tmp.put(new TreeMapStudent1("Gana",90), "A");
    tmp.put(new TreeMapStudent1("Ravi",80),"O");
    tmp.put(new TreeMapStudent1("Nikhil",85),"J");
    System.out.println(tmp);
    Set entires=tmp.entrySet();
    for(Object o:entires){
      Map.Entry e=(Map.Entry)o;
      System.out.println(e.getKey()+"---->"+e.getValue());
    }
  }
}