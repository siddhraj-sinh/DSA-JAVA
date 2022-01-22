class CircularQueueByArray{
  static int size;
  int a[];
  int rear;
  int front;
  CircularQueueByArray(int size){
    CircularQueueByArray.size=size;
    a=new int[size];
    rear=-1;
    front=-1;
  }
  public boolean isEmpty(){
    return rear==-1 && front==-1;
  }
  public boolean isFull(){
    return (rear+1)%size==front;
  }
  public void add(int data){
    if(isFull()){
      System.out.println("queue is full");
      return;
    }else if (front==-1 && rear==-1) {
      front=rear=0;
    }else{
      rear=(rear+1)%size;
    }
    a[rear]=data;
  }
  public int remove(){
    if(isEmpty()){
      System.out.println("queue is empty");
      return -1;
    }else if (front==rear) {
      rear=front=-1;
    }
    else{
      front=(front+1)%size;
    }
    int frontElement=a[front];
    return frontElement;
  }
  public int peek(){
    if(isEmpty()){
      System.out.println("queue is empty");
      return -1;
    }
    return a[front];
  }
  public static void main(String[] args) {
    CircularQueueByArray q = new CircularQueueByArray(3);
    q.add(10);
    q.add(20);
    q.add(30);
    q.remove();
    System.out.println(q.peek());
    q.add(40);
    System.out.println(q.peek());

  }
}
