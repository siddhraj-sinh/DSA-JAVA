/*
A push operation is implemented by inserting an element at the beginning of the list.

A pop operation is implemented by deleting the node from the beginning (the header/top node).
*/

class StackByLinkedList{
  StackNode top;
  class StackNode{
    int data;
    StackNode next;
    StackNode(int data){
      this.data=data;
    }
}
public boolean isEmpty(){
  if(top==null) return true;
  else
     return false;
}
public void push(int data){
  StackNode newNode = new StackNode(data);
  if(top==null){
    top=newNode;
    return;
  }
  StackNode temp = top;
  top=newNode;
  newNode.next=temp;
}
public int pop(){
  if(top==null){
    System.out.println("stack is emplty");
    return 0;
  }
  int popped=top.data;
  top=top.next;
  return popped;
}
public int peek()
    {
        if (top == null) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            return top.data;
        }
    }
    public void show(){
      if (top == null) {
          System.out.println("Stack is empty");
          return;
      }
      StackNode cNode = top;
      while(cNode != null){
        System.out.print(cNode.data+"->");
        cNode=cNode.next;
      }
System.out.println("NULL");
    }
  public static void main(String[] args) {
StackByLinkedList slk = new StackByLinkedList();
     slk.push(20);
     slk.push(40);
     slk.push(60);

     System.out.println("popped element: "+slk.pop());

     System.out.println("Top element is "+ slk.peek());
     slk.show();
  }
}
