import java.util.Scanner;
class Node5{
  int data;
  Node5 next;
  public Node5(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList5{
  Node5 head;
  void add(int n){
    Node5 newNode=new Node5(n);
    if(head==null){
      head=newNode;
    }
    else{
      Node5 current=head;
      while(current.next!=null){
        current=current.next;
      }
      current.next=newNode;
    }
  }
  void display(){
    Node5 current=head;
    while(current!=null){
      System.out.print(current.data+" ");
      current=current.next;
    }
  }
  void deleteAtSpecified(int position,int n){
    if(position>-1&&position<n){
      Node5 current=head;
      int c=1;
      if(position==0){
        head=current.next;
        display();
      }
      else{
        while(c<position){
          current=current.next;
          c++;
        }
        Node5 obj=current.next;
        current.next=obj.next;
        obj.next=null;
        display();
      }
    }
  }
}
public class DeleteAtPosition{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    LinkedList5 ll=new LinkedList5();
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
    System.out.println("Enter The positon to delete");
    int position=sc.nextInt();
    ll.deleteAtSpecified(position, n);
  }
}