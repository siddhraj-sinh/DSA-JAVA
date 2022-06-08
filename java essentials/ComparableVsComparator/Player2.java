
/*
 comprable = when we want to sort object based on single propertie & it is in lang package
 compartor = when we want to sort object based on multiple properties & it is in util pacakage
  for more: https://youtu.be/hbXpzOER270
*/
import java.lang.*;
import java.util.*;

class RankingComparator implements Comparator<Player2>{

  public  int compare(Player2 p1, Player2 p2){
   return p1.getRanking()-p2.getRanking();
  }
}
class Player2{
   private String name;
   private int ranking;
   private int age;

    Player2(String name,int age,int ranking){
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

  public static void main(String[] args) {
     List<Player2> l = new ArrayList<>();
     Player2 p1 = new Player2("virat",32,5);
     Player2 p2 = new Player2("dhoni",35,9);
     Player2 p3 = new Player2("jadeja",28,6);
      l.add(p1);
      l.add(p2);
      l.add(p3);
      System.out.println(l);
      Collections.sort(l,new RankingComparator());
      System.out.println(l);
  }
}
