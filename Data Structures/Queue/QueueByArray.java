import java.util.Scanner;
class QueueByArray{
  static int size;
  int a[];
  int rear=-1;
  QueueByArray(int size){
    QueueByArray.size=size;
    a=new int[size];
  }

 public boolean isEmpty(){
   return rear==-1;
 }
 public boolean isFull(){
   return rear==size-1;
 }
 public void add(int data){
   if(isFull()){
     System.out.println("queue overflow");
     return;
   }else{
   rear=rear+1;

   a[rear]=data;
 }
 }
 public int remove(){
   if(isEmpty()){
     System.out.println("queue is empty");
     return -1;
   }
   int front = a[0];
   for(int i=0;i<rear;i++){
     a[i]=a[i+1];
   }
   rear=rear-1;
   return front;
 }
 public int peek(){
   if(isEmpty()){
     System.out.println("queue is empty");
     return -1;
   }
   return a[0];
 }

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    //System.out.println("Enter size of queue :");
    //int size=input.nextInt();
    QueueByArray q = new QueueByArray(3);
    q.add(10);
    q.add(20);
    q.add(30);
    System.out.println(q.remove());
    System.out.println(q.peek());
  }
}
