/*WAP to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill*/
import java.util.Scanner;
class Electricity_Bill{
  public static void main(String[] args){
    int units;
    double bill=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the units consumed");
    units=sc.nextInt();
    if(units<=50){
      bill=units*0.50;
    }
    else if(units<=150){
      bill=((units-50)*0.75)+(float)25;
    }
    else if(units<=250){
      bill=((units-150)*1.20)+(float)75;
    }
    else{
      bill=((units-250)*1.50)+(float)120;
    }
    bill=bill+(float)(bill*0.2);
    System.out.print("The Electricity bill amount is ="+bill);
  }
}