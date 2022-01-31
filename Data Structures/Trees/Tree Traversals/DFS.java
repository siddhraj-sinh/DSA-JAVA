class Node{
  int data;
  Node left, right;
  Node(int data){
    this.data=data;
  }
}
class DFS{
  Node root;
  public void inorder(Node node){
    if(node==null) return;
    inorder(node.left);
    System.out.print(node.data+" ");
    inorder(node.right);
  }
  public void preorder(Node node){
    if(node==null) return;
    System.out.print(node.data+" ");
    preorder(node.left);
    preorder(node.right);
  }
  public void postorder(Node node){
    if(node==null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data+" ");
  }
  public static void main(String[] args) {
    DFS dfs = new DFS();
    //Creating nodes of a tree
        dfs.root=new Node(1);
        dfs.root.left=new Node(2);
        dfs.root.right=new Node(3);
        dfs.root.left.left=new Node(4);
        dfs.root.left.right=new Node(5);
        dfs.root.right.left=new Node(6);
        dfs.root.right.right=new Node(7);
        System.out.println("Binary Tree Inorder Traversal");
        dfs.inorder(dfs.root);
        System.out.println();
        System.out.println("Binary Tree Preorder Traversal");
        dfs.preorder(dfs.root);
        System.out.println();
        System.out.println("BinaryTree Postorder Traversal");
        dfs.postorder(dfs.root);
  }
}
