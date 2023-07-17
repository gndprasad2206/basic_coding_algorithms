import java.util.Scanner;
class Node3{
  int data;
  Node3 next;
  public Node3(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList2{
  Node3 head;
  void add(int n){
    Node3 newNode=new Node3(n);
    if(head==null){
      head=newNode;
    }
    else{
      Node3 current=head;
      while(current.next!=null){
        current=current.next;
      }
      current.next=newNode;
    }
  }
  void display(){
    Node3 current=head;
    while(current!=null){
      System.out.println(current.data+" ");
      current=current.next;
    }
  }
  void insertion(int position,int value,int n){
    if(position>-1&&position<n){
      Node3 current=head;
      int c=1;
      Node3 newNode=new Node3(value);
      if(position==0){
        newNode.next=current;
        head=newNode;
        display();
      }
      else{
      while(c<position){
        current=current.next;
        c++;
      }
      newNode.next=current.next;
      current.next=newNode;
      display();
      }
    }
    else{
      try{
        throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception: "+e.getMessage());
      }
    }
  }
}
public class InsertionAtSpecified{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    LinkedList2 ll=new LinkedList2();
    System.out.println("Enter the Range of list");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int val=sc.nextInt();
      ll.add(val);
    }
    System.out.println("Enter Position to insert");
    int position=sc.nextInt();
    System.out.println("Enter the value");
    int value=sc.nextInt();
    ll.insertion(position,value,n);
  }
}