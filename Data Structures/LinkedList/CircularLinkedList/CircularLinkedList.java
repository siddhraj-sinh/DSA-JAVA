
class CircularLinkedList{
  Node head;
  Node tail;
  class Node{
    Node next;
    int data;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }

//insert at begin
  void insetAtBegin(int data){
   Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      tail=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;
    tail.next=head;
  }

  //insert at END
  void insetAtEnd(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      tail=newNode;
      return;
    }
    tail.next=newNode;
    tail=newNode;
    tail.next=head;
  }
  void insert(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      tail=newNode;
      return;
    }
      tail.next=newNode;
      tail=newNode;
      tail.next=head;
  }
  //delete from begin
    void deleteFromFront(){
      if(head==null){
        System.out.println("no items in list");
        return;
      }
      if(head==tail){
        head=tail=null;
        return;
      }
      head=head.next;
      tail.next=head;
    }
  //delete from end
  void deleteFromEnd(){
    if(head==null){
      System.out.println("no items in list");
      return;
    }
    if(head==tail){
      head=null;
      tail=null;
      return;
    }
    Node currentNode=head;
    while(currentNode.next!=tail){
      currentNode=currentNode.next;
    }
    currentNode.next=head;
    tail=currentNode;
  }
  //display
  void display(Node node){

    if(head==null){
      System.out.println("no item in list");
      return;
    }
    Node currentNode = node;
    do{
      System.out.print(currentNode.data+" ");
      currentNode=currentNode.next;
    }
   while(currentNode!=head);
   //System.out.print(tail.data);
   System.out.println();
  }
   int count(Node node){
     if(head==null){
       return 0;
     }
     if(head==tail){
       return 1;
     }
     int i =1;
     Node currentNode=node;
     while(currentNode.next!=head){
       i++;
       currentNode=currentNode.next;
     }
     return i;
   }
  public static void main(String[] args) {
    CircularLinkedList l = new CircularLinkedList();
    l.insert(10);
    l.insert(20);
    l.insert(30);
    l.display(l.head);
    l.insetAtBegin(40);
    System.out.println("insert 40 at begin");
    l.display(l.head);
    l.insetAtEnd(50);
    System.out.println("insert 50 at end");
    l.display(l.head);
    l.deleteFromEnd();
    System.out.println("delete from end");
    l.display(l.head);
    l.deleteFromFront();
    System.out.println("delete from front");
    l.display(l.head);
    System.out.println("size of list is: "+l.count(l.head));
  }
}
