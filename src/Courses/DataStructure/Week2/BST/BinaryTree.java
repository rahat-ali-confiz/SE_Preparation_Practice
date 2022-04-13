package Courses.DataStructure.Week2.BST;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree<T> {
    TreeNode<T> root;

    BinaryTree(){root = null;}
    BinaryTree(TreeNode<T> root){this.root = root;}

    public void preOrder(TreeNode treeNode){
        // Traversing using recursion
//        if (treeNode != null){
//            System.out.print(treeNode.getKey()+" ");
//            preOrder(treeNode.getLeft());
//            preOrder(treeNode.getRight());
//        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.print(current.getKey()+" ");
            if (current.getRight() != null) {
                stack.push(current.getRight());
            } if (current.getLeft() != null) {
                stack.push(current.getLeft());
            }
        }
    }

    public void postOrder(TreeNode treeNode) {
        if (treeNode != null){
            postOrder(treeNode.getLeft());
            postOrder(treeNode.getRight());
            System.out.print(treeNode.getKey()+" ");
        }

//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(treeNode);
//        while (!stack.isEmpty()){
//            TreeNode current = stack.peek();
//            if (current.isLeaf()){
//                current = stack.pop();
//                System.out.print( current.getKey()+" ");
//            }
//            else {
//                if (current.getRight() != null) {
//                    stack.push(current.getRight());
//                    current.setRight(null);
//                }
//                if (current.getLeft() != null) {
//                    stack.push(current.getLeft());
//                    current.setLeft(null);
//                }
//            }
//        }

    }

    public void inOrder(TreeNode treeNode){
        // Traversing using Recursion
        if (treeNode != null){
            inOrder(treeNode.getLeft());
            System.out.print(treeNode.getKey()+" ");
            inOrder(treeNode.getRight());
        }

//        Stack<TreeNode<Integer>> stack = new Stack<>();
//        TreeNode current = treeNode;
//        do{
//            while(current!=null){
//                stack.push(current);
//                current = current.getLeft();
//            }
//            if (!stack.isEmpty()){
//                current = stack.pop();
//                System.out.print(current.getKey()+" ");
//                current = current.getRight();
//            }
//        }while(!stack.isEmpty() || current != null);
    }

    public void levelOrder(TreeNode treeNode){
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        if (treeNode == null)
            return;
        nodeQueue.add(treeNode);

        while(!nodeQueue.isEmpty()){
            treeNode = nodeQueue.remove();
            System.out.print(treeNode.getKey()+" ");
            if (treeNode.getLeft()!= null)
                nodeQueue.add(treeNode.getLeft());
            if (treeNode.getRight() !=null)
                nodeQueue.add(treeNode.getRight());
        }
    }

}
