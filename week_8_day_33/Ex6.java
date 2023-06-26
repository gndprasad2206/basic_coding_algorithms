//program to demonstrate join() method
import java.util.Arrays;

 

class MyThread extends Thread {
  int[] a;

 

  MyThread(int[] ar) {
    a = ar;
    start();
  }

 

  public void run() {
    Arrays.sort(a);
    System.out.println("Child completed sorting.");
  }
}

 

public class Ex6 {
  public static void main(String args[]) throws Exception {
    int b[] = { 2, 6, 4, 0, 1, 5, 3 };
    MyThread t = new MyThread(b);
    t.join(); // wait for t to terminate//
    System.out.println("Main printing array elements are :");
    for (int i = 0; i < b.length; i++)
      System.out.print(b[i] + " ");
  }
}

 


//main thread
//new thread---job of new thread is sorting the array
//job of main thread is printing the sorted array

 


//program where I need to create two threads.
//In this program, I need to sort an array and I need to print the sorted array elements.

 

//single program, I have two subtasks--sorting an array and printing the sorted array elements--
//Thread1---job is sorting an array---newly created thread
//Thread2---job is printing the sorted array elements--main thread

 

//after Thread1 finishes the task, then only Thread2 can finish its task

 

//Thread2 need to wait until thread1 finishes its task. This can be done using join() method.

 