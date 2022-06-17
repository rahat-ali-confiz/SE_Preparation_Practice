package Courses.DataStructure.Week3;

public class MinHeap {
    private final int[] Heap;
    private int size;
    private final int maxsize;
    private static final int FRONT = 1;

    public MinHeap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos){return pos/2;}
    private int leftChild(int pos){return (pos*2);}
    private int rightChild(int pos){return (2 * pos) + 1;}
    private boolean isLeaf(int pos){
        return pos > (size / 2) && pos <= size;
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
        int hole = ++size;
        for(; hole>1 && element < Heap[parent(hole)]; hole/=2){
            Heap[hole] = Heap[hole/2];
        }
        Heap[hole] = element;
    }
    private void insertBySwapping(int element){
        if(size>=maxsize)
            return;

        Heap[++size] = element;
        int current = size;

        while(Heap[current] > Heap[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(
                    " PARENT : " + Heap[i]
                            + " LEFT CHILD : " + Heap[2 * i]
                            + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }
    public int remove()
    {

        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);

        return popped;
    }
}
