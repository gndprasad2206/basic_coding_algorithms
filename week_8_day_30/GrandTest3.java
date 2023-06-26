/*Create a program that maintains an array of Student objects. Each Student object should have a studentId, studentName, rollNo, mobileNumber, marks, and address. 
The program should allow the user to input the data for each student dynamically with validations. After inputting the data for five students, the program should display the data for all five students.
 
1.studentId should be a unique id and id should contains 5-digit number only.
2.Name should contain only letters and should be between 2 and 30 characters long.
3.rollNo should be a positive integer.
4.Mobile should contains only 10 digits and should starts with 9 or 8 or 7 or 6.
5.Marks should be a positive integer, and should a two digits number.
6.Address should be between 5 and 100 characters long.
To complete this task, you'll need to write Java code that includes the following:
Define the Student class with the required fields (studentId, studentName, RollNo, mobileNumber, marks, and address) and create setter and getter methods.
1.Create an array of Student objects with a length of 5.
2.Prompt the user to input the data for each student dynamically.
3.Store the inputted data in the corresponding Student object in the array.
4.Display the data for all five students after all data has been inputted.
 
Here's an example input and output for the program: 
----------------------------------------------------------- 
Sample Input: 
------- 
Enter how many students do you want to add : 2
 
Enter data for student 1: 
Student ID: 12345 
Name: John Smith 
Roll number: 101 
Mobile: 934637673 
Marks: 87.5 
Address: 123 Main St, Anytown USA 
 
Enter data for student 2: 
Student ID: 56784 
Name: Jane Doe 
Roll number: 102 
Mobile: 928972973 
Marks: 92.0 
Address: 456 Elm St, Anytown USA
 
Output: 
-------- 
Student ID: 12345
Name: John Smith 
Roll number: 101 
Mobile: 934637673
Marks: 87.5 
Address: 123 Main St, Anytown USA 
 
Student ID: 56784
Name: Jane Doe 
Roll number: 102 
Mobile:  928972973 
Marks: 92.0 
Address: 456 Elm St, Anytown USA 
  */
import java.util.Scanner;
class Students{
  private int studentId;
  private String studentName;
  private int rollNo;
  private long mobileNumber;
  private double marks;
  private String address;
  public void setId(int id){
    studentId=id;
  }
  public void setName(String name){
    studentName=name;
  }
  public void setRollNo(int rollNo){
    this.rollNo=rollNo;
  }
  public void setMobile(long number){
    mobileNumber=number;
  }
  public void setMarks(Double marks){
    this.marks=marks;
  }
  public void setAddress(String add){
    address=add;
  }
  public int getId(){
    return studentId;
  }
  public String getName(){
    return studentName;
  }
  public int getRollNo(){
    return rollNo;
  }
  public long getMobileNumber(){
    return mobileNumber;
  }
  public double getMarks(){
    return marks;
  }
  public String getAddress(){
    return address;
  }
}
public class GrandTest3{
  public static void main(String[] args){
    int id,rollNo,check=0;
    String name,add;
    long mobileNumber;
    double marks;
    Scanner sc=new Scanner(System.in);
    System.out.println();
    System.out.println("Enter how many students do you want to add");
    int n=sc.nextInt();
    Students std[]=new Students[n];
    for(int i=0;i<n;i++){
      std[i]=new Students();
      System.out.println("Enter the "+(i+1)+" Student Details");
      System.out.print("Enter Student ID: ");
      id=sc.nextInt();
      std[i].setId(id);
      int c=0;
      int dupl=0;
      for(int j=0;j<i;j++){
        if(std[j].getId()==id){
          System.out.println("Given student Id already existed");
          c++;
        }
      }
      if(c==1){
        check++;
        break;
      }
      sc.nextLine();
      System.out.print("Enter Student Name: ");
      name=sc.nextLine();
      //std[i].setName(name);
      int length=name.length();
      int count=0;
      if(length>=2 && 30>length){
        for(int m=0;m<length;m++){
          char ch=name.charAt(m);
          if(ch>='a' && ch<='z')
            count++;
        }
        if(count ==length){
          std[i].setName(name);
        }
        else{
          System.out.println("Invalid name");
          check++;
          break;
        }
      }
      System.out.print("Enter Roll Number: ");
      //sc.nextLine();
      rollNo=sc.nextInt();
      if(rollNo>0){
        std[i].setRollNo(rollNo);
      }
      else{
        System.out.println("Invalid Roll number");
        check++;
        break;
      }
      System.out.print("Enter Mobile Nnumber: ");
      mobileNumber=sc.nextLong();
      long digit=0;
      long num=mobileNumber;
      while(mobileNumber>10){
        digit=mobileNumber/10;
        mobileNumber/=10;
      }
      if(digit==9||digit==8||digit==7||digit==6){
        std[i].setMobile(num);
      }
      else{
        System.out.println("Mobile number should be Start with Digits 9,8,7 and 6 only");
        check++;
        break;
      }
      sc.nextLine();
      System.out.print("Enter the marks: ");
      marks=sc.nextDouble();
      double dup=marks;
      int tDigit=(int)marks/100;
      if(tDigit==0){
        std[i].setMarks(dup);
      }
      else{
        System.out.println("Marks should be a positive integer, and should a two digits number.");
        check++;
        break;
      }
      System.out.print("Enter the Address: ");
      sc.nextLine();
      add=sc.nextLine();
      int len=add.length();
      if(len>5&&len<100){
        std[i].setAddress(add);
        
      }
      else{
        System.out.println("Address should be between 5 and 100 characters long.");
        check++;
        break;
      } 
    }
    if(check==0){
      System.out.println("*****Students Details*****");
      for(int i=0;i<n;i++){
        System.out.println("Student ID:"+std[i].getId());
        System.out.println("Name: "+std[i].getName());
        System.out.println("Roll number: "+std[i].getRollNo());
        System.out.println("Mobile: "+std[i].getMobileNumber());
        System.out.println("Marks: "+std[i].getMarks());
        System.out.println("Address: "+std[i].getAddress());
        System.out.println();
      }
    }
  }
}