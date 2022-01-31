import java.util.*;
class Node{
  int data;
  Node left, right;
  Node(int data){
     this.data=data;
     left=right=null;
  }
}
class BFS{
  Node root;
  public void levelOrder(Node node){
   if(node == null ) return;
   Queue<Node> q = new LinkedList<>();
   q.add(node);
   while(!q.isEmpty()){
     Node temp = q.poll();
     System.out.print(temp.data+" ");
     if(temp.left != null){
       q.add(temp.left);
     }
     if(temp.right != null){
       q.add(temp.right);
     }
   }
  }
  public static void main(String[] args) {
     BFS bst = new BFS();
    /*
                  50
                /   \
                30   70
              /  \  /  \
              10  40 60 90
     */
    bst.root= new Node(50);
        bst.root.left=new Node(30);
            bst.root.right=new Node(70);
            bst.root.left.left=new Node(10);
            bst.root.left.right=new Node(40);
            bst.root.right.left=new Node(60);
            bst.root.right.right=new Node(90);
            bst.levelOrder(bst.root);
  }
}
