class HashNode {
    int value;
    int key;
    
    public HashNode(int key, int value){
        this.value = value;
        this.key = key;
    }
}

class HashTable {
    int SIZE = 997;
    HashNode[] harr = new HashNode[SIZE];

    public int hash(int x) {
        return (x*x*x + 3*x*x + 1)% SIZE;
    }

    public void put(int k, int v) {
        int index = hash(k);
        HashNode hn = new HashNode(k, v);
        harr[index] = hn;
    }

    public int get(int k) {
        HashNode n = harr[hash(k)];
        if (n == null) return Integer.MAX_VALUE;
        else return n.value;
    }

    public boolean contains(int k) {
        if (harr[hash(k)] != null) return true;
        else return false;
    }

    public void remove(int k) {
        int index = hash(k);
        harr[index] = null;
    }

    public void print() {
        for (int i = 0; i<harr.length; i++) {
            if (harr[i] != null) System.out.println(harr[i].key
                                + " : " + harr[i].key
                                + " stored at index " + hash(harr[i].key));
        }
    }
}

class HashDriver {
    public static void main(String[] args) {
        HashTable h = new HashTable();  
        h.put(10, 100);
        h.put(8, 64);
        h.put(6, 36);
        if (h.contains(10)) System.out.println(h.get(10));
        if (h.contains(50)) System.out.println(h.get(50));

        h.remove(6);
        h.print();

    }
}
