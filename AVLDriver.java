
import java.util.*;
import java.util.Stack;
import java.lang.Math;

class AVLNode {
    int data;
    int bFactor;
    AVLNode left;
    AVLNode right;

    public AVLNode() {};

    public AVLNode(int data) {
        this.data = data;
    }

    public AVLNode insert(int key) {
        if (key<data) {
            if (left == null) left = new AVLNode(key);
            else left.insert(key);
        } else {
            if (right == null) right = new AVLNode(key);
            else right.insert(key);
        } 
        
        int balanceFactor = computeBf();
        switch (balanceFactor) {
            case 2:
                if (left.bFactor >= 0) return rotateWithLeftChild();
                else {
                    left = left.rotateWithRightChild();
                    return rotateWithLeftChild();
                } 
            case -2:
                if (right.bFactor <= 0) return rotateWithRightChild();
                else {
                    right = right.rotateWithLeftChild();
                    return rotateWithRightChild();
                }
        }
        return this;
    } 

    public boolean isAVL(AVLNode root, int min, int max) {
        if (root!=null) {
            if (root.data>max || root.data<min) {
                return false;
            }
            return isAVL(root.left, min, root.data) && isAVL(root.right, root.data, max);
        } else {
            return true;
        }
    }

    public int computeBf() {
        if (this.left == null && this.right == null) return 0;
        else if (this.left!=null && this.right == null) return left.height() + 1;
        else if (this.left==null && this.right != null) return -1*(right.height() + 1);
        else return left.height() - right.height();
    
    }

    public AVLNode rotateWithLeftChild() {
        AVLNode aNode = left;
        left = aNode.right;
        aNode.right = this;

        return aNode;
    }

    public AVLNode rotateWithRightChild() {
        AVLNode aNode = right;
        left = aNode.left;
        aNode.left = this;

        return aNode;
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

    public int height() {
        if (this.left == null && this.right == null) return 0;
        else if (this.left != null && this.right == null) 
            return left.height() + 1;
        else if (this.left == null && this.right != null)
            return right.height() + 1;
        else return Math.max(left.height(), right.height()) +1;
    }    
}


class AVL {
    AVLNode root;
    public void insert(int key) {
        if (root == null) root = new AVLNode(key);
        else root.insert(key);
    }

    public int computeBf() {
        if (root == null) return 0;
        else return root.computeBf();
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

    int height(){
        if (root == null) {
            return 0;
        } else {
            return root.height();
        }
    }
public void LevelOrder(){
        Queue<AVLNode> avlQ = new LinkedList<AVLNode>();
        bstQ.add(root);
     
        while (!avlQ.isEmpty()){
            AVLNode avlNode = avlQ.remove();
            if (avlNode.left != null) avlQ.add(avlNode.left);
            if (avlNode.right != null) bstQ.add(avlNode.right);
            System.out.print(avlNode.data+" ");
        }
    }

    public boolean isAVL(int min, int max) {
        if (root == null) {
            return false;
        } else {
            return root.isAVL(root, min, max);
        }
    }
}

public class AVLDriver {
    public static void main(String[] args) {
        AVL b = new AVL();
        b.insert(15);
        b.insert(2);
        b.insert(24);
        b.insert(10);
        b.insert(13);
        b.insert(7);
        b.insert(30);
        b.insert(36);
        b.insert(25);
        /*int x = b.computeBf();
        System.out.println(x);*/
      
    }
}
