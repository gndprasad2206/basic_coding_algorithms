class A {
  public synchronized void d1(B b) {
    System.out.println("Thread1 starts executing d1() method");
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread1 trying to call  B class last() method");
    b.last();
  }

 

  public synchronized void last() {
    System.out.println("Inside class A,last() method");
  }
}

 

class B {
  public synchronized void d2(A a) {
    System.out.println("Thread2 starts executing d2() method");
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread2 trying to call  A class last() method");
    a.last();
  }

 

  public  synchronized void last() {
    System.out.println("Inside class B ,last() method");
  }
}

 

public class Deadlock extends Thread {
  A a = new A();
  B b = new B();
  public void m1() {
    this.start();
    a.d1(b);// main Thread
  }
  public void run() {
    b.d2(a); // child Thread
  }
  public static void main(String[] args) {
    Deadlock t = new Deadlock();
    t.m1();
  }
}

 

// main thread holds a's lock and waits for b's lock since it need to execute
// b.last() method
// newly created thread holds b's lock and waits for a's lock since it need to
// execute a.last() method.