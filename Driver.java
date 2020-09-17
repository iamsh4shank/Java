class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int data) {
        this.data = data;
        this.left = this.right = null;
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

    public void swapLeftRight(BSTNode root) {   
        if (root== null ||  
                (root.left==null && root.right==null) )  
            return ;  
        BSTNode temp=root.left; 
        root.left=root.right; 
        root.right=temp; 
        swapLeftRight(root.left);  
        swapLeftRight(root.right);  
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

    public void preorder() {
        if (root == null) return;
        else root.preorder();
    }

    public void postorder() {
        if (root == null) return;
        else root.postorder();
    }

    public void swapLeftRight(BSTNode root) {  
        if (root == null) return;
        else root.swapLeftRight(root);  
    }

    int height(){
        if (root == null) {
            return 0;
        } else {
            return root.height(root);
        }
    }
}

class Driver {
    public static void main(String[] args) {
        BST b = new BST();
        b.insert(50);
        b.insert(20);
        b.insert(10);
        b.insert(60);
        System.out.print("Preorder traversal: ");
        b.preorder();
        b.swapLeftRight(b.root);
        System.out.print("\nAfter swapping : Preorder traversal: ");
        b.preorder();
        int x = b.height();
        System.out.println("\nHeight of root node:" + (x-1));
    }
}