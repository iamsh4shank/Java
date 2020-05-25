package BST_19060;

import java.util.*;

class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;
    int count = 1;

    public BSTNode() {};

    public BSTNode(int data) {
        this.data = data;
    }

    public void insert(int key) {
        if (key == data) {
            count++;
        } else {
            if (key<data) {
                if (left == null) left = new BSTNode(key);
                else left.insert(key);
            } else {
                if (right == null) right = new BSTNode(key);
                else right.insert(key);
            } 
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

    public int minInBST(BSTNode root) {
        if (root.left == null) {
            return root.data;
        } else {
            return minInBST(root.left);
        }
    }

    public int maxInBST(BSTNode root) {
        if (root.right == null) {
            return root.data;
        } else {
            return maxInBST(root.right);
        }
    }

    public int height(BSTNode root) {
        int leftHeight = 0;
        int rightHeight = 0;
        if (root != null){
            if (root.left != null){
                leftHeight = height(root.left);
            }
            if (root.right != null){
                rightHeight = height(root.right);
            }
        }
    
        if (leftHeight>rightHeight) {
            return leftHeight+1;
        } else {
            return rightHeight+1;
        }
    }

    public void countOccurence() {
        if (left != null) left.countOccurence();
        System.out.println("Count of - "+data+" is "+count);
        if (right != null) right.countOccurence();
    }

    public boolean isBST(BSTNode root, int min, int max) {
        if (root!=null) {
            if (root.data>max || root.data<min) {
                return false;
            }
            return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
        } else {
            return true;
        }
    }

}