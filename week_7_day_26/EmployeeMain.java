/*create employee class print the details
name id
salary*/
class Employee{
  String name;
  int id;
  float salary;
  static String company="bitlabs";
  public void print(){
    System.out.println("employee name is:"+name);
    System.out.println("employee id is:"+id);
    System.out.println("employee salary is:"+salary);
    System.out.println("Company name is:"+company);
    System.out.println();
  }
}
public class EmployeeMain{
  public static void main(String[] args){
    Employee e1=new Employee();
    e1.name="prasad";
    e1.id=1;
    e1.salary=50000;
    e1.print();
    e1.company="tekworks";
    Employee e2=new Employee();
    e2.name="ravi";
    e2.id=2;
    e2.salary=50000;
    e2.print();
    Employee e3=new Employee();
    e3.name="charan";
    e3.id=3;
    e3.salary=50000;
    e3.print();
  }
}