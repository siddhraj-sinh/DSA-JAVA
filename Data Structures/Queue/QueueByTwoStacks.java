/*
time complexity of push O(n) and pop O(1)
*/
import java.util.*;
class QueueByTwoStacks{

  Stack<Integer> s1 = new Stack<>();
  Stack<Integer> s2 = new Stack<>();

  public boolean isEmpty(){
    return s1.isEmpty();
  }
  public void add(int data){
    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }
    s1.push(data);
    while(!s2.isEmpty()){
      s1.push(s2.pop());
    }
  }
  public int remove(){
   return s1.pop();
  }
  public int peek(){
    return s1.peek();
  }
  public static void main(String[] args) {
    QueueByTwoStacks q = new QueueByTwoStacks();
    q.add(10);
    q.add(20);
    q.add(30);
    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }
  }
}
