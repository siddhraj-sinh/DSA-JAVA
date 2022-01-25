import java.util.*;
class ReverseQueue{
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    System.out.println("Intial peek: "+q.peek());
    Iterator<Integer> itr = q.iterator();
    System.out.println("Intial Queue:");
    while(itr.hasNext()){
      System.out.print(itr.next()+" ");
    }
    Stack<Integer> stk = new Stack<>();
     while(!q.isEmpty()){
       stk.push(q.peek());
       q.poll();
     }
    System.out.println();
    while(!stk.isEmpty()){
      q.add(stk.peek());
      stk.pop();
    }
    System.out.println("Reverse Queue:");
    Iterator<Integer> itr2= q.iterator();
    while(itr2.hasNext()){
      System.out.print(itr2.next()+" ");
    }
    System.out.println();
    System.out.println("Peek after reversal: "+ q.peek());
  }
}
