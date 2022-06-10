//https://tutorialspoint.dev/data-structure/linked-list/split-a-circular-linked-list-into-two-halves
class SplitCircularList{
  Node head;
  Node tail;
  static Node list1, list2;
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data =data;
    }
  }
  void insert(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=tail=newNode;
      return;
    }
    tail.next=newNode;
    tail=newNode;
    newNode.next=head;
  }
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
   while(currentNode!=node);
   //System.out.print(tail.data);
   System.out.println();
  }


  void split(){
    Node slow = head;
    Node fast = head;
    while(fast.next !=head && fast.next.next !=head){
      slow=slow.next;
      fast=fast.next.next;
    }
    //if there are even element in the list move fast ptr
    if(fast.next.next == head){
      fast = fast.next;
    }
    //set head of list 1
    list1=head;
    //set head of list2
    if(head.next !=head){
      list2=slow.next;
    }
    //make 2nd half
    fast.next=slow.next;
    //set list1's tail next to head
    slow.next=head;
  }

  public static void main(String[] args) {
    SplitCircularList l = new SplitCircularList();
    l.insert(10);
    l.insert(20);
    l.insert(30);
    l.insert(40);
//  l.insert(50);
    l.display(l.head);
    l.split();
    l.display(list1);
    l.display(list2);
  }
}
