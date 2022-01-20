class FindMiddleOfLinkedList{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public void addToBack(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    Node currentNode = head;
    while(currentNode.next !=null){
      currentNode=currentNode.next;
    }
    currentNode.next=newNode;
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

  public int getMiddle(){
   Node p1 = this.head;
   Node p2 = this.head;
   while (p2 != null && p2.next != null)
      {
	p1 = p1.next;
	p2 = p2.next.next;
      }

//When p2 reaches the end, p1 will point to the mid node
    return p1.data;
  }
  public static void main(String[] args) {
    FindMiddleOfLinkedList list = new FindMiddleOfLinkedList();
    list.addToBack(100);
    list.addToBack(200);
    list.addToBack(300);
    list.addToBack(400);
    list.addToBack(500);
      list.addToBack(600);
    list.printList();
   System.out.println(list.getMiddle());

  }
}
