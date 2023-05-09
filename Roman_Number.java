/* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.X can be placed before L (50) and C (100) to make 40 and 90.C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
 
Example 1:
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4. */
import java.util.Scanner;
class Roman_number{
  public static void main(String[] args){
    int number,division=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    number=sc.nextInt();
    while(number>1){
      if(number>=1000){
        division=number/1000;
        while(division>0){
          System.out.print("M");
          division--;
        }
        number=number%1000;
        
      }
      else if(number>=900){
        division=number/900;
        while(division>0){
          System.out.print("CM");
          division--;
        }
        number=number%900;
      }
      else if(number>=500){
        division=number/500;
        while(division>0){
          System.out.print("D");
          division--;
        }
        number=number%500;
      }
      else if(number>=100){
        division=number/100;
        while(division>0){
          System.out.print("C");
          division--;
        }
        number=number%100;
      }
      else if(number>=90){
        division=number/90;
        while(division>0){
          System.out.print("XC");
          division--;
        }
        number=number%90;
      }
      else if(number>=50){
        division=number/50;
        while(division>0){
          System.out.print("L");
          division--;
        }
        number=number%50;
      }
      else if(number>=40){
        division=number/40;
        while(division>0){
          System.out.print("XL");
          division--;
        }
        number=number/40;
      }
      else if(number>=10){
        division=number/10;
        while(division>0){
          System.out.print("X");
          division--;
        }
        number=number/10;
      }
      else if(number>=9){
        division=number/9;
        while(division>0){
          System.out.print("IX");
          division--;
        }
        number=number/9;
      }
      else if(number>=5){
        division=number/5;
        while(division>0){
          System.out.print("X");
          division--;
        }
        number=number/5;
      }
      else if(number>=4){
        division=number/4;
        while(division>0){
          System.out.print("IV");
          division--;
        }
        number=number/4;
      }
      else{
        division=number;
        while(division>0){
          System.out.print("I");
          division--;
        }
        number=0;
      }
    }
  }
}