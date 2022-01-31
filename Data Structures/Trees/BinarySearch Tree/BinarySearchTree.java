class BinarySearchTree{
  Node root;
  BinarySearchTree(){
    root=null;
  }
  class Node{
    int data;
    Node left, right;
    Node(int data){
      this.data=data;
      this.left=null;
      this.left=null;
    }
  }
  //insert function
  void insert(int data){
   root = insertRecursion(root,data);
  }
  // insert recursion function
  Node insertRecursion(Node root, int data){
    if(root==null){
      root=new Node(data);
      return root;
    }
     if(data<root.data) {
      root.left = insertRecursion(root.left,data);
    }else if (data>root.data) {
      root.right=insertRecursion(root.right,data);
    }
    return root;
  }

  void delete(int data){
    root = deleteRecursive(root,data);
  }
  Node deleteRecursive(Node root,int data){
     //tree is empty
     if(root==null){
       return root;
     }
     if(data<root.data){
       root.left = deleteRecursive(root.left,data);
     }
     else if (data>root.data) {
       root.right = deleteRecursive(root.right,data);
     }
     else{
          if (root.left == null)
                return root.right;
          else if (root.right == null)
                return root.left;

            // node has two children;
            //get inorder successor (min value in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRecursive(root.right, root.data);
      }
      return root;
  }
  int minValue(Node root)  {
          //initially minval = root
          int minval = root.data;
          //find minval
          while (root.left != null)  {
              minval = root.left.data;
              root = root.left;
          }
          return minval;
      }
      boolean search(int data)  {
        root = search_Recursive(root, data);
        if (root!= null)
            return true;
        else
            return false;
    }

    //recursive insert function
    Node search_Recursive(Node root, int data)  {
        // Base Cases: root is null or key is present at root
        if (root==null || root.data==data)
            return root;
        // val is lesser than root's key
        if (data<root.data)
            return search_Recursive(root.left, data);
        // val is less than root's key
        return search_Recursive(root.right, data);
    }

  //inorder traversal
  public void inorder(Node root){
    if(root == null){
      return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
  public static void main(String[] args) {
  BinarySearchTree bst = new BinarySearchTree();
  /* Let us create following BST
             50
          /     \
         30      70
        /  \    /  \
      20   40  60   80 */
      bst.insert(50);
      bst.insert(30);
      bst.insert(20);
      bst.insert(40);
      bst.insert(70);
      bst.insert(60);
      bst.insert(80);
      System.out.println("Inorder traversal:");
      bst.inorder(bst.root);
      System.out.println();
      bst.delete(20);
      System.out.println("Inorder traversal after deleting 30 :");
      bst.inorder(bst.root);
      boolean result = bst.search(50);
      System.out.println();
      System.out.println("is 50 present in tree: "+result);

  }
}
