class Node{
  int data;
  Node next;
  public Node(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList{
  Node head;
  public void add(int n){
    Node newNode=new Node(n);
    if(head==null){
      head=newNode;
    }
    else{
      Node current=head;
      while(current.next!=null){
        current=current.next;
      }
      current.next=newNode;
    }
  }
  public void display(){
    Node current=head;
    while(current!=null){
      System.out.println(current.data+" ");
      current=current.next;
    }
  }
}
public class SingleLinkedList{
  public static void main(String[] args){
   LinkedList ls=new LinkedList();
    ls.add(10);
    ls.add(20);
    ls.add(30);
    ls.add(40);
    ls.display();
  }
}