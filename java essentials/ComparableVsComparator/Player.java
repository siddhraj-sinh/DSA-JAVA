
/*
 comprable = when we want to sort object based on single propertie
 for example here list is sorted based on each player ranking.
 compartor = when we want to sort object based on multiple properties
 for example lets say you have another list and now you want to sort it accroding to age
 for more: https://youtu.be/hbXpzOER270
*/
import java.lang.*;
import java.util.*;
class Player implements Comparable<Player>{
   private String name;
   private int ranking;
   private int age;

    Player(String name,int age,int ranking){
      this.name=name;
      this.ranking=ranking;
      this.age=age;
    }

   public String getName(){
     return name;
   }
   public int getAge(){
     return age;
   }
   public int getRanking(){
     return ranking;
   }

  public String toString(){
    return "Emp{"+"name= "+ name +" age= "+ age +" rank= "+ ranking +"}";
  }
  //comparable override method
  //the data will sort acc to rank
  public int compareTo(Player p){
    return getRanking() - p.getRanking();
  }
  public static void main(String[] args) {
     List<Player> l = new ArrayList<>();
     Player p1 = new Player("virat",32,5);
     Player p2 = new Player("dhoni",35,9);
     Player p3 = new Player("jadeja",28,6);
      l.add(p1);
      l.add(p2);
      l.add(p3);
      System.out.println(l);
      Collections.sort(l);
      System.out.println(l);
  }
}
