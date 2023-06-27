import java.util.*;
class Employee_8 implements Comparable{
  String name;
  int id;
  double salary;
  public Employee_8(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;
  }
  public String toString(){
    return this.name+" "+this.id+" "+this.salary;
  }
  public int compareTo(Object obj){
    Employee_8 emp=(Employee_8)obj;
    if(this.salary<emp.salary){
      return -1;
    }
    else if(this.salary>emp.salary){
      return +1;
    }
    else{
      return 0;
    }
  }
}

public class EmployeeTreeSort2{
  public static void main(String[] args){
    TreeSet<Employee_8> ts=new TreeSet<Employee_8>();
    Employee_8 emp1=new Employee_8("Gana",232,50000);
    Employee_8 emp2=new Employee_8("Ravi",225,55000);
    Employee_8 emp3=new Employee_8("Nikhil",220,25000);
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    System.out.println(ts);
    /*for(Object obj:ts){
      Employee_6 emp=(Employee_6)obj;
      System.out.println(emp);
    }*/
    for(Employee_8 emp:ts){
      System.out.println(emp);
    }
  }
}