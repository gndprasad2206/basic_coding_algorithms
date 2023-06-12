class Persone{
  String name;
  String address;
  void print(){
    System.out.println("persone class");
  }
}
class Employee_1 extends Persone{
  String company;
  int id;
  void print1(){
    System.out.println("Employee class ");
  }
}
class Manager extends Employee_1{
  void coding(){
    System.out.println("Export in coding");
  }
  Manager(String name,String Address,String company,int id){
    this.name=name;
    this.address=address;
    this.company=company;
    this.id=id;
  }
}
public class MultiLevelInheritance{
  public static void main(String[] args){
    Employee_1 obj=new Manager("prasad","vij","bitlabs",232);
    obj.print();
    System.out.println(obj.name);
    System.out.println(obj.address);
    obj.print1();
    System.out.println(obj.company);
    System.out.println(obj.id);
    //obj.coding();
    
  }
}