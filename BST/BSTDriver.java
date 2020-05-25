package BST_19060;

public class BSTDriver {
    public static void main(String[] args) {
        BST b = new BST();
        b.insert(50);
        b.insert(20);
        b.insert(80);
        b.insert(20);
        b.insert(10);
        b.insert(20);
        b.insert(50);
        b.insert(20);
        b.countOccunrence();
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean x = b.isBST(min, max);
        System.out.println(x);
    }
}