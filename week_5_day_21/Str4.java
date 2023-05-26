//program to illustrate StringBuffer constructors
public class Str4 {
  public static void main(String args[]) {
    //creating StringBuffer object using default constructor
    StringBuffer sb = new StringBuffer();
    //appending a string to newly created instance
    sb.append("Bitlabs");
    System.out.println("First String: "+sb);
    System.out.println("capacity:"+sb.capacity());
 
    //Using StringBuffer(String str) constructor
    String str = "hello";
    StringBuffer sb2 = new StringBuffer(str);
    System.out.println("Second String: "+sb2);
    System.out.println("capacity:"+sb2.capacity());
 
    //Using StringBuffer(int Capacity) constructor
    StringBuffer sb3 = new StringBuffer(24);
    System.out.println("Capacity of sb3: "+sb3.capacity());
    sb3=sb3.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    System.out.println(sb3);
    System.out.println("Capacity of sb3: "+sb3.capacity());
 
    //creating StringBuffer(CharSequence cs) constructor
    StringBuffer sb4 = new StringBuffer("Welcome");
    System.out.println("Fourth String: "+sb4);
    System.out.println("capacity:"+sb4.capacity());
  }
}