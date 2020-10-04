
class Node {
    Node next;
    int key;
    int value;

    Node(int key, int val) {
        next = null;
        this.key = key;
        value = val;
    }

    Node(int key, int val, Node next) {
        this.next = next;
        this.key = key;
        value = val;
    }
}

class LinkedList {

    private Node head;
    LinkedList() {
        head = null;
    }

    int getNode() {
        return head.key;
    }
    boolean insert(int key, int value) {
        boolean result = false;
        if (head == null) {
            Node newNode = new Node(key, value);
            head = newNode;   
            result = true;     
        } else {
            if (isPresent(key) == -1) {
                Node nodePtr = head;
                while (nodePtr.next != null) {
                    nodePtr = nodePtr.next;
                }
                Node newNode = new Node(key, value);
                nodePtr.next = newNode;
                result = true;     
            }
        }
        return result;
    } 
    boolean delete(int key) {
        boolean result = false;
        if (head == null) {
            return result;
        } else if (isPresent(key) != -1) { 
            if (head.key == key) {
                head = head.next;
            } else {
                Node prevNode = head;

                while (prevNode.next != null) {
                    if (prevNode.next.key == key) {
                        prevNode.next = (prevNode.next).next;
                    } else {
                        prevNode = prevNode.next;
                    } 
                } 
            } 
            result = true; 
        } 
        return result;
    } 
    int isPresent(int key) {

        int result = -1;  
        Node nodePtr = head;
        if (head == null) {
            return result; 
        }
        while (nodePtr.key != key && nodePtr.next != null) {
            nodePtr = nodePtr.next;
        }
        if (nodePtr.key == key) {
            result = nodePtr.value;
        }
        return result;
    }

    int getIndex(int key) {
        int result = 1;  
        Node nodePtr = head;
        if (head == null) {
            return result; 
        }
        while (nodePtr.key != key && nodePtr.next != null) {
            nodePtr = nodePtr.next;
            result ++;
        }
        if (nodePtr.key == key) {
            return result;
        }  else return -1;
    }
}

class HashTable {

    LinkedList[] L;
    int tableSize;
    int entries;
    
    HashTable(int size) {
        this.tableSize = size;
        entries = 0;
        L = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            L[i] = new LinkedList();
        }
    }

    int hash(int x) {
        return (x + 3*x + 1)% this.tableSize;
    }

    boolean put(int key, int val) {

        int hashVal = hash(key);  
        boolean success = L[hashVal].insert(key, val);  
        if (success) {
            entries++;
            if (L[hashVal].getNode() == key ) {
                int i = L[hashVal].getIndex(key);
                System.out.printf("Key %s inserted on index %d\n", key, hashVal);
            } else {
                int i = L[hashVal].getIndex(key);
                System.out.printf("Key %s inserted on index %d at Node number %s\n", key, hashVal, i);                
            }
            
            return true;
        } else { 
            System.out.printf("Key %s already exists\n", key);
            return false;
        }
    }

    boolean remove(int key) {

        int hasVal = hash(key); 
        boolean result = L[hasVal].delete(key); 
        if (result) {
            System.out.printf("Key %s deleted from index %d\n", key, hasVal);
            entries--; 
        } else {   
            System.out.printf("Key %s doesn't exist\n", key);
        } 
        return result;  
    }

    boolean contains(int key) {
int hashValue = hash(key);  
        long value = L[hashValue].isPresent(key);  
        if (value != -1) {
            return true;  
        } else {
            return false;
        } 
    }

    int get(int key) {

        if (contains(key)) {
            int hashValue = hash(key);  
            int value = L[hashValue].isPresent(key);
            return value; 
        } else {
            System.out.println("Not exist");
            return Integer.MAX_VALUE;
        }
    }

    void printStats() {
        System.out.printf("Number of records = %d\n", entries);
    }
}
class HashTableDriver {
    public static void main(String[] args)  {
        HashTable hTable = new HashTable(10);

        System.out.println("Inserting element whose key is 10, 20, 14, 30 in size of 10");
        hTable.put(10, 4);
        hTable.put(20, 5);
        hTable.put(14, 9);
        hTable.put(30, 5);

        System.out.println("\n");
        System.out.println("Printing stats");
        hTable.printStats();

        System.out.println("\n");
        System.out.println("Removing 20");
        hTable.remove(20);

        System.out.println("\n");
        System.out.println("Printing stats");
        hTable.printStats();

        System.out.println("\n");
        System.out.println("Checking is 20 present");
        System.out.println(hTable.contains(20));

        System.out.println("\n");
        System.out.println("Checking the values 14");
        if (hTable.contains(14)) System.out.println(hTable.get(14));

    } 
}
