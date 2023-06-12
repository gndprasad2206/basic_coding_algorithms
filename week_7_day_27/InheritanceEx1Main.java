class Employee1{
  String profession="Teaching";
  String company="Bitlabs";
  void does(){
    System.out.println("trainer");
  }
}
class SoftSkillTeacher extends Employee1{
  String name="Avinash";
  String mainSub="SoftSkill";
}
class TechnicalTeacher extends Employee1{
  String name="Pavan";
  String mainSub="Technical";
}
public class InheritanceEx1Main{
  public static void main(String[] args){
    Employee1 obj1=new Employee1();
    System.out.println("first employee details");
    System.out.println("profession is:"+obj1.profession);
    System.out.println("company name is: "+obj1.company);
    //System.out.println("Mentor name is: "+obj1.name);
    //System.out.println("main subject is: "+obj1.mainSub);
    obj1.does();
    System.out.println();
    System.out.println("second employee details");
    TechnicalTeacher obj2=new TechnicalTeacher();
    System.out.println("profession is:"+obj2.profession);
    System.out.println("company name is: "+obj2.company);
    System.out.println("Mentor name is: "+obj2.name);
    System.out.println("main subject is: "+obj2.mainSub);
    obj2.does();
  }
}