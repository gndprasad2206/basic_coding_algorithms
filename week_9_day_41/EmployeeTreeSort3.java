import java.util.*;
class Employee_6 implements Comparable{
  String name;
  int id;
  double salary;
  public Employee_6(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;
  }
  public int compareTo(Object obj){
    Employee_6 emp=(Employee_6)obj;
    int val=this.name.compareTo(emp.name);
    return val;
  }
  public String toString(){
    return this.name+" "+this.id+" "+this.salary;
  }
}
public class EmployeeTreeSort3{
  public static void main(String[] args){
    TreeSet<Employee_6> ts=new TreeSet<Employee_6>();
    Employee_6 emp1=new Employee_6("Gana",232,50000);
    Employee_6 emp2=new Employee_6("Ravi",225,55000);
    Employee_6 emp3=new Employee_6("Nikhil",220,50000);
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    System.out.println(ts);
    /*for(Object obj:ts){
      Employee_6 emp=(Employee_6)obj;
      System.out.println(emp);
    }*/
    for(Employee_6 emp:ts){
      System.out.println(emp);
    }
  }
}