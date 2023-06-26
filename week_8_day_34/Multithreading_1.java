class Prime1 extends Thread{
  public void run(){
    
    for(int i=1;i<=100;i++){
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0)
          count++;
      }
     
      if(count==2)
      System.out.print(i+",");
    }
  }
}
public class Multithreading_1{
  public static void main(String[] rrr)throws InterruptedException{
    Prime1 p=new Prime1();
    p.start();
    p.join();
    System.out.println();
    for(int i=2;i<=100;i+=2){
     System.out.print(i+",");
    }
  }
}