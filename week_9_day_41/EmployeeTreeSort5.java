import java.util.*;
class Employee_9{
  String name;
  int id;
  String add;
  double salary;
  public Employee_9(String name,int id,double salary,String add){
    this.name=name;
    this.id=id;
    this.salary=salary;
    this.add=add;
  }
  public String toString(){
    return this.name+" "+this.id+" "+this.salary+" "+this.add;
  }
}
public class EmployeeTreeSort5{
  public static void main(String[] args){
    TreeSet<Employee_9> ts=new TreeSet<Employee_9>(new MyComparator3());
    Employee_9 emp1=new Employee_9("Gana",232,50000,"godavari");
    Employee_9 emp2=new Employee_9("Ravi",225,50000,"kadapa");
    Employee_9 emp3=new Employee_9("Nikhil",244,50000,"kannadaa");
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    System.out.println(ts);
    for(Employee_9 emp:ts){
      System.out.println(emp);
    }
  }
}
class MyComparator3 implements Comparator<Employee_9>{
  public int compare(Employee_9 obj1,Employee_9 obj2){
    int val=((obj1.add).length())-((obj2.add).length());
    if(val==0){
      return obj1.name.compareTo(obj2.name);
    }
    else{
      return val;
    }
  }
  
}