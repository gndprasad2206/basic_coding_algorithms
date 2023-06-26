//5. Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.
import java.util.Scanner;
class Calculator_1{
  private double number1;
  private double number2;
  public Calculator_1(double num1,double num2){
    number1=num1;
    number2=num2;
  }
  public double getNumber1(){
    return number1;
  }
  public double getNumber2(){
    return number2;
  }
}
class InvalidExpressionException extends Exception{
  public InvalidExpressionException(String str){
    super(str);
  }
}
public class Exception5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number 1");
    double num1=sc.nextDouble();
    System.out.println("Enter the number 2");
    double num2=sc.nextDouble();
    Calculator_1 c=new Calculator_1(num1,num2);
    System.out.println("Enter the Arithmetic Symbole to perform task");
    sc.nextLine();
    String str=sc.nextLine();
    switch(str){
      case "+":
        System.out.println("sum of two numbers "+(c.getNumber1()+c.getNumber2()));
        break;
      case "-":
        System.out.println("Substraction of two numbers "+(c.getNumber1()-c.getNumber2()));
        break;
      case "*":
        System.out.println("Multiplication of two numbers "+(c.getNumber1()*c.getNumber2()));
        break;
      case "/":
        System.out.println("Division of two numbers "+(c.getNumber1()/c.getNumber2()));
        break;
      default:
        try{
          throw new InvalidExpressionException("InvalidExpressionException");
        }
        catch(InvalidExpressionException e){
          System.out.println("Exception: "+e.getMessage());
        }
    }
  }
}
