package Courses.DataStructure.Week3.Assignment3;

import java.util.Scanner;


public class TreeMain {
    public static void main(String[] arg) {
        int size;
        BST tree = new BST();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of nodes you want to insert into BST: ");
        size = in.nextInt();

        int[] bst = new int[size];
        int[] data = new int[size+1];
        tree.inputData(data, size);
        data[size] = -1;

        Heap heap = new Heap(size);

        TreeNode  node = new TreeNode();
        System.out.println();
        tree.populateTree(node, data);

        System.out.println("\n");
        System.out.print("Post-Order Traversal of BST: ");
        tree.postOrder(node, bst);

        for (int i = 0; i < size; i++)
            heap.insert(bst[i]); // insert node one by one in heap

        System.out.println();
        System.out.print("Min Heap using Insert method: ");
        heap.print();

        System.out.println();
        System.out.print("\nPre-Order Traversal of BST: ");
        tree.preOrder(node, bst);

        System.out.println();
        heap.buildHeap(bst, size);
        System.out.print("Min Heap using Build method: ");
        heap.print();
    }
}

