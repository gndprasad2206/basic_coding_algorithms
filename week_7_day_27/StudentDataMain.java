class StudentData{
  String name;
  int rollNo;
  static String college="Dhanekula";
  StudentData(String name,int rollNo){
    this.name=name;
    this.rollNo=rollNo;
  }
  static  String change(){
    college="cv Raman";
    return college;
  }
  void print(){
    System.out.println(name+" "+rollNo+" "+college);
  }
}
public class StudentDataMain{
  public static void main(String[] args){
    StudentData stu[]=new StudentData[3];
    stu[0]=new StudentData("prasad",232);
    stu[1]=new StudentData("ravi",225);
    stu[2]=new StudentData("charan",227);
    for(int i=0;i<3;i++){
      stu[i].print();
    }
    StudentData.change();
    for(int i=0;i<3;i++){
      stu[i].print();
    }
    /*s1.print();
    s2.print();
    s3.print();
    StudentData.change();
    s1.print();
    s2.name="pavan";
    s2.print();
    s3.print();*/
  }
}