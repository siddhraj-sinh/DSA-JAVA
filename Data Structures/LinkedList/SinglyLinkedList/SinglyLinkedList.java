import java.util.Scanner;
class SinglyLinkedList{
Node head;
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
//add to front
   public void addToFront(int data){
     Node newNode = new Node(data);
     if(head == null){
       head=newNode;
       return;
     }
     newNode.next=head;
     head=newNode;
   }
   // add to back
   public void addToBack(int data){
     Node newNode = new Node(data);
     if(head == null){
       head=newNode;
       return;
     }
     Node currentNode = head;
     while(currentNode.next !=null){
       currentNode=currentNode.next;
     }
     currentNode.next=newNode;
   }
   // add to given position
   public void addToSpecificPosition(int data, int pos){
     Node newNode = new Node(data);
     if(head == null){
       head=newNode;
       return;
     }
     if(pos > length()){
       System.out.println("Invalid position");
       return;
     }
     Node currentNode=head;
     int i=1;
     while(i<pos){
       currentNode=currentNode.next;
       i++;
     }
     newNode.next=currentNode.next;
     currentNode.next=newNode;
   }
   //length of printList
   public int length(){
     int count=0;
     Node currentNode=head;
     while(currentNode.next !=null){
       currentNode=currentNode.next;
       count++;
     }
     return count++;
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
   //delete front
   public void deleteFromFront(){
     if(head == null){
       System.out.println("list is empty");
       return;
     }
     head= head.next;
   }
   // delete last
   public void deleteFromLast(){
     if(head == null){
       System.out.println("list is empty");
       return;
     }
     if(head.next == null){
       head=null;
       return;
     }
     Node secondLastNode = head;
     Node lastNode = head.next;
     while(lastNode.next !=null){
       lastNode=lastNode.next;
       secondLastNode=secondLastNode.next;
     }
     secondLastNode.next=null;
   }
  public static void main(String[] args) {
   SinglyLinkedList list = new SinglyLinkedList();
   Scanner input = new Scanner(System.in);
   int choice;
   System.out.println("*****ENTER YOUR CHOICE*****");
   System.out.println("1) add to front");
   System.out.println("2) add to back");
   System.out.println("3) add to sepcific position");
   System.out.println("4) delete from front");
   System.out.println("5) delete from back");
   System.out.println("6) display a list");
   System.out.println("7) exit........");

   do{
     System.out.println("Enter your choice: ");
    choice = input.nextInt();
    switch(choice){
      case 1:{
        System.out.println("Enter value to insert: ");
        int value = input.nextInt();
        list.addToFront(value);
       break;
      }
      case 2:{
        System.out.println("Enter value to insert: ");
        int value = input.nextInt();
        list.addToBack(value);
      break;
      }
      case 3:{
        System.out.println("Enter value to insert: ");
        int value = input.nextInt();
        System.out.println("Enter position where you want to insert");
        int pos = input.nextInt();
        list.addToSpecificPosition(value,pos);
      break;
      }
      case 4:{
      list.deleteFromFront();
      break;
      }
      case 5:{
        list.deleteFromLast();
       break;
      }
      case 6:{
         list.printList();
        break;
      }
      case 7:{
        System.out.println("EXIT..............");
        break;
      }
      default:
        System.out.println("Invalid choice");
        break;
    }

  }while(choice!=7);
  }
}
