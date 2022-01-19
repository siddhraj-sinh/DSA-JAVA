import java.util.Scanner;
import java.io.*;
import java.lang.*;
class Stack{
  static int MAX=100;
  int top;
  char a[] = new char[MAX];

  Stack(){
    top=-1;
  }
  boolean isEmpty(){
    return top<0;
  }
  boolean isFull(){
    return top>=MAX-1;
  }

  void push(char c){
    if(isFull()){
      System.out.println("OVERFLOW");
    }
    else{
      top=top+1;
      a[top]=c;
    }
  }
  char pop(){
      char c = a[top];
      top=top-1;
      return c;
    }
    char peek(){
      return a[top];
    }
  }


public class InfixToPostfix{
  static Stack stk = new Stack();
 public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
   System.out.print("Enter infix expression: ");
   String infix = input.nextLine();
   System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix));
 }
 static String toPostfix(String infix){
   char symbol;
   String postfix="";

   for(int i=0;i<infix.length();i++){
     symbol=infix.charAt(i);
     if(Character.isLetter(symbol)){
       postfix=postfix+symbol;
     }else if(symbol == '('){
       stk.push(symbol);
     }else if(symbol == ')'){
       while(stk.peek() != '('){
         postfix=postfix+stk.pop();

       }
       stk.pop(); //remove (
     }
     else{
       while (!stk.isEmpty() && !(stk.peek()=='(') && prec(symbol) <= prec(stk.peek()))
       postfix = postfix + stk.pop();
       stk.push(symbol);
     }
   }
   while (!stk.isEmpty())
postfix = postfix + stk.pop();
return postfix;
 }
static int prec(char x)
{
if (x == '+' || x == '-')
return 1;
if (x == '*' || x == '/' || x == '%')
return 2;
return 0;
}
}
