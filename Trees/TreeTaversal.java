import java.util.*;
import java.lang.*;
import java.io.*;


class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}
class binarytree {
    Node root;


    binarytree() {
        this.root = null;
    }
    void postorder(Node n){
        if(n == null) return;
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.key + " ");
    }
    void preorder(Node n){
        if(n == null) return;
        System.out.print(n.key + " ");
        preorder(n.left);
        preorder(n.right);

    }
    void inorder(Node n){
        if(n == null) return;
        inorder(n.left);
        System.out.print(n.key + " ");
        inorder(n.right);

    }
    void printlevelorder(){
        int h = height(root);
        for(int i=1;i<=h;i++){
            printlevel(root,i);
        }
    }
    int height(Node root){
        if(root == null) return 0;
        else{
            int lh = height(root.left);
            int rh = height(root.right);

            if(lh>rh) return (lh+1);
            else return (rh+1);
        }
    }
    void printlevel(Node root,int level){
        if(root == null) return;
        if(level == 1) System.out.print(root.key + " ");
        else if (level >1) {
            printlevel(root.left, level - 1);
            printlevel(root.right, level - 1);
        }
    }
    void printPostorder()  {     postorder(root);  }
    void printInorder()    {     inorder(root);   }
    void printPreorder()   {     preorder(root);  }


    public static void main(String[] args) {
        binarytree bt = new binarytree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.printPostorder();
        System.out.println();
        bt.printInorder();
        System.out.println();
        bt.printPreorder();
        System.out.println();
        bt.printlevelorder();
    }
}


