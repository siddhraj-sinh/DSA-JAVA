import java.util.Scanner;
class ConstructBinaryTree{
   static Scanner sc = null;
   public static void inorderTraversal(Node node){
     if(node == null){
       return;
     }
     inorderTraversal(node.left);
     System.out.print(node.data+" ");
     inorderTraversal(node.right);
     }
  public static void main(String[] args) {
    sc= new Scanner(System.in);
    Node root = create();
    inorderTraversal(root);
  }
  static Node create(){
    Node root = null;
    System.out.println("Enter data");
    int data = sc.nextInt();
    if(data == -1){
      return root;
    }
    root = new Node(data);
    System.out.println("Enter left for" + data);
    root.left=create();
    System.out.println("Enter right for" + data);
    root.right=create();
    return root;
  }
}

class Node{
  int data;
  Node left, right;

  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
}
