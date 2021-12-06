package p3;

public class TreeNode<T> {

    T element;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T element) {

        this.element = element;
        this.left = null;
        this.right = null;
    }


}
