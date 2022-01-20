class DoublyLinkedList{
  Node head;
  class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
      this.data=data;
      next=null;
      prev=null;
    }
  }

  public void addToFront(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
  }

  public void addToBack(int data){
   Node newNode = new Node(data);
   if(head==null){
     head=newNode;
     return;
   }
    Node tail = getTail();
    tail.next=newNode;
    newNode.prev=tail;

  }
  public void deleteFromFront(){
    if(head == null){
      System.out.println("list is empty");
      return;
    }
    if(head.next==null){
      head=null;
      return;
    }

    head=head.next;
    head.prev=null;
  }
  public Node getTail(){
    Node currentNode=head;
    while(currentNode.next !=null){
      currentNode=currentNode.next;
    }
    return currentNode;
  }
  public void printList(){
    if (head == null){
   System.out.println ("List is empty");
    return;
     }
   Node currentNode=head;
   while(currentNode !=null){
     System.out.print(currentNode.data+"->");
     currentNode=currentNode.next;
   }
   System.out.println("NULL");
  }
  public static void main(String[] args) {
   DoublyLinkedList dll = new DoublyLinkedList();
  dll.addToFront(100);
  dll.addToFront(200);
  dll.printList();
  dll.addToBack(300);
  dll.printList();
  dll.addToFront(400);
  dll.printList();
  dll.deleteFromFront();
  dll.deleteFromFront();
  dll.deleteFromFront();
  dll.deleteFromFront();


  dll.printList();
  }
}
