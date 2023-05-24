/*write a java program to read the array elements and then display the following menu.
  1.find the sum of array elements.
  2.find the max and min of array.
  3.reverse the arry elemets.
  4.find the prime numbers in array. */
import java.util.Scanner;
class Multiple_Task_1{
  public int sum(int a[]){
    int total=0;
    for(int i=0;i<a.length;i++){
      total=total+a[i];
    }
    return total;
  }
  public int[] maxMin(int a[]){
    int max=a[0];
    for(int i=1;i<a.length;i++){
      if(max<a[i])
        max=a[i];
    }
    a[0]=max;
    int min=a[0];
    for(int i=1;i<a.length;i++){
      if(min>a[i])
        min=a[i];
    }
    a[1]=min;
    return a;
  }
  public int[] reverse(int a[]){
    int temp=0,i=0,j=a.length;
      for(i=0,j=a.length-1;i<j;i++,j--){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    return a;
  }
  public int[] isPrime(int a[]){
    int k=0,temp=0,count;
    int a1[]=new int[a.length];
    for(int i=0;i<a.length;i++){
      count=0;
      for(int j=1;j<=a[i];j++){
        if(a[i]%j==0){
          count++;
          }
      if(count==2){
        a1[k++]=a[i];
      }
    }
  }
   return a1; 
}
}

public class Multiple_Task_Main_1{
  public static void main(String[] args){
    System.out.println("********MENU********");
    System.out.println("1.find the sum of array elements.\n2.find the max and min of array.\n3.reverse the arry elemets.\n4.find the prime numbers in array.");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the choice");
    int choice=sc.nextInt();
    System.out.println("Enter the range of the array");
    int range =sc.nextInt();
    System.out.println("Enter the "+range+" values into array");
    int arr[]=new int[range];
    for(int i=0;i<range;i++){
      arr[i]=sc.nextInt();
    }
    Multiple_Task_1 call=new Multiple_Task_1();
    switch(choice){
      case 1:
        int total=call.sum(arr);
        System.out.println("The sum of the Total Array Elements is:"+total);
        break;
      case 2:
        call.maxMin(arr);
        System.out.println("The Maximum value in a Array is:"+arr[0]);
        System.out.println("The Minimum value In a Array is:"+arr[1]);
        break;
      case 3:
        call.reverse(arr);
        System.out.println("The reversel of Array is:");
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+",");
        break;
      case 4:
        int a2[]=new int[arr.length];
        a2=call.isPrime(arr);
        System.out.println("The prime numbers in the array is:");
        for(int i=0;i<a2.length;i++)
          System.out.print(a2[i]+",");
        break;
        default:
        System.out.println("Enter the correct choice");
    }
  }
}

  
