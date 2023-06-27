import java.util.*;
class Employee_7{
  private String name;
  private int id;
  private double salary;
  public Employee_7(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public double getSalary(){
    return salary;
  }
  public String toString(){
    return(" "+this.name+" "+this.id+" "+this.salary);
  }
}
public class EmployeeTreeSorting{
  public static void main(String[] args){
    TreeSet<Employee_7> ts=new TreeSet<Employee_7>(new MyComparator2());
    Employee_7 emp1=new Employee_7("Gana",232,20000);
    Employee_7 emp2=new Employee_7("Ravi",225,20000);
    Employee_7 emp3=new Employee_7("Nikhil",224,20000);
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    System.out.println(ts);
  }
}
class MyComparator2 implements  Comparator<Employee_7>{
  public int compare(Employee_7 obj1,Employee_7 obj2){
    return (obj1.getName()).compareTo(obj2.getName());
  }
}