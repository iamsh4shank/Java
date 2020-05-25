package BST_19060;

import java.util.Stack;

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

    public void countOccurence() {
        if (root == null) return;
        else root.countOccurence();
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

    public int minInBST() {
        if (root == null) {
            return 0;
        } else {
            return root.minInBST(root);
        }
    }

    public int maxInBST() {
        if (root == null) {
            return 0 ;
        } else {
            return root.maxInBST(root);
        }
    }

    int height(){
        if (root == null) {
            return 0;
        } else {
            return root.height(root);
        }
    }

    public boolean delete(int id){
        BSTNode parent = root;
        BSTNode current = root;
        boolean isLeftChild = false;
        while(current.data!=id){
            parent = current;
            if(current.data>id){
                isLeftChild = true;
                current = current.left;
            }else{
                isLeftChild = false;
                current = current.right;
            }
            if(current ==null){
                return false;
            }
        }
    
        if (current.left==null && current.right==null){
            if (current==root){
                root = null;
            }
            if (isLeftChild ==true){
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if(current.right==null){
            if(current==root){
                root = current.left;
            } else if(isLeftChild){
                parent.left = current.left;
            } else{
                parent.right = current.left;
            }
        }
        else if(current.left==null){
            if(current==root){
                root = current.right;
            }else if(isLeftChild){
                parent.left = current.right;
            }else{
                parent.right = current.right;
            }
        } else if(current.left!=null && current.right!=null){
            BSTNode successor	 = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftChild){
                parent.left = successor;
            }else{
                parent.right = successor;
            }			
            successor.left = current.left;
            }		
        return true;		
        }

    public BSTNode getSuccessor(BSTNode deleteNode){
    BSTNode successsor =null;
    BSTNode successsorParent =null;
    BSTNode current = deleteNode.right;
    while(current!=null){
        successsorParent = successsor;
        successsor = current;
        current = current.left;
    }
    if(successsor!=deleteNode.right){
        successsorParent.left = successsor.right;
        successsor.right = deleteNode.right;
    }
    return successsor;
    }
 
    public int kthNode(int k) {
        int s = k-1;
        Stack<BSTNode> stack = new Stack<BSTNode>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            stack.pop();
            if (s-- == 0) {
                return root.data;
            }
            root = root.right;
        }
        return -1;
    }

    public boolean isBST(int min, int max) {
        if (root == null) {
            return false;
        } else {
            return root.isBST(root, min, max);
        }
    }
}