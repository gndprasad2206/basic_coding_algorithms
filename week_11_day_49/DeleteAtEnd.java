import java.util.Scanner;
class Node6{
  int data;
  Node6 next;
  public Node6(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList6{
  Node6 head;
  void add(int n){
    Node6 newNode=new Node6(n);
    if(head==null){
      head=newNode;
    }
    else{
      Node6 current=head;
      while(current.next!=null){
        current=current.next;
      }
      current.next=newNode;
    }
  }
  void display(){
    Node6 current=head;
    while(current!=null){
      System.out.print(current.data+" ");
      current=current.next;
    }
  }
  void deleteAtEnd(int n){
    Node6 current=head;
    int c=1;
    while(c<n-1){
      current=current.next;
      c++;
    }
    current.next=null;
    display();
  }
}
public class DeleteAtEnd{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    LinkedList6 ll=new LinkedList6();
    System.out.println("Enter the range of list");
    int n=sc.nextInt();
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
      int val=sc.nextInt();
      ll.add(val);
    }
    System.out.println("List");
    ll.display();
    System.out.println();
    ll.deleteAtEnd(n);
  }
}