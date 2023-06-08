/*create employee class print the details
name id
salary*/
import java.util.Scanner;
class EmployeeLoop{
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
public class EmployeeLoopMain{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   Employee e1=new Employee();
    e1.name=sc.nextLine();
    e1.id=sc.nextInt();
    e1.salary=sc.nextFloat();
    e1.print();
    sc.nextLine();
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