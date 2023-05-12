/*WAP to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill  */
import java.util.Scanner;
class Electricity_Bill_1{
  public static void main(String[] args){
    int units;
    float bill_Amount;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the consumed units");
    units=sc.nextInt();
    if(units<=50){
      bill_Amount=(float)units*(float)0.50;
    }
    else if(units<=150){
      bill_Amount=(float)((units-50)*0.75)+(float)25;
    }
    else if(units<=250){
      bill_Amount=(float)((units-150)*1.20)+(float)100;
    }
    else{
      bill_Amount=(float)((units-250)*1.50)+(float)220;
    }
    bill_Amount=(float)bill_Amount+(float)(bill_Amount*0.2);
    System.out.println("The Electricity bill for consumed units is ="+bill_Amount);
  }
}