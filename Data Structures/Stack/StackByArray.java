/* Java program to implement stack
operations using array*/
import java.util.Scanner;
class Stack{
  static int MAX= 100;
  int top;
  int a[] = new int[MAX];

  Stack(){
    top=-1;
  }

  boolean isEmpty(){
    return top<0;
  }
  boolean isFull(){
    return top>=MAX-1;
  }

  boolean push(int num){
    if(isFull()){
      System.out.println("Stack is overflow");
      return false;
    }
    else{
      top=top+1;
      a[top]=num;
      System.out.println(num+" pushed into stack");
      return true;
    }
  }
 int pop(){
   if(isEmpty()){
     System.out.println("Stack is underflow");
     return 0;
   }
   else{
     int popElement = a[top];
     top=top-1;
     return popElement;
   }
 }
 int peek(){
   if(isEmpty()){
     System.out.println("Stack is underflow");
     return 0;
   }
   else{
   return a[top];
   }
 }

 void traverse(){
   if(isEmpty()){
     System.out.println("stack is underflow");
   }else{
   for(int i=top;i>=0;i--){
     System.out.print(a[i]+" ");
   }
 }
 }
}
class StackByArray{
public static void main(String[] args) {
  System.out.println("*****ENTER YOUR CHOICE*****");
  System.out.println("1) push in stack");
  System.out.println("2) pop in stack");
  System.out.println("3) traverse in stack");
  System.out.println("4) peek of stack");
  System.out.println("5) exit........");

  Stack stk = new Stack();
  Scanner input = new Scanner(System.in);
  int choice;
  do{
   System.out.println("Enter your choice");
   choice = input.nextInt();

   switch(choice){
     case 1:{
       System.out.println("Enter value to insert: ");
       int value = input.nextInt();
       stk.push(value);
      break;
     }
     case 2:{
       stk.pop();
     break;
     }
     case 3:{
         stk.traverse();
     break;
     }
     case 4:{
       stk.peek();
      break;
     }
     case 5:{
       System.out.println("EXIT..............");
       break;
     }
     default:
       System.out.println("Invalid choice");
       break;
   }

 }while(choice!=5);

}
}
