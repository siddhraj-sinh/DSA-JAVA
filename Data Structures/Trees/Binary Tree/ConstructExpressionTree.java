import java.util.*;
class ConstructExpressionTree{
   class Node{
     char data;
     Node left, right;
     Node(char data){
       this.data = data;
       left=right=null;
     }
   }
     public boolean isOperator(char c){
       if(c=='+'||c=='-'||c=='*'||c=='/'){
         return true;
       }
       return false;
     }
     public Node expressionTree(String s){
        Stack<Node> stk = new Stack<>();
        Node t1,t2,temp;
        for(int i=0;i<s.length();i++){
            if(!isOperator(s.charAt(i))){
              temp = new Node(s.charAt(i));
              stk.push(temp);
            }else{
              temp = new Node(s.charAt(i));
               t1 = stk.pop();
               t2 = stk.pop();
               temp.left = t2;
               temp.right = t1;

               stk.push(temp);
            }
        }
        temp = stk.pop();
        return temp;
     }
     public void inorderTraversal(Node node){
       if(node==null) return;
       inorderTraversal(node.left);
       System.out.print(node.data+" ");
       inorderTraversal(node.right);
     }
  public static void main(String[] args) {
    ConstructExpressionTree et = new ConstructExpressionTree();
    /*     *
          /  \
        +     c
      /  \
      a   b
    */
    String str = "ab+c*";
    Node root = et.expressionTree(str);
    et.inorderTraversal(root);
  }
}
