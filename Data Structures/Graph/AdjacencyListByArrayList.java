import java.util.*;

class AdjacencyListByArrayList{
  int vertex;
  ArrayList<ArrayList<Integer>> list;
  AdjacencyListByArrayList(int vertex){
    this.vertex=vertex;
    list = new ArrayList<ArrayList<Integer>>(vertex);
    for (int i = 0; i < vertex; i++)
      list.add(new ArrayList<Integer>());
  }
  public void addEdge(int s,int d){
    list.get(s).add(d);
    list.get(d).add(s);
  }
  public void printGraph(){
    for (int i = 0; i < list.size(); i++) {
      System.out.println("\nVertex " + i + ":");
      for (int j = 0; j < list.get(i).size(); j++) {
        System.out.print(" -> " + list.get(i).get(j));
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
AdjacencyListByArrayList graph =  new AdjacencyListByArrayList(5);
graph.addEdge(0,1);
 graph.addEdge(0, 4);
 graph.addEdge(1, 2);
 graph.addEdge(1, 3);
 graph.addEdge(1, 4);
 graph.addEdge(2, 3);
 graph.addEdge(3, 4);
 graph.printGraph();
  }
}
