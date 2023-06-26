class MyThread1 implements Runnable
  {
    public void run(){
      for(int i=0,j=1;i<10;i++,j++){
        System.out.println("Child Thread Sum: "+(i+j));
      }
    }
  }
public class InterfaceMultithred
  {
    public static void main(String[] args)
    {
      MyThread1 t=new MyThread1();
      Thread call=new Thread(t);
      call.start();
      for(int i=0;i<10;i++)
        {
          System.out.println("Main Thraed");
        }
    }
  }