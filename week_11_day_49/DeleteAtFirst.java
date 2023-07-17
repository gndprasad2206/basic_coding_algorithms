import java.util.Scanner;
class Node4{
  int data;
  Node4 next;
  public Node4(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList4{
  Node4 head;
  void add(int n){
    Node4 newNode=new Node4(n);
    if(head==null){
      head=newNode;
    }
    else{
      Node4 current=head;
      while(current.next!=null){
        current=current.next;
      }
      current.next=newNode;
    }
  }
  void display(){
    Node4 current=head;
    while(current!=null){
      System.out.print(current.data+" ");
      current=current.next;
    }
  }
  void deletingFront(){
    Node4 current=head;
    head=current.next;
    display();
  }
}
public class DeleteAtFirst{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    LinkedList4 ll=new LinkedList4();
    System.out.println("Enter the rage of list");
    int n=sc.nextInt();
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
      int val=sc.nextInt();
      ll.add(val);
    }
    System.out.println("List");
    ll.display();
    System.out.println();
    System.out.println("List After Deletion");
    ll.deletingFront();
  }
}