//Develop a program to manage student grades. Create classes for students, courses, and a grade management system. Implement methods to calculate the average grade of a student, find the highest and lowest grades, and generate a report card
import java.util.*;
class Students6{
  private static int nextId=0;
  private int id;
  private int sub1;
  private int sub2;
  private int sub3;
  private int sub4;
  public Students6(int sub1,int sub2,int sub3,int sub4){
    this.id=nextId++;
    this.sub1=sub1;
    this.sub2=sub2;
    this.sub3=sub3;
    this.sub4=sub4;
  }
public static int getNextId() {
	return nextId;
}

public int getId() {
	return id;
}

public int getSub1() {
	return sub1;
}

public int getSub2() {
	return sub2;
}

public int getSub3() {
	return sub3;
}

public int getSub4() {
	return sub4;
} 
}
class CalculationGrade{
  HashMap<Integer,Students6> students=new HashMap<Integer,Students6>();
  public void addStudent(Students6 student){
    students.put(student.getId(),student);
    System.out.println("Student Marks added Successfully");
  }
  public void averageGrade(){
    int low=100,high=0,i=1;
    for(Students6 st:students.values()){
      int sum=st.getSub1()+st.getSub2()+st.getSub3()+st.getSub4();
      int average=sum/4;
      System.out.println("gread Of "+i+"st Student : "+gradeOfStudent(average));
      i++;
      if(ifGrater(average,high)){
        high=average;
      }
      if(isSmaller(average,low)){
        low=average;
      }
      System.out.println("Highest Grade: "+gradeOfStudent(high));
      System.out.println("Lowest Grade: "+gradeOfStudent(low));
    }
  }
  public static boolean isSmaller(int avg,int low){
    if(avg<low){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean ifGrater(int avg,int high){
    if(avg>high){
      return true;
    }
    else{
      return false;
    }
  }
  public static String gradeOfStudent(int score){
    if(score>=0&&score<=100){
      if(score>=85){
        return "A";
      }
      else if(score >=75){
        return "B";
      }
      else if(score>=65){
        return "C";
      }
      else if(score >=35){
        return "D";
      }
      else{
        return "F";
      }
    }
    else 
      return "Invalid Marks";
  }
}
public class StudentGradeSystem{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    CalculationGrade calculation=new CalculationGrade();
    System.out.println("Enter count of Number Of Students");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.println();
      System.out.print("Enter the sub1 marks: ");
      int sub1=sc.nextInt();
      System.out.print("Enter the sub2 marks: ");
      int sub2=sc.nextInt();
      System.out.print("Enter the sub3 marks: ");
      int sub3=sc.nextInt();
      System.out.print("Enter the sub4 marks: ");
      int sub4=sc.nextInt();
      Students6 s=new Students6(sub1,sub2,sub3,sub4);
      calculation.addStudent(s);
    }
    calculation.averageGrade();
  }
}