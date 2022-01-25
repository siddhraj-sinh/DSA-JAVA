import java.util.*;
class QueueByCollectionFramework{
  public static void main(String[] args) {
    //queue is interface hence we can't make object of it directly instead we make object of classes which implements Queue interface

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    q1.add(10);
    q1.add(20);
    q1.add(30);

    q2.add(40);
    q2.add(50);
    q2.add(60);

    //getting iterable object using iterator() method
    Iterator<Integer> itr1 = q1.iterator();
    Iterator<Integer> itr2 = q2.iterator();

  System.out.println("Queue using LinkedList class:");
    while(itr1.hasNext()){
      System.out.print(itr1.next()+" ");
    }
    System.out.println();
    
    System.out.println("Queue using ArrayDeque class:");
      while(itr2.hasNext()){
        System.out.print(itr2.next()+" ");
      }
  }
}
