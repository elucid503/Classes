package Heap;

public class MaxHeap {

    private int[] Heap;
    private int size;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public MaxHeap(int maxsize) {

        this.maxsize = maxsize;
        this.size = 0;

        Heap = new int[this.maxsize + 1];

        Heap[0] = Integer.MAX_VALUE;

    }
 
    private int parent(int pos) {

        return pos / 2;

    }
 
    private int leftChild(int pos) {

        return (2 * pos);

    }
 
    private int rightChild(int pos) {

        return (2 * pos) + 1;

    }
 
    private boolean isLeaf(int pos) {
        
        return (pos >= (size / 2.0) && pos <= size);

    }
 
    private void swap(int fpos, int spos) {
        
        int tmp;
        tmp = Heap[fpos];

        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;

    }
 
    private void heapify(int pos) {
    	        
        if (this.isLeaf(pos)) { return; } // Leafs are already heaps
    	        
        if (this.Heap[pos] < this.Heap[this.leftChild(pos)] || this.Heap[pos] < this.Heap[this.rightChild(pos)]) {

            // We must do a swap in either direction

            if (this.Heap[this.leftChild(pos)] > this.Heap[this.rightChild(pos)]) {

                this.swap(pos, this.leftChild(pos)); // Moves the larger value up
                this.heapify(this.leftChild(pos)); // Does everything again

            } else {

                // Same logic here

                this.swap(pos, this.rightChild(pos));
                this.heapify(this.rightChild(pos));

            }

        }
    	 
    }
 
    public void insert(int element) {
         
        if (this.Heap.length - 1 < this.size) { return; } // We should be checking if full here to avoid runtime errors when inserting
        
        this.Heap[++size] = element; // inserts at bottom layer and rightmost side (end)
        int currentPos = this.size; 

        // this is NOT recursive, but uses a while loop to run when current is greater than parent

        while (this.Heap[currentPos] > this.Heap[this.parent(currentPos)]) {

            this.swap(currentPos, this.parent(currentPos)); 
            currentPos = this.parent(currentPos); // updating the current value for next time

        }
    
    }
 
    public void print() {
       
        for (int i = 1; i <= size / 2.0; i++) {
            
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i] + " RIGHT CHILD :" + Heap[2 * i  + 1]);
            System.out.println();

        }
        
    }
 
    public void maxHeap() {

        for (int pos = (size / 2); pos >= 1; pos--) {

            heapify(pos);

        }

    }
 
    public int extractMax() {
        
        int maxValue = Heap[FRONT]; // get the prev value (max)
        
        this.Heap[FRONT] = this.Heap[size--]; // moves last element to front
        this.heapify(FRONT); // fixes the heap

        return maxValue;
    
    }
 
}