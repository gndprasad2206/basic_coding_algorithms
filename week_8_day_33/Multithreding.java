class MyThread3 extends Thread
  {
   public void run(){
      int num1=1;
      int num2=2;
      for(int i=0;i<10;i++){
        System.out.println(num1+num2);
        num1++;
        num2++;
      }
    }
  }
public class Multithreding{
  public static void main(String[] args){
    MyThread3 call=new MyThread3();
    call.start();
    for(int i=0;i<10;i++){
    System.out.println("Main thread");
    }
  }
}