package Courses.DataStructure.Week3.Assignment3;


import java.util.Scanner;

public class BST {
    public static int counter = 0;
    public void insertNode(TreeNode root, int key){
        TreeNode node = new TreeNode(key);
        TreeNode p = root;
        TreeNode q = root;

        while(key != p.getInfo() && q != null){
            p = q;
            if (key < p.getInfo())
                q = p.getLeft();
            else
                q = p.getRight();
        }
        if (key == p.getInfo()){
            System.out.println("Attempt to Insert a duplicate value: "+key);
        }
        else if(key < p.getInfo())
            p.setLeft(node);
        else
            p.setRight(node);
    }
    public void postOrder(TreeNode treeNode, int[] data) {
        if (treeNode != null){
            postOrder(treeNode.getLeft(),data);
            postOrder(treeNode.getRight(),data);
            System.out.print(treeNode.getInfo()+" ");
            data[counter++] = treeNode.getInfo();
        }
    }
    public void preOrder(TreeNode treeNode, int[] data) {
        counter =0;
        if (treeNode != null){
            System.out.print(treeNode.getInfo()+" ");
            data[counter++] = treeNode.getInfo();
            preOrder(treeNode.getLeft(),data);
            preOrder(treeNode.getRight(),data);
        }
    }

    public void inputData(int[] data, int size) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter " + size + " values to insert into BST: ");
        for (int i = 0; i < size; i++) {
            data[i]=in.nextInt();
        }
    }
    public void populateTree(TreeNode treeNode, int[] x) {
        treeNode.setInfo(x[0]);
        System.out.println(treeNode.getInfo() + " is inserted as root in BST");

        for (int i = 1; x[i] > 0; i++) {
            System.out.println(x[i] + " inserted in BST");
            insertNode(treeNode,  x[i]);
        }
    }

}
