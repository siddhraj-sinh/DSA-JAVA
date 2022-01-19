import java.util.Scanner;
import java.lang.*;
class Stack{
  static int MAX=100;
  int top;
  int a[]=new int[MAX];
  Stack(){
    top=-1;
  }
  void push(int x){
    top = top+1;
    a[top]=x;
  }
  int pop(){
    int temp = a[top];
    top=top-1;
    return temp;
  }
  boolean isEmpty(){
    return top<0;
  }
  int peek(){
    return a[top];
  }

}
class EvaluatePostfixExpression{
  static Stack stk = new Stack();
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter postfix expression: ");
   String postfix = input.nextLine();
   System.out.println("Solution of this postfix is:" +evaluatePostfix(postfix));
  }
  static int evaluatePostfix(String postfix){
  char symbol;
  int result = 0;
  for(int i=0;i<postfix.length();i++){
    symbol=postfix.charAt(i);
    if(isOperator(symbol)){
      int first = stk.pop();
      int second = stk.pop();
      switch(symbol){
        case '+':
        result = first+second;
        break;
        case '-':
        result = first-second;
        break;
        case '*':
        result = first*second;
        break;
        case '/':
        result = first/second;
        break;
      }
      //after evaluating two operand push back their result into stack
      stk.push(result);
    }
    else{
      //conversion from char to int needed while pushing operand into stack
      int num=Character.getNumericValue(symbol);
      stk.push(num);
    }
  }
  //return final result
   return result;
  }
static boolean isOperator(char op){
    if(op == '+' || op == '-' || op == '*' || op == '/' || op =='%'){
            return true;
          }
        return false;
  }
}
