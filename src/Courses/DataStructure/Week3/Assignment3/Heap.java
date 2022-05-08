package Courses.DataStructure.Week3.Assignment3;

public class Heap {
    private final int[] Heap;
    private int currentSize;
    private final int capacity;

    public Heap(int maxsize){
        this.capacity = maxsize;
        this.currentSize = 0;
        Heap = new int[this.capacity + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos){return pos/2;}
    private int leftChild(int pos){return (pos*2);}
    private int rightChild(int pos){return (2 * pos) + 1;}
    private boolean isLeaf(int pos){
        return pos > (currentSize / 2) && pos <= currentSize;
    }

    private void swap(int fpos, int spos){
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void minHeapify(int pos){
        if (!isLeaf(pos)) {
            if (Heap[pos] > Heap[leftChild(pos)]
                    || Heap[pos] > Heap[rightChild(pos)]) {
                if (Heap[leftChild(pos)]
                        < Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }
                else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(int element){
        int current = ++currentSize;
        for(; current>1 && element < Heap[parent(current)]; current/=2){
            Heap[current] = Heap[current/2];
        }
        Heap[current] = element;
    }

    public void print(){
        for (int i = 1; i <= currentSize / 2; i++) {
            System.out.print(Heap[i]+" ");
        }
    }

    public void buildHeap(int[] arr, int n){
        for(int i=1;i<=n;i++){
            Heap[i] = arr[i-1];
            currentSize = n;
            for(int j = currentSize/2;j>0;j--)
                minHeapify(j);
        }
    }

}
