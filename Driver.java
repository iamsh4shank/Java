
import java.util.*;
class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode() {};

    public BSTNode(int data) {
        this.data = data;
    }

    public void insert(int key) {
        if (key<data) {
            if (left == null) left = new BSTNode(key);
            else left.insert(key);
        } else {
            if (right == null) right = new BSTNode(key);
            else right.insert(key);
        } 
    } 

    public void inorder() {
        if (left != null) left.inorder();
        System.out.print(data+ " ");
        if (right != null) right.inorder();
    }

    public boolean search(int key) {
        if (key == data) return true;
        else if (key<data && left != null) return left.search(key);
        else if (key>data && right != null) return right.search(key);
        else return false; 
    }

    public void preorder() {
        System.out.print(data+ " ");
        if (left != null) left.preorder();
        if (right != null) right.preorder();
    }

    public void postorder() {
        if (left != null) left.postorder();
        if (right != null) right.postorder();
        System.out.print(data+ " ");
        
    }
}

class BST {
    BSTNode root;
    public void insert(int key) {
        if (root == null) root = new BSTNode(key);
        else root.insert(key);
    }

    public void inorder() {
        if (root == null) return;
        else root.inorder();
    }

    public boolean search(int key) {
        if (root == null) return false;
        else return root.search(key);
    }

    public void preorder() {
        if (root == null) return;
        else root.preorder();
    }

    public void postorder() {
        if (root == null) return;
        else root.postorder();
    }

    public void LevelOrder(){
        Queue<BSTNode> bstQ = new LinkedList<BSTNode>();
        bstQ.add(root);
     
        while (!bstQ.isEmpty()){
            BSTNode bstNode = bstQ.remove();
            if (bstNode.left != null) bstQ.add(bstNode.left);
            if (bstNode.right != null) bstQ.add(bstNode.right);
            System.out.print(bstNode.data+" ");
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        BST b = new BST();
        b.insert(50);
        b.insert(20);
        b.insert(80);
        b.insert(10);
        System.out.println("Inorder - ");
        b.inorder();
        System.out.println("\n");
        System.out.println("Preorder - ");
        b.preorder();
        System.out.println("\n");
        System.out.println("Postorder - ");
        b.postorder();
        System.out.println("\n");
        System.out.println("LevelOrder - ");
        b.LevelOrder();
        System.out.println("\n");
        System.out.println("Is 20 there?");
        boolean a = b.search(20);
        System.out.print(a);
        System.out.println("\n");
        System.out.println("Is 30 there?");
        boolean c = b.search(30);
        System.out.print(c);
        System.out.println("\n");
    }
}