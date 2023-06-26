class Prime extends Thread{
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
class Multithreading1{
  public static void main(String[] rrr){
    Prime p=new Prime();
    p.start();
    try{
      p.join();
    }
    catch(InterruptedException e){
      System.out.println("Exception "+e.getMessage());
    }
    System.out.println();
    for(int i=2;i<=100;i+=2){
     System.out.print(i+",");
    }
  }
}