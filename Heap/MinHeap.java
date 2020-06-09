class MinHeapClass { 
    
    int[] minHeap;
    int size;
    int minSize;

    MinHeapClass(int minSize) {
        this.minSize = minSize;
        minHeap = new int[minSize];
        size = 0;

    }

    static int parentPos(int pos) {
        return pos/2;
    }

    static int leftChildPos(int pos) {
        return 2*pos+1;
    }

    static int rightChildPos(int pos) {
        return (2*pos+2);
    }


    static void heapify(int arr[], int n, int i) 
    { 
        int smallest = i;
        int l = leftChildPos(i);
        int r = rightChildPos(i);

        if (l <= n && arr[l] < arr[smallest]) 
            smallest = l; 

        if (r <= n && arr[r] < arr[smallest]) 
            smallest = r; 

        if (smallest != i) { 
            int swap = arr[i]; 
            arr[i] = arr[smallest]; 
            arr[smallest] = swap; 
            heapify(arr, n, smallest); 
        } 
    } 

    void buildHeap(int arr[], int n) { 
        for (int i = (int)Math.floor(n / 2)-1; i >= 0; i--) { 
            heapify(arr, n, i); 
        } 
        System.out.println("Array representation of Heap is:"); 
  
        for (int i = 0; i < n; ++i) 
            System.out.print(minHeap[i] + " "); 
  
        System.out.println();
    } 

    void insert(int element) {
        minHeap[size] = element;
        size++;
    }

    public int extractmin() 
    { 
        int popped = minHeap[0]; 
        minHeap[0] = minHeap[size--]; 
        buildHeap(minHeap, size);
        return popped; 
    }

}
class MinHeap {

    // Driver Code 
    public static void main(String args[]) {
        MinHeapClass h = new MinHeapClass(15); 
        h.insert(1);
        h.insert(3);
        h.insert(5);
        h.insert(4);
        h.insert(6);
        h.insert(13);
        h.insert(10);
        h.insert(9);
        h.insert(8);
        h.insert(15);
        h.insert(17);
        h.buildHeap(h.minHeap, h.size);

        
    } 
} 