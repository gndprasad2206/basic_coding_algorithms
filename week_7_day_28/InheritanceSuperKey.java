class Employee2{
  String name;
  String company;
  int  age;
  Employee2(String name,String company,int age){
    this.name=name;
    this.company=company;
    this.age=age;
  }
  static void print(){
    System.out.println("Employee block");
  }
  void getEmpDetails(){
    System.out.println("employee name is "+name);
    System.out.println("company name is "+company);
    System.out.println("Age of employee "+age);
  }
}
class Manager1 extends Employee2{
  int managerId;
  Manager1(String name,String company,int age,int managerId){
  super(name,company,age);
  this.managerId=managerId;
  }
  void manager(){
    System.out.println("manager details");
    System.out.println("-----------------");
    super.getEmpDetails();
    System.out.println("Manager Id is: "+managerId);
  }
}
class Accountent extends Employee2{
  int accountId;
  Accountent(String name,String company,int age,int accountId){
    super(name,company,age);
    this.accountId=accountId;
  }
  void accountent(){
    System.out.println("Accontent Details");
    System.out.println("-----------------");
    super.getEmpDetails();
    System.out.println("Accountent id is:"+accountId);
  }
}
public class InheritanceSuperKey{
  public static void main(String[] args){
    Manager1 m=new Manager1("Prasad","Bitlabs",21,232);
    Employee2.print();
    m.manager();
    System.out.println();
    Accountent acc=new Accountent("Ravi","Bitlabs",21,227);
    acc.accountent();
  }
}