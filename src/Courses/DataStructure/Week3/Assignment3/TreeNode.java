package Courses.DataStructure.Week3.Assignment3;

public class TreeNode {
    private int object;
    private TreeNode left, right;

    TreeNode(){
        this.object = 0;
        this.left = null;
        this.right = null;
    }
    TreeNode(int object){
        this.object = object;
        this.left = null;
        this.right = null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    public int getInfo() {
        return object;
    }

    public void setInfo(int object) {
        this.object = object;
    }

    public boolean isLeaf(){
        if(this.left == null && this.right == null)
            return true;
        return false;
    }
}
