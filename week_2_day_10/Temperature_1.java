//Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.
import java.util.Scanner;
class Temperature_1{
  public static void main(String[] args){
    float temperature;
    int units;
    Scanner sc= new Scanner(System.in);
    System.out.println("Select the units you need to entered");
    System.out.println("1.Celsius");
    System.out.println("2.Fahrenheit");
    units=sc.nextInt();
    switch(units){
      case 1:
        System.out.println("Enter the temperature in celsius");
        temperature=sc.nextFloat();
        temperature=temperature*(float)33.8;
        System.out.println("After converting temperature value into Fahrenheit  ="+temperature+"F");
        break;
      case 2:
        System.out.println("Enter the temperature in Fahrenheit");
        temperature=sc.nextFloat();
        temperature=temperature/(float)33.8;
        System.out.println("After converting temperature value into celsius  ="+temperature+"C");
        break;
      default:
        System.out.println("select the correct unit choice");
      }
  }
}