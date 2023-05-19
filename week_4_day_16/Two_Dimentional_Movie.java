//movies ratings
import java.util.Scanner;
public class Two_Dimentional_Movie{
  public static  void main(String[] args){
    int arr[][]=new int[3][4];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  matrix elements");
    for(int i=0;i<3;i++){
      for(int j=0;j<4;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<3;i++){
      for(int j=0;j<4;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    
    for(int j=0;j<4;j++){
      int sum=0,avg=0;
      for(int i=0;i<3;i++){
        sum=sum+arr[i][j];
      }
      avg=sum/3;
      System.out.println("The average rating of "+j+" movie is ="+avg);
    }
    int max=arr[0][1];
    for(int i=0;i<arr.length;i++){
      if(max<arr[i][1])
        max=arr[i][1];
    }
    System.out.println(max);
  }
}

    
    /*for(int j=0;j<4;j++){
      for(int i=0;i<3;i++){
        max=arr[i][j];
        if(max<arr[i+1][j+1]){
          max=arr[i+1][j+1];
        }
      }
      System.out.println("Highest rating of "+j+" the movie is "+max);
    }
  }
}*/