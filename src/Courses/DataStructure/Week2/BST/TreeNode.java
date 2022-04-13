package Courses.DataStructure.Week2.BST;


public class TreeNode<T> {
    private T key;
    private TreeNode<T> left, right;

    TreeNode(){
        key = null;
        left = null;
        right = null;
    }

    TreeNode(T key){
        this.key = key;
        left = null;
        right = null;
    }

    public TreeNode<T> getLeft() {
        return left;
    }
    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }
    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public void setKey(T key){
        this.key = key;
    }
    public T getKey(){
        return this.key;
    }

    public boolean isLeaf(){
        if(this.left == null && this.right == null)
            return true;
        return false;
    }

    public static void insertNode(TreeNode<Integer> root, int key){
        TreeNode<Integer> node = new TreeNode<>(key);
        TreeNode<Integer> p = root;
        TreeNode<Integer> q = root;

        while(key != p.getKey() && q != null){
            p = q;
            if (key < p.getKey())
                q = p.getLeft();
            else
                q = p.getRight();
        }
        if (key == p.getKey()){
            System.out.println("Attempt to Insert a duplicate value: "+key);
        }
        else if(key < p.getKey())
            p.setLeft(node);
        else
            p.setRight(node);
    }

}
