import java.util.Scanner;
class ReverseSinglyLinkedList{
  Node head;
  class Node{
    int data;
    Node next;

    Node(int data){
      this.data=data;
    }
  }
   public void addToFront(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;
   }
   //print
   public void printList(){
     if(head == null){
       System.out.println("list is empty");
       return;
     }
     Node currentNode = head;
     while(currentNode !=null){
       System.out.print(currentNode.data+"->");
       currentNode=currentNode.next;
     }
     System.out.println("NULL");
   }
 /*reverse linkedlist by reversing link between nodes*/
   public void reverseList(){
     if(head==null || head.next==null){
       return;
     }

     Node prevNode=head;
     Node currentNode=head.next;
     while(currentNode !=null){
       Node nextNode=currentNode.next;
       currentNode.next=prevNode;
       //update
       prevNode=currentNode;
       currentNode=nextNode;
     }
     head.next=null;
     head=prevNode;
   }

   /*Print reverse of a Linked List without actually reversing*/

   public void printReverse(Node head){
     if(head==null) return;
     printReverse(head.next);
     System.out.print(head.data+"->");
   }

   public static void main(String[] args) {
     ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
     list.addToFront(100);
     list.addToFront(200);
     list.addToFront(300);
     list.addToFront(400);
     Scanner input = new Scanner(System.in);
     System.out.println("1) Reverse a linked list by changing links between nodes");
     System.out.println("2) Print reverse of a linked list without actually reversing");
     int choice = input.nextInt();
     if(choice == 1){
       list.reverseList();
       list.printList();
     }else if(choice==2){
       list.printReverse(list.head);
     }
   }
}
