class HashNode {
    int value;
    int key;
    
    public HashNode(int key, int value){
        this.value = value;
        this.key = key;
    }
}

class LinearProbingHash
{
    int currentSize, maxSize;
    HashNode[] harr;  

    void setSize(int maxSize) {
        this.maxSize = maxSize;
    }

    LinearProbingHash(int capacity) {
        currentSize = 0;
        harr = new HashNode[capacity]; 
        maxSize = capacity;
    }  

    boolean contains(int key) {
        if (get(key) != -1) return true;
        else return false;
    }
 
    int hash(int key) {
        return (key+3*key+1)% maxSize;
    }    
 
    void put(int key, int val) {                
        int tmp = hash(key);
        int i = tmp;
        do {
            if (harr[i] == null) {
                harr[i] = new HashNode(key,val);
                currentSize++;
                return;
            }
            if (harr[i].key == key) { 
                harr[i].value = val; 
                return; 
            }            
            i = (i + 1) % maxSize;            
        } while (i != tmp);       
    }
 
    int get(int key) {
        int i = hash(key);
        while (harr[i] != null){
            if (harr[i].key == key)
                return harr[i].value;
            i = (i + 1) % maxSize;
        }            
        return -1;
    }
 
    void remove(int key) {
        if (!contains(key)) 
            return;
        int i = hash(key);
        while (harr[i].key != key) 
            i = (i + 1) % maxSize;        
        harr[i] = harr[i] = null;      
        for (i = (i + 1) % maxSize; harr[i] != null; i = (i + 1) % maxSize){
            int tmp1 = harr[i].key, tmp2 = harr[i].value;
            harr[i] = harr[i] = null;
            currentSize--;  
            put(tmp1, tmp2);            
        }
        currentSize--;        
    }       
 
    void printHashTable() {
        System.out.println("\nHash Table Key Value pair is as follows: ");
        for (int i = 0; i < maxSize; i++)
            if (harr[i] != null)
                System.out.println(harr[i].key +" "+ harr[i].value);
        System.out.println();
    }   
}


class HashLinearProbe {
    public static void main(String[] args)
    {
        LinearProbingHash lHash = new LinearProbingHash(10);
        lHash.put(10, 2);
        lHash.put(5, 3);  
        lHash.put(23, 3);  
        lHash.put(20, 3);  
        lHash.printHashTable();  
        lHash.remove(21);
        lHash.printHashTable();
    }
}
