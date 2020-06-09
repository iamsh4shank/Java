class HeapClass { 
    
    int[] maxHeap;
    int size;
    int maxSize;

    HeapClass(int maxSize) {
        this.maxSize = maxSize;
        maxHeap = new int[maxSize];
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
        int largest = i;
        int l = leftChildPos(i);
        int r = rightChildPos(i);

        if (l < n && arr[l] > arr[largest]) 
            largest = l; 

        if (r < n && arr[r] > arr[largest]) 
            largest = r; 

        if (largest != i) { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 

            heapify(arr, n, largest); 
        } 
    } 

    static void buildHeap(int arr[], int n) { 
        for (int i = (int)Math.floor(n / 2)-1; i >= 0; i--) { 
            heapify(arr, n, i); 
        } 
        System.out.println("Array representation of Heap is:"); 
  
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println();
    } 

    void insert(int element) {
        maxHeap[size] = element;
        size++;
    }

    public int extractMax() 
    { 
        int popped = maxHeap[0]; 
        maxHeap[0] = maxHeap[size--]; 
        buildHeap(maxHeap, size);
        return popped; 
    }

    public void sort(int arr[]) { 
        int n = arr.length; 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        for (int i=n-1; i>0; i--) { 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
            heapify(arr, i, 0); 
        } 
    } 

    void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
}


class Heap {

    // Driver Code 
    public static void main(String args[]) {
        HeapClass h = new HeapClass(12); 
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
        HeapClass.buildHeap(h.maxHeap, h.size);



    } 
} 