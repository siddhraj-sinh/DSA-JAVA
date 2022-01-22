class QueueByLinkedList{
  Node head=null;
  Node tail=null;
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      next=null;
    }
  }
  public boolean isEmpty(){
    return head == null && tail == null;
  }

  public void add(int data){
    Node newNode = new Node(data);
    if(isEmpty()){
      head=tail=newNode;
    }else{
      tail.next=newNode;
      tail=newNode;
    }
  }
  public int remove(){
    if(isEmpty()){
      System.out.println("queue is empty");
      return -1;
    }
    if(head==tail){
      tail=null;
    }
     int frontElement = head.data;
      head=head.next;
    return frontElement;
  }
  public int peek(){
    if(isEmpty()){
      System.out.println("queue is empty");
      return -1;
    }
    return head.data;
  }
  public static void main(String[] args) {
         QueueByLinkedList q = new QueueByLinkedList();
         q.add(10);
         q.add(20);
         q.add(30);
         System.out.println(q.remove());
         System.out.println(q.peek());
  }
}
