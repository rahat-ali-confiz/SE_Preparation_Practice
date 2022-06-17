package Courses.DataStructure.Week2.BST;


import static Courses.DataStructure.Week2.BST.TreeNode.insertNode;

public class TMain {
    public static void main(String [] args){
        int[] arr = new int[]{14,15,4,9,7,18,3,5,16,4,20,
                             17,9,14,5,-1};
        TreeNode<Integer> node = new TreeNode<>();
        node.setKey(arr[0]);

        for (int i=1; arr[i]>0;i++){
            insertNode(node , arr[i]);
        }

        BinaryTree<Integer> bTree = new BinaryTree<>(node);
//        bTree.preOrder(node);
//        System.out.println();
//        bTree.inOrder(node);
//        System.out.println("Level Order");
//        bTree.mirrorTree(node);
//        System.out.println();
        System.out.println("Mirror Order");
        bTree.levelOrder(node);


    }
}