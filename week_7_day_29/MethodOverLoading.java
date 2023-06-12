class Student{
  void details(String  name,int id){
    System.out.println("name of the student is:"+name);
    System.out.println("Student id is:"+id);
  }
  void details(String name,int id,String branch){
     System.out.println("name of the student is:"+name);
     System.out.println("Student id is:"+id);
    System.out.println("Branch of the student "+branch);
  }
}
public class MethodOverLoading{
  public static void main(String[] args){
    Student s=new Student();
    System.out.println();
    s.details("prasad", 232);
    System.out.println();
    s.details("Prasad", 232, "EEE");
  }
}