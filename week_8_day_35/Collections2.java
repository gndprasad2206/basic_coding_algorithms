import java.util.*;
class Employee4{
  private String  name;
  private int id;
  private double salary;
  public void setName(String name){
    this.name=name;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setSalary(double salary){
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
}
public class Collections2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList arr=new ArrayList();
    Employee4 emp=new Employee4();
    Employee4 emp1=new Employee4();
    System.out.print("Enter name: ");
    emp.setName(sc.nextLine());
    System.out.print("Enter Id: ");
    emp.setId(sc.nextInt());
    System.out.print("Enter Salary: ");
    emp.setSalary(sc.nextDouble());
    arr.add(emp);
    
    //arr.add(emp.getId());
    //arr.add(emp.getSalary());
    //System.out.println(arr.toArray());
    Iterator ir=arr.iterator();
    while(ir.hasNext()){
      System.out.print(ir.next()+" ");
    }
  }
}