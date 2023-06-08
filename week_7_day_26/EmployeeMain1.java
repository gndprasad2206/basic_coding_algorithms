import java.util.Scanner;
class EmployeeDemo{
  String name;
  int id;
  String gender;
  long mobileNumber;
  EmployeeDemo(String name,int id,String gender,long mobileNumber){
    this.name=name;
    this.id=id;
    this.gender=gender;
    this.mobileNumber=mobileNumber;
  }
  public String getName(){
      return name;
    } 
  public int getId(){
      return id;
    }
  public String getGender(){
      return gender;
    }
  public long getMobileNumber(){
      return mobileNumber;
    }
}
public class EmployeeMain1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    EmployeeDemo[] em=new EmployeeDemo[3];
    for(int i=0;i<3;i++){
      System.out.println("Enter the "+(i+1)+" employee details");
      String name=sc.nextLine();
      int id=sc.nextInt();
      String gender=sc.nextLine();
      long number=sc.nextLong();
      em[i]=new EmployeeDemo(name,id,gender,number);
     // em[i]=new EmployeeDemo(sc.nextLine(),sc.nextInt(),sc.nextLine(),sc.nextLong());
    }
    for(int i=0;i<3;i++){
      System.out.println("Enter the "+i+" employee details");
      System.out.println("the employee name is "+em[i].getName());
      System.out.println("the employee id is "+em[i].getId());
      System.out.println("gender is: "+em[i].getGender());
      System.out.println("mobile number is "+em[i].getMobileNumber());
    }
  }
}