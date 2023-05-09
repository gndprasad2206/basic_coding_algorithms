//Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
class Age_Calculation{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Age (YYYY-MM-DD): ");
    String dateOfBirth=sc.nextLine();
    LocalDate birthDate=LocalDate.parse(dateOfBirth);
    LocalDate currentDate=LocalDate.now();
    Period age=Period.between(birthDate, currentDate);
    System.out.println("The age of the person is " +age.getYears()+ " years "+age.getMonths()+ " months "+age.getDays()+" days" );
    int age_In_Years=age.getYears();
    if(age_In_Years>18){
      System.out.println("The person is adult");
    }
    else{
      System.out.println("The person is minor");
    }
  }
}