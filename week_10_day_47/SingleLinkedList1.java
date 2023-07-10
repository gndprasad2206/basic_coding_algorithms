class Node1{
  int data;
  Node1 next;
  public Node1(int data){
    this.data=data;
    this.next=null;
  }
}
class Node2{
  int data;
  Node2 next;
  public Node2(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList1{
  Node1 head1;
  Node2 head2;
  public void addAtEnd(int n){
    Node2 newNode=new Node2(n);
    if(head2==null){
      head2=newNode;
    }
    else{
      Node2 current=head2;
      while(current.next!=null){
        current=current.next;
      }
      current.next=newNode;
    }
  }
  public void addAtFront(int n){
    Node1 newNode=new Node1(n);
    if(head1==null){
      head1=newNode;
    }
    else{
     // Node1 current=head;
      //while(current.next!=null){
      //  current=current.next;
      //}
      newNode.next=head1;
      head1=newNode;
    }
  }
  public void display1(){
    System.out.println("insertion At front");
    Node1 current=head1;
    while(current!=null){
      System.out.print(current.data+" ");
      current=current.next;
    }
    System.out.println();
  }
  public void display2(){
    System.out.println("Insertion At last");
    Node2 current=head2;
    while(current!=null){
      System.out.print(current.data+" ");
      current=current.next;
    }
  }
}
public class SingleLinkedList1{
  public static void main(String[] args){
   LinkedList1 ls=new LinkedList1();
    ls.addAtFront(10);
    ls.addAtFront(20);
    ls.addAtFront(30);
    ls.addAtFront(40);
    ls.addAtEnd(10);
    ls.addAtEnd(20);
    ls.addAtEnd(30);
    ls.addAtEnd(40);
    ls.display1();
    ls.display2();
  }
}