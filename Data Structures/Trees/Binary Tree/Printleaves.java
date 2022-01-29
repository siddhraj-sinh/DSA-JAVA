class Printleaves{
  Node root;
  static class Node{
    int data;
    Node left, right;
    Node(int data){
      this.data =data;
    }
  }

  static boolean isLeaf(Node node){
    if(node.left == null && node.right == null){
      return true;
    }
    return false;
  }
  public static void printLeaves(Node node){
   if(node==null){
     return;
   }
   if(isLeaf(node)){
     System.out.println(node.data);
   }
   printLeaves(node.left);
   printLeaves(node.right);
  }
  public static void main(String[] args) {
      Printleaves pl = new Printleaves();
      /*
            1
          /  \
          2   3
        /
        4
      */
      pl.root = new Node(3);
      pl.root.left = new Node(9);
      pl.root.right = new Node(20);
      pl.root.right.left = new Node(15);
      pl.root.right.right=new Node(7);
      System.out.println("Leaf Nodes in given tree are: ");
     printLeaves(pl.root);
  }
}
