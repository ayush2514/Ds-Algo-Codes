 class BinaryNode {
    public String data;
    public BinaryNode left;
    public BinaryNode right;
}
 class BinaryTreeLL {
    BinaryNode root;
    public BinaryTreeLL()
    {
        this.root=null;
    }
    void preOrder(BinaryNode node) {
        if(node==null)
        {
             return ;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
public class Main {
    public static void main(String args[]) {
        BinaryTreeLL binaryTree= new BinaryTreeLL();
        BinaryNode N1=new BinaryNode();
        N1.data="N1";
        BinaryNode N2=new BinaryNode();
        N2.data="N2";
        BinaryNode N3=new BinaryNode();
        N3.data="N3";
        BinaryNode N4=new BinaryNode();
        N4.data="N4";
        BinaryNode N5=new BinaryNode();
        N5.data="N5";
        BinaryNode N6=new BinaryNode();
        N6.data="N6";
        BinaryNode N7=new BinaryNode();
        N7.data="N7";
        BinaryNode N8=new BinaryNode();
        N8.data="N8";
        BinaryNode N9=new BinaryNode();
        N9.data="N9";
        N1.left=N2;
        N1.right=N3;
        N2.left=N4;
        N2.right=N5;
        N4.left=N8;
        N4.right=N9;
        N3.left=N6;
        N3.right=N7;
        binaryTree.root=N1;
        binaryTree.preOrder(binaryTree.root);
    }
}