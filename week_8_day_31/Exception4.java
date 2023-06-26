//4. Employee Management: Create a class called Employee that represents an employee and a class called Company that represents a company. The company class should have methods to add, remove, and display employees. You can also create a custom exception called InvalidSalaryException to throw when an employee's salary is below the minimum wage.
import java.util.Scanner;
class Employee_5{
  private String name;
  private double salary;
  private int id;
  /*public Product_1(String name,double price,int quantity){
    this.name=name;
    this.price=price;
    this.quantity=quantity;
  }*/
  public void setName(String name){
    this.name=name;
  }
  public void setSalary(double salary){
    this.salary=salary;
  }
  public void setId(int id){
    this.id=id;
  }
  
  public String getName(){
    return name;
  }
  public double getSalary(){
    return salary;
  }
  public int getId(){
    return id;
  }
}
class Company extends Employee_5{
  Scanner sc=new Scanner(System.in);
  public void addEmployee(Employee_5 emp[]){
    Employee_5 newEmp[]=new Employee_5[emp.length+1];
    int l=newEmp.length-1;
    newEmp[l]=new Employee_5();
    for(int i=0;i<emp.length;i++){
      newEmp[i]=emp[i];
    }
    System.out.print("Entre name: ");
    newEmp[l].setName(sc.nextLine());
    System.out.print("Ente Salary: ");
    newEmp[l].setSalary(sc.nextDouble());
    System.out.print("Enter Id: ");
    newEmp[l].setId(sc.nextInt());
    
    for(int i=0;i<newEmp.length;i++){
      System.out.println();
      System.out.println("Name: "+newEmp[i].getName());
      System.out.println("Salary: "+newEmp[i].getSalary());
      System.out.println("Id: "+newEmp[i].getId());
    }
  }
  public void removeEmployee(Employee_5 emp[],int index){
    Employee_5 newEmp[]=new Employee_5[emp.length-1];
    int k=0;
    for(int i=0;i<emp.length;i++){
      if(index==i){
        continue;
      }
      else{
        newEmp[k++]=emp[i];
      }
    }
    for(int j=0;j<newEmp.length;j++){
      System.out.println();
      System.out.println("Name: "+newEmp[j].getName());
      System.out.println("Salary: "+newEmp[j].getSalary());
      System.out.println("Id: "+newEmp[j].getId());
    }
  }
  public void display(Employee_5 emp[]){
    for(int i=0;i<emp.length;i++){
      System.out.println("Enter the "+(1+i)+" Employee wages");
      int wages=sc.nextInt();
      try{
        if(emp[i].getSalary()<wages){
        throw new InvalidSalaryException("InvalidSalaryException");
        }
      else{
        System.out.println("Name: "+emp[i].getName());
            System.out.println("Price: "+emp[i].getSalary());
            System.out.println("Qunatity: "+emp[i].getId());
          }
        }
      catch(InvalidSalaryException e){
        System.out.println("Exception: "+e.getMessage());
        System.exit(0);
      }
    }
  }
}
class InvalidSalaryException extends Exception{
  public InvalidSalaryException(String str){
    super(str);
  }
}
public class Exception4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the count of Employees");
    int n=sc.nextInt();
    Employee_5 emp[]=new Employee_5[n];
    for(int i=0;i<emp.length;i++){
      emp[i]=new Employee_5();
      System.out.println("Enter the "+(1+i)+" Employee Details");
      sc.nextLine();
      System.out.print("Enter name: ");
      emp[i].setName(sc.nextLine());
      System.out.print("Enter Salary: ");
      emp[i].setSalary(sc.nextDouble());
      System.out.print("Enter Id: ");
      emp[i].setId(sc.nextInt());
    }
    System.out.println("1.Add Employee\n2.Remove Employee\n3.Display Employees\nSelect one option");
    int choice=sc.nextInt();
    Company c=new Company();
    switch(choice){
      case 1:
        c.addEmployee(emp);
        break;
      case 2:
        //Store s=new Store();
        System.out.println("Enter Index value to remove Employee");
        int ind=sc.nextInt();
        c.removeEmployee(emp,ind);
        break;
      case 3:
        c.display(emp);
        break;
      default:
        System.out.println("Invalid Option");
    }
  }
}